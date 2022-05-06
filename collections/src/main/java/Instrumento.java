public abstract class Instrumento implements Comparable<Instrumento> {

    String nome;
    double preco;


    @Override
    public int compareTo(Instrumento o) {
        return Double.compare(this.preco,o.preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
