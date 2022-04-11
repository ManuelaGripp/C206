public class Comprador {

    String nome;
    double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){

        if (brownie instanceof BrownieNutella){
            System.out.println(" ");
            System.out.println( this.nome + " esta comprando o " + brownie.nome);
            brownie.addCarrinhoDeCompras();
            brownie.calculaValorTotalCompra();
            System.out.println(" ");
        }

        if (brownie instanceof BrownieDoceDeLeite){
            System.out.println(" ");
            System.out.println( this.nome + " esta comprando o " + brownie.nome);
            brownie.addCarrinhoDeCompras();
            brownie.calculaValorTotalCompra();
            System.out.println(" ");
        }

        if (brownie instanceof BrownieCafe){
            System.out.println(" ");
            System.out.println( this.nome + " esta comprando o " + brownie.nome);
            brownie.addCarrinhoDeCompras();
            brownie.calculaValorTotalCompra();
            System.out.println(" ");
        }



    }

}
