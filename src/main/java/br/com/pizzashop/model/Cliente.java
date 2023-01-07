package br.com.pizzashop.model;

public class Cliente {
	private Long id;
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String telefone, String endereco, String cpf) {		
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	

}
