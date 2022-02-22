public class Principal {

    public static void main(String[] args) {

   /* Conta c1 = new Conta();
    Conta c2 = new Conta();
    c1.saldo = 50;
    c2.saldo = 100;

    //Transferencia

        c2.transferencia(20, c1);

        System.out.println("Saldo C1: " + c1.saldo);
        System.out.println("Saldo C2: " + c2.saldo);*/

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 15;
        z2.vida = 40;

        z2.trasfereVida(z1,20);

        System.out.println(z1.vida);
        System.out.println(z2.vida);
    }
}
