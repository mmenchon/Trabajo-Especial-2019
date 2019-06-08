import java.util.Vector;

public class Vecino extends Usuario {
    private Vector<Producto> historial;


    public Vecino (String nombre ,String mail,String contrasenia,boolean loged){
        this.nombre=nombre;
        this.email=mail;
        this.contrasenia =contrasenia;
        this.loged=loged;

    }
}
