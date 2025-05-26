package br.com.medvoll.service;

import br.com.medvoll.dto.PacienteDTO;
import br.com.medvoll.model.Paciente;
import br.com.medvoll.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public void cadastrarPaciente(PacienteDTO dados) {
        repository.save(new Paciente(dados));
    }
}
