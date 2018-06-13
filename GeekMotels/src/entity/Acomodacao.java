package entity;

public class Acomodacao {
	private int id;
	private int numeroQuarto;
	private long preco;
	private String descricao;
	private String tipoQuarto;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	
	public long getPreco() {
		return preco;
	}
	
	public void setPreco(long preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getTipoQuarto() {
		return tipoQuarto;
	}
	
	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
}
