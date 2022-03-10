public class Equipe {

    String capitao;
    Heroi[] herois = new Heroi[15];

    public Equipe(String capitao) {
        this.capitao = capitao;
    }

    void adicionarHeroi(Heroi heroi) {
        for (int i = 0; i < this.herois.length; i++) {
            if (herois[i] == null) {
                herois[i] = heroi;
                System.out.println("Adicionado");
                break;
            }
        }
    }

    void mostraInfo() {
        System.out.println("Equipe: ");
        for (int i = 0; i < this.herois.length; i++) {
            if (herois[i] != null) {
                System.out.println("Membros:");
                System.out.println("Nome:" + this.herois[i].nome);
                System.out.println("Poder:" + this.herois[i].poder);
                System.out.println("PodeVoar:" + this.herois[i].podeVoar);
            }
        }
    }

    void mostraMaisForte() {
        float poder = 0f;
        int maisForte = 0;
        boolean flag = false;

        for (int i = 0; i < herois.length; i++) {
            if (herois[i] != null) {
                if (herois[i].poder > poder) {
                    flag = true;
                    poder = herois[i].poder;
                    maisForte = i;
                }
            }
        }
        if (flag)
            System.out.println("O heroi mais forte: " + herois[maisForte].nome);
    }

    int calculaVoadores() {
        int voam = 0;
        int total = 0;
        for (Heroi heroi : herois) {
            if (heroi != null) {
                total++;
                if (heroi.podeVoar) {
                    voam++;
                    System.out.println(voam);
                }
            }
        }

        int res = (voam * 100 / total);
        return res;

    }


}
