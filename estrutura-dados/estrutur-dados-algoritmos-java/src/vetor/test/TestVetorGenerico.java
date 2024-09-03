package vetor.test;

import vetor.VetorGenerico;

public class TestVetorGenerico {
    public static void main(String[] args) {
        VetorGenerico vetor = new VetorGenerico(3);

        Contato c1 = new Contato("Contato1", "111-111", "c1@gmail.com");
        Contato c2 = new Contato("Contato2", "222-222", "c2@gmail.com");
        Contato c3 = new Contato("Contato3", "333-333", "c3@gmail.com");

        // É igual ao c1, e como apliquei o equals e hashcode na classe Contato,
        // vai dar que existe no vetor, mesmo não sendo adicionado
        Contato c4 = new Contato("Contato1", "111-111", "c1@gmail.com");

        vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);

        int pos = vetor.busca(c4);
        if (pos > -1) {
            System.out.println("Elemento existe");
        } else {
            System.out.println("Não existe!");
        }

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);

        /*
         * vetor.adicionar("A");
         * vetor.adicionar(2);
         * vetor.adicionar(true);
         * System.out.println(vetor);
         * 
         * System.out.println(vetor.busca(2));
         * System.out.println(vetor.busca("A"));
         * System.out.println(vetor.busca(true));
         * 
         * vetor.remove(2);
         * System.out.println(vetor);
         */
    }
}
