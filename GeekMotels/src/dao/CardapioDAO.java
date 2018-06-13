package dao;

import entity.Cardapio;

public interface CardapioDAO {
	public void adicionarAoCardapio(Cardapio c);
	public void alterarDoCardapio(Cardapio c);
	public void listarCardapio();
	public void excluirDoCardapio(Cardapio c);
}
