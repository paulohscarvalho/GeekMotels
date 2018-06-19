package dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Cliente;

public class ClienteDAOImplementation implements ClienteDAO {
	
	private static EntityManagerFactory emf;
	
	public ClienteDAOImplementation() {
		if ( emf == null ){ 
			emf = Persistence.createEntityManagerFactory("GEEKMOTELS");
		}
	}
	

	@Override
	public void inserir(Cliente cliente) throws SQLException {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();	
	}

	@Override
	public void remover(long id) throws SQLException {
		EntityManager em = emf.createEntityManager();
		Cliente cliente = em.getReference(Cliente.class, id);
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void atualizar(long id, Cliente cliente) throws SQLException {
		EntityManager em = emf.createEntityManager();
		Cliente clienteAntigo = em.getReference(Cliente.class, id);
		em.getTransaction().begin();
		clienteAntigo.setNome( cliente.getNome() );
		clienteAntigo.setTelefone( cliente.getTelefone() );
		clienteAntigo.setEmail( cliente.getEmail() );
		clienteAntigo.setCpf( cliente.getCpf() );
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Cliente> pesquisarPorNome(String nome) throws SQLException {
		List<Cliente> clientes = null;
		EntityManager em = emf.createEntityManager();
		TypedQuery<Cliente> qry = em.createNamedQuery(
				"select cli from Cliente cli where cli.nome like :nome", 
				Cliente.class);
		qry.setParameter("nome", nome);
		clientes = qry.getResultList();
		return clientes;
	}

	@Override
	public List<Cliente> pesquisarTodos() throws SQLException {
		List<Cliente> clientes = null;
		EntityManager em = emf.createEntityManager();
		TypedQuery<Cliente> qry = em.createNamedQuery(
				"select cli from Cliente cli", 
				Cliente.class);
		clientes = qry.getResultList();
		return clientes;
	}
	

}
