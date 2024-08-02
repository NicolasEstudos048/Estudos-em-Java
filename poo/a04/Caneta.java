package poo.a04;

public class Caneta {
    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;

    // Construct - Set algo como padrão para qualquer caneta criada
    public Caneta(String modelo, String cor, double ponta) {
        /*
         * this.setModelo(modelo);
         * this.setCor(cor);
         * this.setPonta(ponta);
         * this.tampar(); ou
         */
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public String getModelo() { // get - Recebe algo
        return this.modelo;
    }

    public void setModelo(String modelo) { // set - Coloca algo
        this.modelo = modelo;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
}
