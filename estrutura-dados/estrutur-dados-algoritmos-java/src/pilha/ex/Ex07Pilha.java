package pilha.ex;

import pilha.Pilha;

/*
 * Desenvolva um algoritmo que resolva o quebra cabeça Torre de Hanoi
 */
public class Ex07Pilha {
    public static void main(String[] args) {
        Pilha<Integer> original = new Pilha<>();
        Pilha<Integer> destino = new Pilha<>();
        Pilha<Integer> auxiliar = new Pilha<>();

        original.empilha(4);
        original.empilha(3);
        original.empilha(2);
        original.empilha(1);

        torreHanoi(original.getTamanho(), original, destino, auxiliar);
    }

    public static void torreHanoi(int num, Pilha<Integer> original, Pilha<Integer> destino, Pilha<Integer> auxiliar) {
        if (num > 0) {
            torreHanoi(num - 1, original, auxiliar, destino);
            destino.empilha(original.desempilha());
            System.out.println("------------------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreHanoi(num - 1, auxiliar, destino, original);
        }
    }
}
