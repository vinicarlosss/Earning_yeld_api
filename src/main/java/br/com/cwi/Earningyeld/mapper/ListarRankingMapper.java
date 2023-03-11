package br.com.cwi.Earningyeld.mapper;

import br.com.cwi.Earningyeld.controller.response.ListarRankingResponse;
import br.com.cwi.Earningyeld.domain.Ranking;

public class ListarRankingMapper {
    public static ListarRankingResponse toResponse(Ranking entity) {
        return ListarRankingResponse.builder()
                .id(entity.getId())
                .nome_empresa(entity.getNomeEmpresa())
                .ticker(entity.getTicker())
                .earningYeld(entity.getEarningYeld())
                .build();
    }
}
