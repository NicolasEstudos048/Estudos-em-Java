package basico.a07.ex;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num2: ");
        int num2 = scanner.nextInt();

        System.out.print("Num3: ");
        int num3 = scanner.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Num 1 é maior");
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println("Num2 é maior");
        } else if(num3 >= num1 && num3 >= num2){
            System.out.println("Num3 é maior");
        }

    }
    
}
