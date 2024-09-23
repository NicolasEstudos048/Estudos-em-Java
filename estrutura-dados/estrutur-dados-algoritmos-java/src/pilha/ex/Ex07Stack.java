package pilha.ex;

import java.util.Stack;

/*
 * Desenvolva um algoritmo que resolva o quebra cabeça Torre de Hanoi
 */
public class Ex07Stack {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);

        torreHanoi(original.size(), original, destino, auxiliar);
    }

    public static void torreHanoi(int num, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar) {
        if (num > 0) {
            torreHanoi(num - 1, original, auxiliar, destino);
            destino.push(original.pop());
            System.out.println("------------------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreHanoi(num - 1, auxiliar, destino, original);
        }
    }
}
