package fila.ex;

import fila.Fila;

/*
 * Crie uma fila de documentos para serem impressos, cada um tem o nome e a qtd a ser impresso
 * o programa deve enfileirar os documentos, e na mesma ordem imprimir cada documento desenfileirando
 */
public class Ex01Fila {
    public static void main(String[] args) {
        Fila<Documento> fila = new Fila<>();
        fila.enfileira(new Documento("A", 1));
        fila.enfileira(new Documento("B", 2));
        fila.enfileira(new Documento("C", 3));
        fila.enfileira(new Documento("D", 7));
        fila.enfileira(new Documento("E", 9));

        while (!fila.estaVazia()) {
            Documento documento = fila.desenfileira();
            System.out.println(
                    "Imprimindo documento: " + documento.getNome() + ", " + documento.getQtdFolhas() + " folhas");
            try {
                Thread.sleep(200 * documento.getQtdFolhas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos documentos impressos!");
    }
}