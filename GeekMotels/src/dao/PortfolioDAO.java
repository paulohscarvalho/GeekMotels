package dao;

import entity.Portfolio;

public interface PortfolioDAO {
	public void adicionar(Portfolio p);
	public void alterar(Portfolio p);
	public void consultar();
	public void excluir(Portfolio p);
}
