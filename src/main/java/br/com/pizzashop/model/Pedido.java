package br.com.pizzashop.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {
	private int ped_cod;
	private LocalDate ped_data;
	private BigDecimal ped_total;	
	private Cliente cliente;
	private Funcionarios funcionario;
	private Entregador entregador;
	
	public Pedido() {
		
	}

	public Pedido(LocalDate ped_data, BigDecimal ped_total, Cliente cliente, Funcionarios funcionario,
			Entregador entregador) {
		
		this.ped_data = ped_data;
		this.ped_total = ped_total;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.entregador = entregador;
	}

	public int getPed_cod() {
		return ped_cod;
	}

	public void setPed_cod(int ped_cod) {
		this.ped_cod = ped_cod;
	}

	public LocalDate getPed_data() {
		return ped_data;
	}

	public void setPed_data(LocalDate ped_data) {
		this.ped_data = ped_data;
	}

	public BigDecimal getPed_total() {
		return ped_total;
	}

	public void setPed_total(BigDecimal ped_total) {
		this.ped_total = ped_total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionarios getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionarios funcionario) {
		this.funcionario = funcionario;
	}

	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}
	
	
	

}
