package basico.a06.ex;

import  java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero inteiro A: ");
        int a = scanner.nextInt();

        System.out.print("Numero inteiro B: ");
        int b = scanner.nextInt();

        System.out.print("Numero inteiro Real: ");
        double real = scanner.nextDouble();



        System.out.println("Primeira soma: " + (( a * 2) * (b / 2)));
        System.out.println("Segunda soma: " + ((a * 3) + real));
        System.out.println("Terceira soma: " + (Math.pow(real, 3)));

    }

}
