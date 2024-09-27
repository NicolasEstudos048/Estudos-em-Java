package fila.ex;

import fila.FilaPrioridade;

/*
 * Simile um sistemas de pronto socorro
 * As pessoas devem ser classificadas em 3 códigos: vermelho - maior,
 * amarelo - média e verde - leve
 * Deve obedecer as seguintes condições:
 * 
 * enfileire 6 pessoas
 * vermelho atender primeiro
 * cada consulta leva 5 segundos
 * a cada 4, chega uma com prioridade aleatória
 */
public class Ex03Fila {

    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {
        FilaPrioridade<Pessoa> fila = new FilaPrioridade<>();

        fila.enfileira(new Pessoa("1", VERDE));
        fila.enfileira(new Pessoa("2", AMARELO));
        fila.enfileira(new Pessoa("3", VERMELHO));
        fila.enfileira(new Pessoa("4", VERDE));
        fila.enfileira(new Pessoa("5", VERDE));
        fila.enfileira(new Pessoa("6", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNewPessoas pacientes = new PSNewPessoas(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();
    }
}
