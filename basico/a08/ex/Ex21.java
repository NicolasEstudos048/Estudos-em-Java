package basico.a08.ex;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero de turmas: ");
        int numTurmas = scanner.nextInt();

        int numAlunos;
        int soma = 0;
        boolean invalido =true;

        for(int i=1; i<=numTurmas; i++) {

            invalido = true;
            do{
                System.out.print("Quantidade de alunos turma " + i + ": ");
                numAlunos = scanner.nextInt();
    
                if (numAlunos <= 40) { invalido = false; }
                else { System.out.println("Quantidade de alunos invalida. Deve ser menor ou igual a 40."); }
            } while(invalido);

            soma += numAlunos;
        }

        double media = soma / numTurmas;
        System.out.println("Media: " + media);

    }
}
