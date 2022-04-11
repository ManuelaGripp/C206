public class Jedi extends Personagem implements Treinamento,Forca {

    private boolean mestre;
    private Sabre sabre = new Sabre();


    public Jedi(boolean mestre) {
        this.mestre = mestre;
    }

    //Metodos da propria classe
    public void addSabre(Sabre sabre){
        this.sabre = sabre;
    }


    //Metodos classe mae
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Mestre: " + this.mestre);
        System.out.println("Cor do sabre: " + sabre.getCor() );
    }


    @Override
    public void travarBatalha(){
        System.out.println(getNome() + " travou uma batalha contra um Sith" );
        int poder = getPoder();
        poder++;
        setPoder(poder);
    }

    //Metodo interface Treinamento
    @Override
    public void treinarPadawan(){
    if (mestre || getPoder() > 70 ){
        System.out.println(getNome() + " treinou um Padawan");
    } else
        System.out.println(getNome() + " ainda nao consegue treinar um Padawan");
    }

    //Metodos interface Forca
    @Override
    public void usarForca(){
        System.out.println(getNome() + " usou a forca para o bem");
        int poder = getPoder();
        poder += 4;
        setPoder(poder);

    }

    @Override
    public void trocarSabre(String cor){
    sabre.setCor(cor);
    }




}
