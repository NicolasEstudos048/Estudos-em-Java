package fila.ex;

public class Documento {
    private String nome;
    private int qtdFolhas;

    public Documento(String nome, int qtdFolhas) {
        this.nome = nome;
        this.qtdFolhas = qtdFolhas;
    }

    public int getQtdFolhas() {
        return qtdFolhas;
    }

    public void setQtdFolhas(int qtdFolhas) {
        this.qtdFolhas = qtdFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
