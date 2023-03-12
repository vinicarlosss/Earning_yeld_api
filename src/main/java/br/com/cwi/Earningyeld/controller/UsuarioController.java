package br.com.cwi.Earningyeld.controller;

import br.com.cwi.Earningyeld.controller.request.AlterarSenhaRequest;
import br.com.cwi.Earningyeld.controller.request.GerarTokenRequest;
import br.com.cwi.Earningyeld.controller.request.IncluirUsuarioRequest;
import br.com.cwi.Earningyeld.controller.response.UsuarioResponse;
import br.com.cwi.Earningyeld.service.GerarTokenService;
import br.com.cwi.Earningyeld.service.IncluirUsuarioService;
import br.com.cwi.Earningyeld.service.UserPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IncluirUsuarioService incluirUsuarioService;
    @Autowired
    private GerarTokenService gerarTokenService;
    @Autowired
    private UserPasswordService userPasswordService;

    @PostMapping
    private UsuarioResponse incluir(@RequestBody @Valid IncluirUsuarioRequest request){
        return incluirUsuarioService.incluir(request);
    }

    @PostMapping("/forgot-password")
    public void gerarToken(@RequestBody @Valid GerarTokenRequest request){
        gerarTokenService.gerar(request);
    }

    @PostMapping("/change-password")
    public void changePassword(@RequestBody @Valid AlterarSenhaRequest request){
        userPasswordService.changePassword(request.getPassword(), request.getToken());
    }
}
