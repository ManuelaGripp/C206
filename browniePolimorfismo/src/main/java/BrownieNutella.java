public class BrownieNutella extends Brownie {


    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //Metodos herdado

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando um brownie de nutella no carrinho");
    }

    public void adicionaNutella() {
        System.out.println(this.nome + " adicionando Nutella");
    }

}
