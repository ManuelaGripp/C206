import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        List<Jogo> joguinhos = new ArrayList<>();
        Arquivo a1 = new Arquivo();

        while (flag) {
            System.out.println("1 - Salvar as informações do jogo no arquivo.txt");
            System.out.println("2 - Mostrar as informações dos jogos salvos no arquivo");
            System.out.println("3 - Ordenar os jogos em ordem crescente de preço");
            System.out.println("4 - Ordenar os jogos em ordem decrescente de preço");
            System.out.println("5 - Sair");


            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    Jogo jogo = new Jogo();
                    System.out.println("Entre com o nome do jogo: ");
                    jogo.setNome(sc.nextLine());

                    System.out.println("Entre com o preco do jogo: ");
                    try {
                        jogo.setPreco(sc.nextDouble());
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }

                    System.out.println("Entre com o genero do jogo: ");
                    sc.next();
                    jogo.setGenero(sc.nextLine());

                    a1.escrever(jogo);
                    break;

                case 2:
                    joguinhos = a1.ler();

                    for (Jogo j: joguinhos) {
                        System.out.println(j.getNome());
                        System.out.println(j.getPreco());
                        System.out.println(j.getGenero());
                    }

                    break;

                case 3:
                    joguinhos = a1.ler();
                    Collections.sort(joguinhos);
                    for (Jogo j: joguinhos) {
                    System.out.println(j.getNome());
                    System.out.println(j.getPreco());
                    System.out.println(j.getGenero());
                }
                    break;

                case 4:
                    joguinhos = a1.ler();
                    Collections.sort(joguinhos, Collections.reverseOrder());
                    for (Jogo j: joguinhos) {
                        System.out.println(j.getNome());
                        System.out.println(j.getPreco());
                        System.out.println(j.getGenero());
                    }
                    break;

                case 5:
                    flag = false;
                    break;
            }


        }
    }


}
