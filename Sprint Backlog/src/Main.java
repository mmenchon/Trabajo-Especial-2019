import Entidades.*;
import ciudad.Barrio;
import ciudad.Cuadra;
import ciudad.Zona;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Zona c1= new Cuadra();
        Zona b1 = new Barrio();
        
        Usuario v1 = new Vecino("Juan", "juani", "pepo1",c1);
        Usuario v2 = new Vecino("Carlos", "carlitos", "pepo2",c1);
        Usuario v3 = new Vecino("Pedro", "pedrito", "pepo3",c1);
        Usuario v4 = new Vecino("Mauri", "maurito", "pepo4",c1);
        Usuario v5 = new Vecino("Mariano", "nanito", "pepo5");
        Usuario v6 = new Vecino("Leo", "leito", "pepo6");

        Municipio m1 = new Municipio();
        Usuario e1 = new Empleado("Edison", "thomas", "foco");
        UserManager usuarios = new UserManager();
        usuarios.signUp(v1);
        usuarios.signUp(v2);
        usuarios.signUp(v3);
        usuarios.signUp(v4);
        usuarios.signUp(v5);
        usuarios.signUp(v6);
        usuarios.signUp(e1);

        Producto p1 = new Producto("botella plastica", 10, 13, 20);
        Producto p2 = new Producto("botella vidrio", 11, 13, 18);
        Producto p3 = new Producto("caja plastica", 3, 4, 7);
        m1.addReciclables(p2);
        m1.addReciclables(p1);
        m1.addReciclables(p3);


        Vector<Producto> skr=m1.getProductos();
        for (Producto p4: skr) {
            System.out.print(p4.getNombre());
        }

    }
}
