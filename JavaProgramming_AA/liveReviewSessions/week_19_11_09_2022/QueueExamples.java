package week_19_11_09_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> cities = new ArrayDeque<>();
        cities.addAll(Arrays.asList("Edirne", "Ankara", "Izmir", "Kayseri", "Tirana", "Chisinau", "Oslo"));

        while (cities.size()>0){
            System.out.println("cities.poll() = " + cities.poll());
        }

        System.out.println("queue FIFO");

        System.out.println("cities.size() = " + cities.size());
        System.out.println("cities = " + cities);
    }
}
