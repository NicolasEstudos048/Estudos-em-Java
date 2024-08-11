package poo.a10;

public final class Bolsista extends Aluno{ // Por ter o final está classe não pode ser herdada , ou seja não pode ter filhos
    private double bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de aluno " + this.getNome());
    }

    @Override // SObrepor
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento Facilitado!!!");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
