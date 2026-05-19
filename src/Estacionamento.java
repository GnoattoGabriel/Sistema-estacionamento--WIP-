
public class Estacionamento {

    private String nome;
    private String cnpj;
    public Endereco endereco;

    public Estacionamento(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void imprimirDados() {
        System.out.println("Estacionamento: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: "
                + endereco.getRua()
                + ", "
                + endereco.getNumero()
                + " - "
                + endereco.getBairro());
        System.out.println("Cidade: "
                + endereco.getCidade()
                + " - "
                + endereco.getEstado());
        System.out.println("CEP: "
                + endereco.getCep());
    }

    public String getEnderecoCompleto() {
        return endereco.getRua()
                + ", "
                + endereco.getNumero()
                + " - "
                + endereco.getBairro()
                + ", "
                + endereco.getCidade()
                + " - "
                + endereco.getEstado()
                + ", "
                + endereco.getCep();
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
