package br.com.pizzashop.model;

import java.time.LocalDate;

public class Funcionarios {
	private int fun_cod;
	private String fun_nome;
	private String fun_cargo;
	private String fun_permissao;
	private LocalDate fun_data_cad;
	
	
	public Funcionarios() {
		
	}


	public Funcionarios(String fun_nome, String fun_cargo, String fun_permissao, LocalDate fun_data_cad) {
		
		this.fun_nome = fun_nome;
		this.fun_cargo = fun_cargo;
		this.fun_permissao = fun_permissao;
		this.fun_data_cad = fun_data_cad;
	}


	public int getFun_cod() {
		return fun_cod;
	}


	public void setFun_cod(int fun_cod) {
		this.fun_cod = fun_cod;
	}


	public String getFun_nome() {
		return fun_nome;
	}


	public void setFun_nome(String fun_nome) {
		this.fun_nome = fun_nome;
	}


	public String getFun_cargo() {
		return fun_cargo;
	}


	public void setFun_cargo(String fun_cargo) {
		this.fun_cargo = fun_cargo;
	}


	public String getFun_permissao() {
		return fun_permissao;
	}


	public void setFun_permissao(String fun_permissao) {
		this.fun_permissao = fun_permissao;
	}


	public LocalDate getFun_data_cad() {
		return fun_data_cad;
	}


	public void setFun_data_cad(LocalDate fun_data_cad) {
		this.fun_data_cad = fun_data_cad;
	}
	
	
	
	
	
}
