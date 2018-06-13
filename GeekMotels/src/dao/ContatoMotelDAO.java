package dao;

import entity.ContatoMotel;

public interface ContatoMotelDAO {
	public void adicionarContatoMotel(ContatoMotel cm);
	public void alterarContatoMotel(ContatoMotel cm);
	public void consultarContatoMotel();
	public void excluirContatoMotel(ContatoMotel cm);
}
