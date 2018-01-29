package br.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.biblioteca.data.PessoaRepository;
import br.com.biblioteca.data.ProjetoRepository;
import br.com.biblioteca.model.Projeto;

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
	
	@RequestMapping("/novo")
	String cadastro(Model model) {
		model.addAttribute("projeto",new Projeto());
		model.addAttribute("funcionarios",repositoryPessoas.findAll());
		return "form";
	}
	
}
