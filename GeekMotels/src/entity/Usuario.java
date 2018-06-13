package entity;

import java.util.List;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private String rg;
	private List<Cupom> cupom;
	
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
	
	public List<Cupom> getCupom() {
		return cupom;
	}
	
	public void setCupom(List<Cupom> cupom) {
		this.cupom = cupom;
	}
	
}
