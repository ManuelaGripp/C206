public class Conta {

    //Membros da class
    double saldo;
    double limite;
    int numero;
    String nomeDoDono;

    //Metodos

    void sacar( double quantia ){
        saldo -= quantia;
    }

    void depositar(double quantia){
        saldo += quantia;
    }



}
