package lista.test;

import lista.ListaEncadeada;

public class ListaEncadeadaTest {
    public static void main(String[] args) {
        // testesIniciais();

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionarInicio(3);
        lista.adicionarInicio(2);
        lista.adicionarInicio(1);

        lista.adicionar(0, 5);
        System.out.println(lista);

        System.out.println(lista.removeInicio());
        System.out.println(lista);

        System.out.println(lista.removeFinal());
        System.out.println(lista);

        lista.adicionar(4);
        lista.adicionar(5);
        lista.adicionar(6);
        System.out.println(lista);

        System.out.println(lista.remove(3));
        System.out.println(lista);
    }

    public static void testesIniciais() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionar(1);

        System.out.println(lista.getTamanho());
        System.out.println(lista);

        lista.adicionar(2);
        System.out.println(lista);

        lista.adicionar(3);
        System.out.println(lista);

        // lista.limpa();
        // System.out.println(lista.getTamanho());
        // System.out.println(lista);

        System.out.println(lista.busca(0));
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));

        System.out.println("--------------------------------");

        System.out.println(lista.buscaPosicao(0));
        System.out.println(lista.buscaPosicao(1));
        System.out.println(lista.buscaPosicao(2));
        // System.out.println(lista.buscaPosicao(-1));
        // System.out.println(lista.buscaPosicao(4));
    }
}
