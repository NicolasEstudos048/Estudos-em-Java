package basico.a08.ex;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int contPar = 0;
        int contImpar = 0;

        for(int i=0; i<10; i++) {

            System.out.print("Numero: ");
            int num = scanner.nextInt();

            if(num % 2 == 0) { contPar++; }
            else { contImpar++; }
        }

        System.out.println("Quantidade de numeros pares: " + contPar);
        System.out.println("Quantidade de numeros impares: " + contImpar);
        
    }

}
