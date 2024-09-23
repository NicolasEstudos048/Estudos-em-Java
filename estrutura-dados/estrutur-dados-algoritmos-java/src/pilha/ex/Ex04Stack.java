package pilha.ex;

import java.util.Stack;

/*
 * Escreva um programa que testa se uma sequência de caracteres fornecida pelo
 * usuário é um palíndromo, ou seja, é uma palavra cuja primeira metade é
 * simétrica à segunda metade. Exemplos:
 * 
 * AABCCBAA - sim
 * ADDFDDA - sim
 * ABFFBB - nâo
 */
public class Ex04Stack {
    public static void main(String[] args) {
        imprimeResultado("ADA");
        imprimeResultado("AABCCBAA");
        imprimeResultado("Maria");
        imprimeResultado("ADDFDDA");
        imprimeResultado("ABFFBB");
    }

    public static void imprimeResultado(String s) {
        System.out.println(s + " é palindromo? " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            pilha.push(s.charAt(i));
        }

        String sInverso = "";
        while (!pilha.isEmpty()) {
            sInverso += pilha.pop();
        }

        if (sInverso.equalsIgnoreCase(s)) {
            return true;
        }

        return false;
    }

}
