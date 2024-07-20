package basico.a08.ex;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("N-ésimo termo: ");
        int n = scanner.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");

        for(int i=3; i<=n; i++) {

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.print(proximo + " ");

        }


    }

}
