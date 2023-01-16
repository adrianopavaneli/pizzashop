package br.com.pizzashop.model;

import java.time.LocalDate;

public class Entregador {
	private int ent_cod;
	private String ent_nome;
	private String ent_status;
	private LocalDate ent_data_cad;
	
	public Entregador() {
		
	}

	public Entregador(String ent_nome, String ent_status, LocalDate ent_data_cad) {
		
		this.ent_nome = ent_nome;
		this.ent_status = ent_status;
		this.ent_data_cad = ent_data_cad;
	}

	public int getEnt_cod() {
		return ent_cod;
	}

	public void setEnt_cod(int ent_cod) {
		this.ent_cod = ent_cod;
	}

	public String getEnt_nome() {
		return ent_nome;
	}

	public void setEnt_nome(String ent_nome) {
		this.ent_nome = ent_nome;
	}

	public String getEnt_status() {
		return ent_status;
	}

	public void setEnt_status(String ent_status) {
		this.ent_status = ent_status;
	}

	public LocalDate getEnt_data_cad() {
		return ent_data_cad;
	}

	public void setEnt_data_cad(LocalDate ent_data_cad) {
		this.ent_data_cad = ent_data_cad;
	}
	
	
	
	
}
