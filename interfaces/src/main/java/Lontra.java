public class Lontra extends Mamifero implements Aquatico {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom(){
        System.out.println("Ih ih, iriri");
    }
    @Override
    public void nadar(){
        System.out.println(this.nome + " esta nadando");
    }

    public void entrarNaAgua(){
        System.out.println("Entrou na agua");
        nadar();
    }

}
