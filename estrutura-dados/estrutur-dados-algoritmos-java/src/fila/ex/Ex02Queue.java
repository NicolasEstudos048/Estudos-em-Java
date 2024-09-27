package fila.ex;

import java.util.Queue;
import java.util.LinkedList;

/*
 * Distribua as senhas de atendimento a um grupo de pessoas. Deve ser senha prioritaria ou normal.
 * Seguintes critérios:
 * 1 atendente
 * 1 senha normal dev ser atendida a cada 3 senhas prioritaria
 * Não havendo prioritaria, senha normal deve ser atendida
 */
public class Ex02Queue {
    public static void main(String[] args) {
        Queue<String> regular = new LinkedList<>();
        Queue<String> prioridades = new LinkedList<>();

        final int MAX_PRIORITY = 3;

        regular.add("P1");
        regular.add("P2");
        regular.add("P3");
        regular.add("P4");
        regular.add("P5");
        regular.add("P6");
        regular.add("P7");
        regular.add("P8");
        regular.add("P9");
        regular.add("P10");

        prioridades.add("P1 PD");
        prioridades.add("P2 PD");
        prioridades.add("P3 PD");
        prioridades.add("P4 PD");
        prioridades.add("P5 PD");
        prioridades.add("P6 PD");
        prioridades.add("P7 PD");
        prioridades.add("P8 PD");
        prioridades.add("P9 PD");

        while (!regular.isEmpty() || !prioridades.isEmpty()) {
            int cont = 0;

            while (!prioridades.isEmpty() && cont < MAX_PRIORITY) {
                atendePessoa(prioridades);
                cont++;
            }

            if (!regular.isEmpty()) {
                atendePessoa(regular);
            }

            if (prioridades.isEmpty()) {
                while (!regular.isEmpty()) {
                    atendePessoa(regular);
                }
            }
        }
    }

    public static void atendePessoa(Queue<String> Queue) {
        String atendida = Queue.remove();
        System.out.println("atendida: " + atendida);
    }
}
