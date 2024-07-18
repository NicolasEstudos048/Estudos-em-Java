package basico.a08.ex;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num2: ");
        int num2 = scanner.nextInt();

        for(int i = num1; i <= num2; i++){
            System.out.println(i);
        }

    }

}
