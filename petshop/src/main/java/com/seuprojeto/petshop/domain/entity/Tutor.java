package com.seuprojeto.petshop.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tutores")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String telefone;

    @Column(unique = true)
    private String email;

    // Relacionamento OneToMany com Pet (opcional, para conveniência. O Pet já tem o ManyToOne)
    // @OneToMany(mappedBy = "tutor", fetch = FetchType.LAZY)
    // private List<Pet> pets;
}