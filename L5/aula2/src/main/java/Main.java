import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        float x;
        float y;
        String opcao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 1 numero");
        x = sc.nextFloat();
        System.out.println("Entre com 2 numero");
        y = sc.nextFloat();
        System.out.println("Operacao desejada");
        sc.nextLine();
        opcao = sc.nextLine();

        switch (opcao){
            case "soma":
                System.out.println(x+y);
                break;
        }






    }
}
