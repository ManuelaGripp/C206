public class Conta {

    //Membros da class
    double saldo;
    double limite;

    //Metodos

    void sacar(double quantia) {
        saldo -= quantia;
    }

    void depositar(double quantia) {
        saldo += quantia;
    }

    void transferencia(double quantia, Conta destino) {
        this.sacar(quantia);
        destino.depositar(quantia);
    }


}
