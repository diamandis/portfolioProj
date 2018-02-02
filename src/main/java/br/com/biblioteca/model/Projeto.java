package br.com.biblioteca.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="projeto")
public class Projeto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="nome")
	private String nomeProjeto;
	@Column(name="data_inicio")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataInicio;
	@Column(name="data_previsao_fim")
	@DateTimeFormat(pattern="dd/MM/yyyy")	
	private Date dataPrevista;
	@Column(name="data_fim")
	@DateTimeFormat(pattern="dd/MM/yyyy")	
	private Date dataFim;
	@Column(name="descricao")
	private String descricao;
	@Column(name="status")
	private Status status;
	@Column(name="orcamento")
	private BigDecimal orcamento;
	@Column(name="risco")
	private Risco risco;
	
	@JoinColumn(name="idgerente")
	@ManyToOne
	private Pessoa gerente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataPrevista() {
		return dataPrevista;
	}
	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public BigDecimal getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(BigDecimal orcamento) {
		this.orcamento = orcamento;
	}
	public Risco getRisco() {
		return risco;
	}
	public void setRisco(Risco risco) {
		this.risco = risco;
	}
	public Pessoa getGerente() {
		return gerente;
	}
	public void setGerente(Pessoa gerente) {
		this.gerente = gerente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
