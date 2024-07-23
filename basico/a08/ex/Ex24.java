package basico.a08.ex;

import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do pão: ");
        double precoPao = scanner.nextDouble();

        for (int i=1; i<=50; i++){ System.out.println(i + " - R$" + (precoPao * i)); }
    }

}
