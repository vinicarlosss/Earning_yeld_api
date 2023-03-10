package br.com.cwi.Earningyeld.repository;

import br.com.cwi.Earningyeld.domain.Ranking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankingRepository extends JpaRepository<Ranking, Long> {
    Page<Ranking> findAll(Pageable pageable);
}
