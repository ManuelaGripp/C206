public abstract class Funcionario {

    private String nome;
    private int idade;
    private double salario;


    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostraInfo() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario: " + this.salario);
    }

    public double salarioBonus() {
        return this.salario;
    }

    //public void fazAlgo() {
       // System.out.println(this.nome + "Chris esta fazendo algo");
   // }
    // Transformando o metodo em abstrato
    // Sendo abstrato todas as classes filhas precisam reescrever esse metodo
    public abstract void fazAlgo();


}
