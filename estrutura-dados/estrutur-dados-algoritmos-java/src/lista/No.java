package lista;

/*
 * Referencia um elemento para o proximo
 */
public class No<T> {
    private T elemento;
    private No<T> proximo;

    public No(T elemento) {
        // O primeiro elemento aponta para null
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(T elemento, No<T> proximo) {
        // Os demais elementos apontam para o proximo
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
    }
}
