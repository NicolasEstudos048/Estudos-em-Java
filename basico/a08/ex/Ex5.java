package basico.a08.ex;

import java.util.Scanner;

public class Ex5 {

        public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        double paisA;
        double paisB;
        double taxaA;
        double taxaB;
        int anos = 0;

        boolean valido = false;
        do { 

            System.out.print("Saldo inicial do país A: ");
            paisA = scanner.nextDouble();

            if (paisA > 0){
                valido = true;
            } else { System.out.println("Insira valido!"); }
            
        } while (!valido);

        valido = false;
        do { 

            System.out.print("Saldo inicial do país B: ");
            paisB = scanner.nextDouble();

            if (paisB > 0){
                valido = true;
            } else { System.out.println("Insira valido!"); }
            
        } while (!valido);

        valido = false;
        do { 

            System.out.print("Taxa de crescimento país A: ");
            taxaA = scanner.nextDouble();

            if (taxaA > 0){
                valido = true;
            } else { System.out.println("Insira valido!"); }
            
        } while (!valido);

        valido = false;
        do { 

            System.out.print("Taxa de crescimento país B: ");
            taxaB = scanner.nextDouble();

            if (taxaB > 0){
                valido = true;
            } else { System.out.println("Insira valido!"); }
            
        } while (!valido);

        while (paisA < paisB) {
            
            paisA =+ (paisA / 100) * taxaA;
            paisB =+ (paisB / 100) * taxaB;
            anos++;
        }

        System.out.println(paisA);
        System.out.println(paisB);
        System.out.println("Foram necessários " + anos + " anos para que o país A ultrapasse o país B.");

    }

}
