import java.util.Vector;

public class Cuadra extends Zona {

	private Vector<Vecino> ciudadanos;
	
	@Override
	public Vector<Vecino> getRanking() {
		Vector<Vecino> v = new Vector<Vecino>();
		
		v.sort(new OrdenRanking());
		return v;
	}


	@Override
	public Vector<Producto> getHistorial() {
	    Vector<Producto> res = new Vector<Producto>();
	    for(Vecino _vecino: ciudadanos) {
	        res.addAll(_vecino.getHistorial());
        }
        return  res;
    }

}
