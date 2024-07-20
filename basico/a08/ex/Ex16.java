package basico.a08.ex;

import java.util.Scanner;

public class Ex16 {

        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        System.out.println("Fibonacci até 500:");

        System.out.print(primeiro + " " + segundo + " ");

        /*
        do {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.print(proximo + " ");
        } while (proximo < 500);
        */

        while (proximo < 500){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.print(proximo + " ");
        }

    }
}
