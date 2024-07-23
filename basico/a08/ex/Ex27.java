package basico.a08.ex;

import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qts temperaturas: ");
        int qtdeTemperaturas = scanner.nextInt();

        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;


        for(int i=1; i<=qtdeTemperaturas; i++) {

            System.out.print("Temperatura " + i + ": ");
            temp = scanner.nextDouble();

            soma += temp;

            if(temp > maior) { maior = temp; }
            if(temp < menor) { menor = temp; }
        }

        System.out.println("Média: " + (soma / qtdeTemperaturas));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);

    }

}
