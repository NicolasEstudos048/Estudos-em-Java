package fila.test;

import fila.FilaPrioridade;

public class MainFilaPrioridade {
    public static void main(String[] args) {
        FilaPrioridade<Integer> fila = new FilaPrioridade<>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);

        System.out.println(fila); // 1 2 3 e nao 1 3 2
    }
}
