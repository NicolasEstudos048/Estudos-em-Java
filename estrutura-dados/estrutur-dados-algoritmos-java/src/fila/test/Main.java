package fila.test;

import fila.Fila;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(5);
        fila.enfileira(10);
        fila.enfileira(13);

        System.out.println(fila);

        System.out.println(fila.espiar());
        System.out.println(fila.desenfileira());
        System.out.println(fila.espiar());
        System.out.println(fila.getTamanho());

        System.out.println(fila);
    }
}
