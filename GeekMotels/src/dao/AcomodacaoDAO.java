package dao;

import entity.Acomodacao;

public interface AcomodacaoDAO {
	public void adicionarAcomodacao(Acomodacao a);
	public void alterarAcomodacao(Acomodacao a);
	public void listarAcomodacao();
	public void excluirAcomodacao(Acomodacao a);
}
