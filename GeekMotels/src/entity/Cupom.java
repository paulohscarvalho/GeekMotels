package entity;

import java.util.Date;

public class Cupom {
	private int id;
	private int numero;
	private long desconto;
	private Date validade;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public long getDesconto() {
		return desconto;
	}
	
	public void setDesconto(long desconto) {
		this.desconto = desconto;
	}
	
	public Date getValidade() {
		return validade;
	}
	
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
}
