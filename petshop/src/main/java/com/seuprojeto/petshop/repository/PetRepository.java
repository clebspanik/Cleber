package com.seuprojeto.petshop.repository;

import com.seuprojeto.petshop.domain.entity.Pet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    // Filtro útil: /api/pets?tutorId=<id>
    Page<Pet> findByTutorId(Long tutorId, Pageable pageable);
}