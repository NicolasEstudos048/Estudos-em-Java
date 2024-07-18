package basico.a08.ex;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base: ");
        int base = scanner.nextInt();

        System.out.print("Expoente: ");
        int expoente = scanner.nextInt();

        int resultado = base;

        for(int i=1; i<expoente; i++) { resultado *= base; }
        System.out.println(resultado);

    }

}
