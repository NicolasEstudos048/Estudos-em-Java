package basico.a10.ex;

class Ex1{

    public static void main(String[] args) {
        
        int[] vetA = new int[5];

        vetA[0] = 54;
        vetA[1] = 32;
        vetA[2] = 18;
        vetA[3] = 78;
        vetA[4] = 96;

        int[] vetB = new int[vetA.length];
        for(int i=0; i<vetA.length; i++){ vetB[i] = vetA[i]; }

        System.out.println("Vetor A");
        for(int i : vetA){ System.out.println(i); }

        System.out.println("Vetor B");
        for(int i : vetB){ System.out.println(i); }

    }

}
