package br.com.cwi.Earningyeld.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AlterarSenhaRequest {
    @NotBlank
    private String password;
    @NotBlank
    private String token;
}
