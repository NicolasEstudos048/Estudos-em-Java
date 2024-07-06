package basico.a07.ex;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipo carne: ");
        System.out.println("1 - File duplo");
        System.out.println("1 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo =  scanner.nextInt();

        System.out.print("Qtd em KG: ");
        double qtd = scanner.nextDouble();

        double precoKg = 0;

        if(tipo == 1){

            System.out.println(qtd + "kg - File DUplo");

            if(qtd < 5){
                precoKg = 4.9;
            }else{
                precoKg = 5.8;
            }
        } else if(tipo == 2){

            System.out.println(qtd + "kg - Alcatra");

            if(qtd < 5){
                precoKg = 5.9;
            }else{
                precoKg = 6.8;
            }
        } else if(tipo == 3){

            System.out.println(qtd + "kg - Picanha");

            if(qtd < 5){
                precoKg = 6.9;
            }else{
                precoKg = 7.8;
            }
        }

        double total = qtd * precoKg;

        System.out.println(qtd + "kg * " + precoKg + " = " + total);

        System.out.print("No cartão? [1 para sim]: ");
        int cartao = scanner.nextInt();

        if(cartao == 1){
            double desconto = (total / 100) * 5;
            System.out.println("Desconto: " + desconto);
            System.out.println("Pagar: " + (total - desconto));
        } else{
            System.out.println("Pagar: " + total);
        }

    }

}
