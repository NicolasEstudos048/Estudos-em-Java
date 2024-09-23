package pilha.ex;

import pilha.Pilha;

/*
 * Desenvolva um algoritmo que faça a conversão de decimais para binários
 */
public class Ex06Pilha {
    public static void main(String[] args) {
        resultado(2);
        resultado(4);
        resultado(10);
        resultado(25);
        resultado(10035);

        System.out.println("-----------------------------------------------");

        resultadoBase(25, 16);
        resultadoBase(10035, 8);
        resultadoBase(10035, 16);
    }

    public static void resultado(int num) {
        System.out.println(num + " - " + decimalBinario(num));
    }

    public static void resultadoBase(int num, int base) {
        System.out.println(num + " - " + decimalBase(num, base));
    }

    public static String decimalBinario(int num) {
        Pilha<Integer> pilha = new Pilha<>();
        String numBinary = "";
        int resto;

        while (num > 0) {
            resto = num % 2;
            pilha.empilha(resto);
            num /= 2;
        }

        while (!pilha.estaVazia()) {
            numBinary += pilha.desempilha();
        }

        return numBinary;
    }

    public static String decimalBase(int num, int base) {
        if (base > 16) {
            throw new IllegalArgumentException("Base inválida.");
        }

        Pilha<Integer> pilha = new Pilha<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (num > 0) {
            resto = num % base;
            pilha.empilha(resto);
            num /= base;
        }

        while (!pilha.estaVazia()) {
            numBase += bases.charAt(pilha.desempilha());
        }

        return numBase;
    }
}
