package br.com.cwi.Earningyeld.controller;

import br.com.cwi.Earningyeld.controller.request.IncluirUsuarioRequest;
import br.com.cwi.Earningyeld.controller.response.UsuarioResponse;
import br.com.cwi.Earningyeld.service.IncluirUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IncluirUsuarioService incluirUsuarioService;

    @PostMapping
    private UsuarioResponse incluir(@RequestBody IncluirUsuarioRequest request){
        return incluirUsuarioService.incluir(request);
    }
}
