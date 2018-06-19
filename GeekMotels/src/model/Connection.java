package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


public class Connection {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/geekmotels";
	private static final String USUARIO = "root";
	private static final String SENHA = "root";
	private static Connection conexao;

	public static Connection conectar() {
		
	try {
			Class.forName(DRIVER);
			conexao = (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
			System.out.println("conectado!");
	return conexao;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void closeConnection() throws SQLException {
		 try {
		    ((java.sql.Connection) conexao).close();
	        } catch (Exception e) {
	        } 

   }
	
	
	public boolean insertCliente(Cliente cliente) {
		  
        Statement stmt = null;
        ResultSet rs = null;

        try {
        	 stmt = (Statement) ((java.sql.Connection) conexao).createStatement();

        	 PreparedStatement preparedStatement = (PreparedStatement) ((java.sql.Connection) conexao)
                     .prepareStatement("insert into Cliente (id, nome, telefone, email,cpf) values(?,?,?,?,?)");
              preparedStatement.setLong(1, cliente.getId());
              preparedStatement.setString(2, cliente.getNome());
              preparedStatement.setString(3, cliente.getTelefone());
              preparedStatement.setString(4, cliente.getEmail());
              preparedStatement.setString(5, cliente.getCpf());
             
              preparedStatement.execute();
              
              return true;
        } catch (SQLException ex) {
              Logger lgr = Logger.getLogger(Connection.class.getName());
              lgr.log(Level.SEVERE, ex.getMessage(), ex);
              return false;

        }
	}
}


	
	
