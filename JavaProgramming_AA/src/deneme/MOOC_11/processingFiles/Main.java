package deneme.MOOC_11.processingFiles;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        PrintWriter writer = new PrintWriter("file123.txt");
        writer.println("Hello file!"); //writes the string "Hello file!" and line change to the file
        writer.println("More text");
        writer.print("And a little extra"); // writes the string "And a little extra" to the file without a line change
        writer.print(" And a little extra 2"); // writes the string "And a little extra" to the file without a line change
        writer.close(); //closes the file and ensures that the written text is saved to the file
*/
        Storer storer = new Storer();
        storer.writeToFile("diary.txt", "Dear diary, today was a good day.");
    }
}
