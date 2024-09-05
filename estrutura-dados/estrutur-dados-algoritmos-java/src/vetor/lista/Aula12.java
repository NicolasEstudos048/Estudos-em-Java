package vetor.lista;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);

        arrayList.add(1, "B");
        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("Elemento existe!");
        } else {
            System.out.println("Elemento não existe!");
        }

        int posicao = arrayList.indexOf("D");
        if (posicao > -1) {
            System.out.println("Elemento existe");
        } else {
            System.out.println("Elemento não existe!");
        }

        // Retorna elemento da posição passada
        System.out.println(arrayList.get(2));

        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);

        System.out.println(arrayList.contains("C"));

        System.out.println(arrayList.size());
    }
}
