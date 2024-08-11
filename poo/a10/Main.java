package poo.a10;

public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); Classe Pessoa não pode ser instanciada por ser abstract
        Visitante v1 = new Visitante();
        v1.setNome("Reinaldo");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());
        System.out.println("============================");

        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setIdade(18);
        a1.setSexo("F");
        a1.setMatr(1111);
        a1.setCurso("Informatica");
        a1.pagarMensalidade();
        a1.cancelaMatr();
        System.out.println(a1.toString());
        System.out.println(a1.toStringAluno());
        System.out.println("============================");

        Bolsista b1 = new Bolsista();
        b1.setMatr(1112);
        b1.setCurso("Filosofia");
        b1.setNome("João");
        b1.setIdade(20);
        b1.setSexo("M");
        b1.setBolsa(12.5);
        b1.pagarMensalidade(); // É o mesmo método que o de cima, mas esse foi sobreposto
        b1.renovarBolsa();
        System.out.println(b1.toString());
        System.out.println(b1.toStringAluno());
        System.out.println("============================");

        Tecnico t1 = new Tecnico();
        t1.setMatr(1113);
        t1.setCurso("Engenharia");
        t1.setNome("Ana");
        t1.setIdade(25);
        t1.setSexo("F");
        t1.setRegistoProfissional(5555);
        t1.pagarMensalidade();
        t1.praticar();
        System.out.println(t1.toString());
        System.out.println(t1.toStringAluno());
        System.out.println("============================");

        Professor p1 = new Professor();
        p1.setNome("Pedro");
        p1.setIdade(35);
        p1.setSexo("M");
        p1.setEspecialidade("ALgorithm");
        p1.setSalario(3800);
        p1.ReceberAum(1000);
        System.out.println(p1.toString());
        System.out.println(p1.toStringProf());
        System.out.println("============================");

        Funcionario f1 = new Funcionario();
        f1.setNome("Maria");
        f1.setIdade(30);
        f1.setSexo("F");
        f1.setSetor("Limpeza");
        f1.mudarTrabalho();
        System.out.println(f1.toString());
        System.out.println(f1.toStringFuncio());
        System.out.println("============================");
    }
}
