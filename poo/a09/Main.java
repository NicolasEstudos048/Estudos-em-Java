package poo.a09;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoas[0] = new Pessoa("John", 25, "M");
        pessoas[1] = new Pessoa("Alice", 30, "F");

        livro[0] = new Livro("Livro 1", "Autor 1", 200, pessoas[0]);
        livro[1] = new Livro("Livro 2", "Autor 2", 150, pessoas[1]);
        livro[2] = new Livro("Livro 3", "Autor 3", 180, pessoas[0]);

        livro[0].abrir();
        livro[0].folhear(300);
        livro[0].avancarPag();
        livro[0].voltarPag();
        livro[0].fechar();
        System.out.println(livro[0].toString());

        System.out.println("================================");

        System.out.println(livro[2].toString());
        pessoas[0].fazerAniversario();
        System.out.println(pessoas[0].getIdade());

        System.out.println("================================");

        System.out.println(livro[1].toString());
        pessoas[1].fazerAniversario();
        System.out.println(pessoas[1].getIdade()); //
    }
}
