public class Ex2 {
    float peso = 66f;
    float altura = 1.58f;

    float imc = (peso)/(altura*altura);

        if(imc < 18.5) {
        System.out.println(imc);
        System.out.println("Abaixo do peso");
    }
        else if(imc < 25)
            System.out.println("Peso ideal");
        else if(imc < 30){
        System.out.println(imc);
        System.out.println("Levemente acima do peso ");
    }
        else if(imc < 35)
            System.out.println("Obesidade grau 1");
        else if(imc < 40)
            System.out.println("Obesidade grau 2 (severa)");
        else
                System.out.println("Obesidade grau 3 (morbida)");
}
