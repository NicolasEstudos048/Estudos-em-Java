package poo.a11.animais;

public class Cachorro extends Lobo{
        public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando Rabo!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    // Polimorfismo de Sobrecarga - Poliformas de fazer a mesma coisa utilizando assinaturas diferentes dentro da mesma classe
    public void reagir(String frase){ // Tem uma assinatura que retorna um String
        if(frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("Olá")){
            System.out.println("Abanar e Latir");
        } else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int minuto){ // Tem duas assinaturas que retorna inteiros
        if(hora < 12){
            System.out.println("Abanar");
        } else if(hora >= 18) {
            System.out.println("Ignorar");
        } else{
            System.out.println("Abanar e Latir");
        }
    }
    public void reagir(boolean dono){ // Tem uma assinatura que retorna um lógico
        if(dono == true){
            System.out.println("Abanar");
        } else{
            System.out.println("Rosnar e Latir");
        }
    }
    public void reagir(int idade, double peso){ // Tem duas assinaturas que retorna inteiro e ponto flutuante
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar");
            } else{
                System.out.println("Latir");
            }
        } else{
            if(peso < 10){
                System.out.println("Rosnar");
            } else{
                System.out.println("Ignorar");
            }
        }
    }
}
