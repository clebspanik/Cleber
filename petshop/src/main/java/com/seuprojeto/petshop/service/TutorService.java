package com.seuprojeto.petshop.service;

import com.seuprojeto.petshop.domain.entity.Tutor;
import com.seuprojeto.petshop.dto.tutor.TutorRequest;
import com.seuprojeto.petshop.repository.TutorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor // Lombok para injeção de dependência no construtor
public class TutorService {

    private final TutorRepository tutorRepository;

    @Transactional(readOnly = true)
    public Page<Tutor> findAll(Pageable pageable) {
        return tutorRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Tutor findById(Long id) {
        return tutorRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Tutor com ID " + id + " não encontrado."));
    }

    @Transactional
    public Tutor save(TutorRequest dto) {
        Tutor tutor = new Tutor();
        tutor.setNome(dto.getNome());
        tutor.setTelefone(dto.getTelefone());
        tutor.setEmail(dto.getEmail());
        return tutorRepository.save(tutor);
    }

    @Transactional
    public Tutor update(Long id, TutorRequest dto) {
        Tutor tutor = findById(id);
        tutor.setNome(dto.getNome());
        tutor.setTelefone(dto.getTelefone());
        tutor.setEmail(dto.getEmail());
        return tutorRepository.save(tutor);
    }

    @Transactional
    public void delete(Long id) {
        tutorRepository.delete(findById(id));
    }
}