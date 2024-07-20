package basico.a08.ex;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qtd de Pessoas: ");
        int qtdPessoas = scanner.nextInt();

        int somaIdades = 0;
        double mediaIdades = 0;

        for(int i=0; i<qtdPessoas; i++){

            System.out.print("Idade Pessoa " + (i + 1 )+ ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }
        mediaIdades = somaIdades / qtdPessoas;

        System.out.println("Media das Idades: " + mediaIdades);

        if ((mediaIdades >= 0) && (mediaIdades <= 25)){
            System.out.println("Grupo: Jovens");
        } else if ((mediaIdades >= 26) && (mediaIdades <= 60)){
            System.out.println("Grupo: Adultos");
        } else if (mediaIdades > 60) {
            System.out.println("Grupo: Idosos");
        } else {
            System.out.println("Media das Idades Invalida");
        }

    }

}
