public class Impostor extends Astronauta implements Missao, Sabotar, Executar {

    private int qtdMortes;

    public Impostor(String nome) {
        super(nome);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Quantidade de mortes: " + this.qtdMortes);
    }

    @Override
    public void reportar(){
        System.out.println(getNome() + " fez um self report");
    }

    @Override
    public void reparar(){
        System.out.println(getNome() + " fingiu que fez um reparo");
    }

    public void usarVentoinha(){
        System.out.println("Impostor se escondeu na ventilacao");
    }

    public void trancarPortas(String local){
        System.out.println("Impostor fechou as portas do " + local);
    }

    @Override
    public void fazerMissao(){
        System.out.println(getNome() + " fez uma tarefa falsa");
    }

    @Override
    public void sabotarLuz(){
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio(){
        System.out.println("O impostor sabotou o oxigenio");
    }

    @Override
    public void sabotarReator(){
        System.out.println("O impostor sabotou o reator");
    }

    @Override
    public void sabotarComunicacao(){
        System.out.println("O impostor sabotou a comunicacao");
    }

    @Override
    public void executar(){
        System.out.println(getNome() + " matou um tripulante");
    }

}
