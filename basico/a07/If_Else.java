package basico.a07;

import java.util.Scanner;

public class If_Else {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade.");
        } else{
            System.out.println("Menor de idade.");
        }
        */

        System.out.print("Preço: ");
        double valor = scanner.nextDouble();

        if(valor <= 10){
            System.out.println("Barato");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Desconto...");
        } else if (valor >= 15 && valor <17) {
            System.out.println("Pesquisar");
        } else{
            System.out.println("Caro");
        }

    }

}
