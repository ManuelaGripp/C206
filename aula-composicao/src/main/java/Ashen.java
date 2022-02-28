public class Ashen {

    String nome;
    int vida;
    Arma arma;

    Ashen(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }

    void usarArma(){
    arma.ressistencia -= 2;
    }

    void tomarDano(){
        vida -= 5;
    }
}
