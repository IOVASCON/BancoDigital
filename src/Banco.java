
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        for (Conta conta : contas) {
            System.out.println("Nome: " + conta.getCliente().getNome());
            System.out.println("Tipo: " + conta.getCliente().getTipoCliente());
            System.out.println("Número do PIX: " + conta.getCliente().getNumeroPix());
            System.out.println("Tem Cartão de Crédito: " + conta.getCliente().isTemCartaoCredito());
            System.out.println("-------------------------");
        }
    }

    public void debitoAutomatico(String servico, double valor) {
        System.out.println("Débito automático para " + servico + " no valor de R$" + valor);
        for (Conta conta : contas) {
            conta.sacar(valor);
        }
    }
}
