
import Adicionados.DateTimeEstacionamento;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

public class TicketEstacionamento {

    private String codigo;
    private Veiculo veiculo;
    private Vaga vaga;
    private boolean perdido;
    private DateTimeEstacionamento entrada;

    public TicketEstacionamento(String codigo, Veiculo veiculo, Vaga vaga, boolean perdido) {
        this.codigo = codigo;
        this.veiculo = veiculo;
        this.vaga = vaga;
        this.perdido = perdido;
        this.entrada = new DateTimeEstacionamento(LocalDateTime.now());
    }

    public void imprimirTicket() {

            DateTimeEstacionamento entrada = new DateTimeEstacionamento(
                                                    veiculo.getDataHoraEntrada());

            System.out.println("Ticket: " + codigo);
            System.out.println("Veículo: " + veiculo.getPlaca());
            System.out.println("Vaga: " + vaga.getCodigo());

            System.out.println(
                    "Entrada: " + entrada.formatar()
            );

            if (entrada.isHorarioEspecial()) {
                System.out.println("Período: horário especial");
            } else {
                System.out.println("Período: horário regular");
            }

            if (perdido) {
                System.out.println("Situação: ticket perdido");
            } else {
                System.out.println("Situação: ticket regular");
            }
    }

    public long calcularMinutosPermanencia(TicketEstacionamento ticket) {
        return Duration.between(
                ticket.getDataHoraEntrada(),
                ticket.getDataHoraSaidaPrevista()).toMinutes();
    }

    public String getCodigo() {
        return codigo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public boolean isPerdido() {
        return perdido;
    }

    public LocalDateTime getDataHoraEntrada() {
        return veiculo.getDataHoraEntrada();
    }

    public LocalDateTime getDataHoraSaidaPrevista() {
        return veiculo.getDataHoraSaidaPrevista();
    }
}
