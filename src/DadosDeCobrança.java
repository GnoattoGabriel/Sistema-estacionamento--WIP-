public class DadosDeCobrança {
    private String banco;
    private String agencia;
    private String conta;
    private String metodoPagamentoPreferencial;

    public DadosDeCobrança(String metodoPagamentoPreferencial,
                           String conta,
                           String agencia,
                           String banco) {
        this.metodoPagamentoPreferencial = metodoPagamentoPreferencial;
        this.conta = conta;
        this.agencia = agencia;
        this.banco = banco;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getMetodoPagamentoPreferencial() {
        return metodoPagamentoPreferencial;
    }

    public void setMetodoPagamentoPreferencial(String metodoPagamentoPreferencial) {
        this.metodoPagamentoPreferencial = metodoPagamentoPreferencial;
    }
}
