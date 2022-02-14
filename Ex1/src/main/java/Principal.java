public class Principal {
    public static void main(String[] args) {
    Zumbi z1 = new Zumbi();
    Zumbi z2 = new Zumbi();
    Zumbi z3 = new Zumbi();

    z1.nome = "Robson";
    z2.nome = "Volatil";
    z3.nome = "Ironia";

    z1.fome = true;
    z2.fome = false;

    z1.atacar();
    z2.gritar();
    z3.correr();

    }

}
