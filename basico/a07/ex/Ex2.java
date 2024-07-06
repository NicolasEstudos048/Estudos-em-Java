package basico.a07.ex;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println(num + " é positivo");
        } else if(num < 0){
            System.out.println(num + " é negativo");
        } else {
            System.out.println(num + " é nulo");
        }

    }

}
