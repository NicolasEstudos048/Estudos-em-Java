package poo.a11.animais;

import poo.a11.Mamifero;

public class Canguru extends Mamifero{
    public void usarBolsa(){
        System.out.println("Canguru usando bolsa.");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}
