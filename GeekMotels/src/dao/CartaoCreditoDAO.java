package dao;

import entity.CartaoCredito;

public interface CartaoCreditoDAO {
	public void adicionarCartaoCredito(CartaoCredito cc);
	public void alterarCartaoCredito(CartaoCredito cc);
	public void consultarCartaoCredito();
	public void excluirCartaoCredito(CartaoCredito cc);
}
