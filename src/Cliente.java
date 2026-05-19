
public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private int pontosFidelidade;
    private int mesesComoCliente;
    private boolean mensalista;
    public DadosDeCobrança dadosDeCobrança;


    public Cliente(String nome, String cpf, String telefone,
                   int pontosFidelidade, int mesesComoCliente, boolean mensalista,
                   String banco, String agencia, String conta, String metodoPagamentoPreferencial) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.pontosFidelidade = pontosFidelidade;
        this.mesesComoCliente = mesesComoCliente;
        this.mensalista = mensalista;

    }

    public void imprimirResumo() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Pontos de fidelidade: " + pontosFidelidade);
        System.out.println("Mensalista: " + mensalista);
        System.out.println("Cobrança: " + getDadosCobrancaFormatados());
    }

    public String getDadosCobrancaFormatados() {
        return dadosDeCobrança.getBanco()
                + " | Agência "
                + dadosDeCobrança.getAgencia()
                + " | Conta "
                + dadosDeCobrança.getConta()
                + " | Método preferencial: "
                + dadosDeCobrança.getMetodoPagamentoPreferencial();
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public int getMesesComoCliente() {
        return mesesComoCliente;
    }

    public boolean isMensalista() {
        return mensalista;
    }

    public int calcularDescontoCliente(Cliente cliente) {
        if (isMensalista() && getPontosFidelidade() >= 4000) {
            return 20;
        }

        if (getMesesComoCliente() >= 12 && getPontosFidelidade() >= 2000) {
            return 10;
        }

        if (getPontosFidelidade() >= 1000) {
            return 5;
        }

        return 0;
    }
}