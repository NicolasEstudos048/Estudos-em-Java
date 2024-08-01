package poo.a02;

public class A01 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "Bic";
        c1.carga = 60;
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampar();
        c1.status();
        c1.rabicar();

        Caneta c2  = new Caneta();
        c2.modelo = "Parker";
        c2.carga = 80;
        c2.cor = "Vermelha";
        c2.ponta = 0.7;
        c2.destampar();
        c2.status();
        c2.rabicar();
    }
}
