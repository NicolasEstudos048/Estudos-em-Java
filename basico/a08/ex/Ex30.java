package basico.a08.ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        double percen = 1.5;

        salario += (salario / 100) * percen;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for(int i=1997; i<=2015; i++){

            percen *= 2;

            salario += (salario / 100) * percen;

            System.out.println(i + " = "  + format.format(salario) + " - " + percen + "%");

        }

    }

}
