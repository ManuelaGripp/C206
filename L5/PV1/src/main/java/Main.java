import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); //Leitura dos dados
        Deck deck = new Deck("Manuela");// Instanciando novo deck

        boolean flag = true;
        int op;

        while (flag) {

            System.out.println(" ");
            System.out.println("-------Menu-------");
            System.out.println("1 - Adiconar carta ao deck");
            System.out.println("2 - Mostrar informacoes");
            System.out.println("3 - Mostrar o tipo em maior quantidade");
            System.out.println("4 - Mostrar a media aritmetica de poder de cada tipo");
            System.out.println("5 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1: //Adicionando nova carta
                    sc.nextLine();
                    Carta carta = new Carta();

                    System.out.println("Nome da carta: ");
                    carta.nome = sc.nextLine();
                    System.out.println("Tipo da carta: ");
                    carta.tipo = sc.nextLine();
                    System.out.println("Poder da carta: ");
                    carta.poder = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Arma da carta");
                    carta.arma.tipo = sc.nextLine();

                    deck.addCarta(carta);
                    break;

                case 2://Mostra as informacoes do deck e das cartas
                    deck.mostraInfo();
                    break;

                case 3://maior quantidade de tipo no deck
                    System.out.println(deck.maiorQuantidade());
                    break;

                case 4://Mostra a media do poder dos tipos
                    deck.mediaTipos();
                    break;

                case 5:// Sair
                    flag = false;
                    break;

                default://Entrada de uma opcao inexistente
                    System.out.println("Opcao Invalida");
                    break;
            }
        }
    }
}
