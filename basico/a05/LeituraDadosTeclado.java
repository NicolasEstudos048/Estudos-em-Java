package basico.a05;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Seu nome é: " + nome);
        
        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scan.next();
        System.out.println("Seu sobrenome é: " + sobreNome);

        System.out.println("Sua idade: " );
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Sua altura é: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);*/

        System.out.println("Seu primeiro nome, idade, quantidade de filhos, altura, tem cachorro: ");
        String nome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temCachorro = scan.nextBoolean();

        System.out.println("Você digitou: ");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem cachorro: " + temCachorro);

    }
    
}
