package entity;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private String rg;
	private int telefone1;
	private int telefone2;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public int getTelefone1() {
		return telefone1;
	}
	
	public void setTelefone1(int telefone1) {
		this.telefone1 = telefone1;
	}
	
	public int getTelefone2() {
		return telefone2;
	}
	
	public void setTelefone2(int telefone2) {
		this.telefone2 = telefone2;
	}
	
}
