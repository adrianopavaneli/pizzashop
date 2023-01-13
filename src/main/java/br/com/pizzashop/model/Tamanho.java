package br.com.pizzashop.model;

import java.math.BigDecimal;

public class Tamanho {
	private Long id;
	private String nome;
	private BigDecimal desconto;
	public Tamanho() {
		
	}
	public Tamanho(String nome, BigDecimal desconto) {
		
		this.nome = nome;
		this.desconto = desconto;
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
	public BigDecimal getDesconto() {
		return desconto;
	}
	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
	
	

}
