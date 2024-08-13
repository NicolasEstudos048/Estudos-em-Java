package poo.a11;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void alimentar() {
        System.err.println("Comendo frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
