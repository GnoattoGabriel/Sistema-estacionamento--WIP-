
import Adicionados.Seguradora;

import java.time.LocalDateTime;

public class Veiculo {

    private String placa;
    private String modelo;
    private String cor;
    private Seguradora seguradora;
    private TicketEstacionamento ticketEstacionamento;

    public Veiculo(String placa, String modelo, String cor,
                   String seguradora, String numeroApolice,
                   String telefoneAssistencia) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void imprimirDados() {
        System.out.println("Veículo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Entrada registrada: " + ticketEstacionamento.getDataHoraEntrada());
        System.out.println("Saída prevista: " + ticketEstacionamento.getDataHoraSaidaPrevista());
        System.out.println("Seguro: " + getDadosSeguroFormatados());
    }

    public String getDadosSeguroFormatados() {
        return seguradora
                + " | Apólice "
                + seguradora.getNumeroApolice()
                + " | Assistência "
                + seguradora.getTelefoneAssistencia();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getSeguradora() {
        return seguradora;
    }
}

