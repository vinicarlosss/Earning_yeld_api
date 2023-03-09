package br.com.cwi.Earningyeld.mapper;

import br.com.cwi.Earningyeld.controller.response.DetalharEmpresaResponse;
import br.com.cwi.Earningyeld.domain.Empresa;

public class DetalharEmpresaMapper {
    public static DetalharEmpresaResponse toResponse(Empresa empresa) {
        return DetalharEmpresaResponse.builder()
                .id(empresa.getId())
                .ticker(empresa.getTicker())
                .nomeEmpresa(empresa.getNomeEmpresa())
                .ebit(empresa.getEbit())
                .valorMercado(empresa.getValorMercado())
                .dividaLiquida(empresa.getDividaLiquida())
                .build();
    }
}
