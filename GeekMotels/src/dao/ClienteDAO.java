package dao;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface ClienteDAO {
	
	public void inserir(Cliente cliente) throws SQLException;
	public void remover(long id) throws SQLException;
	public void atualizar(long id, Cliente cliente) throws SQLException;
	public List<Cliente> pesquisar(String nome) throws SQLException;
	}
