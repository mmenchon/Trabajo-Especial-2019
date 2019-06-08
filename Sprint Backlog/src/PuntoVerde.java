
public class PuntoVerde {

	private Ubicacion direccion;
	private String horario;
	
	public PuntoVerde(Ubicacion u, String h) {
		direccion = u;
		horario = h;
	}
	
	public Ubicacion getDireccion() {
		Ubicacion u = new Ubicacion(direccion.getX(), direccion.getY());
		return u;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setDireccion(Ubicacion d) {
		direccion = d;
	}
	
	public void setHorario(String h) {
		horario = h;
	}
}
