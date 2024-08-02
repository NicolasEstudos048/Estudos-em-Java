package poo.a03;

public class Caneta {
    // public - para qualquer classe
    public String modelo;
    public String cor;
    // private - só pode ser acessado dentro desta classe
    private double ponta;
    // protected - só pode ser acessado dentro desta classe e suas subclasses
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Tampada? " + this.tampada);
    }

    public void rabicar() {
        if (tampada == true) {
            System.out.println("Erro!!!");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
