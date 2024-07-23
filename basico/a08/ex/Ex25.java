package basico.a08.ex;

import java.util.Scanner;

public class Ex25 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {

            double soma = 0;

            System.out.print("Quantidade de produto: ");
            int qtd = scanner.nextInt();

            for (int i=1; i<=qtd; i++) {

                System.out.print("Produto " + i + ": R$");
                double preco = scanner.nextDouble();
                if (preco < 0) { System.out.println("Invalido"); }
                else if (preco == 0) { break; }
                else { soma += preco; }
            }

            System.out.println("Total: R$" + soma);
            System.out.print("Dinheiro: ");
            double dinheiro = scanner.nextDouble();

            System.out.println("Troco: " + (dinheiro - soma));

            System.out.print("Cotinuar? [S/N] ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("S")) { break; }
        }

    }

}
