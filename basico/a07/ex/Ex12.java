package basico.a07.ex;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Horas trabalhadas: ");
        double horas = scanner.nextDouble();

        System.out.print("Valor hora: ");
        double valorHora = scanner.nextDouble();

        double salarioBruto = horas * valorHora;

        double imposto;

        if (salarioBruto <= 900) {
            imposto = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            imposto = salarioBruto * 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            imposto = salarioBruto * 0.1;
        } else {
            imposto = salarioBruto * 0.2;
        }

        double fgts = salarioBruto * 0.11;

        double inss = salarioBruto * 0.1;

        double descontos = inss + imposto;

        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário Bruto: " + salarioBruto);

        System.out.println("Imposto: " + imposto);

        System.out.println("INSS: " + inss);

        System.out.println("FGTS: " + fgts);

        System.out.println("Descontos: " + descontos);

        System.out.println("Salário Liquido: " + salarioLiquido);

    }

}
