package basico.a10.ex;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int[] vetA = new int[8];
        int[] vetB = new int[vetA.length];

        for(int i=0; i<vetA.length; i++){
            
            System.out.println("Valor " + i + ": ");
            vetA[i] = scanner.nextInt();

            vetB[i] = vetA[i] * 2;
        }

        System.out.println("Vetor A");
        for(int i : vetA){ System.out.println(i); }

        System.out.println("Vetor B");
        for(int i : vetB){ System.out.println(i); }


    }

}
