public class Sith extends Personagem implements Forca {

    private boolean darth;
    private Sabre sabre = new Sabre();

    public Sith(boolean darth) {
        this.darth = darth;
    }

    //Metodo classe mae
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Darth: " + darth);
        System.out.println("Cor do sabre: " + sabre.getCor() );
    }

    @Override
    public void travarBatalha(){
        System.out.println(getNome() + " travou uma batalha contra um Jedi" );
        int poder = getPoder();
        poder++;
        setPoder(poder);
    }


    //Metodos da propria classe
    public void corromperJedi(){
    if(darth && getPoder() > 60){
        System.out.println(getNome() + " levou um Jedi para o lado negro da forca");
    } else
        System.out.println(getNome() + " ainda nao consegue corromper Jedi" );
    }

    public void addSabre(Sabre sabre){
        this.sabre = sabre;
    }


    //Metodos interface Forca
    @Override
    public void usarForca(){
        System.out.println(getNome() + " usou o lado negro da forca");
        int poder = getPoder();
        poder+=2;
        setPoder(poder);
    }

    @Override
    public void trocarSabre(String cor){
    sabre.setCor(cor);
    }






}
