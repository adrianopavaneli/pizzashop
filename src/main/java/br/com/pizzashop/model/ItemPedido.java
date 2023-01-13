package br.com.pizzashop.model;

import java.util.ArrayList;
import java.util.List;

public class ItemPedido {
	private Long id;
	private List<Pizza> pizzas = new ArrayList<>();
	private List<Bebida> bebidas =  new ArrayList<>();
	public ItemPedido() {
		
	}
	public ItemPedido(List<Pizza> pizzas, List<Bebida> bebidas) {
		
		this.pizzas = pizzas;
		this.bebidas = bebidas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Pizza> getPizzas() {
		return pizzas;
	}
	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	public void setBebidas(List<Bebida> bebidas) {
		this.bebidas = bebidas;
	}
	
	
	
	
	

}
