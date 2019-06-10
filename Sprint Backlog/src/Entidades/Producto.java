package Entidades;

import java.util.Vector;

public class Producto {
    private String nombre;
    private int cantidad;
    private boolean reciclable;
    private float ganancia;
    private float impacto;
    private float punt_reciclaje;

    public Producto(String nombre, float ganancia, float impacto, float puntoReciclable){
        nombre=nombre;
        punt_reciclaje = puntoReciclable;
        ganancia=ganancia;
        impacto=impacto;
    }
    
    public void setPuntReciclaje(float pr) {
		punt_reciclaje = pr;
	}
   
    public float getPuntReciclaje() {
    	return punt_reciclaje; 
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isReciclable() {
        return reciclable;
    }

    public void setReciclable(boolean reciclable) {
        this.reciclable = reciclable;
    }

    public float getGanancia() {
        return ganancia;
    }

    public void setGanancia(float ganancia) {
        this.ganancia = ganancia;
    }

    public float getImpacto() {
        return impacto;
    }

    public void setImpacto(float impacto) {
        this.impacto = impacto;
    }
    public boolean equals (Producto P1){
        if (this.getNombre().equals(P1.getNombre())) {
            return  true;
        }
        return false;
    }
    public boolean esReciclable (Municipio M1){
        Vector<Producto > productos;
        productos=M1.getProductos();
        for (Producto product:productos){
            if (product.equals(this)){
                return true;
            }
        }
        return false;
    }
}
