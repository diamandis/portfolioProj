package br.com.biblioteca.model;

public enum Status {
	ANALISE("Em análise"),REALIZADA("Análise realizada"),APROVADA("Análise aprovada"),
	INICIADO("Iniciado"),ANDAMENTO("Em andamento"),ENCERRADO("Encerrado"), PLANEJADO("Planejado"), CANCELADO("Cancelado");
	
	private final String descricao;
	
	Status(String descricao) {
		this.descricao = descricao;
	}
}
