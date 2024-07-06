package basico.a07.ex;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Telefonou para vitima? ");
        String resp1 = scanner.next();

        System.out.print("Esteve no local do crime? ");
        String resp2 = scanner.next();
        
        System.out.print("Mora perto da vitima? ");
        String resp3 = scanner.next();
        
        System.out.print("Trabalhou com a vitima? ");
        String resp4 = scanner.next();

        System.out.print("Devia para vitima? ");
        String resp5 = scanner.next();

        int cont = 0;

        if(resp1.equalsIgnoreCase("sim")){
            cont++;
        }
        if(resp2.equalsIgnoreCase("sim")){
            cont++;
        }
        if(resp3.equalsIgnoreCase("sim")){
            cont++;
        }
        if(resp4.equalsIgnoreCase("sim")){
            cont++;
        }
        if(resp5.equalsIgnoreCase("sim")){
            cont++;
        }

        if(cont == 2){
            System.out.println("Suspeito");
        } else if(cont == 3 || cont == 4){
            System.out.println("Cumplice");
        } else if(cont == 5){
            System.out.println("Assasino");
        } else if(cont == 0){
            System.out.println("Inocente");
        }

    }

}
