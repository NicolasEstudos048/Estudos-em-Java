package basico.a06.ex;

// Area do circulo

import java.util.Scanner;


public class Ex6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Raio do circulo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area: " + area);

    }

}
