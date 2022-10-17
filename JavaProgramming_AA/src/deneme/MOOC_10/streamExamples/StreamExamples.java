package deneme.MOOC_10.streamExamples;

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

import static java.nio.file.Files.lines;

public class StreamExamples {
    public static void main(String[] args) throws IOException {


        // 1) Integer stream
        IntStream
                .range(1, 10) //1 dahil 10 haric
                .forEach(System.out::println); // forEach(sout) shortcut

        System.out.println("-------------------------------------------");

        // 2) Integer stream with skip

        IntStream
                .range(1, 10)
                .skip(5) //skips the first 5 elements
                .forEach(x -> System.out.println(x));


        System.out.println("-------------------------------------------");

        // 3) Integer stream with sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );

        System.out.println("-------------------------------------------");

        // 4) Stream.of, sorted and findFirst

        Stream.of("John", "Tim", "Tom", "Karen")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("-------------------------------------------");

        // 5) Stream from Array, sort, filter and print
        String[] names = {"John", "Tim", "Tom", "Karen", "amanda", "Sarah", "samantha", "Hans", "Sasha"};
        Arrays.stream(names)   // same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");

        // 6) Average of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        System.out.println("-------------------------------------------");

        // 7) Stream from List, filter and print
        List<String> people = Arrays.asList("John", "Tim", "Arthur", "Adam", "Ali", "Tom", "Karen", "amanda", "Sarah", "samantha", "Hans", "Sasha");

        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");

        // 8) Stream rows from text file, sort, filter, and print
        Stream<String> bands = lines(Paths.get("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming\\src\\DENEME\\MOOC_10\\stream\\bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close(); // for memory usage


        System.out.println("----------------------9---------------------");

        // 9) Stream rows from text file and save to list
        List<String> bands2 = lines(Paths.get("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming\\src\\DENEME\\MOOC_10\\stream\\bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x)); // bands2.forEach(System.out::println);

        System.out.println("----------------------10---------------------");

        // 10) Stream rows from CSV file and count
        Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming\\src\\DENEME\\MOOC_10\\stream\\data.txt"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();

        System.out.println(rowCount + " rows.");
        rows1.close();

        System.out.println("----------------------11---------------------");

        // 11) Stream rows from CSV file, parse data from rows
        Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming\\src\\DENEME\\MOOC_10\\stream\\data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        rows2.close();

        System.out.println("----------------------12---------------------");

        // 12) Stream rows from CSV file, store fields in HashMap
        Stream<String> rows3 = Files.lines(Paths.get("C:\\Users\\eyela\\IdeaProjects\\JavaProgramming\\src\\DENEME\\MOOC_10\\stream\\data.txt"));
        Map<String, Integer> map = new HashMap<>();

        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("----------------------13---------------------");

        // 13) Reduction - sum
        double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, (Double a, Double b) -> a + b);

        System.out.println("total = " + total);

        System.out.println("----------------------14---------------------");

        // 14) Reduction - summary statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();

        System.out.println("summary = " + summary);


    }

}
