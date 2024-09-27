package fila.ex;

import fila.Fila;

/*
 * Distribua as senhas de atendimento a um grupo de pessoas. Deve ser senha prioritaria ou normal.
 * Seguintes critérios:
 * 1 atendente
 * 1 senha normal dev ser atendida a cada 3 senhas prioritaria
 * Não havendo prioritaria, senha normal deve ser atendida
 */
public class Ex02Fila {
    public static void main(String[] args) {
        Fila<String> regular = new Fila<>();
        Fila<String> prioridades = new Fila<>();

        final int MAX_PRIORITY = 3;

        regular.enfileira("P1");
        regular.enfileira("P2");
        regular.enfileira("P3");
        regular.enfileira("P4");
        regular.enfileira("P5");
        regular.enfileira("P6");
        regular.enfileira("P7");
        regular.enfileira("P8");
        regular.enfileira("P9");
        regular.enfileira("P10");

        prioridades.enfileira("P1 PD");
        prioridades.enfileira("P2 PD");
        prioridades.enfileira("P3 PD");
        prioridades.enfileira("P4 PD");
        prioridades.enfileira("P5 PD");
        prioridades.enfileira("P6 PD");
        prioridades.enfileira("P7 PD");
        prioridades.enfileira("P8 PD");
        prioridades.enfileira("P9 PD");

        while (!regular.estaVazia() || !prioridades.estaVazia()) {
            int cont = 0;

            while (!prioridades.estaVazia() && cont < MAX_PRIORITY) {
                atendePessoa(prioridades);
                cont++;
            }

            if (!regular.estaVazia()) {
                atendePessoa(regular);
            }

            if (prioridades.estaVazia()) {
                while (!regular.estaVazia()) {
                    atendePessoa(regular);
                }
            }
        }
    }

    public static void atendePessoa(Fila<String> fila) {
        String atendida = fila.desenfileira();
        System.out.println("atendida: " + atendida);
    }
}
