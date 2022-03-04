import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        Carrinho c1 = new Carrinho();

        while (flag){

            //Menu com as opcoes disponiveis
            System.out.println("--- Menu---");
            System.out.println("1. Incluir novo produto: ");
            System.out.println("2. Ver produtos do carrinho");
            System.out.println("3. Sair");
            System.out.println("Qual a operacao desejada: ");
            int op = sc.nextInt();

            //Processando opcao
            switch (op){
                case 1://add novo Produto
                    sc.nextLine();
                    Produto p = new Produto();
                    System.out.println("Entre com o nome do produto: ");
                    p.nome = sc.nextLine();
                    System.out.println("Entre com o nome do descricao: ");
                    p.descricao = sc.nextLine();
                    System.out.println("Entre com o nome do fabricante: ");
                    p.fabricante = sc.nextLine();
                    System.out.println("Entre com o nome do preco: ");
                    p.preco = sc.nextDouble();
                    c1.addProduto(p);
                    break;

                case 2:// mostrando produtos no carrino
                    c1.exibirInfos();
                    break;

                case 3://saida do menu
                    System.out.println("Finalizando as compras");
                    flag = false;
                    break;

                default://opcao invalida
                    System.out.println("Opcao invalida");

            }


        }
        System.out.print("Total da compra: ");
        System.out.println(c1.calculaTotal());

    }


}
