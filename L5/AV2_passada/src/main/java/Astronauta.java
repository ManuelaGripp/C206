public abstract class Astronauta {

    public static int cont;
    private String nome;
    public Skin skin = new Skin();
    public Pet pet = new Pet() ;

    public String getNome() {
        return nome;
    }

    public Skin getSkin() {
        return skin;
    }

    public Pet getPet() {
        return pet;
    }

    public Astronauta(String nome) {
        this.nome = nome;
        cont++;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        if (pet.nome != null)
            System.out.println("Pet: " + this.pet.nome);
        else
            System.out.println("Nao possui pet");

        if (skin.tipo != null)
            System.out.println("Tipo do pet: " + this.skin.tipo);
        else
            System.out.println("Nao possui skin");
    }

    public void verCameras(){
        System.out.println(this.nome + " olho nas cameras");
    }

    public abstract void reportar();
    public abstract void reparar();






}
