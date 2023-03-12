package br.com.cwi.Earningyeld.controller.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class GerarTokenRequest {
    @Email
    @NotBlank
    private String email;
}
