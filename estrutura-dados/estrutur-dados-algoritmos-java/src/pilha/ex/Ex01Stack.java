package pilha.ex;

import java.util.Scanner;
import java.util.Stack;

/*
 * Ler 10 números, para cada número verifique:
 * 
 * Se par, empilhe
 * Se impar, desempilhe um numero, caso vazia mostrar mensagem
 * Se no final não estiver vazia, desempilhar todos, mostrando na tela
 */
public class Ex01Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Numero %d: ", i + 1);
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando " + num);
                stack.push(num);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("stack vazia");
                } else {
                    System.out.println("Desempilhando " + stack.pop());
                }
            }
        }
        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.println("Desempilhando " + stack.pop());
        }
        System.out.println(stack);
        scanner.close();
    }
}
