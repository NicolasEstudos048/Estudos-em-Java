package basico.a08.ex;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
    
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (nome.equalsIgnoreCase(senha)){
                System.out.println("Senha incorreta!");
            } else {
                break;
            }
            
        }

    }

}
