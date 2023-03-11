package br.com.cwi.Earningyeld.controller;

import br.com.cwi.Earningyeld.controller.response.ListarRankingResponse;
import br.com.cwi.Earningyeld.service.ListarRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ranking")
public class RankingController {

    @Autowired
    private ListarRankingService listarRankingService;

    @GetMapping
    public Page<ListarRankingResponse> listar(Pageable pageable){
        return listarRankingService.listar(pageable);
    }
}
