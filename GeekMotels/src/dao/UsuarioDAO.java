package dao;

import entity.Usuario;

public interface UsuarioDAO {
	public void adicionarUsuario(Usuario u);
	public void alterarUsuario(Usuario u);
	public void consultarUsuario();
	public void excluirUsuario(Usuario u);
}
