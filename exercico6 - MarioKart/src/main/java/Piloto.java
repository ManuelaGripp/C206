public class Piloto {

    String nome;
    boolean vilao;

    Piloto(String nome, boolean vilao){
        this.nome = nome;
        this.vilao = vilao;
    }

    void soltarSuperPoder(){
        System.out.println( this.nome + " soltando super poder");
    }

    void mostraInfo(){
        System.out.println( "Nome do piloto: " + nome);
        System.out.println("Vilao: " + vilao);
    }

}
