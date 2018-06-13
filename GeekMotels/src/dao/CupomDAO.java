package dao;

import entity.Cupom;

public interface CupomDAO {
	public void adicionarCupom(Cupom c);
	public void alterarCupom(Cupom c);
	public void consultarCupom();
	public void excluirCupom(Cupom c);
}
