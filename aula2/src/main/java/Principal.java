public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.saldo = 700;
        c1.limite = 100;
        c1.nomeDoDono = "Capiroto";

        c2.saldo = 700;
        c2.limite = 100;
        c2.nomeDoDono = "Capiroto";

        //Mesmo que eles tenham os mesmos membros eles referenciam
        //epacos diferentes na memoria c1 != c2

        /*System.out.println("O saldo eh " + c1.saldo +
                " nome do dono eh " + c1.nomeDoDono
        );

        c1.sacar(300);

        System.out.println("Saldo " + c1.saldo );*/




    }
}
