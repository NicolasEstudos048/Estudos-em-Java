package basico.a06.ex;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        double hora = scanner.nextDouble();

        System.out.print("Horas trabalhadas no mês: ");
        double trabalhado = scanner.nextDouble();

        double salarioBruto = hora * trabalhado;
        double imposto = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double descontos = inss + sindicato + imposto;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Imposto: " + imposto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Total de descontos: " + descontos);
        System.out.println("Salário Líquido: " + salarioLiquido);

    }

}
