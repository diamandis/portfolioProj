package br.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.biblioteca.model.Projeto;
import br.com.biblioteca.model.Risco;
import br.com.biblioteca.model.Status;
import br.com.biblioteca.service.PessoaService;
import br.com.biblioteca.service.ProjetoService;

@Controller
public class IndexController {
@Autowired
private ProjetoService projetoServico;
@Autowired
private PessoaService pessoaServico;

	@RequestMapping("/index")
	String home(Model model) {
		model.addAttribute("projetos", projetoServico.findAll());
		return "index";
	}
	
	@RequestMapping(value="/novo", method=RequestMethod.GET)
	String cadastro(Model model) {
		model.addAttribute("projeto",new Projeto());
		model.addAttribute("funcionarios",pessoaServico.findAll());
		model.addAttribute("risco", Risco.values());
		model.addAttribute("status",Status.values());
		return "form";
	}
	
	@RequestMapping(value="/novo", method=RequestMethod.POST)
	String salvar(@ModelAttribute("projeto") Projeto projeto) {
		projetoServico.save(projeto);
			
		return "redirect:index";
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	String editar(@PathVariable Long id, Model model) {
		model.addAttribute("projeto",projetoServico.findById(id));
		model.addAttribute("funcionarios",pessoaServico.findAll());
		return "form";
	}
		
	 @ExceptionHandler(Exception.class)
	  void handleError(Exception ex) {
		System.out.println(ex);
	    System.out.println(ex.getStackTrace());
	    System.out.println(ex.getMessage());

	 }
	
}
