public class Main {

    public static void main(String[] args) {

        Nave nave = new Nave();

        Sabre sabreVerde = new Sabre();
        Sabre sabreAzul = new Sabre();
        Sabre sabreVermelho = new Sabre();
        Sabre sabreRoxo = new Sabre();

        Jedi jedi1 = new Jedi(true);
        Jedi jedi2 = new Jedi(false);

        Sith sith1 = new Sith(true);
        Sith sith2 = new Sith(false);

        Droid droid1 = new Droid(true);
        Droid droid2 = new Droid(false);

        jedi1.setPoder(80);
        jedi1.setNome("Jedi1");
        jedi1.addSabre(sabreVerde);

        jedi2.setPoder(50);
        jedi2.setNome("Jedi2");
        jedi2.addSabre(sabreAzul);

        sith1.setPoder(70);
        sith1.setNome("Sith1");
        sith1.addSabre(sabreVermelho);

        sith2.setPoder(50);
        sith2.setNome("Sith2");
        sith2.addSabre(sabreRoxo);

        droid1.setNome("Droid1");
        droid1.setPoder(80);

        droid2.setNome("Droid2");
        droid2.setPoder(40);

        nave.personagens[0] = jedi1;
        nave.personagens[1] = jedi2;
        nave.personagens[2] = sith1;
        nave.personagens[3] = sith2;
        nave.personagens[4] = droid1;
        nave.personagens[5] = droid2;

        nave.mostraInfo();

        System.out.println("Quantidade de Personagens: " + Personagem.cont);






    }

}
