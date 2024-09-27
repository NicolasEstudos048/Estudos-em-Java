package estruturadados.base;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    // Começa com 10 de capacidade
    public EstruturaEstatica() {
        this(10);
    }

    // Retorna boolean se estiver vazia
    public boolean estaVazia() { // isEmpty()
        return this.tamanho == 0;
    }

    // Adiciona elemento
    protected boolean adicionar(T element) {
        this.aumentaCapacidade();
        if (this.getTamanho() < this.getElementos().length) {
            this.elementos[this.tamanho] = element;
            this.tamanho += 1;
            ;
            return true;
        }
        return false;
    }

    // Adiciona elemento na posição desejada
    protected Boolean adicionar(Integer posicao, T elemento) {
        validacao(posicao);
        this.aumentaCapacidade();
        for (int i = this.getTamanho() - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.getElementos()[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho += 1;

        return true;
    }

    // Remove elemento na posição desejada
    protected void remove(int posicao) {
        validacao(posicao);
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.getElementos()[i + 1];
        }
        this.tamanho -= 1;
    }

    // Aumenta automaticamente a capacidade do Vetor
    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] novoElemento = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novoElemento[i] = this.elementos[i];
            }
            this.elementos = novoElemento;
        }
    }

    private void validacao(int posicao) {
        if (!(posicao >= 0 && posicao <= this.getTamanho())) {
            throw new IllegalArgumentException("Posição Inválida");
        }
    }

    public T[] getElementos() {
        return elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        // Vai retornar sem que apareça os valores null
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < this.getTamanho(); i++) {
            stringBuilder.append(this.getElementos()[i]);
            if (i < this.getTamanho() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
