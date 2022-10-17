package deneme.MOOC7.readFromFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {

        ArrayList<String> recipes = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("recipes.txt"))) {

            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();


                // if the line is blank we do nothing
                if (line.isEmpty()) {
                    continue;
                }

                // do something with the data
                recipes.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(recipes);


    }
}
