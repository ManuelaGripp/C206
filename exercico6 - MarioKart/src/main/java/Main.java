public class Main {

    public static void main(String[] args) {

        //Instanciando os pilotos
        Piloto piloto = new Piloto("Mario", false);
        Piloto piloto2 = new Piloto("luigi", true);

        //Instanciando o kart e fazendo a agragacao dos pilotos e passando o valor doa membros do motor
        Kart k1 = new Kart("Joao", piloto, "100", 60.5f);
        Kart k2 = new Kart("Bianca", piloto2, "50", 56.4f );

        k1.motor.mostraInfo();
        System.out.println(" ");

        k2.motor.mostraInfo();
        System.out.println(" ");

        k1.piloto.soltarSuperPoder();
        k2.fazerDrift();

        k1.soltarTurbo();
        k2.pular();

    }

}
