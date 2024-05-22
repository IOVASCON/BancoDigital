
public class Cliente {

    private String nome;
    private String numeroPix;
    private String tipoCliente; // "PF" ou "PJ"
    private boolean temCartaoCredito;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroPix() {
        return numeroPix;
    }

    public void setNumeroPix(String numeroPix) {
        this.numeroPix = numeroPix;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public boolean isTemCartaoCredito() {
        return temCartaoCredito;
    }

    public void setTemCartaoCredito(boolean temCartaoCredito) {
        this.temCartaoCredito = temCartaoCredito;
    }
}
