import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Cordas c1 = new Cordas("Cavaco",200);
        Sopro s1 = new Sopro("Clarinete",350);
        Percussao p1 = new Percussao("tantan",150);

        ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();

        instrumentos.add(c1);
        instrumentos.add(s1);
        instrumentos.add(p1);

        Collections.sort(instrumentos,Collections.reverseOrder());

        for(int i = 0; i < instrumentos.size();i++){
            System.out.println("Instrumento " + i);
            System.out.println(instrumentos.get(i).nome);
            System.out.println(instrumentos.get(i).preco);
        }




        


    }
}
