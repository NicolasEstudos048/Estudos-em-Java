package basico.a07.ex;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço1: ");
        double preco1 = scanner.nextDouble();

        System.out.print("Preço2: ");
        double preco2 = scanner.nextDouble();

        System.out.print("Preço3: ");
        double preco3 = scanner.nextDouble();

        if(preco1 <= preco2 && preco1 <= preco3){
            System.out.println("Comprar produto 1");
        } else if(preco2 <= preco1 && preco2 <= preco3){
            System.out.println("Comprar produto 2");
        } else if(preco3 <= preco1 && preco3 <= preco2){
            System.out.println("Comprar produto 3");
        }

    }

}
