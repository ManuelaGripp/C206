import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       // Funcionario f1 = new Funcionario("Joao",32,"12345");

        //Arquivo.escrever(f1);

        ArrayList<Funcionario> funcs = Arquivo.ler();
        for (Funcionario funcionario: funcs){
            System.out.println("Nome: " + funcionario.nome);
            System.out.println("Idade: " + funcionario.idade);
            System.out.println("CPF: " + funcionario.cpf);
        }

    }

}
