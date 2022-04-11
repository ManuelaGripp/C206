public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Sabor: " + this.sabor);
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado no carrinho de compras");
    }

    public void calculaValorTotalCompra() {
        System.out.println("CALCULANDO VALOR TOTAL" );
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco );

}

}
