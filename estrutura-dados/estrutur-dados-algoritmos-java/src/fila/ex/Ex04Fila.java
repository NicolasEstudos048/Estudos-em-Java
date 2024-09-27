package fila.ex;

import fila.Fila;
import java.util.Random;

/*
 * Simule a brincadiera Batata Quente
 */
public class Ex04Fila {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        for (int i = 0; i < 10; i++) {
            fila.enfileira(i);
        }

        Random aleatorio = new Random();
        int num = 0;

        while (num == 0) {
            num = aleatorio.nextInt(10);
        }

        System.out.println("Num: " + num);

        while (fila.getTamanho() > 1) {
            for (int i = 0; i < num; i++) {
                fila.enfileira(fila.desenfileira());
            }
            System.out.println("Eliminado: " + fila.desenfileira());
        }
        System.out.println("Só restou: " + fila.desenfileira());
    }
}
