package pilha.ex;

import pilha.Pilha;

/*
 * Verifique se uma expressão matemática tem os parênteses agrupados de forma correta, isto é:
 * 1 - Se o número de parênteses a direita e a esquerda são iguais
 * 2 - Se todo parêntese aberto é seguido posteriormente por um fechamento de parêntese
 * Exemplos:
 * 
 * ((A+B) ou A+B( violam a condição 1
 * )A+B(- C ou (A+B)) - (C+D violam a condicão 2
 * ((A+B)+D) está ok
 */
public class Ex05Pilha {
    public static void main(String[] args) {
        imprimeResultado("A+B");
        imprimeResultado("A+B+((C - d)");
        imprimeResultado("{[()]}[](){()}");
        imprimeResultado("{[(]}[](){()}");
        imprimeResultado("A+B+C-D)");
    }

    public static void imprimeResultado(String s) {
        System.out.println(s + " - " + verificaSimbolo(s));
    }

    final static String ABRE = "[{(";
    final static String FECHA = "]})";

    public static boolean verificaSimbolo(String expre) {
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;

        while (index < expre.length()) {
            simbolo = expre.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {

                if (pilha.estaVazia()) {
                    return false;
                } else {
                    topo = pilha.desempilha();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }
            index++;
        }
        return true;
    }
}
