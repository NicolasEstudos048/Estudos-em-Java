package pilha.ex;

import java.util.Scanner;

import pilha.Pilha;

/*
 * Ler 10 números, para cada número verifique:
 * 
 * Se par, empilhe na pilha par
 * Se impar, empilhe na pilha impar
 * Se zero, desempilha um de cada pilha, se vazia, exibir mensagem de erro
 * No final desempilhe tudo da duas pilhas, imprimindo na tela
 */
public class Ex02Pilha {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Numero %d: ", i + 1);
            int numero = scanner.nextInt();

            if (numero == 0) {
                // Par
                Integer desempilhado = par.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha Par vazia");
                } else {
                    System.out.println("Removendo de par " + desempilhado);
                }

                // Impar
                desempilhado = impar.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha Impar vazia");
                } else {
                    System.out.println("Removendo de impar " + desempilhado);
                }

            } else if (numero % 2 == 0) {
                System.out.println("Empilhando par " + numero);
                par.empilha(numero);
            } else {
                System.out.println("Empilhando impar " + numero);
                impar.empilha(numero);
            }
        }
        System.out.println(par);
        System.out.println(impar);

        while (!par.estaVazia()) {
            System.out.println("Desempilhando de par " + par.desempilha());
        }

        while (!impar.estaVazia()) {
            System.out.println("Desempilhando de impar " + impar.desempilha());
        }

        System.out.println(par);
        System.out.println(impar);

        scanner.close();
    }
}
