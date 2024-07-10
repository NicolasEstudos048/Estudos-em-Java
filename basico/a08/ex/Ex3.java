package basico.a08.ex;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        boolean sexo = false;
        boolean estadoCivil = false;

        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine();
        } while (nome.length() < 3);

        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Salario: ");
            salario = scanner.nextDouble();

        } while (salario < 0);

        do {
            System.out.print("Sexo [F - M]: ");
            String sexo1 = scanner.next();

            if (sexo1.equalsIgnoreCase("F") || sexo1.equalsIgnoreCase("M")) {
                sexo = true;
            }

        } while (sexo == false);

        do {
            System.out.print("Estado Civil: ");
            String estadoCivil1 = scanner.next();

            if (estadoCivil1.equalsIgnoreCase("S") || estadoCivil1.equalsIgnoreCase("C") || estadoCivil1.equalsIgnoreCase("D") || estadoCivil1.equalsIgnoreCase("V")) {
                estadoCivil = true;
            }

        } while (estadoCivil == false); 

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(estadoCivil);

    }

}
