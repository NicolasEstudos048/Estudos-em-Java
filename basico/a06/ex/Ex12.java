package basico.a06.ex;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sua altura: ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Peso Ideal: " + pesoIdeal);

    }

}
