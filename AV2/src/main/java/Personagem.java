public abstract class Personagem {

    public static int cont;
    private String nome;
    private int id;
    private int poder;

    public Personagem() {
        cont++;
        id = cont;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    //Metodos
    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Id: " + this.id);
        System.out.println("Poder: " + this.poder);
    }

    public abstract void travarBatalha();


}
