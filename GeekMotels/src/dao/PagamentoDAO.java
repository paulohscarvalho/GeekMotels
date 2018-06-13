package dao;

import entity.Pagamento;

public interface PagamentoDAO {
	public void adicionarPagamento(Pagamento p);
	public void alterarPagamento(Pagamento p);
	public void consultarPagamento();
	public void excluirPagamento(Pagamento p);
}
