package basico.a07.ex;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sexo [F/M]: ");
        String sexo = scanner.next();

        if(sexo.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        } else if(sexo.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else{
            System.out.println("Sexo invalido");
        }

    }
}
