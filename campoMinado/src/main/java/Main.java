import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CampoMinado campo1 = new CampoMinado();
        Random rand = new Random();
        int linha = rand.nextInt(2);
        int coluna = rand.nextInt(2);

        System.out.println(linha);
        System.out.println(coluna);

        for (int i = 0; i < 4; i++) {

            campo1.inserirBomba(linha, coluna);

            Scanner entrada = new Scanner(System.in);

            System.out.println("Entre com a linha");
            int linhaIn = entrada.nextInt();

            System.out.println("Entre com a coluna");
            int colunaIn = entrada.nextInt();

            campo1.bombaAtiva(linhaIn, colunaIn);

        }

    }
}