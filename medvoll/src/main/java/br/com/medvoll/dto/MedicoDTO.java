package br.com.medvoll.dto;

import br.com.medvoll.model.Especialidade;

public record MedicoDTO(String nome,
                        String email,
                        String crm,
                        Especialidade especialidades,
                        EnderecoDTO endereco) {
}
