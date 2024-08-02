package poo.a03;

public class A02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "Bic"; // Pode ser executado por ser public
        c1.cor = "Azul";
        // c1.ponta = 0.5; Só seria executável na própria classe
        c1.carga = 60; // Pode ser executado por estar dentro de uma classe que utiliza o método caneta
        // c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabicar();
    }
}
