package br.com.cwi.Earningyeld.mapper;

import br.com.cwi.Earningyeld.controller.request.IncluirUsuarioRequest;
import br.com.cwi.Earningyeld.controller.response.UsuarioResponse;
import br.com.cwi.Earningyeld.domain.Usuario;

public class IncluirUsuarioMapper {

    public static Usuario toEntity(IncluirUsuarioRequest request) {
        return Usuario.builder()
                .nome(request.getNome())
                .email(request.getEmail())
                .ativo(true)
                .build();
    }

    public static UsuarioResponse toResponse(Usuario usuario) {
        return UsuarioResponse.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .build();
    }
}
