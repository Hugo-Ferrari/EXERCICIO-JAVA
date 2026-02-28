public class Conta {
    public int numeroConta, agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;


    public Conta( int numeroConta, int agencia, String nomeClient) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeClient;
        this.saldo = 0;
        this.status = true;

    }

    public void depositar(float x) {
        if (this.status) {
            this.saldo += x;
            System.out.println(x + " Reais depositados na conta de" + this.nomeCliente);
        }
    }

    public void sacar(float x) {
        if (this.status && this.saldo >= x) {
            this.saldo -= x;
            System.out.println("um saque de " + x + " reais foi feito na conta de " + this.nomeCliente);
        } else {
            System.out.println(!this.status ? "Conta inativa" : "saldo insuficiente");
        }
    }

    public void encerrarConta() {
        if (this.saldo ==0) {
            this.status = false;
            System.out.println("a conta foi cancelada por falta de dinheiro");
        }
    }
    public String toString(){
        return " \nNumero: " + this.numeroConta + "\n Agencia: " + this.agencia + "\n Cliente: " + this.nomeCliente + " \nSaldo atual: " + this.saldo + " \nStatus: " + (this.status? "ativo" : "Encerrada");
    }
}