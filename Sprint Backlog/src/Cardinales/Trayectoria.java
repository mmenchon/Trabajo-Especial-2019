package Cardinales;

import java.util.Vector;

public class Trayectoria {

	private Vector<Ubicacion> recorrido;
	
	public void add(Ubicacion u) {
		recorrido.add(u);
	}
	
	public Trayectoria getTray() {
		return this;
	}

}
