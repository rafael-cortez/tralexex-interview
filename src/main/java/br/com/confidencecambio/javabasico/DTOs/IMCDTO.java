package br.com.confidencecambio.javabasico.DTOs;


import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class IMCDTO {
    @NotNull(message = "Weight cannot be null")
    BigDecimal weight;
    @NotNull(message = "Height cannot be null")
    BigDecimal height;

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getHeight() {
        return height;
    }
}
