package poo.a12;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Video 1");
        v[1] = new Video("Video 2");
        v[2] = new Video("Video 3");

        Audiencia a[] = new Audiencia[2];
        a[0] = new Audiencia("Alice", 25, "F", "alice");
        a[1] = new Audiencia("Bob", 30, "M", "bob");

        Visualizacao visu[] = new Visualizacao[3];
        visu[0] = new Visualizacao(a[0], v[2]);
        visu[0].avaliar();
        System.out.println(visu[0].toString());

        visu[1] = new Visualizacao(a[0], v[1]);
        visu[1].avaliar(87.0);
        System.out.println(visu[1].toString());

        /*System.out.println(v[0].toString());
        System.out.println(a[0].toString());*/
    }
}
