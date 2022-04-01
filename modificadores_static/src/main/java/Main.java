import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Robo r1 = new Robo("A");
        Robo r2 = new Robo("B");
        Robo r3 = new Robo("C");

        //Para acessa variaveis estaticas
        //Acessar a partir da propria classe

        System.out.println(Robo.cont);

        System.out.println(r1.nSerie);
        System.out.println(r2.nSerie);
        System.out.println(r3.nSerie);

        JOptionPane.showMessageDialog(null, "Hello World");
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a"));
        JOptionPane.showMessageDialog(null, "Valor de n: " + n);

    }
}
