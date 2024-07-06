package basico.a07.ex;

import java.util.Scanner;

public class EX15 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Lado C: ");
        double ladoC = scanner.nextDouble();

        if(((ladoA + ladoB) > ladoC) || ((ladoA + ladoC) > ladoB) || ((ladoB + ladoC) > ladoA)) {
            if(ladoA == ladoB && ladoA == ladoC) { System.out.println("Triangulo Equilatero"); } 
            else if(ladoA != ladoB && ladoA != ladoC && ladoC != ladoB) { System.out.println("Triangulo Escaleno"); } 
            else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) { System.out.println("Triangulo Isoceles"); }
        } else{
            System.out.println("Não é um triangulo");
        }

    }

}
