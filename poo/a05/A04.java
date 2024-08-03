package poo.a05;

public class A04 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("cp");
        p1.depositar(1000);
        p1.sacar(5000);
        p1.setNumeroConta(1111);
        p1.setDono("Clauber");
        p1.pagarMensal();
        
        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("cc");
        p2.setDono("João");
        p2.setNumeroConta(2222);
        p2.depositar(2000);
        p2.sacar(2050);
        p2.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
