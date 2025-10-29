package com.seuprojeto.petshop.repository;

import com.seuprojeto.petshop.domain.entity.Atendimento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
    // Filtro útil: /api/atendimentos?data=2025-10-21 (busca no dia)
    // Assumindo que a busca por data deve ser no dia todo (00:00:00 até 23:59:59)
    Page<Atendimento> findByDataHoraBetween(LocalDateTime startOfDay, LocalDateTime endOfDay, Pageable pageable);
}