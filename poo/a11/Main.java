package poo.a11;

import poo.a11.animais.Cachorro;
import poo.a11.animais.Canguru;

public class Main {
    public static void main(String[] args) {
        /*  Polimorfismo de Sobreposição
         * @Override
         * Acontece quando substituimos um método de uma superclasse na sua subclasse, usando a mesma assinatura
         */
        Mamifero m = new Mamifero();
        Canguru k = new Canguru();
        Cachorro c  = new Cachorro();
        // Reptil r = new Reptil();
        // Peixe p = new Peixe();
        // Ave a = new Ave();

        m.setPeso(85.3);
        m.setIdade(2);
        m.setMembros(4);
        m.alimentar();
        m.emitirSom();
        m.locomover();

        k.setPeso(55.30);
        k.setIdade(3);
        k.setMembros(4);
        k.alimentar();
        k.emitirSom();
        k.locomover();

        c.setPeso(3.94);
        c.setIdade(5);
        c.setMembros(4);
        c.alimentar();
        c.emitirSom();
        c.locomover();
    }
}
