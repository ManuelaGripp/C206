public class Engenheiro extends Funcionario implements GerenciaProjeto{

    String ramo;
    @Override
    public void fazAlgo(){
        System.out.println(this.getNome() + " esta fazendo um projeto");
    }

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    public double salarioAnula(){
        return this.getSalario() + 12;
    }

    @Override
    public void gerenciar(){
        System.out.println(this.getNome() + " esta gerenciando um projeto") ;
    }

}
