package pilha.ex;

import pilha.Pilha;

/*
 * Crie uma pilha com capacidade de 20 livros
 * Insira 6, cada um teá nome, isbn, ano de lançamento e autor
 * Crie um exemplo para utilizar cada método da classe Pilha
 */
public class Ex03Pilha {
    public static void main(String[] args) {
        Pilha<Ex03Livro> livros = new Pilha<>(20);

        Ex03Livro livro1 = new Ex03Livro("Tao Te Ching", "9-786559-102631", -460, "Lao-Tsé");
        Ex03Livro livro2 = new Ex03Livro("O Pensamento", "9-78515-167995", -1828, "George Orwell");
        Ex03Livro livro3 = new Ex03Livro("Os Irmãos Karamázov", "978-85-7326-411-1", -1828, "Dostoiévski");

        System.out.println("Pilha vazia? " + livros.estaVazia());

        livros.empilha(livro1);
        livros.empilha(livro2);
        livros.empilha(livro3);

        System.out.println("-------------------------------");
        System.out.println(livros.getTamanho() + " livros foram empilhados");
        System.out.println("Pilha vazia? " + livros.estaVazia());

        System.out.println("-------------------------------");
        System.out.println(livros);

        System.out.println("-------------------------------");
        System.out.println("Topo da pilha: " + livros.topo());

        System.out.println("-------------------------------");
        System.out.println("Desempilhando livros...");
        while (!livros.estaVazia()) {
            System.out.println(livros.desempilha());
        }

        System.out.println("-------------------------------");
        System.out.println("Pilha vazia? " + livros.estaVazia());
        System.out.println(livros);
    }
}
