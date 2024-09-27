package fila.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAPI {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(2);
        queue.add(1);

        System.out.println(queue);
    }
}
