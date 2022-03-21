package br.inatel.cdg.inimigo;

public class Asteroide {

    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void dsestrir(){
        System.out.println("Asteroide Destruido");
    }

}
