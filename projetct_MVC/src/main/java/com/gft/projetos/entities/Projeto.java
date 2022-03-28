package com.gft.projetos.entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Projeto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String apelido;
	
	@ManyToOne
	private Linguagem linguagem;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataEntrega;
	
	private BigDecimal orcamentoLong;
	
	@ManyToMany
	private List<Desenvolvedor> desenvolvedores;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Linguagem getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(Linguagem linguagem) {
		this.linguagem = linguagem;
	}
	public BigDecimal getOrcamentoLong() {
		return orcamentoLong;
	}
	public void setOrcamentoLong(BigDecimal orcamentoLong) {
		this.orcamentoLong = orcamentoLong;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public List<Desenvolvedor> getDesenvolvedores() {
		return desenvolvedores;
	}
	public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	}
	
	

}
