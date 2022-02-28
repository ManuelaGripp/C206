public class Arma {

    String nome;
    int poder;
    int ressistencia;
    String descricao;

    public Arma(String nome, int poder, int ressistencia, String descricao) {
        this.nome = nome;
        this.poder = poder;
        this.ressistencia = ressistencia;
        this.descricao = descricao;
    }

    void mostraInfoArma(){
        System.out.println("Nome da arma: " + nome);
        System.out.println("Poder da arma: " + poder);
        System.out.println("Ressistencia da arma: " + ressistencia);
        System.out.println("Descricao da arma: " + descricao);
    }


}
