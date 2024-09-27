package fila;

import estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) { // Enqueue
        super.adicionar(elemento);
    }

    public T espiar() { // Peek
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira() { // Dequeue
        final int POS = 0;
        if (this.estaVazia()) {
            return null;
        }
        T elementoRemovido = this.elementos[POS];
        this.remove(POS); // Remove o primeiro elemento
        return elementoRemovido;
    }
}
