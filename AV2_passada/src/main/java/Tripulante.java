public class Tripulante extends Astronauta implements Missao {

    private int qtdMissoes;

    Tripulante(String nome, int qtdMissoes){
        super(nome);
        this.qtdMissoes = qtdMissoes;
    }


    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Quantidade de missoes: " + this.qtdMissoes);
    }



    @Override
    public void reportar(){
        System.out.println( getNome() + " reportou um corpo");
    }

    @Override
    public void reparar(){
        System.out.println(getNome() + " fez um reparo");

    }

    @Override
    public void fazerMissao(){
        System.out.println(getNome() + " fez uma missao");
        qtdMissoes--;
    }


}
