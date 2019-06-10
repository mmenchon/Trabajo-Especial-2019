package Entidades;

import Cardinales.Ubicacion;

import java.util.Vector;

public class Vecino extends Usuario {
    private Vector<Producto> historial;
    private float puntaje;

    public Vecino (String nombre ,String mail,String contrasenia){
        super(nombre, mail, contrasenia);
    }
    public void addProducto(Producto P1, Municipio M1){
        if (P1.esReciclable(M1)){
            historial.add(P1);
        }
    }

    public float getIngresogenerado(){
        float ingres=0;
        for (Producto it:historial){
            ingres+=it.getGanancia();
        }
        return ingres;
    }
    public Ubicacion getPuntoVerde(PuntoVerde pto1){
        return pto1.getDireccion();
    }

    public float gananciaOng() {
        return  this.getIngresogenerado()*2;
    } // las ONG le sacan un 100% a los productos , entonces sacan el doble por cada producto
    
    public float getPuntaje() {
    	float punt =0;
    	for (int i = 0; i < historial.size(); i++) {
			punt += historial.elementAt(i).getPuntReciclaje();
		}
    	return punt;
    }


    public Vector<Producto> getHistorial() {
        return historial;
    }
}