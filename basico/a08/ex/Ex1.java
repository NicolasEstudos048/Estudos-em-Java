package basico.a08.ex;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            
            System.out.print("Num entre 0 e 10: ");
            int num = scanner.nextInt();

            System.out.println(num);

            if (num >= 0 && num <= 10) {
                break;
            }

        }

    }

}
