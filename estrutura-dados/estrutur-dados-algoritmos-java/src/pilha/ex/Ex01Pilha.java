package pilha.ex;

import java.util.Scanner;
import pilha.Pilha;

/*
 * Ler 10 números, para cada número verifique:
 * 
 * Se par, empilhe
 * Se impar, desempilhe um numero, caso vazia mostrar mensagem
 * Se no final não estiver vazia, desempilhar todos, mostrando na tela
 */
public class Ex01Pilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Numero %d: ", i + 1);
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando " + num);
                pilha.empilha(num);
            } else {
                Integer desempilha = pilha.desempilha();
                if (desempilha == null) {
                    System.out.println("Pilha vazia");
                } else {
                    System.out.println("Desempilhando " + desempilha);
                }
            }
        }
        System.out.println(pilha);

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando " + pilha.desempilha());
        }
        System.out.println(pilha);
        scanner.close();
    }
}
