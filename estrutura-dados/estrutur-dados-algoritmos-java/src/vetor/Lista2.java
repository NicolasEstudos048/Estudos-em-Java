package vetor;

import estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {
    public Lista2() {
        super();
    }

    public Lista2(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adicionar(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adicionar(posicao, elemento);
    }

    public void remove(int posicao) {
        super.remove(posicao);
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        return elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
