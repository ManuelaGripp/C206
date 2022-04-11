public class Main {
    public static void main(String[] args) {

        Brownie cafe = new BrownieCafe("C", 5, "Laranja");
        Brownie nutella = new BrownieNutella("N", 5, "Chocolate branco");
        Brownie doceDeLeite = new BrownieDoceDeLeite("DL", 5, "Meio amargo");


        Comprador comprador = new Comprador("Joao", 10);

        comprador.efetuarCompra(cafe);
        comprador.efetuarCompra(nutella);
        comprador.efetuarCompra(doceDeLeite);







    }
}
