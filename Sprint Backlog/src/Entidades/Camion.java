package Entidades;

import Cardinales.Trayectoria;
import Cardinales.Ubicacion;

public class Camion {
	
	private Ubicacion posicion;
	private Trayectoria trayectoria;
	private Trayectoria recorrido;
	
	public void setRecorrido(Trayectoria t) {
		trayectoria = t;
	}
	
	public Ubicacion getPosicion() {
		return posicion;
	}
	
	public Trayectoria getTrayectoria() {
		return trayectoria;
	}

	public Trayectoria getRecorrido() {
		return recorrido;
	}
}
