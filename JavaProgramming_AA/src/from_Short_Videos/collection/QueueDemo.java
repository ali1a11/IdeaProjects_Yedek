package from_Short_Videos.collection;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        Queue<Integer> arrayDequeue = new ArrayDeque<>();

        Queue<Integer> linkedList = new LinkedList<>();

        priorityQueue.addAll(Arrays.asList(1, 20, 3, 40, 5, 6));
        arrayDequeue.addAll(Arrays.asList(1, 20, 3, 40, 5, 6));
        linkedList.addAll(Arrays.asList(1, 20, 3, 40, 5, 6));

        System.out.println("priorityQueue = " + priorityQueue); // priorityQueue = [1, 5, 3, 40, 20, 6] // random order
        System.out.println("arrayDequeue = " + arrayDequeue); // arrayDequeue = [1, 20, 3, 40, 5, 6] // insertion order
        System.out.println("linkedList = " + linkedList); // linkedList = [1, 20, 3, 40, 5, 6] // insertion order

        // FIFO

        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("arrayDequeue.poll() = " + arrayDequeue.poll());
        System.out.println("linkedList.poll() = " + linkedList.poll());

        System.out.println("priorityQueue = " + priorityQueue); // priorityQueue = [3, 5, 6, 40, 20]
        System.out.println("arrayDequeue = " + arrayDequeue); // arrayDequeue = [20, 3, 40, 5, 6]
        System.out.println("linkedList = " + linkedList); // linkedList = [20, 3, 40, 5, 6]

        // LinkedList has index number,  get() method

        System.out.println("((LinkedList)linkedList).get(2) = " + ((LinkedList) linkedList).get(2)); // 40

        System.out.println("---------------------------");

        for (Integer each : priorityQueue) {
            System.out.println(each);
        }

        System.out.println("---------------------------");
        for (Integer each : arrayDequeue) {
            System.out.println(each);
        }

        System.out.println("---------------------------");

        for (Integer each : linkedList) {
            System.out.println(each);
        }

        System.out.println("---------------------------");

        for (int i = 0; i < ((LinkedList) linkedList).size(); i++) {
            System.out.println(((LinkedList<Integer>) linkedList).get(i));
        }

    }
}
