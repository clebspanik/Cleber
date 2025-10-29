package com.seuprojeto.petshop.dto.tutor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TutorRequest {

    @NotBlank(message = "O nome é obrigatório.")
    @Size(max = 255, message = "O nome não pode exceder 255 caracteres.")
    private String nome;

    @NotBlank(message = "O telefone é obrigatório.")
    @Size(max = 20, message = "O telefone não pode exceder 20 caracteres.")
    private String telefone;

    // Email é opcional
    private String email;
}