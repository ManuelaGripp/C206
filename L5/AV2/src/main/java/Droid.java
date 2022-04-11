public class Droid extends Personagem {

    private boolean hostil;

    public Droid(boolean hostil) {
        this.hostil = hostil;
    }

    //Metodos da classe mae
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Hostil: " + this.hostil);
    }


    @Override
    public void travarBatalha() {
    if (hostil){
        System.out.println(getNome() + " travou uma batalha contra um Jedi" );
        int poder = getPoder();
        poder++;
        setPoder(poder);
    } else {
        System.out.println(getNome() + "vtravou uma batalha contra um Sith" );
        int poder = getPoder();
        poder++;
        setPoder(poder);
    }
    }



    //Metodos da propria classe
    public void hackearSistema(){
        System.out.println(getNome() + " hackeou o sistema da nave" );
    }




}
