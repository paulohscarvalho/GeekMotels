package controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.ClienteDAO;
import dao.ClienteDAOImplementation;
import model.Cliente;

@ManagedBean(name="ClienteMB")
public class ClienteManagedBean implements Serializable {
	
	private Cliente clienteAtual;
	private ClienteDAO cliDao;
	
	public ClienteManagedBean() { 
		setClienteAtual(new Cliente());
		cliDao = new ClienteDAOImplementation();
	}
	
	public String inserir() {
		try {
			cliDao.inserir( clienteAtual );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String remover() { 
		try {
			cliDao.remover( clienteAtual.getId() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String atualizar() { 
		try {
			cliDao.atualizar( clienteAtual.getId(), clienteAtual );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String pesquisar() { 
		try {
			List<Cliente> clientes = cliDao.pesquisarPorNome( clienteAtual.getNome() );
			for (Cliente cliente : clientes) { 
				System.out.println("Nome : " + cliente.getNome());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	

	public Cliente getClienteAtual() {
		return clienteAtual;
	}

	public void setClienteAtual(Cliente clienteAtual) {
		this.clienteAtual = clienteAtual;
	}

}

