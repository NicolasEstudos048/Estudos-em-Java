package basico.a09;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Num: ");
        int num = scanner.nextInt();

        System.out.print("Max: ");
        int max = scanner.nextInt();

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                // System.out.println(i);
                // break;
                continue;
            }
            System.out.println(i);
        }

    }

}
