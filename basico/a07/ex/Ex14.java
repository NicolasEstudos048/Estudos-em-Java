package basico.a07.ex;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito = "";

        if (media >= 9 && media <= 10){
            conceito = "A";
        } else if (media >= 7.5 && media < 9){
            conceito = "B";
        } else if (media >= 6 && media < 7.5){
            conceito = "C";
        } else if (media >= 4 && media < 6){
            conceito = "D";
        } else if (media >= 0 && media < 4){
            conceito = "E";
        }

        System.out.println("Media: " + media);
        System.out.println("Conceito: " + conceito);

        switch(conceito){
            case "A":
            case "B":
            case "C": System.out.println("APROVADO"); break;
            default: System.out.println("REPROVADO"); break;
        }

    }

}
