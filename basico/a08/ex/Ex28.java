package basico.a08.ex;

import  java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        int num = scanner.nextInt();


        for(int i=1; i<=num; i++) {

            boolean primo = true;
        
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    primo = false;
                }
            } 
            if(primo) { System.out.println(i + " é primo"); }         
        }



    }

}
