package basico.a06.ex;

// Area do quadrado

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lados: ");
        double base = scanner.nextDouble();

        double area = Math.pow(base, 2);

        System.out.println("Área: " + area);

        System.out.println("Seu dobro é: " + (area * 2));

    }

}
