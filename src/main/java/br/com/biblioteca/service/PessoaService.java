package br.com.biblioteca.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.data.PessoaRepository;
import br.com.biblioteca.model.Pessoa;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository repository;
	
	public Collection<Pessoa> findAll() {
		return repository.findAll();
	}
}
