package br.com.cwi.Earningyeld.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetalharEmpresaResponse {

    private Long id;
    private String ticker;
    private String nomeEmpresa;
    private double ebit;
    private double valorMercado;
    private double dividaLiquida;
}
