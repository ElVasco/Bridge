package main;

import java.util.List;

public interface JugadoresDAO {
	
	void registrarJugador(Jugador jugador);
	//void borrarJugador(long idJugador);
	void darDeBajaJugador(int idJugador);
	void editarJugador(Jugador jugador);
	List<Jugador> obtenerJugadores(long idEquipo);
}
