package br.com.cwi.Earningyeld.service;

import br.com.cwi.Earningyeld.controller.response.ListarRankingResponse;
import br.com.cwi.Earningyeld.mapper.ListarRankingMapper;
import br.com.cwi.Earningyeld.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ListarRankingService {

    @Autowired
    private RankingRepository rankingRepository;

    public Page<ListarRankingResponse> listar(Pageable pageable) {
        return rankingRepository.findAll(pageable)
                .map(ListarRankingMapper::toResponse);
    }
}
