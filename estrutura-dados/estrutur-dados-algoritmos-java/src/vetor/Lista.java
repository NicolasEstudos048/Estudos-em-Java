package vetor;

import java.lang.reflect.Array;

// Lista vai ter um tipo genérico que vai ser decidido na sua classe de execução
public class Lista<T> {
    // O tipo do array vai ser decidido na classe de execução
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        // Solução mais limpa de colocar que vai receber um Generic
        this.elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        // this.elementos = new T[capacidade]; Não é possivel usar isso, entao tem que
        // fazer o cast
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        tamanho = 0;
    }

    // Método adicionar retornando booleano
    // Retorna true caso adicionado com sucesso e false caso não haja espaço
    public boolean adicionar(T element) {
        this.aumentaCapacidade();
        if (this.getTamanho() < this.getElementos().length) {
            this.elementos[this.tamanho] = element;
            this.setTamanho(this.getTamanho() + 1);
            ;
            return true;
        }
        return false;
    }

    /*
     * Maneira de adicionar o elemento em qualquer posição
     * 
     * Copia o elemento anterior na posição seguinte, para que seja posssível
     * adicionar o elemento desejado na posição desejada sem perder nada
     */
    public Boolean adicionar(Integer posicao, T elemento) {
        validacao(posicao);
        this.aumentaCapacidade();
        for (int i = this.getTamanho() - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.getElementos()[i];
        }
        this.elementos[posicao] = elemento;
        this.setTamanho(this.getTamanho() + 1);

        return true;
    }

    /*
     * Aumenta a capacidade do vetor se o tamanho limite ja estiver atingido
     * 
     * A única maneira de aumentar a capacidade é copiando o vetor em outro de
     * tamnho maior
     */
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] novoElemento = (T[]) new Object[this.elementos.length * 2]; // Dobra a capacidade
            for (int i = 0; i < this.elementos.length; i++) {
                novoElemento[i] = this.elementos[i];
            }
            this.elementos = novoElemento; // após clonado o vetor, faz os elementos receberem ele
        }
    }

    /*
     * Remove Elementos de qualquer posição
     * 
     * Para isso, sobreescreve o numero removido pelo número a sua frente, e faz
     * isso para todas as posições que estão na frente que ainda não foram
     * sobreescritas, ignora o ultimo numero
     */
    public void remove(int posicao) {
        validacao(posicao);
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.getElementos()[i + 1];
        }
        this.setTamanho(this.getTamanho() - 1);
    }

    public void remove(T elemento) {
        int posicao = this.busca(elemento);
        if (posicao > -1) {
            this.remove(posicao);
        }
    }

    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    /*
     * Faz a busca dentro do Array e traz somente o elemento da posição
     * Ele não mostra elementos null, retornando a exception
     */
    public T busca(int posicao) {
        validacao(posicao);
        return this.getElementos()[posicao];
    }

    /*
     * Busca sequencial
     * 
     * Vai de posição em posição no vetor, e verifica se é o elemento procurado
     */
    public int busca(T elemento) {
        for (int i = 0; i < this.getTamanho(); i++) {
            if (this.getElementos()[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {
        /*
         * for(int i=0; i<this.getTamanho(); i++){
         * if(this.getElementos()[i].equals(elemento)){
         * return true;
         * }
         * }
         * return false;
         * 
         * int pos = busca(elemento);
         * if(pos > -1){
         * return true;
         * }
         * return false;
         */

        return busca(elemento) > -1;
    }

    public int ultimoIndice(T elemento) {
        for (int i = this.getTamanho() - 1; i >= 0; i--) {
            if (this.getElementos()[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Aplica uma exception se a posição que foi passada for invalida
    public void validacao(int posicao) {
        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição Inválida");
        }
    }

    public T[] getElementos() {
        return elementos;
    }

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
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
        // return "Vetor [elementos=" + Arrays.toString(elementos) + ", tamanho=" +
        // tamanho + "]";
    }
}
