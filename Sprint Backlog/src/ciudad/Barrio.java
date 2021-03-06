package ciudad;

import java.util.Vector;

import Entidades.OrdenRanking;
import Entidades.Producto;
import Entidades.Vecino;

public class Barrio extends Zona {
	private  Vector<Zona> v;

	public Barrio() {
		this.v= new Vector<Zona>();
	}

	@Override
	public Vector<Vecino> getRanking() {
        Vector<Vecino> res = new Vector<Vecino>();
        for (Zona z: this.v) {
            res.addAll(z.getRanking());
        }
		res.sort(new OrdenRanking());
        return res;
	}

	@Override
	public Vector<Producto> getHistorial() {
		Vector<Producto> res = new Vector<Producto>();
		for (Zona z: this.v) {
			res.addAll(z.getHistorial());
		}
		return res;
	}

	public void addZona(Zona z) {
	   this.v.add(z);
    }

}
