package Adicionados;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValorEstendido {
    private BigDecimal valor;

    public ValorEstendido(BigDecimal valor) {
        this.valor = valor;
    }

    public String formatarEmReais() {

        return "R$ "
                + valor.setScale(2, RoundingMode.HALF_UP)
                .toString()
                .replace(".", ",");
    }

    public boolean isAltoValor() {

        return valor.compareTo(
                new BigDecimal("50.00")
        ) >= 0;
    }

    public BigDecimal getOriginal() {
        return valor;
    }
}
