package vetor.test;

import vetor.Lista;

public class VetorGenerico {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(1);

        vetor.adicionar("Elemento1");
        // vetor.adicionar(2); Só aceita string
        vetor.adicionar("Elemento2");
        vetor.adicionar("Elemento3");

        System.out.println(vetor.contem("Elemento1")); // Contains do ArrayList
        System.out.println(vetor.contem("Elemento3"));

        System.out.println(vetor.ultimoIndice("Elemento1")); // lastIndexOf do ArrayList

        System.out.println(vetor);

        System.out.println(vetor.obtem(0)); // Get do ArrayList
        System.out.println(vetor.obtem(1));

        vetor.remove("Elemento1"); // Remove do ArrayList onde passa o proprio elemento como paramentro
        System.out.println(vetor);
    }
}
