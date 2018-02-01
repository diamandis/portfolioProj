package br.com.biblioteca.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.data.ProjetoRepository;
import br.com.biblioteca.model.Projeto;

@Service
public class ProjetoService {
	@Autowired
	private ProjetoRepository repository;
	
	public Projeto save(Projeto p) {
		if(p.getGerente().isFuncionario()) {
			p.getGerente().setFuncionario(false);
		}		
		return repository.save(p);
	}
	
	public Collection<Projeto> findAll() {
		return repository.findAll();
	}
	
	public Projeto findById(Long id) {
		return repository.findById(id);
	}
}
