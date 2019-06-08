import java.util.Vector;

public class Vecino extends Usuario {
    private Vector<Producto> historial;


    public Vecino (String nombre ,String mail,String contrasenia,boolean loged){
        this.nombre=nombre;
        this.email=mail;
        this.contrasenia =contrasenia;
        this.loged=loged;
    }
    public void recycleProduct(Producto P1, Municipio M1){
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
}
public ubicacion(Puntoverde pto1){
    return pto1.getubicacion;
}
public float gananciaOng(){
    return  (this.getIngresogenerado()*2); /*las ONG le sacan un 100% a los productos , entonces sacan el doble por cada producto
}

