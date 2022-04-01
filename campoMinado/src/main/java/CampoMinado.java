public class CampoMinado {

    Bomba[][] campoMinado = new Bomba[2][2];

    CampoMinado() {
        for (int i = 0; i < campoMinado.length; i++)
            for (int j = 0; j < campoMinado.length; j++) {
                campoMinado[i][j] = new Bomba();
            }
    }

    void inserirBomba(int linha, int coluna){
    campoMinado[linha][coluna].setPossuiBomba(true);
    }

    void bombaAtiva(int linha, int coluna){

        if (campoMinado[linha][coluna].isPossuiBomba()) {
            System.out.println("BOMBA!!!");
        } else
            System.out.println("UFA!!");
    }

}
