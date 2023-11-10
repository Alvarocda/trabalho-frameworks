package br.edu.ifmt.apresentacaoframeworks.repositories;

import br.edu.ifmt.apresentacaoframeworks.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoa, Long> {

}
