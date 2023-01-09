package br.com.pizzashop.model;

import java.math.BigDecimal;

public class Ingrediente {
	private Long id;
	private String nome;
	private String unidade;
	private BigDecimal preco;
	
	public Ingrediente() {
		
	}

	public Ingrediente(String nome, String unidade, BigDecimal preco) {		
		this.nome = nome;
		this.unidade = unidade;
		this.preco = preco;
	}

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

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
	
	

}
