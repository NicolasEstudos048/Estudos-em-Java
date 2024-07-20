package basico.a08.ex;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        int num = scanner.nextInt();

        boolean primo = true;

        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                System.out.println(num + " não é primo");
                primo = false;
            }
        } 
        if(primo) { System.out.println(num + " é primo"); } 

    }

}
