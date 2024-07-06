package basico.a07.ex;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num2: ");
        int num2 = scanner.nextInt();

        System.out.print("Num3: ");
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3) { // num1 é menor e num3 é maior

            System.out.println(num3 + " - " + num2 + " - " + num1);
            
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2) { // num1 é menor e num2 é maior

            System.out.println(num2 + " - " + num3 + " - " + num1);
            
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num2) { // num2 é menor e num3 é maior

            System.out.println(num3 + " - " + num1 + " - " + num2);
            
        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1) { // num2 é menor e num1 é maior

            System.out.println(num1 + " - " + num3 + " - " + num2);
            
        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2) { // num3 é menor e num2 é maior

            System.out.println(num2 + " - " + num1 + " - " + num3);
            
        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1) { // num3 é menor e num1 é maior

            System.out.println(num1 + " - " + num2 + " - " + num3);
            
        }

    }

}
