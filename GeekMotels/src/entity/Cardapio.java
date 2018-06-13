package entity;

public class Cardapio {
	private int id;
	private String descricao;
	private long preco;
	
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
	
	public long getPreco() {
		return preco;
	}
	
	public void setPreco(long preco) {
		this.preco = preco;
	}
	
}
