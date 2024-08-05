package poo.a07;

public class Lutador implements Interface {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    
    @Override
    public void apresentar() {
        System.out.println("------------------------------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }
    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    @Override
    public void status() {
        System.out.println("--------------------------------");
        System.out.print(this.getNome());
        System.out.println(" é peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Invalida";
        } else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        } else if(this.getPeso() <= 83.9){
            this.categoria = "Medio";
        } else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Invalida";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
