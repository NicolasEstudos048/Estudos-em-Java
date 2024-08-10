package poo.a09;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void avancarPag() {
        if(this.getAberto() && this.getPagAtual() < this.totPaginas){
            this.setPagAtual(this.getPagAtual() + 1);
        } else{
            this.setPagAtual(0);
        }
    }
    @Override
    public void voltarPag() {
        if(this.getAberto() && this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual() - 1);
        } else{
            this.setPagAtual(0);
        }
    }
    @Override
    public void folhear(int pagina) {
        if(this.getAberto()){
            if(pagina >= 0 && pagina < this.getTotPaginas()){
                System.out.println("Folhando página " + pagina);
                this.setPagAtual(pagina);
            } else{
                this.setPagAtual(0);
            }
        }
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + "\ntotPaginas=" + totPaginas + ", pagAtual=" + pagAtual
                + ", aberto=" + aberto + "\nleitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo() +"]";
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
}
