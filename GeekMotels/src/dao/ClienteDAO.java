package dao;


import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Cliente;

public interface ClienteDAO {
	
	public void inserir(Cliente cliente) throws SQLException;
	public void remover(long id) throws SQLException;
	public void atualizar(long id, Cliente cliente) throws SQLException;
	public List<Cliente> pesquisarPorNome(String nome) throws SQLException;
	public List<Cliente> pesquisarTodos() throws SQLException;
}
