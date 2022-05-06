import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cordas c1 = new Cordas();
        Cordas c2 = new Cordas();
        Sopro s1 = new Sopro();
        Sopro s2 = new Sopro();
        Percussao p1 = new Percussao();
        Percussao p2 = new Percussao();

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());

        ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
        instrumentos.add(c1);
        instrumentos.add(s1);
        instrumentos.add(p1);
        instrumentos.add(c2);
        instrumentos.add(s2);
        instrumentos.add(p2);

        for (int i = 0; i < instrumentos.size(); i++) {
            instrumentos.get(i).nome = nomes.get(i);
            instrumentos.get(i).preco = new Random().nextDouble()*100;
        }
        System.out.println("");
        System.out.println("Instrumento em ordem de preenchimento ");

        for(int i = 0; i < instrumentos.size();i++){
            System.out.println(instrumentos.get(i).nome);
            System.out.println(instrumentos.get(i).preco);
        }

        Collections.sort(instrumentos,Collections.reverseOrder());

        System.out.println("");
        System.out.println("Instrumento em ordem decrescente");
        for(int i = 0; i < instrumentos.size();i++){

            System.out.println(instrumentos.get(i).nome);
            System.out.println(instrumentos.get(i).preco);
        }

    }
}
