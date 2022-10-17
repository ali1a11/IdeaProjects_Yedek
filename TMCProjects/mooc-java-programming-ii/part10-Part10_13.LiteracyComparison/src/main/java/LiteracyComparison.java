import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        List<Country> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts-> new Country(parts[3], Integer.valueOf(parts[4]), parts[2], Double.valueOf(parts[5])))
                    .forEach(country -> rows.add(country));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

// do something with the read lines

        //System.out.println(rows);
/*
        rows.sort((p1, p2) -> (int) (p1.getLiteracyRate() - p2.getLiteracyRate()));

        rows.stream().forEach(p -> System.out.println(p));
*/
/*
        rows.stream().sorted((p1, p2) -> {
            return (int) (p1.getLiteracyRate() - p2.getLiteracyRate());
        }).forEach(p -> System.out.println(p));
*/
        Collections.sort(rows);
        for (Country row : rows) {
            System.out.println(row);

        }
    }
}
/* from mooc

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {

        ArrayList<Result> results = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(l -> l.split(","))
                    .map(a -> new Result(a[2].replace("(%)", "").trim(), a[3], Integer.valueOf(a[4]), Double.parseDouble(a[5])))
                    .forEach(t -> results.add(t));
        } catch (IOException ex) {
            System.out.println("Error reading file.");
        }

        results.stream().sorted((t1, t2) -> {
            if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
                return 1;
            }
            if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
    }
}
 */