package br.com.cwi.Earningyeld.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListarRankingResponse {

    private Long id;
    private String ticker;
    private String nome_empresa;
    private double earningYeld;
}
