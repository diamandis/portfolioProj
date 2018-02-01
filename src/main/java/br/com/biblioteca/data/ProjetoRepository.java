package br.com.biblioteca.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.biblioteca.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto,Long> {
	Projeto findById(Long id);
}
