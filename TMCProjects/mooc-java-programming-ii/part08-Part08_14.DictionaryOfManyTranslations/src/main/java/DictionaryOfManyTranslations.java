import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }


    public void add(String word, String translation) {
        // an empty list has to be added for a new word if one has not already been added
        this.translations.putIfAbsent(word, new ArrayList<>());

        //ArrayList<String> translate = this.translations.get(word);
        //translate.add(translation);

        this.translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> list = new ArrayList<>();
        if (translations.get(word) == null) {
            return list;
        } else {
            return translations.get(word);
        }
    }
    /*
        public ArrayList<String> translate(String word) {
        return dictionary.getOrDefault(word, new ArrayList<>());
    }
    */


    public void remove(String word) {
        translations.remove(word);
    }


}
