package com.eli.junior.gerenciador_projetos.controllers;

import com.eli.junior.gerenciador_projetos.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService service;

}
