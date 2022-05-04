public abstract class Instrumento implements Comparable<Instrumento> {

    String nome;
    int preco;

    public Instrumento(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Instrumento o) {
        return Integer.compare(this.preco,o.preco);
    }
}
