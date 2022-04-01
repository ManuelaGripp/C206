public class Professor extends Funcionario {

    String materia;

    public Professor(String nome, int idade, double salario, String materia){
        super(nome, idade, salario);
        this.materia = materia;
    }

    public void corrigeProvas(){
        System.out.println(this.getNome() + " esta corrigindo provas");
    }


    //Permite que o objeto use o metodo da classe mae e adicione umaa funcionalidade nova
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Materia: " + this.materia);
    }

    @Override
    public void fazAlgo(){
        System.out.println(this.getNome() + " esta dando aula de " + this.materia );
    }


}
