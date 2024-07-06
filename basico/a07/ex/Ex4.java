package basico.a07.ex;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scanner.next();

        if(letra.length() > 1){

            System.out.println("Invalido");

        } else{

            switch(letra){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U": System.out.println("Vogal"); break;
                default: System.out.println("Consoante"); break; 
            }

        }


    }

}
