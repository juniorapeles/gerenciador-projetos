package com.eli.junior.gerenciador_projetos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Pessoa {

    @Id
    private Long id;
    private String nome;
    private String cpf;
    private String senha;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String cpf, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
