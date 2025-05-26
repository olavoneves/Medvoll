package br.com.medvoll.service;

import br.com.medvoll.dto.MedicoDTO;
import br.com.medvoll.model.Medico;
import br.com.medvoll.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    public void cadastrarMedico(MedicoDTO dados) {
        repository.save(new Medico(dados));
    }
}
