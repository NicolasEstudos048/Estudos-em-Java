package basico.a06;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        int resultado = 1+2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiro = "String";
        String segundo = " concatenada";
        String resultadoConcatenacao = primeiro + segundo;
        System.out.println(resultadoConcatenacao);

        resultado++;
        System.out.println(resultado);

        System.out.println(resultado++); // Mostrou dps adicionou
        System.out.println(++resultado); // Adicionou dps mostrou

        // resultado += 1;

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--); // Mostrou dps removeu
        System.out.println(--resultado); // Removeu dps mostrou

        // 13:47

    }
    
}
