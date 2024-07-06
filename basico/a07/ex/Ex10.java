package basico.a07.ex;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual periodo você estuda [M-Matutino, V-Vespertino, N-Noturno]: ");
        String periodo = scanner.next();

        if(periodo.equalsIgnoreCase("m")){
            System.out.println("Bom dia!");
        } else if(periodo.equalsIgnoreCase("v")){
            System.out.println("Boa tarde!");
        } else if(periodo.equalsIgnoreCase("n")){
            System.out.println("Boa Noite!");
        } else{
            System.out.println("Periodo invalido");
        }

    }

}
