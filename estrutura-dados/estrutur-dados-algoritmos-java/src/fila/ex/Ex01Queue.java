package fila.ex;

import java.util.Queue;
import java.util.LinkedList;

/*
 * Crie uma fila de documentos para serem impressos, cada um tem o nome e a qtd a ser impresso
 * o programa deve enfileirar os documentos, e na mesma ordem imprimir cada documento desenfileirando
 */
public class Ex01Queue {
    public static void main(String[] args) {
        Queue<Documento> fila = new LinkedList<>();
        fila.add(new Documento("A", 1));
        fila.add(new Documento("B", 2));
        fila.add(new Documento("C", 3));
        fila.add(new Documento("D", 7));
        fila.add(new Documento("E", 9));

        while (!fila.isEmpty()) {
            Documento documento = fila.remove();
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
