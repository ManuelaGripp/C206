import lombok.Data;
@Data
public class Conta {

    //Membros
    Cliente cliente;
    private double saldo, limite;

    //Construtor

    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    //Metodos

    void depositar(double quantia){
        saldo += quantia;
    }

    //getters e setters
//    public double getSaldo() {
//        return saldo;
//    }

    /* não é necessário nesse caso
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }*/


}
