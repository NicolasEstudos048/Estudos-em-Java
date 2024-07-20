package basico.a08.ex;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas? ");
        int qtdNotas = scanner.nextInt();

        double soma = 0;
        double media;

        for(int i=0; i<qtdNotas; i++){
            
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }
        media = soma / qtdNotas;
        System.out.print("Média: " + media);


    }

}
