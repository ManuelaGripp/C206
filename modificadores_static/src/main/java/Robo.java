public class Robo {

    static int cont;
    public String nome;
    public int nSerie;

    public Robo(String nome) {
        this.nome = nome;
        cont++;
        this.nSerie = cont;//Cada robo recebe um id diferente na ordem que sao criados
    }

    public void mostraInfo(){
        System.out.println("Nome do robo: " + this.nome);
    }

    public static void mensagem(){//Desssa forma nao preciso instanciar um objeto para chamar a funcao
        System.out.println("Mensagem");
    }


}
