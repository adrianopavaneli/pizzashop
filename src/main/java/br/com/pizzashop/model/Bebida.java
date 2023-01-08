package br.com.pizzashop.model;

import java.math.BigDecimal;

public class Bebida {
	private Long id;
	private String nome;
	private BigDecimal preco;
	
	public Bebida() {
		
	}

	public Bebida(String nome, BigDecimal preco) {		
		this.nome = nome;
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	

}
