package basico.a07.ex;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Media: " + media);

        if(media > 10 || media < 0) {
            System.out.println("Nota inválida");
        } else {
            if(media == 10) {
                System.out.println("Aprovado com Distinção");
            }else if(media >= 7) {
                System.out.println("Aprovado");
            }else {
                System.out.println("Reprovado");
            }
        }
    }
}
