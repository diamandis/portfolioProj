package br.com.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="membros")
public class Membro {
	@Id	
	private Long projetoId;
	private Long pessoaId;
		
	
	public Membro(Long projetoId, Long pessoaId) {
		super();
		this.projetoId = projetoId;
		this.pessoaId = pessoaId;
	}
	public Long getProjetoId() {
		return projetoId;
	}
	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}
	public Long getPessoaId() {
		return pessoaId;
	}
	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}
	
	
}
