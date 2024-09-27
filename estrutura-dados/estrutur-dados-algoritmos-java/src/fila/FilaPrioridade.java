package fila;

/*
* Esse método sobrescreve o método enfileira da classe Fila para fazer com que o novo elemento 
* seja inserido na fila em uma posição que respeite sua prioridade.
*
* Para definirmos prioridades, usamos o CompareTO do Comparable
* obj1 > obj2 retorna > 0 (1)
* obj1 < obj2 retorna < 0 (-1)
*/
public class FilaPrioridade<T> extends Fila<T> {

    @Override
    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i = 0; i < this.getTamanho(); i++) {
            /*
             * Se chave.compareTo(this.elementos[i]) < 0, significa que o novo
             * elemento tem uma prioridade menor (mais importante) que o elemento
             * elementos[i]. Nesse caso, a iteração é interrompida com break,
             * pois encontramos a posição correta onde o novo elemento deve ser inserido
             */
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adicionar(i, elemento);
    }
}
