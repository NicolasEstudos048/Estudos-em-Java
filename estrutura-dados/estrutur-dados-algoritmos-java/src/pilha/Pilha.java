package pilha;

import estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    // Adiciona na Pilha
    public void empilha(T element) { // Push
        super.adicionar(element);
    }

    // Retorna o Topo da Pilha
    public T topo() { // Peek
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[this.getTamanho() - 1];
    }

}
