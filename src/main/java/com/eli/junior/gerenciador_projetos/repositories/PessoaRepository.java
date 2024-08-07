package com.eli.junior.gerenciador_projetos.repositories;

import com.eli.junior.gerenciador_projetos.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Long, Pessoa> {
}
