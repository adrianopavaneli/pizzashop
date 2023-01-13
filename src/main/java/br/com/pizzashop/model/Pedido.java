package br.com.pizzashop.model;

import java.time.LocalDateTime;

public class Pedido {
	private Long idPedido;
	private Long idCliente;
	private Long idItemPedido;
	private LocalDateTime datahora;
	public Pedido() {
		
	}
	public Pedido(Long idCliente, Long idItemPedido, LocalDateTime datahora) {
		
		this.idCliente = idCliente;
		this.idItemPedido = idItemPedido;
		this.datahora = datahora;
	}
	public Long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Long getIdItemPedido() {
		return idItemPedido;
	}
	public void setIdItemPedido(Long idItemPedido) {
		this.idItemPedido = idItemPedido;
	}
	public LocalDateTime getDatahora() {
		return datahora;
	}
	public void setDatahora(LocalDateTime datahora) {
		this.datahora = datahora;
	}
	
	
	
	

}
