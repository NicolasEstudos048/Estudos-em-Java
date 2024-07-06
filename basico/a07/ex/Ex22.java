package basico.a07.ex;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Morangos [Kg]: ");
        double morangos = scanner.nextDouble();

        System.out.print("Maças [Kg]: ");
        double macas = scanner.nextDouble();

        double precoKgMorango = 0;
        if (morangos <= 5) {
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca = 0;
        if (morangos <= 5) {
            precoKgMorango = 1.8;
        } else {
            precoKgMorango = 1.5;
        }

        double precoMorango = morangos * precoKgMorango;
        double precoMaca = macas * precoKgMaca;

        double precoParcial = precoMorango + precoMaca;
        double precoTotal = precoParcial;

        if((morangos + macas > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }

        System.out.println("Preco Total: " + precoTotal);

    }

}
