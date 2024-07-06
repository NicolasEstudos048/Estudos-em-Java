package basico.a06.ex;

import java.util.Scanner;

// Peça o número e imprima

public class Ex2 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scanner.nextInt();
        System.out.println("Você digitou: " + number);

    }

}
