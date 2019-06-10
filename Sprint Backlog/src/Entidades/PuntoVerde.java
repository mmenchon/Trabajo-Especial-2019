package Entidades;

import Cardinales.Ubicacion;

public class PuntoVerde {

	private Ubicacion direccion;
	private String horario;
	
	public PuntoVerde(Ubicacion u, String h) {
		direccion = u;
		horario = h;
	}
	
	public Ubicacion getDireccion() {
		return direccion;
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
