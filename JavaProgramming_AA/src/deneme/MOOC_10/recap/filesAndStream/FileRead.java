package deneme.MOOC_10.recap.filesAndStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public static void main(String[] args) {

        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming\\src\\DENEME\\MOOC_10\\recap\\filesAndStream\\TestFile.txt")).forEach(row -> rows.add(row));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        rows.stream().forEach(row-> System.out.println(row));

    }
}
