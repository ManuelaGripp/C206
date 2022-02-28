public class Principal {

    public static void main(String[] args) {

       Ashen ashen = new Ashen("Ashen", 400);
       Arma arma = new Arma("Machado", 100, 80, "Forte");
       ashen.arma = arma;

        ashen.arma.mostraInfoArma();
        ashen.usarArma();
        ashen.tomarDano();
        ashen.arma.mostraInfoArma();
        System.out.println(ashen.vida);





    }
}
