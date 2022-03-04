public class Carrinho {

    double total = 0;
    Produto[] produtos = new Produto[100];

    void exibirInfos() {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println("Produtos Selecionados: ");
                System.out.println((i+1) + "o. : " );
                produtos[i].mostrarInfo();

            }
        }
    }

    double calculaTotal() {
        for (Produto produto : produtos) {
            if (produto != null)
                total += produto.preco;


        }

        return total;

    }

    void addProduto(Produto p){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = p;
                break;

            }
        }
    }


}
