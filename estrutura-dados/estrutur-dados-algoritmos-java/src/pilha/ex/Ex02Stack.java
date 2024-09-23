package pilha.ex;

import java.util.Scanner;
import java.util.Stack;

/*
 * Ler 10 números, para cada número verifique:
 * 
 * Se par, empilhe na pilha par
 * Se impar, empilhe na pilha impar
 * Se zero, desempilha um de cada pilha, se vazia, exibir mensagem de erro
 * No final desempilhe tudo da duas pilhas, imprimindo na tela
 */
public class Ex02Stack {
    public static void main(String[] args) {
        Stack<Integer> stackPar = new Stack<>();
        Stack<Integer> stackImpar = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Numero %d: ", i + 1);
            int numero = scanner.nextInt();

            if (numero == 0) {
                // stackPar
                if (stackPar.isEmpty()) {
                    System.out.println("Pilha stackPar vazia");
                } else {
                    System.out.println("Removendo de stackPar " + stackPar.pop());
                }

                // stackImpar
                if (stackImpar.isEmpty()) {
                    System.out.println("Pilha stackImpar vazia");
                } else {
                    System.out.println("Removendo de stackImpar " + stackImpar.pop());
                }

            } else if (numero % 2 == 0) {
                System.out.println("Empilhando stackPar " + numero);
                stackPar.push(numero);
            } else {
                System.out.println("Empilhando stackImpar " + numero);
                stackImpar.push(numero);
            }
        }
        System.out.println(stackPar);
        System.out.println(stackImpar);

        while (!stackPar.isEmpty()) {
            System.out.println("Desempilhando de stackPar " + stackPar.pop());
        }

        while (!stackImpar.isEmpty()) {
            System.out.println("Desempilhando de stackImpar " + stackImpar.pop());
        }

        System.out.println(stackPar);
        System.out.println(stackImpar);

        scanner.close();
    }
}
