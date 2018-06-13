package dao;

import entity.Promocao;

public interface PromocaoDAO {
	public void adicionarPromocao(Promocao p);
	public void alterarPromocao(Promocao p);
	public void consultarPromocao();
	public void excluirPromocao(Promocao p);
}
