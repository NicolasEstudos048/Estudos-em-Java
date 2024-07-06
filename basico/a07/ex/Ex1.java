package basico.a07.ex;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num2: ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("num1 é maior");
        } else if(num1 == num2){
            System.out.println("São iguais");
        } else{
            System.out.println("num2 é maior");
        }

    }

}
