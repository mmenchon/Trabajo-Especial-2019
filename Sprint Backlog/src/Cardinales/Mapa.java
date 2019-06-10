package Cardinales;

import java.util.Vector;

public class Mapa {
	
	private Vector<Ubicacion> map;
	private Vector<PuntoVerde> puntos;
	
	public Mapa(Ubicacion m, PuntoVerde pv) {
		map.add(m);
		puntos.add(pv);
	}
	
	public Mapa getMapa() {
		return this;
	}

	public Vector<PuntoVerde> getPuntosVerdes() {
	    return puntos;
    }
}
