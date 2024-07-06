package basico.a07.ex;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano Bissexto");
        }else {
            System.out.println("Ano Não Bissexto");
        }

    }

}
