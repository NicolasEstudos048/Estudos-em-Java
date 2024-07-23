package basico.a08.ex;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero para fatorial: ");
        int num = scanner.nextInt();

        System.out.print(num + "!= ");

        int fatorial = 1;

        for (int i = num; i > 1; i--) {
            fatorial *= i;
            System.out.print(i + " . ");
        }
        System.out.print("1 = " + fatorial);

    }

}
