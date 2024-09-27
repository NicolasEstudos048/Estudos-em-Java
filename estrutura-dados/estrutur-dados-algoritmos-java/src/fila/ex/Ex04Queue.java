package fila.ex;

import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;

/*
 * Simule a brincadiera Batata Quente
 */
public class Ex04Queue {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            fila.add(i);
        }

        Random aleatorio = new Random();
        int num = 0;

        while (num == 0) {
            num = aleatorio.nextInt(10);
        }

        System.out.println("Num: " + num);

        while (fila.size() > 1) {
            for (int i = 0; i < num; i++) {
                fila.add(fila.remove());
            }
            System.out.println("Eliminado: " + fila.remove());
        }
        System.out.println("Só restou: " + fila.remove());
    }
}
