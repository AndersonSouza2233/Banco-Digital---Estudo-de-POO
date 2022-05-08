import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Banco banco =  new Banco("Fulano");
        banco.novaContaCorrente(new Cliente("Anderson"));
        banco.novaContaPoupanca(new Cliente("JOaoa"));
        banco.mostarContasCorrente();
        banco.mostarContasPoupanca();
    }
}
