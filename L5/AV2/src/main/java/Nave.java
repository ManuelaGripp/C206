public class Nave {

    private String nome;
    public Personagem[]personagens = new Personagem[6];
    private boolean velocidadeDaLuz;

    public void mostraInfo(){

        for (int i = 0; i < personagens.length;i++){
            if (personagens[i] instanceof Jedi){
                System.out.println("Esse Personagem e um Jedi");
                Jedi j1 = (Jedi) personagens[i];
                j1.travarBatalha();
                j1.treinarPadawan();
                j1.usarForca();
                j1.trocarSabre("Amarelo");
                j1.mostraInfo();
                System.out.println(" ");

            } else if(personagens[i] instanceof Sith){
                System.out.println("Esse Personagem e um Sith");
                Sith s1 = (Sith) personagens[i];
                s1.travarBatalha();
                s1.corromperJedi();
                s1.usarForca();
                s1.trocarSabre("Azul");
                s1.mostraInfo();
                System.out.println(" ");
            } else{
                System.out.println("Esse Personagem e um Droid");
                Droid d1 = (Droid) personagens[i];
                d1.travarBatalha();
                d1.hackearSistema();
                d1.mostraInfo();
                System.out.println(" ");
            }



        }


    }

}
