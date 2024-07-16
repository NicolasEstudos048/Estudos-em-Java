package basico.a10;

public class Arrays {

    public static void main(String[] args) {
        
        double[] temperatura = new double[365];

        temperatura[0] = 31.3;
        temperatura[1] = 32;
        temperatura[2] = 33.7;
        temperatura[3] = 34;
        temperatura[4] = 33.1;

        for(int i=0; i<temperatura.length; i++){
            System.out.println("Dia " + (i+1) + ": " + temperatura[i] + "°C");  
        }

        for(double temp : temperatura){
            System.out.println(temp);
        }

    }

}
