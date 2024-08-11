package poo.a10;

public class Tecnico extends Aluno{
    private int registoProfissional;

    public void praticar(){
        System.out.println("Tecnico praticando!");
    }

    public int getRegistoProfissional() {
        return registoProfissional;
    }

    public void setRegistoProfissional(int registoProfissional) {
        this.registoProfissional = registoProfissional;
    }
}
