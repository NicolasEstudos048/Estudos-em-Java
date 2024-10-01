package lista;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    private final int NAO_ENCONTRADO = -1;
    private final String NAO_EXISTE = "Posição não existe";
    private final String LISTA_VAZIA = "Lista Vazia";

    /*
     * Adiciona um novo elemento à lista encadeada.
     * 
     * Se o tamanho da lista for 0, significa que a lista está vazia.
     * Nesse caso, o novo nó será tanto o primeiro quanto o último elemento da
     * lista.
     * O ponteiro 'inicio' e o ponteiro 'ultimo' serão atualizados para apontar para
     * este novo nó.
     * 
     * Caso já exista pelo menos um elemento na lista, o novo nó será adicionado ao
     * final.
     * O ponteiro 'ultimo' (que aponta para o último elemento atual) terá seu
     * próximo nó ('proximo') atualizado para o novo nó.
     * 
     * Em seguida, o ponteiro 'ultimo' é atualizado para apontar para o novo nó
     * adicionado, e o tamanho da lista é incrementado para refletir a adição do
     * novo elemento.
     */
    public void adicionar(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.getTamanho() == 0) {
            // Se a lista está vazia, o novo nó será o primeiro e o último
            this.inicio = celula;
        } else {
            // Se já houver elementos, atualiza o próximo do último nó
            this.ultimo.setProximo(celula);
        }
        // Atualiza o último nó para ser o novo nó
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionar(int posicao, T elemento) {
        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        if (posicao == 0) { // Vazia
            this.adicionarInicio(elemento);
        } else if (posicao == this.getTamanho()) { // Adiciona
            this.adicionar(elemento);
        } else { // Meio
            No<T> noAnterior = this.buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public void adicionarInicio(T elemento) {
        if (this.getTamanho() == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<>(elemento, this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public T removeInicio() {
        if (this.getTamanho() == 0) {
            throw new RuntimeException(LISTA_VAZIA);
        }
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.getTamanho() == 0) {
            this.ultimo = null;
        }

        return removido;
    }

    public T removeFinal() {
        if (this.getTamanho() == 0) {
            throw new RuntimeException(LISTA_VAZIA);
        }
        if (this.getTamanho() == 1) {
            return this.removeInicio();
        }
        No<T> penultimoNo = this.buscaNo(this.getTamanho() - 2);
        T removido = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo(null);
        this.ultimo = penultimoNo;
        this.tamanho--;

        return removido;
    }

    public T remove(int posicao) {
        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }
        if (posicao == 0) {
            return this.removeInicio();
        }
        if (posicao == this.getTamanho() - 1) {
            return this.removeFinal();
        }
        No<T> noAnterior = this.buscaNo(posicao - 1);
        No<T> atual = noAnterior.getProximo();
        No<T> proximo = atual.getProximo();
        noAnterior.setProximo(proximo);
        atual.setProximo(null);
        this.tamanho--;

        return atual.getElemento();
    }

    private boolean posicaoNaoExiste(int posicao) {
        return !(posicao >= 0 && posicao <= this.getTamanho());
    }

    public void limpa() {
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> buscaNo(int posicao) {
        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public T buscaPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {
        No<T> noAtual = this.inicio;
        int pos = 0;

        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }

        return NAO_ENCONTRADO;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        if (this.getTamanho() == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        No<T> atual = this.inicio;
        for (int i = 0; i < this.getTamanho() - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        /*
         * builder.append(atual.getElemento()).append(",");
         * while (atual.getProximo() != null) {
         * atual = atual.getProximo();
         * builder.append(atual.getElemento()).append(",");
         * }
         */

        return builder.toString();
    }
}
