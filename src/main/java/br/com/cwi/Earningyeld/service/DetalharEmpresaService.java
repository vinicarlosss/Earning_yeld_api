package br.com.cwi.Earningyeld.service;

import br.com.cwi.Earningyeld.controller.response.DetalharEmpresaResponse;
import br.com.cwi.Earningyeld.domain.Empresa;
import br.com.cwi.Earningyeld.mapper.DetalharEmpresaMapper;
import br.com.cwi.Earningyeld.service.search.BuscarEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.cwi.Earningyeld.mapper.DetalharEmpresaMapper.toResponse;

@Service
public class DetalharEmpresaService {

    @Autowired
    private BuscarEmpresaService buscarEmpresaService;

    public DetalharEmpresaResponse detalhar(String ticker) {

        Empresa empresa = buscarEmpresaService.porTicker(ticker);

        return toResponse(empresa);
    }
}
