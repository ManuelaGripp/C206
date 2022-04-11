public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }



    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando um brownie de cafe no carrinho");

    }

    public void adicionaCafe(){
        System.out.println(this.nome + " adicionando cafe");
    }

}
