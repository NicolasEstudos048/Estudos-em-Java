package vetor;

import java.util.Arrays;

// Vetores e Arrays
public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        tamanho = 0;
    }

    // Maneiras para o método adiocionar

    // Emite uma exception caso for adiocionar e não tiver espaço no vetor
    /*
     * public void adicionar(String elemento) {
     * for (int i = 0; i < this.elementos.length; i++) {
     * if (this.elementos[i] == null) {
     * this.elementos[i] = elemento;
     * break;
     * }
     * }
     * }
     */

    // Maneira 2 com método adicionar com tratamento de exception
    /*
     * public void adicionar(String element) throws Exception {
     * if (this.tamanho < this.elementos.length) {
     * this.elementos[this.tamanho] = element;
     * this.tamanho++;
     * } else {
     * throw new Exception("Vetor cheio, não é possível adiocionar");
     * }
     * }
     */

    // Maneira 3 com método adicionar retornando booleano
    // Retorna true caso adicionado com sucesso e false caso não haja espaço
    public boolean adicionar(String element) {
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
    public Boolean adicionar(Integer posicao, String elemento) {
        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        for (int i = this.getTamanho() - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.getElementos()[i];
        }
        this.elementos[posicao] = elemento;
        this.setTamanho(this.getTamanho() + 1);

        return true;
    }

    /*
     * Faz a busca dentro do Array e traz somente o elemento da posição
     * Ele não mostra elementos null, retornando a exception
     * Caso a posição seja inválida, lança uma IllegalArgumentException com a
     * mensagem "Posição Inválida"
     */
    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.getElementos()[posicao];
    }

    /*
     * Busca sequencial
     * 
     * Vai de posição em posição no vetor, e verifica se é o elemento procurado
     */
    public Integer busca(String elemento) {
        for (int i = 0; i < this.getTamanho(); i++) {
            if (this.getElementos()[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
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
