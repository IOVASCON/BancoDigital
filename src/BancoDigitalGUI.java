
import javax.swing.*;

public class BancoDigitalGUI {

    private Banco banco;
    private JTextArea textArea;

    public BancoDigitalGUI() {
        banco = new Banco();
        banco.setNome("Banco Digital");

        // Criação da interface gráfica
        JFrame frame = new JFrame("Banco Digital");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label e campo de texto para nome do cliente
        JLabel labelCliente = new JLabel("Nome do Cliente:");
        labelCliente.setBounds(10, 10, 120, 25);
        frame.add(labelCliente);

        JTextField textNome = new JTextField();
        textNome.setBounds(140, 10, 160, 25);
        frame.add(textNome);

        // Label e campo de texto para número do PIX
        JLabel labelPix = new JLabel("Número do PIX:");
        labelPix.setBounds(10, 40, 120, 25);
        frame.add(labelPix);

        JTextField textPix = new JTextField();
        textPix.setBounds(140, 40, 160, 25);
        frame.add(textPix);

        // Label e campo de texto para tipo de cliente (PF/PJ)
        JLabel labelTipo = new JLabel("Tipo de Cliente (PF/PJ):");
        labelTipo.setBounds(10, 70, 140, 25);
        frame.add(labelTipo);

        JTextField textTipo = new JTextField();
        textTipo.setBounds(160, 70, 140, 25);
        frame.add(textTipo);

        // Label e campo de texto para cartão de crédito (true/false)
        JLabel labelCredito = new JLabel("Tem Cartão de Crédito (true/false):");
        labelCredito.setBounds(10, 100, 200, 25);
        frame.add(labelCredito);

        JTextField textCredito = new JTextField();
        textCredito.setBounds(220, 100, 80, 25);
        frame.add(textCredito);

        // Botão para adicionar cliente
        JButton btnAddCliente = new JButton("Adicionar Cliente");
        btnAddCliente.setBounds(10, 130, 160, 25);
        frame.add(btnAddCliente);

        // Área de texto para exibição de informações
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 160, 560, 190);
        frame.add(scrollPane);

        // Ação do botão "Adicionar Cliente" usando expressão lambda
        btnAddCliente.addActionListener(e -> {
            String nome = textNome.getText();
            String pix = textPix.getText();
            String tipo = textTipo.getText();
            boolean temCredito = Boolean.parseBoolean(textCredito.getText());

            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setNumeroPix(pix);
            cliente.setTipoCliente(tipo);
            cliente.setTemCartaoCredito(temCredito);

            Conta conta = new ContaCorrente(cliente);
            banco.adicionarConta(conta);

            textArea.append("Cliente " + nome + " adicionado.\n");
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Cria uma nova instância da interface gráfica
        new BancoDigitalGUI();
    }
}
