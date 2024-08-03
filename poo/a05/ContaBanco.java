package poo.a05;

public class ContaBanco {
    // Atributos
    public int numeroConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // Construtor
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }

    // Métodos
    public void abrirConta(String conta){ // abrir conta: corrente(cc) = $50 | poupança(cp) = $150
        this.setTipo(conta);
        this.setStatus(true);
        if(this.getTipo().equalsIgnoreCase("CC")){
            this.setSaldo(50);
        } else if(this.getTipo().equalsIgnoreCase("CP")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta.");
    }
    public void fecharConta(){ // para fechar nao pode ter dinheiro na conta e nem estar em débito
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro.");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta está em débito.");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
    }
    public void depositar(double valor){ // conta tem que estar aberta para depositar
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
        } else{
            System.out.println("Impossível depositar.");
        }
    }
    public void sacar(double valor){ // conta tem que estar aberta e ter saldo para sacar
        if(this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
            } else{
                System.out.println("Saldo insuficiente.");
            }
        } else{
            System.out.println("Impossível sacar.");
        }
    }
    public void pagarMensal(){ // conta corrente(cc) - $12 | conta poupança(cp) - $20
        int valor = 0;
        if(this.getTipo().equalsIgnoreCase("CC")){
            valor = 12;
        } else if(this.getTipo().equalsIgnoreCase("CP")){
            valor = 20;
        }

        if(this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
            } else{
                System.out.println("Saldo insuficiente para pagar mensalidade.");
            }
        }
        else{
            System.out.println("Conta fechada.");
        }
    }

    // Getters and Setters
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Número da Conta: " + this.getNumeroConta());
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.getStatus()));
    }
}
