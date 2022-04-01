public class Main {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[10];

        Professor p1 = new Professor("Chris", 27, 20000,"POO");
        Engenheiro e = new Engenheiro("Tohno", 46, 10000,"Software");

        funcionarios[0] = p1;
        funcionarios[1] = e;

        //funcionarios[1].corrigeProvas(); Quando usamos o funcionario para instanciar um objeto
        //nao conseguimos acessar os atributos e metodos unicos de cada classe

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null ) {
                if (funcionarios[i] instanceof Professor) {
                    System.out.println("Essa posicao tem um professor");
                    Professor prof = (Professor) funcionarios[i];
                    prof.mostraInfo();
                    prof.fazAlgo();
                    prof.corrigeProvas();
                }
            }else if(funcionarios[i] instanceof Engenheiro){
                System.out.println("Essa posicao tem um engenheiro");
                Engenheiro eng = (Engenheiro) funcionarios[i];
                eng.mostraInfo();
                eng.fazAlgo();
                System.out.println(eng.ramo);
            } else {
                System.out.println("Essa posicao tem um arquiteto");
                Arquiteto arc = (Arquiteto) funcionarios[i];
                arc.mostraInfo();
                arc.fazAlgo();
                System.out.println(arc.getNome());
            }




            }

        }

    }


}
