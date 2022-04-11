public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //Metodos herdados



    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando um brownie de doce de leite no carrinho");
    }


    public void adicionaDoceDeLeite(){
        System.out.println(this.nome + " adicionando doce de leite");
    }



}
