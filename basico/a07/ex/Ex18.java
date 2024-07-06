package basico.a07.ex;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é impar");
        }

    }

}
