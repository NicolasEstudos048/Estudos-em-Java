package basico.a08.ex;

import java.util.Scanner;

public class Ex11 {

        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num2: ");
        int num2 = scanner.nextInt();

        int soma = 0;

        for(int i = num1; i <= num2; i++){
            soma += i;
        }

        System.out.println("Soma: " + soma);

    }


}
