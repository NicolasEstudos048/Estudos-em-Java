package basico.a08.ex;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int num = scanner.nextInt();

        for(int i=0; i<=10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }

    }

}
