package basico.a06.ex;

import  java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho em MB: " );
        double tamanho = scanner.nextDouble();

        System.out.print("Velocidade em Mbps: ");
        double velocidade = scanner.nextDouble();

        double tempo = tamanho / velocidade;

        System.out.println("Tempo: " + tempo + " minutos");

    }

}
