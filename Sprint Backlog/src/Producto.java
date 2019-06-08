import java.util.Vector;

public class Producto {
    private String nombre;
    private int cantidad;
    private boolean reciclable;
    private float ganancia;
    private float impacto;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto (String nombre, int cantidad, boolean reciclable, float ganancia, float impacto){
        this.nombre=nombre;
        this.cantidad=cantidad; /*va afuera para mi*/
        this.reciclable=reciclable;
        this.ganancia=ganancia;
        this.impacto=impacto;
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
        if (this.getNombre().equals(P1.getNombre()){
            return  true;
        }
        return false;
    }
    public boolean esReciclable (Municipio M1){
        Vector<Productos >P1;
        P1=M1.devolverProcuctos();
        for (Producto P2:P1){
            if (P2.equals(this)){
                return true;
            }
        }
        return false;
    }
}
