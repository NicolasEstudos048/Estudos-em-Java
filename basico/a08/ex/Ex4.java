package basico.a08.ex;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        double paisA = 80000;
        double paisB = 200000;
        int anos = 0;

        do {
            paisA = paisA + ((paisA * 3) / 100);

            paisB = paisB + ((paisB * 1.5) / 100);

            anos++;

        } while (paisA < paisB);

        System.out.println(paisA);
        System.out.println(paisB);
        System.out.println("Foram necessários " + anos + " anos para que o país A ultrapasse o país B.");

    }


}
