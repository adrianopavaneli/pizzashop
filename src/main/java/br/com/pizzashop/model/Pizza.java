package br.com.pizzashop.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private Long id;
	private String nome;
	private BigDecimal preco;
	List<Ingrediente> ingredientes =  new ArrayList<>();
	public Pizza() {
		
	}
	public Pizza(String nome, BigDecimal precoBase, List<Ingrediente> ingredientes) {		
		this.nome = nome;
		this.preco = precoBase;
		this.ingredientes = ingredientes;
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
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
	
	
	
	

}
