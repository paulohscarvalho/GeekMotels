package entity;

import java.util.Date;

public class Pagamento {
	private Date dataPagamento;
	private long valorPagamento;
	private long totalDesconto;
	
	public long aplicarDesconto(Cupom cupom, Promocao promocao) {
		return totalDesconto;
	}
	
	public long calcularPagamento(Reserva reserva) {
		return valorPagamento;
	}
	
	public void efetuarPagamento(CartaoCredito cartaoCredito, Usuario usuario) {
		//efetua o pagamento
	}
	
	public Date getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	public long getValorPagamento() {
		return valorPagamento;
	}
	
	public void setValorPagamento(long valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	
	public long getTotalDesconto() {
		return totalDesconto;
	}
	
	public void setTotalDesconto(long totalDesconto) {
		this.totalDesconto = totalDesconto;
	}
	
}
