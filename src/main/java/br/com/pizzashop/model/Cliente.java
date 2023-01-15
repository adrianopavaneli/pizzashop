package br.com.pizzashop.model;

import java.time.LocalDate;

public class Cliente {
	private int cli_cod;
	private String cli_nome;
	private String cli_telefone;
	private String cli_rua;
	private String cli_bairro;
	private LocalDate cli_data_cad;
	
	public Cliente() {
		
	}

	
	public Cliente(String cli_nome, String cli_telefone, String cli_rua, String cli_bairro, LocalDate cli_data_cad) {
		
		this.cli_nome = cli_nome;
		this.cli_telefone = cli_telefone;
		this.cli_rua = cli_rua;
		this.cli_bairro = cli_bairro;
		this.cli_data_cad = cli_data_cad;
	}


	public int getCli_cod() {
		return cli_cod;
	}


	public void setCli_cod(int cli_cod) {
		this.cli_cod = cli_cod;
	}


	public String getCli_nome() {
		return cli_nome;
	}


	public void setCli_nome(String cli_nome) {
		this.cli_nome = cli_nome;
	}


	public String getCli_telefone() {
		return cli_telefone;
	}


	public void setCli_telefone(String cli_telefone) {
		this.cli_telefone = cli_telefone;
	}


	public String getCli_rua() {
		return cli_rua;
	}


	public void setCli_rua(String cli_rua) {
		this.cli_rua = cli_rua;
	}


	public String getCli_bairro() {
		return cli_bairro;
	}


	public void setCli_bairro(String cli_bairro) {
		this.cli_bairro = cli_bairro;
	}


	public LocalDate getCli_data_cad() {
		return cli_data_cad;
	}


	public void setCli_data_cad(LocalDate cli_data_cad) {
		this.cli_data_cad = cli_data_cad;
	}


	
}
