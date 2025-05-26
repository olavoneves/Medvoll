package br.com.medvoll.controller;

import br.com.medvoll.dto.MedicoDTO;
import br.com.medvoll.service.MedicoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody MedicoDTO dados) {
        service.cadastrarMedico(dados);
    }
}
