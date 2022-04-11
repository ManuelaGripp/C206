public class Main {

    public static void main(String[] args) {

        Tripulante t1 = new Tripulante("Jack", 5);
        Impostor i1 = new Impostor("Caio");


        i1.skin.tipo = "Rara";
        i1.pet.nome = "Greg";


        Astronauta[] astronautas = new Astronauta[Astronauta.cont];

        astronautas[0] = t1;
        astronautas[1] = i1;

        for (int i = 0; i < astronautas.length; i++){

            if (astronautas[i] instanceof Tripulante){
                Tripulante trip = (Tripulante) astronautas[i];
                System.out.println(" ");
                System.out.println("Tripulante");
                trip.reparar();
                trip.reportar();
                trip.fazerMissao();
                trip.verCameras();
                trip.mostraInfo();
            } else{
                Impostor impo = (Impostor) astronautas[i];
                System.out.println(" ");
                System.out.println("Impostor: ");
                impo.reportar();
                impo.reparar();
                impo.usarVentoinha();
                impo.trancarPortas("Sala de arquivos");
                impo.fazerMissao();
                impo.sabotarComunicacao();
                impo.sabotarLuz();
                impo.sabotarReator();
                impo.sabotarOxigenio();
                impo.executar();
                impo.mostraInfo();
            }

        }




    }
}
