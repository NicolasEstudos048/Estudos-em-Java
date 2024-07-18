package basico.a08.ex;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num;
        int soma = 0;
        double media;

        for(int i=1; i<=5; i++){
            System.out.print("Numero: ");
            num = scanner.nextInt();
            soma += num;
        }

        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

    }

}
