
public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente 1");
        cliente1.setNumeroPix("123456789");
        cliente1.setTipoCliente("PF");
        cliente1.setTemCartaoCredito(true);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cliente 2");
        cliente2.setNumeroPix("987654321");
        cliente2.setTipoCliente("PJ");
        cliente2.setTemCartaoCredito(false);

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        Banco banco = new Banco();
        banco.setNome("Banco Digital");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.listarClientes();
        banco.debitoAutomatico("Luz", 30);
        banco.debitoAutomatico("Água", 20);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
