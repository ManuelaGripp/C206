import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("12345","abc");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("------Menu------");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Mostras contatos");
            System.out.println("3 - Sair");
            int op = sc.nextInt();

            switch (op){
                case 1:
                    sc.nextLine();
                    Contato contato = new Contato();
                    contato.nome = sc.nextLine();
                    contato.dataNascimento = sc.nextLine();
                    contato.telefone = sc.nextLine();
                    contato.email = sc.nextLine();
                    empresa.contatos[0] = contato;
                    break;

                case 2:
                    empresa.exibirInfos();
                    break;

                case 3:
                    flag = false;

                default:
                    System.out.println("Opcao invalida");

            }
        }

    }

}
