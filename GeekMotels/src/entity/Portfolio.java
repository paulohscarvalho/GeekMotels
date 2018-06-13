package entity;

public class Portfolio {
	private int id;
	private String descricao;
	
	public void listarCardapio(Cardapio cardapio) {
		//lista o cardápio do motel
	}
	
	public void exibirContatoMotel(ContatoMotel contatoMotel) {
		//exibe o contato do motel
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
