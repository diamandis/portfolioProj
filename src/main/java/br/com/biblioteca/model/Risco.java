package br.com.biblioteca.model;

public enum Risco {
	BAIXO("Baixo"),MEDIO("Médio"),ALTO("Alto");
	
	private final String descricao;
	
	Risco(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
