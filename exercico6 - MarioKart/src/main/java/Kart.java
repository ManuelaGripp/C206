public class Kart {

    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(String nome, Piloto piloto, String cilindradas, float velocidadeMaxima ) {
        this.nome = nome;
        motor = new Motor(cilindradas, velocidadeMaxima);
        this.piloto = piloto;
    }


    void pular(){
        System.out.println( this.nome + " pulando");
    }

    void soltarTurbo(){
        System.out.println( this.nome + " soltando Turbo");
    }

    void fazerDrift(){
        System.out.println(this.nome + " fazendo Drift");
    }

}
