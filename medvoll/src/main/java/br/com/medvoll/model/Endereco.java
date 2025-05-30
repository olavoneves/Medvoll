package br.com.medvoll.model;

import br.com.medvoll.dto.EnderecoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String complemento;

    public Endereco(EnderecoDTO endereco) {
        this.cep = endereco.cep();
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.localidade = endereco.localidade();
        this.uf = endereco.uf();
        this.complemento = endereco.complemento();
    }
}
