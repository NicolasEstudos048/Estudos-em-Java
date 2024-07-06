package basico.a07.ex;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor A: ");
        double valorA = scanner.nextDouble();

        if(valorA == 0){
            System.out.println("Valor inválido");
        } else{
            
        System.out.print("Valor B: ");
        double valorB = scanner.nextDouble();

        System.out.print("Valor C: ");
        double valorC = scanner.nextDouble();

        double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;

        if(delta < 0){
            System.out.println("Delta negativo");
        } else{

            System.out.println("Delta: " + delta);

            double x1 = ((-valorB) + Math.sqrt(delta)) / (2 * valorA);
            double x2 = ((-valorB) - Math.sqrt(delta)) / (2 * valorA);

            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);

        }

        }

    }

}
