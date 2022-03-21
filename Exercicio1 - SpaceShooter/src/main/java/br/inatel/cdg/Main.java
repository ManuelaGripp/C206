package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {

    public static void main(String[] args) {

        Nave n1 = new Nave("Nave1", 100, "Explosivo");
        Nave n2 = new Nave("Nave2", 200, "Normal");

        Asteroide a1 = new Asteroide("A1", "Pequeno");
        Asteroide a2 = new Asteroide("A2", "Grande");

        n1.atirar(a1);
        n1.atirar(a2);

        n2.atirar(a1);
        n2.atirar(a2);
    }

}
