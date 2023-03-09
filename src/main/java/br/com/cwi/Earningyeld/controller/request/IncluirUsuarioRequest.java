package br.com.cwi.Earningyeld.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class IncluirUsuarioRequest {

    @NotBlank
    private  String nome;
    @NotBlank
    private String email;
    @NotBlank
    private String senha;
}
