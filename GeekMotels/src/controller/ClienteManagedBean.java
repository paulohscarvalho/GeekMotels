
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import dao.ClienteDAO;
import dao.ClienteDAOImplementation;
import model.Cliente;



@ManagedBean
@SessionScoped
public class ClienteManagedBean implements Serializable {

	private static final long serialVersionUID = -3304202810037758438L;
	
	private Cliente clienteAtual;
	private ClienteDAO cliDAO;
	private List<Cliente> clientes;
	
	public ClienteManagedBean() { 
		clienteAtual = new Cliente();
		setClientes(new ArrayList<Cliente>());
		cliDAO = new ClienteDAOImplementation();
		
	}
	
	public String inserir() { 
		try {
			cliDAO.inserir( clienteAtual );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String carregar(Cliente cliente) { 
		clienteAtual = cliente;
		return "";		
	}
	
	public String atualizar() {
		try {
			cliDAO.atualizar( clienteAtual.getId(), clienteAtual );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String remover(Cliente cliente) { 
		try {
			cliDAO.remover( cliente.getId() );
			pesquisar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return "";
	}
	
	public String pesquisar() { 
		try {
			clientes = cliDAO.pesquisar( clienteAtual.getNome() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String pesquisarTodos() { 
		try {
			clientes = cliDAO.pesquisar( "" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public Cliente getClienteAtual() {
		return clienteAtual;
	}

	public void setClienteAtual(Cliente cliente) {
		this.clienteAtual = clienteAtual;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
