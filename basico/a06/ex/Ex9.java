package basico.a06.ex;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = 5 * (fahrenheit - 32) / 9;

        System.out.println("Temperatura em Celsius: " + celsius);

    }

}
