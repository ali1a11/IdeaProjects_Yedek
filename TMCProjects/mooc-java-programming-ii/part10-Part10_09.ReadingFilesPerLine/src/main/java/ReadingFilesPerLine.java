
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        read("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming\\src\\DENEME\\MOOC_10\\streamExamples\\data.txt");
        System.out.println(read("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming\\src\\DENEME\\MOOC_10\\streamExamples\\data.txt"));

    }

    public static List<String> read(String file){
        List<String> lines1 = new ArrayList<>();
        try {
            // reading the file line by line
            lines1 = Files.lines(Paths.get(file)).collect(Collectors.toList());


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lines1;
    }

}

/* from mooc
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here

    }

    public static List<String> read(String file) {
        try {
            return Files.lines(Paths.get(file)).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return new ArrayList<>();
    }
}
 */
