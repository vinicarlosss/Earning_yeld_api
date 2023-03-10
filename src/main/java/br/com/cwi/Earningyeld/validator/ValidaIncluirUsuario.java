package br.com.cwi.Earningyeld.validator;

import br.com.cwi.Earningyeld.controller.request.IncluirUsuarioRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

import static java.util.Objects.isNull;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Component
public class ValidaIncluirUsuario {

    private  static  final int  TAMANHO_MINIMO = 4;
    private static final int TAMANHO_MINIMO_EMAIL = 10;
    public void validar(IncluirUsuarioRequest request) {

        if(isNull(request)){
            throw new ResponseStatusException(BAD_REQUEST, "Dados não informados");
        }

        if(request.getNome().trim().length() < TAMANHO_MINIMO){
            throw new ResponseStatusException(BAD_REQUEST, "Nome deve ter ao menos 4 caracteres");
        }

        if(request.getSenha().trim().length() < TAMANHO_MINIMO){
            throw new ResponseStatusException(BAD_REQUEST, "Senha deve ter ao menos 4 caracteres");
        }

        if(request.getEmail().trim().length() < TAMANHO_MINIMO_EMAIL){
            throw new ResponseStatusException(BAD_REQUEST, "Email deve ter ao menos 10 caracteres");
        }
    }
}
