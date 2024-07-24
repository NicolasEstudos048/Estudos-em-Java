package basico.a08.ex;

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabuada de: ");
        int num = scanner.nextInt();

        System.out.print("Começar em: ");
        int start = scanner.nextInt();

        System.out.print("Terminar em: ");
        int end = scanner.nextInt();

        if (end > start){
            System.out.println("Tabuada do " + num + " começando em " + start + " terminando em " + end);
            for(int i = start; i <= end; i++){
                int tabuada = num;
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
        } else { System.out.println("Invalido"); }

    }

}
