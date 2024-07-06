package basico.a06.ex;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em fahrenheit: " + fahrenheit);

    }

}
