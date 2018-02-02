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
	
	public void delete(Projeto p) throws IllegalArgumentException {
		if(p.getStatus().name().equals("Iniciado") || p.getStatus().name().equals("Em andamento") || p.getStatus().name().equals("Encerrado")) {
			throw new IllegalArgumentException("Projeto não pode ser excluído durante esta etapa.");
		} else {
			repository.delete(p);
		}
	}
}
