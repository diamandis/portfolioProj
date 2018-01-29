package br.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.biblioteca.data.PessoaRepository;
import br.com.biblioteca.data.ProjetoRepository;
import br.com.biblioteca.model.Projeto;
import br.com.biblioteca.model.Risco;
import br.com.biblioteca.model.Status;

@Controller
public class IndexController {
@Autowired
private ProjetoRepository repository;
@Autowired
private PessoaRepository repositoryPessoas;

	@RequestMapping("/index")
	String home(Model model) {
		model.addAttribute("projetos", repository.findAll());
		return "index";
	}
	
	@RequestMapping(value="/novo", method=RequestMethod.GET)
	String cadastro(Model model) {
		model.addAttribute("projeto",new Projeto());
		model.addAttribute("funcionarios",repositoryPessoas.findAll());
		model.addAttribute("risco", Risco.class.getEnumConstants());
		model.addAttribute("status",Status.class.getEnumConstants());
		return "form";
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	String salvar(@ModelAttribute("projeto") Projeto projeto) {
		return null;
	}
	
}
