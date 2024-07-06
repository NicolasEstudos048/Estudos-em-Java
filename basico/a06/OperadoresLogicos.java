package basico.a06;

public class OperadoresLogicos {

    public static void main(String[] args) {

        /*      
                & - AND - os dois tem que ser verdadeiros
                | - OR - um dos dois tem que ser verdadeiro
                ^ - XOR	- se os dois forem verdadeiros ele da falso e vice versa
                && - AND curto circuito - faz mesma coisa que o & , porém se o primeiro for falso ele não vai verificar o segundo
                || - OR curto circuito - faz mesma coisa que o | , porém se o primeiro for falso ele não vai verificar o segundo
                ! - NOT - se for verdadeiro ele da falso
         */
        
        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);	

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(verdadeiro && falso);
        System.out.println(!verdadeiro || falso);

    }
    
}
