package vetor.test;

import vetor.Vetor;

public class TestVetor {
    public static void main(String[] args) {
        Vetor vetor1 = new Vetor(10);

        /*
         * try {
         * vetor.adicionar("Elemento1");
         * vetor.adicionar("Elemento2");
         * vetor.adicionar("Elemento3");
         * } catch (Exception e) {
         * e.printStackTrace();
         * }
         */

        vetor1.adicionar("Elemento1");
        vetor1.adicionar("Elemento2");
        vetor1.adicionar("Elemento 3");

        System.out.println(vetor1.getTamanho());
        System.out.println(vetor1.toString());
        System.out.println(vetor1.busca(2));
        System.out.println(vetor1.busca("Elemento 3"));
        // System.out.println(vetor.busca(3));

        System.out.println("----------------------------------------------------------");

        Vetor vetor2 = new Vetor(10);
        vetor2.adicionar("B");
        vetor2.adicionar("C");
        vetor2.adicionar("E");
        vetor2.adicionar("F");
        vetor2.adicionar("G");

        System.out.println(vetor2);

        vetor2.adicionar(0, "A");
        System.out.println(vetor2);

        vetor2.adicionar(3, "D");
        System.out.println(vetor2);

        System.out.println("----------------------------------------------------------");

        Vetor vetor3 = new Vetor(3);
        vetor3.adicionar("B");
        vetor3.adicionar("C");
        vetor3.adicionar("E");
        vetor3.adicionar("F");
        vetor3.adicionar("G");

        System.out.println(vetor3);

    }
}
