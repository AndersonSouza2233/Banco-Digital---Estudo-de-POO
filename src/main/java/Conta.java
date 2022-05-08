public abstract class Conta {

    protected static int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int conta;
    protected Double saldo;
    protected Cliente cliente;

    public Conta(int conta, Cliente cliente) {
        this.agencia = this.AGENCIA_PADRAO;
        this.conta = conta;
        this.saldo = 0d;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void sacar(Double  valor){
        this.saldo -= valor;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void transferir(Conta contaDestino, Double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
