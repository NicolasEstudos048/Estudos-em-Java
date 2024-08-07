package poo.a07.a08;

import java.util.Random;
import poo.a07.Lutador;

public class Luta implements InterfaceLuta {
    private Lutador desafiante; 
    private Lutador desafiado;
    private int rounds;
    private boolean aprovado;

    @Override
    public void lutar() {
        if(this.getAprovado()){
            System.out.println("Desafiado");
            this.getDesafiado().apresentar();
            System.out.println("Desafiante");
            this.getDesafiante().apresentar();
            Random random = new Random();
            int vencedor = random.nextInt(3);
            System.out.println("--------------Resultado--------------");
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: // Desafiado Ganhou Luta
                    System.out.println(this.getDesafiado().getNome() + " ganhou!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                break;
                case 2: // Desafiado Perdeu Luta
                    System.out.println(this.getDesafiante().getNome() + " ganhou!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                break;
            }
            System.out.println("----------------------------");  
        } else{
            System.out.println("Luta não aprovada.");
        }
    }

    @Override
    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if(lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2){
            this.setAprovado(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        } else{
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null); 
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    
}
