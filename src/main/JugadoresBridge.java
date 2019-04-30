package main;

import java.util.List;

public class JugadoresBridge  implements JugadoresDAO{

	@Override
	public void registrarJugador(Jugador jugador) {
		
	}

	
	public void darDeBajaJugador(long idJugador) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void darDeBajaJugador(int idJugador) {
		darDeBajaJugador((long)idJugador) ;		
	}

	@Override
	public void editarJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Jugador> obtenerJugadores(long idEquipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
