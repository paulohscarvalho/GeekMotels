package dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Cliente;

public class ClienteDAOImplementation implements ClienteDAO {
	
	
	
	public ClienteDAOImplementation{
		if(emf ==null){
			emf = Persistence.createEntityManagerFactory("GeekMotels");
		}
	}

	@Override
	public void inserir(Cliente cliente) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(long id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(long id, Cliente cliente) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> pesquisarPorNome(String nome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> pesquisarTodos() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
