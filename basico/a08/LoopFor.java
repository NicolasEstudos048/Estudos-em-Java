package basico.a08;

public class LoopFor {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++){
            System.out.println(i);
        }

        for (int i = 5; i >= 0; i--){
            System.out.println(i);
        }

        for (int i=0, j=10; i < j; i++, j--){ 
            System.out.println("i: " + i + " j: " + j);
        }

        int cont = 0;
        for (; cont < 10; ) {
            System.out.println(cont);
            cont+=2; 
        }

        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.println(soma);
        
    }

}
