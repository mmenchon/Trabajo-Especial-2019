import java.util.Vector;

public class Barrio extends Zona {
	private  Vector<Zona> v;

	@Override
	public Vector<Vecino> getRanking() {
        Vector<Vecino> res = new Vector<Vecino>();
        for (Zona z: v) {
            res.addAll(z.getRanking());
        }
        return res;
	}

	@Override
	public Vector<Producto> getHistorial() {
		Vector<Producto> res = new Vector<Producto>();
		for (Zona z: v) {
			res.addAll(z.getHistorial());
		}
		return res;
	}

}
