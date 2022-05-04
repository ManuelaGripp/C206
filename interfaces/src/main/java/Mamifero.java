public abstract class Mamifero {

    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
    }

    public abstract void emitirSom();



}
