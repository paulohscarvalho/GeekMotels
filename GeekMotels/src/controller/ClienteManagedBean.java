package controller;

import java.io.Serializable;
import java.sql.SQLException;  
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import model.Cliente;
import model.Connection;
  
@ManagedBean(name="ClienteMB")
public class ClienteManagedBean implements Serializable{
   
	private static final long serialVersionUID = 1L;
	
	Connection conexao = Connection.conectar();
	
	private Cliente cliente = new Cliente();
      
     public String cadastrarCliente() throws SQLException {
           
    	 Connection conexao = new Connection();         
                 
                 
                if (conexao.insertCliente(cliente)) {
                     FacesContext.getCurrentInstance().addMessage(
                      null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                      "Sucesso!", "Dados recebidos com sucesso!"));
                } else {
                     FacesContext.getCurrentInstance().addMessage(
                        null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro!", 
                        "Erro no recebimento dos dados!"));
  
                }
                conexao.closeConnection();   
          return "";
     }
      
    
      
     public Cliente getCliente() {
          return cliente;
     }
      
     public void setCliente(Cliente cliente) {
          this.cliente = cliente;
     }
}