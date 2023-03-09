package br.com.cwi.Earningyeld.service.search;

import br.com.cwi.Earningyeld.domain.Empresa;
import br.com.cwi.Earningyeld.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
public class BuscarEmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa porTicker(String ticker) {
        return empresaRepository.findByTicker(ticker)
                .orElseThrow(()->{
                    throw new ResponseStatusException(BAD_REQUEST, "Empresa não encontrada");
                });
    }
}
