package basico.a08.ex;

import java.util.Scanner;

public class Ex33 {

        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de n: ");
        int n = scanner.nextInt();

        double soma = 0;

        for (int i=1; i<=n; i++) { soma += 1/i; }
        System.out.println("Soma: " + soma);
    }

}
