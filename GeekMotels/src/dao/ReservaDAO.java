package dao;

import entity.Reserva;

public interface ReservaDAO {
	public void adicionarReserva(Reserva r);
	public void alterarReserva(Reserva r);
	public void consultarReserva();
	public void excluirReserva(Reserva r);
}
