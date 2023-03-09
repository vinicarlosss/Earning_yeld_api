package br.com.cwi.Earningyeld.repository;

import br.com.cwi.Earningyeld.domain.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    Optional<Empresa> findByTicker(String ticker);
}
