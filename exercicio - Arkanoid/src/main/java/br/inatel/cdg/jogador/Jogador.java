package br.inatel.cdg.jogador;

import br.inatel.cdg.bloco.Bloco;

public class Jogador {

    private int pontuacao;
    private int qtdAtual;

    public int getPontuacao() {
        return pontuacao;
    }

    public void destruirBloco(){
        pontuacao++;
        Bloco.setNumBloco(Bloco.getNumBloco()-1);
    }

    public int totalBlocos(){
        return pontuacao + Bloco.getNumBloco();
    }

}
