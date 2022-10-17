package dictionary;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveableDictionary {
    private String words;
    private String translation;
    private HashMap<String, String> dictionary;

    private String file;

    public SaveableDictionary() {
        this.words = words;
        this.translation = translation;
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.words = words;
        this.translation = translation;
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        List<String> rows = new ArrayList<>();
        try {

            Files.lines(Paths.get(this.file))
                    .forEach(row-> rows.add(row));
            for (String row : rows) {
                String[] parts= row.split(":");
                this.dictionary.put(parts[0],parts[1]);
            }

            return true;

            //.map(row->row.split(":")).map(parts->dictionary.put(parts[0], parts[1]));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }


    public void add(String words, String translation) {
        if (!dictionary.containsKey(words)) {
            this.dictionary.put(words, translation);
        }
    }

    public String translate(String word) {

        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else if (!dictionary.containsKey(word)) {

            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }
            }
        }

        return null;
    }

    public void delete(String word) {

        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        }

        if (!dictionary.containsKey(word)) {
            dictionary.values().remove(word);
        }
    }

    public boolean save(){
        boolean save = false;

        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String key : this.dictionary.keySet()) {
                String row = key + ":" + this.dictionary.get(key);
                writer.println(row);
            }
            writer.close();
            save = true;

        } catch (FileNotFoundException e) {
            save = false;
            throw new RuntimeException(e);

        }
        return save;
    }
}

/* from mooc
package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveableDictionary {

    private Map<String, String> words;
    private String file;

    public SaveableDictionary() {
        this.words = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        this.words.put(parts[0], parts[1]);
                        this.words.put(parts[1], parts[0]);
                    });
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void add(String word, String translation) {
        if (words.containsKey(word)) {
            return;
        }

        words.put(word, translation);
        words.put(translation, word);
    }

    public String translate(String word) {
        return words.get(word);
    }

    public void delete(String word) {
        String translation = translate(word);

        words.remove(word);
        words.remove(translation);
    }

    private void saveWords(PrintWriter writer) throws IOException {
        List<String> allreadySaved = new ArrayList<>();
        words.keySet().stream().forEach(word -> {
            if (allreadySaved.contains(word)) {
                return;
            }

            String pari = word + ":" + words.get(word);
            writer.println(pari);

            allreadySaved.add(word);
            allreadySaved.add(words.get(word));
        });
    }
}

 */



