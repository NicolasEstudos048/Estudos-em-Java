package vetor.test;

import vetor.Lista;

public class VetorGenerico {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(1);

        vetor.adicionar("Elemento1");
        // vetor.adicionar(2); Só aceita string
        vetor.adicionar("Elemento2");

        System.out.println(vetor.contem("Elemento1"));
        System.out.println(vetor.contem("Elemento3"));

        System.out.println(vetor);
    }
}
