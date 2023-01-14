package br.com.pizzashop.model;

import java.math.BigDecimal;

public class Cardapio {
	private int car_cod;
	private String car_descricao;
	private String car_tipo;
	private BigDecimal car_valor;
	
	public Cardapio() {
		
	}

	public Cardapio(String car_descricao, String car_tipo, BigDecimal car_valor) {		
		this.car_descricao = car_descricao;
		this.car_tipo = car_tipo;
		this.car_valor = car_valor;
	}

	public int getCar_cod() {
		return car_cod;
	}

	public void setCar_cod(int car_cod) {
		this.car_cod = car_cod;
	}

	public String getCar_descricao() {
		return car_descricao;
	}

	public void setCar_descricao(String car_descricao) {
		this.car_descricao = car_descricao;
	}

	public String getCar_tipo() {
		return car_tipo;
	}

	public void setCar_tipo(String car_tipo) {
		this.car_tipo = car_tipo;
	}

	public BigDecimal getCar_valor() {
		return car_valor;
	}

	public void setCar_valor(BigDecimal car_valor) {
		this.car_valor = car_valor;
	}
	
	
	
	

}
