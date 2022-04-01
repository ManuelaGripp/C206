package br.inatel.cdg.bloco;

public class Bloco {

    private static int numBloco;
    private static int blocosDestruidos;

    public Bloco() {
        numBloco++;
    }

    public static int getNumBloco() {
        return numBloco;
    }

    public static void setNumBloco(int numBloco) {
        Bloco.numBloco = numBloco;
    }
}
