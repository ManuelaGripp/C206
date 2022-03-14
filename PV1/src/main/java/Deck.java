public class Deck {
    //Atributos
    String dono;
    Carta[] cartas = new Carta[20];

    public Deck(String dono) {
        this.dono = dono;
    }

    //Metodos
    void mostraInfo() {
        System.out.println("Dono do deck: " + dono);
        for (int i = 0; i < cartas.length; i++) {

            if (cartas[i] != null) {
                System.out.println((i + 1) + "o carta");
                cartas[i].mostraInfo();
            }
        }
    }

    //Adiciona uma carta ao deck
    void addCarta(Carta carta) {
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] == null) {
                cartas[i] = carta;
                break;
            }

        }
    }

    //Retorna o nome do tipo mais presente no deck
    String maiorQuantidade() {
        int sold, arq, pes;
        sold = arq = pes = 0;

        for (int i = 0; i < cartas.length; i++) {

            if (cartas[i] != null) {

                if (cartas[i].tipo.equals("soldado")) {
                    sold++;
                } else if (cartas[i].tipo.equals("arqueiro")) {
                    arq++;
                } else if ((cartas[i].tipo.equals("pesado"))) {
                    pes++;
                }
            }

        }

        //Verficando quem eh o maior
        if (sold > arq && sold > pes)
            return "soldado";
        else if (arq > sold && arq > pes)
            return "arqueiro";
        else if (pes > sold && pes > arq)
            return "pesado";
        else
            return "Empatou";
    }



    //Faz a media do poder dos tipos
    void mediaTipos() {

        double totalSold, totalArq, totalPes;
        int sold, arq, pes;
        sold = arq = pes = 0;
        totalSold = totalArq = totalPes = 0;
        for (int i = 0; i < cartas.length ; i++) {

            if (cartas[i] != null){
                if(cartas[i].tipo.equals("soldado")){
                    sold++;
                    totalSold += cartas[i].poder;

                }
                if(cartas[i].tipo.equals("arqueiro")){
                    arq++;
                    totalArq += cartas[i].poder;

                }
                if(cartas[i].tipo.equals("pesado")){
                    pes++;
                    totalPes += cartas[i].poder;
                }
            }

        }
            //Mostrando as medias apenas dos tipos que existentes
            if (sold != 0)
            System.out.println("Media de poder dos soldados sao: " + (totalSold/sold));
            if (arq != 0)
                System.out.println("Media de poder dos arqueiros sao/e: " + (totalArq/arq));
            if (pes != 0)
                System.out.println("Media de poder dos pesados sao/e: " + (totalPes/pes));


    }


}
