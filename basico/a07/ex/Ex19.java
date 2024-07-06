package basico.a07.ex;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num2: ");
        int num2 = scanner.nextInt();

        System.out.print("Operação [+ - / *]: ");
        String operacao = scanner.next();

        double resultado = 0;
        boolean valida = true;

        switch(operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
            resultado = num1 - num2;
            break;
            case "/":
            resultado = num1 / num2;
            break;
            case "*":
            resultado = num1 * num2;
            break;
            default:
                System.out.println("Operação inválida"); valida = false;
                break;
        }

        if(valida){

            System.out.println("Resultado: " + resultado);

            if(resultado >= 0){
                System.out.println("Positivo");
            } else{
                System.out.println("Negativo");
            }

            if(resultado % 2 == 0){
                System.out.println("Par");
            } else{
                System.out.println("Ímpar");
            }

        }

    }

}
