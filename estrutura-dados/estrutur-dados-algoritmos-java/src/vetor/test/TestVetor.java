package vetor.test;

import vetor.Vetor;

public class TestVetor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        /*
         * try {
         * vetor.adicionar("Elemento1");
         * vetor.adicionar("Elemento2");
         * vetor.adicionar("Elemento3");
         * } catch (Exception e) {
         * e.printStackTrace();
         * }
         */

        vetor.adicionar("Elemento1");
        vetor.adicionar("Elemento2");
        vetor.adicionar("Elemento 3");

        System.out.println(vetor.getTamanho());

        System.out.println(vetor.toString());

        System.out.println(vetor.busca(2));
        // System.out.println(vetor.busca(3));

        System.out.println(vetor.busca("Elemento 3"));
    }
}
