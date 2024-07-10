package basico.a08.ex;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        int anos = 0;

        System.out.print("Saldo inicial do país A: ");
        int paisA = scanner.nextInt();

        System.out.print("Saldo inicial do país B: ");
        int paisB = scanner.nextInt();

        do {
            paisA = paisA + ((paisA * 3) / 100);
            paisB = paisB + ((paisB* 3) / 100);
            anos++;
        } while (paisA < paisB);

        System.out.println(paisA);
        System.out.println(paisB);
        System.out.println("Foram necessários " + anos + " anos para que o país A ultrapasse o país B.");

    }

}
