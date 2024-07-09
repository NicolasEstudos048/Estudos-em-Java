package basico.a08;

public class LoopWhile {

    public static void main(String[] args) {
        
        int cont = 1;
        int max = 10;
    
        while(cont <= max){
            System.out.println("Valor: " + cont);
            cont++;  // Incremento a cada iteração
        }

        System.out.println(cont);

        do {
            cont++;  // Incremento a cada iteração
            System.out.println("Valor: " + cont);
        } while(cont < 15);

        System.out.println(cont);

    }

}
