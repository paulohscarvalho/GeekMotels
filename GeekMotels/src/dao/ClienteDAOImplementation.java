package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Cliente;

public class ClienteDAOImplementation implements ClienteDAO {

	@Override
	public void inserir(Cliente cliente) throws SQLException {
		EntityManager em = JPAUtil.getEMF().createEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void remover(long id) throws SQLException {
		EntityManager em = JPAUtil.getEMF().createEntityManager();
		Cliente cliente = em.getReference(Cliente.class, id);
		if (cliente != null) {
			em.getTransaction().begin();
			em.remove(cliente);
			em.getTransaction().commit();
		}
		em.close();
	}

	@Override
	public void atualizar(long id, Cliente cliente) throws SQLException {
		EntityManager em = JPAUtil.getEMF().createEntityManager();
		Cliente clienteAntigo = em.getReference(Cliente.class, id);
		if (clienteAntigo != null) { 
			em.getTransaction().begin();
			clienteAntigo.setNome( cliente.getNome() );
			clienteAntigo.setTelefone( cliente.getTelefone() );
			clienteAntigo.setEmail( cliente.getEmail() );
			clienteAntigo.setCpf( cliente.getCpf() );
			em.getTransaction().commit();
		}
		em.close();
	}

	@Override
	public List<Cliente> pesquisar(String nome) throws SQLException {
		EntityManager em = JPAUtil.getEMF().createEntityManager();
		TypedQuery<Cliente> qry = 
				em.createQuery("select cliente from Cliente cliente where nome like :n", Cliente.class);
		qry.setParameter("n", "%" + nome + "%");
		List<Cliente> produtos = new ArrayList<Cliente>();
		produtos.addAll( qry.getResultList() ); 
		em.close();
		return produtos;
	}

}
