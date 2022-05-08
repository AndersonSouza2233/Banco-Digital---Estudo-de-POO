public class ContaCorrete extends Conta{
    private static int SEQUENCIAL_CORRENTE = 0;

    public ContaCorrete(Cliente cliente) {
        super(SEQUENCIAL_CORRENTE++, cliente);
    }

    @Override
    public String toString() {
        return "ContaCorrete{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNome() +
                '}';
    }
}
