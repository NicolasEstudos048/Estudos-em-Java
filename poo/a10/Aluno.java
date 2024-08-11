package poo.a10;

public class Aluno extends Pessoa{ // Classe implemental, herda tudo e implementa novas funcionalidades
    private int matr;
    private String curso;

    public void cancelaMatr(){
        System.out.println("Matricula cancelada de aluno " + this.getNome());
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga de aluno " + this.getNome());
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toStringAluno() {
        return "Aluno [matr=" + matr + ", curso=" + curso + "]";
    }
}
