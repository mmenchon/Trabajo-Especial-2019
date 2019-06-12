package Entidades;

import Cardinales.Ubicacion;
import ciudad.Cuadra;

import java.util.Vector;

public class Vecino extends Usuario {
    private Vector<Producto> historial;
    private Cuadra manzana;

    public Vecino (String nombre ,String mail,String contrasenia, Cuadra manzana){
        super(nombre, mail, contrasenia);
        this.manzana = manzana;
    }
    public void addProducto(Producto p1, Municipio m1){
        if (p1.esReciclable(m1)){
            historial.add(p1);
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

    public Cuadra getManzana() {
        return manzana;
    }

    public void setManzana(Cuadra manzana) {
        this.manzana = manzana;
    }
}