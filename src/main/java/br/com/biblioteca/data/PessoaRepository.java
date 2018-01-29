package br.com.biblioteca.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.biblioteca.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Long>{

}
