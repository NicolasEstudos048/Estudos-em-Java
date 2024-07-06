package basico.a07.ex;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia semana [1 á 7]: ");
        int diaSemana = scanner.nextInt();

        switch(diaSemana){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("invalido"); break;
        }
        
    }

}
