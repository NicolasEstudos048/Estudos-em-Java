package basico.a06.ex;

// Peça dois numeros e soma-os

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro: ");
        int numero2 = scanner.nextInt();

        System.out.println("A soma é: " + (numero1 + numero2));

    }

}
