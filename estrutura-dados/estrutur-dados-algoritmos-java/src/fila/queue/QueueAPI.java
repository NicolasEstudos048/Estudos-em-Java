package fila.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAPI {
    public static void main(String[] args) {

        // Não existe a classe Queue no Java, é necessario implementar
        // Queue queue = new Queue<>();

        // Implementa usando o LinkedList, então assim será possivel utilizar os metodos
        // Queue
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1); // Enqueue
        queue.add(2);

        System.out.println(queue);
        System.out.println(queue.peek()); // Mostra o primeiro elemento sem remover
        System.out.println(queue.remove()); // Dequeue - Remove o primeiro elemento pq o Link implementou do Queue
        System.out.println(queue);
    }
}
