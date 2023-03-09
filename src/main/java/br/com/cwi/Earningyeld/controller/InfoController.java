package br.com.cwi.Earningyeld.controller;

import br.com.cwi.Earningyeld.controller.response.DetalharEmpresaResponse;
import br.com.cwi.Earningyeld.service.DetalharEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/infos")
public class InfoController {

    @Autowired
    private DetalharEmpresaService detalharEmpresaService;

    @GetMapping("/{ticker}")
    private DetalharEmpresaResponse detalhar(@PathVariable String ticker){
        return detalharEmpresaService.detalhar(ticker);
    }
}
