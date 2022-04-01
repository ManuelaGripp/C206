public class Arquiteto extends Funcionario implements GerenciaProjeto {


    public Arquiteto(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void fazAlgo() {
        System.out.println(this.getNome() + " esta fazendo uma casa");
    }

    @Override
    public void gerenciar() {
        System.out.println(this.getNome() + " esta gerenciando um projeLo");
    }

    @Override
    public void faProjeto(){}

}



