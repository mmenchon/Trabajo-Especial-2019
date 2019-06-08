import java.util.Vector;

public class Cuadra extends Zona {

	private Vector<Vecino> ciudadanos;
	
	@Override
	public Vector<Vecino> getRanking() {
		Vector<Vecino> v = new Vector<Vecino>();
		
		v.sort(OrdenRanking);
	}

	public Vector<Vecino> copia() {
		
	}
	@Override
	public Vector<Producto> getHistorial() {
		// TODO Auto-generated method stub
		return null;
	}

}
