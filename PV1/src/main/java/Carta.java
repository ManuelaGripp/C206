public class Carta {

    String nome;
    String tipo;
    double poder;
    Arma arma = new Arma();

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Poder: " + poder);
        System.out.println("Tipo da Arma: " + arma.tipo);
        System.out.println(" ");
    }

}
