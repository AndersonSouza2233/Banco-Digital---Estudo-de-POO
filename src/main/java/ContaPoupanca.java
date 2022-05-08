public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL_POUPANCA = 0;

    public ContaPoupanca(Cliente cliente) {
        super(SEQUENCIAL_POUPANCA++, cliente);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNome() +
                '}';
    }
}
