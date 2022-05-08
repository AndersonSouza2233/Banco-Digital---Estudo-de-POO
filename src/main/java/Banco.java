import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List <Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void novaContaCorrente(Cliente cliente){
        contas.add(new ContaCorrete(cliente));
    }

    public void novaContaPoupanca(Cliente cliente){
        contas.add(new ContaPoupanca(cliente));
    }

    public void listarContas(){
        contas.forEach(conta -> System.out.println(conta));
    }

    public void mostarContasCorrente(){
        System.out.println("\nMostrando Contas Corrente");
        for (int i = 0; i < contas.size(); i++) {
            if(contas.get(i) instanceof ContaCorrete){
                System.out.println(contas.get(i));
            }
        }
    }

    public void mostarContasPoupanca(){
        System.out.println("\nMonstando Contas Poupanca");
        for (int i = 0; i < contas.size(); i++) {
            if(contas.get(i) instanceof ContaPoupanca){
                System.out.println(contas.get(i));
            }
        }
    }
}
