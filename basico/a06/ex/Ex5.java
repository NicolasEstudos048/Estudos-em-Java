package basico.a06.ex;

// Converter metros em cm

import java.util.Scanner;


public class Ex5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        System.out.println("Centimetros: " + centimetros);

    }

}
