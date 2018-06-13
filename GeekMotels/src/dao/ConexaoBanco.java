package dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexaoBanco {

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
}
