package basico.a08.ex;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero para fatorial: ");
        int num = scanner.nextInt();

        System.out.print(num + "!= ");

        int fatorial = num;

        for (int i = num - 1; i > 0; i--) {
            fatorial *= i;
            System.out.print(i+" ");
        }
        System.out.print("= " + fatorial);

    }

}
