package pilha.test;

import pilha.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i <= 10; i++) {
            pilha.empilha(i); // Push
        }

        System.out.println(pilha);

        System.out.println(pilha.getTamanho());
        System.out.println(pilha.estaVazia()); // isEmpty()
        System.out.println(pilha.topo()); // Peek
        System.out.println(pilha.desempilha()); // Pop

        System.out.println(pilha);
    }
}
