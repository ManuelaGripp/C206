public class Zumbi {
    double vida;
    String nome;


    double mostraVida() {
        return vida;
    }

    boolean trasfereVida(Zumbi zumbiAlvo, double quantia) {
        if (this.vida > quantia) {
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;
            System.out.println("Transferiu");
            return true;
        }
        System.out.println("Nao Transferiu");
        return false;
    }
}
