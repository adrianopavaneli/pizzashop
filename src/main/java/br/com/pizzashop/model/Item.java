package br.com.pizzashop.model;

public class Item {
	private int item_cod;
	private int item_quantidade;
	private Entregador item_ent_cod;
	private Funcionarios item_fun_cod;
	private Cliente item_cli_cod;
	private Pedido item_ped_cod;
	private Cardapio item_car_cod;	
	
	
	public Item() {
		
	}


	public Item(int item_quantidade, Entregador item_ent_cod, Funcionarios item_fun_cod, Cliente item_cli_cod,
			Pedido item_ped_cod, Cardapio item_car_cod) {
		
		this.item_quantidade = item_quantidade;
		this.item_ent_cod = item_ent_cod;
		this.item_fun_cod = item_fun_cod;
		this.item_cli_cod = item_cli_cod;
		this.item_ped_cod = item_ped_cod;
		this.item_car_cod = item_car_cod;
	}


	public int getItem_cod() {
		return item_cod;
	}


	public void setItem_cod(int item_cod) {
		this.item_cod = item_cod;
	}


	public int getItem_quantidade() {
		return item_quantidade;
	}


	public void setItem_quantidade(int item_quantidade) {
		this.item_quantidade = item_quantidade;
	}


	public Entregador getItem_ent_cod() {
		return item_ent_cod;
	}


	public void setItem_ent_cod(Entregador item_ent_cod) {
		this.item_ent_cod = item_ent_cod;
	}


	public Funcionarios getItem_fun_cod() {
		return item_fun_cod;
	}


	public void setItem_fun_cod(Funcionarios item_fun_cod) {
		this.item_fun_cod = item_fun_cod;
	}


	public Cliente getItem_cli_cod() {
		return item_cli_cod;
	}


	public void setItem_cli_cod(Cliente item_cli_cod) {
		this.item_cli_cod = item_cli_cod;
	}


	public Pedido getItem_ped_cod() {
		return item_ped_cod;
	}


	public void setItem_ped_cod(Pedido item_ped_cod) {
		this.item_ped_cod = item_ped_cod;
	}


	public Cardapio getItem_car_cod() {
		return item_car_cod;
	}


	public void setItem_car_cod(Cardapio item_car_cod) {
		this.item_car_cod = item_car_cod;
	}
	
	
	
	
	
	
	

}
