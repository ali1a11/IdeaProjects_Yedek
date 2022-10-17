package deneme.MOOC_11.processingFiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Storer {


    public void writeToFile(String file, String text) {
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println(text);
            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
