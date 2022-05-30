import java.util.*;

public class Main {
    public static void main(String[] args) {
/*
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
*/

        //Exercicio 3

        long global = 100000;

        List <Integer> inteirosArray = new ArrayList<>();
        Set<Integer> inteirosSet = new HashSet<>();
        Map<Integer,Integer> inteirosMap = new HashMap<>();
        long  tempIniArray;
        long  tempFinArray;
        long  tempIniSet;
        long  tempFinSet;
        long  tempIniMap;
        long  tempFinMap;

        //Array
        tempIniArray = System.currentTimeMillis();
        for (int i = 0; i < global; i++) {
            inteirosArray.add(i);
        }
        tempFinArray = System.currentTimeMillis();


        //Set
        tempIniSet = System.currentTimeMillis();
        for (int i = 0; i < global; i++) {
            inteirosSet.add(i);
        }
        tempFinSet = System.currentTimeMillis();


        //Map
        tempIniMap = System.currentTimeMillis();
        for (int i = 0; i < global; i++) {
            inteirosMap.put(i,i);
        }
        tempFinMap = System.currentTimeMillis();

        System.out.println("Tempo gasto na inserçao com Array: " + (tempFinArray-tempIniArray));
        System.out.println("Tempo gasto na inserção com Set: " + (tempFinSet - tempIniSet) );
        System.out.println("Tempo gasto na inserção com Map: " + (tempFinMap - tempIniMap) );


        tempIniArray = System.currentTimeMillis();
        for (int i = 0; i < global; i++) {
            inteirosArray.contains(i);
        }
        tempFinArray = System.currentTimeMillis();


        tempIniSet = System.currentTimeMillis();
        for (int i = 0; i < global; i++) {
            inteirosSet.contains(i);
        }
        tempFinSet = System.currentTimeMillis();

        tempIniMap = System.currentTimeMillis();

        for (int i = 0; i < global; i++) {
            inteirosMap.containsKey(i);
        }

        tempFinMap = System.currentTimeMillis();

        System.out.println("");
        System.out.println("Leitura");
        System.out.println("Tempo gasto na leitura com Array: " + (tempFinArray-tempIniArray));
        System.out.println("Tempo gasto na leitura com Set: " + (tempFinSet - tempIniSet) );
        System.out.println("Tempo gasto na leitura com Map: " + (tempFinMap - tempIniMap) );

    }
}
