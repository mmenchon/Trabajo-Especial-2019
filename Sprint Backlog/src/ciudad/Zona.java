package ciudad;

import Entidades.Producto;
import Entidades.Vecino;

import java.util.Vector;

public abstract class Zona {
    
	public abstract Vector<Vecino> getRanking();
	
	public abstract Vector<Producto> getHistorial();
}
