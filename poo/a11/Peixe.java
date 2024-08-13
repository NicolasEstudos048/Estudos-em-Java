package poo.a11;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    public void soltarBolha(){
        System.out.println("Soltou Bolha");
    }
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
