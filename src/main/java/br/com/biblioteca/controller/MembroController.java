package br.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.data.MembroRepository;
import br.com.biblioteca.data.PessoaRepository;
import br.com.biblioteca.model.Membro;
import br.com.biblioteca.model.Pessoa;

@RestController
@RequestMapping("/membro")
public class MembroController {
	@Autowired
	private PessoaRepository repository;
	@Autowired
	private MembroRepository repositoryMembros;
	
	//cadastro de novos funcionarios
	@RequestMapping(value="/novo",method = RequestMethod.POST)
	ResponseEntity<?> add(@RequestBody Pessoa membro) {
		if(repository.save(membro) != null) {
		    return new ResponseEntity<>(null, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}

	
	//associação de funcionário a projeto
	@RequestMapping(value="/addEmProjeto/{id}",method = RequestMethod.POST)
	ResponseEntity<?> add(@PathVariable Long id, @RequestBody Pessoa membro) {
		if(!membro.isFuncionario()) {
			return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
		}
		if(repositoryMembros.save(new Membro(id,membro.getId())) != null) {
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

}
