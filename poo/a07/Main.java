package poo.a07;

import poo.a07.a08.Luta;

public class Main {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        lutador[1] = new Lutador("Putscript", "Brasil", 26, 1.68, 57.8, 14, 2, 3);
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutador[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        lutador[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        lutador[5] = new Lutador("Nerddart", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutador[3], lutador[2]);
        lutador[3].status();
        lutador[2].status();
        UEC01.lutar();
        lutador[3].status();
        lutador[2].status();
    }
}
