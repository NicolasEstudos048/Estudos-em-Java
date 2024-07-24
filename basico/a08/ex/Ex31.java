package basico.a08.ex;

import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de n: ");
        int n = scanner.nextInt();

        for (int i=1, j=1; i<=n; i++, j+=2) {
            System.out.print(i + "/" + j + " + ");

        }

    }

}
