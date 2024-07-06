package basico.a07.ex;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu salário: ");
        double salario = scanner.nextDouble();

        double aumento;
        int percentual;

        if(salario <= 280){
            percentual = 20;
        } else if(salario >=280 && salario < 700){
            percentual = 15;
        } else if(salario >= 700 && salario < 1500){
            percentual = 10;
        } else{
            percentual = 5;
        }

        aumento = (salario * percentual) / 100;

        System.out.println("Salario antes: " + salario);
        System.out.println("Aumento de " + percentual + "%");
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salario: " + (salario + aumento));
        
    }

}
