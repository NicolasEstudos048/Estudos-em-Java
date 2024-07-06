package basico.a06.ex;

// Total salario mensal

import java.util.Scanner;


public class Ex8 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        double hora = scanner.nextDouble();

        System.out.print("Horas trabalhadas no mês: ");
        double trabalhado = scanner.nextDouble();

        System.out.println("Salário é: " + (hora * trabalhado));
    }

}
