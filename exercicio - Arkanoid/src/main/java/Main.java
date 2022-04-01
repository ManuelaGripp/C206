import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.jogador.Jogador;

public class Main {

    public static void main(String[] args) {

        Bloco b1 = new Bloco();
        Bloco b2 = new Bloco();
        Bloco b3 = new Bloco();
        Bloco b4 = new Bloco();
        Bloco b5 = new Bloco();

        Jogador j1 = new Jogador();

        j1.destruirBloco();
        System.out.println("Numeros de blocos criados: "+ j1.totalBlocos());
        System.out.println("Blocos destruidos: " + j1.getPontuacao());
        System.out.println("Pontuacao do jogador: " + Conversor.converte(j1.getPontuacao()));

    }


}
