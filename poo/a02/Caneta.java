package poo.a02;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Tampada? " + this.tampada);
    }

    void rabicar() {
        if(tampada == true) {
            System.out.println("Erro!!!");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
