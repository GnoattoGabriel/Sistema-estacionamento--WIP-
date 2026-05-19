package Adicionados;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEstacionamento {

    private LocalDateTime dataHora;

    public DateTimeEstacionamento(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String formatar() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        return dataHora.format(formatter);
    }

    public boolean isHorarioEspecial() {

        DayOfWeek dia = dataHora.getDayOfWeek();
        int hora = dataHora.getHour();


        return dia == DayOfWeek.SATURDAY ||
                dia == DayOfWeek.SUNDAY ||
                hora >= 22;
    }

    public LocalDateTime getOriginal() {
        return dataHora;
    }

}
