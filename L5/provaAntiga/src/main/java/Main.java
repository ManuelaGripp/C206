import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int op;
        Equipe e1 = new Equipe("Capitao America");
        while(flag){


            System.out.println("------Menu-------");
            System.out.println("1 - Adicionar heroi");
            System.out.println("2 - Mostras informacao da equipe e dos herois");
            System.out.println("3 - Mostrar o heroi mais forte");
            System.out.println("4 - Porcentagem dos herois que voam na equipe");
            System.out.println("5 - Sair");
            op = sc.nextInt();

            switch (op){
                case 1:
                    sc.nextLine();
                    Heroi h1 = new Heroi();
                    System.out.println("Entre com o nome do heroi: ");
                    h1.nome = sc.nextLine();
                    System.out.println("Entre com o poder do heroi: ");
                    h1.poder = sc.nextFloat();
                    System.out.println("Voa ou nao: ");
                    h1.podeVoar = sc.nextBoolean();

                    System.out.println(h1.poder);
                    System.out.println(h1.nome);
                    System.out.println(h1.podeVoar);

                    e1.adicionarHeroi(h1);
                    break;

                case 2:
                    System.out.println(e1.herois[0]);
                    e1.mostraInfo();
                    break;

                case 3:
                    e1.mostraMaisForte();
                    break;

                case 4:
                    System.out.print("Porcentagem de herois que voam: ");
                    System.out.println(e1.calculaVoadores());
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;


            }



        }
    }


}
