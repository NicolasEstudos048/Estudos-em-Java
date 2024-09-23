package pilha.ex;

import java.util.Stack;

/*
 * Crie uma stack com capacidade de 20 livros
 * Insira 6, cada um teá nome, isbn, ano de lançamento e autor
 */

public class Ex03Stack {
    public static void main(String[] args) {
        Stack<Ex03Livro> livros = new Stack<>();

        Ex03Livro livro1 = new Ex03Livro("Tao Te Ching", "9-786559-102631", -460, "Lao-Tsé");
        Ex03Livro livro2 = new Ex03Livro("O Pensamento", "9-78515-167995", -1828, "George Orwell");
        Ex03Livro livro3 = new Ex03Livro("Os Irmãos Karamázov", "978-85-7326-411-1", -1828, "Dostoiévski");

        System.out.println("Pilha vazia? " + livros.isEmpty());

        livros.push(livro1);
        livros.push(livro2);
        livros.push(livro3);

        System.out.println("-------------------------------");
        System.out.println(livros.size() + " livros foram Empilhados");
        System.out.println("Pilha vazia? " + livros.isEmpty());

        System.out.println("-------------------------------");
        System.out.println(livros);

        System.out.println("-------------------------------");
        System.out.println("Topo da pilha: " + livros.peek());

        System.out.println("-------------------------------");
        System.out.println("Desempilhando livros...");
        while (!livros.isEmpty()) {
            System.out.println(livros.pop());
        }

        System.out.println("-------------------------------");
        System.out.println("Pilha vazia? " + livros.isEmpty());
        System.out.println(livros);
    }

}
