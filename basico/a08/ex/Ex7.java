package basico.a08.ex;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1;

        int maior = Integer.MIN_VALUE;

        for(int i=0; i<=4; i++) {
            System.out.print("Numero: ");
            num1 = scanner.nextInt();

            if(num1 > maior) {
                maior = num1;
            }
        }

        System.out.println(maior);
    }
}
