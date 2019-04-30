package main;

import java.util.List;

public class JugadoresDAOImpl  extends JugadoresBridge{

	public void registrarJugador(Jugador jugador) {
		System.out.println("registrar jugador");
	}

	public void borrarJugador(long idJugador) {
		System.out.println("borrar jugador");
	}

	public void darDeBajaJugador(long idJugador) {
		System.out.println("dar de baja jugador");
	}

	public void editarJugador(Jugador jugador) {
		System.out.println("editar jugador");
	}

	public List<Jugador> obtenerJugadores(long idEquipo) {
		System.out.println("obtener lista de jugadores");
		return null;
	}

	
}
