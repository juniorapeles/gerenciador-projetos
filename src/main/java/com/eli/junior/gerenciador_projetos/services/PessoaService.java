package com.eli.junior.gerenciador_projetos.services;

import com.eli.junior.gerenciador_projetos.dtos.PessoaDTO;
import com.eli.junior.gerenciador_projetos.entities.Pessoa;
import com.eli.junior.gerenciador_projetos.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    //mandar uma lista de pessoas
    public PessoaDTO getAllPessoas() {

    }

    //retornar uma pessoa
    public PessoaDTO getByIdPessoas(Long id) {

        Optional<Long> entity = repository.findById(id);
    }

    public void DeleteById(Long id) {
        repository.deleteById(id);
    }

}
