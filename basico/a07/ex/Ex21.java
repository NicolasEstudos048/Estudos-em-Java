package basico.a07.ex;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos litros: ");
        double litros = scanner.nextDouble();

        System.out.print("Tipo de combustivel [A-alcool, G-gasolina]: ");
        String combustivel = scanner.next();

        double precoGas = 2.5;
        double precoAlcool = 1.9;
        int percDesconto = 0;
        double total = 0;
        double desconto = 0;

        if(combustivel.equalsIgnoreCase("a")){

            if(litros <= 20){
                percDesconto = 3;
            } else{
                percDesconto = 5;
            }

            total = litros * precoAlcool;

        } else if(combustivel.equalsIgnoreCase("g")){
            
            if(litros <= 20){
                percDesconto = 4;
            } else{
                percDesconto = 6;
            }

            total = litros * precoGas;

        }

        desconto = (total / 100) * percDesconto;

        double precoPagar = total - desconto;

        System.out.println("Preço a pagar: " + precoPagar);

    }

}
