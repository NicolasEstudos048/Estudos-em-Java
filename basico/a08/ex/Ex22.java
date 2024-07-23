package basico.a08.ex;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num de Cds: ");
        int numCds = scanner.nextInt();

        double preco;
        double soma = 0; 
        for (int i = 1; i <= numCds; i++) {
            System.out.print("Valor do CD " + i + ": ");
            preco = scanner.nextDouble();

            soma += preco;
        }

        double media = soma / numCds;

        System.out.print("Média do CD: " + media);

    }

}
