import Entidades.*;
import ciudad.Barrio;
import ciudad.Cuadra;
import ciudad.Zona;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Zona c1;
        Zona c2;
        Zona c3;
        Zona c4;
        Zona c5;
        Zona c6;
        Zona c7;
        Zona c8;
        Zona b1;
        Zona b2;
        Zona ciudad;
        c1 = new Cuadra();
        c2 = new Cuadra();
        c3 = new Cuadra();
        c4 = new Cuadra();
        c5 = new Cuadra();
        c6 = new Cuadra();
        c7 = new Cuadra();
        c8 = new Cuadra();
        b1 = new Barrio();//se inicializan las zonas, barrio/cuadra
        ((Barrio) b1).addZona(c1);
        ((Barrio) b1).addZona(c2);
        ((Barrio) b1).addZona(c3);
        ((Barrio) b1).addZona(c4);
        b2 = new Barrio();
        ((Barrio) b2).addZona(c5);
        ((Barrio) b2).addZona(c6);
        ((Barrio) b2).addZona(c7);
        ((Barrio) b2).addZona(c8);//se asignan cuadras a los barrios
        ciudad = new Barrio();
        ((Barrio) ciudad).addZona(b1);
        ((Barrio) ciudad).addZona(b2);//se crea una ciudad y se le asignan los barrios

        Vecino v1 = new Vecino("Juan", "juani", "pepo1", (Cuadra) c1);
        Vecino v2 = new Vecino("Carlos", "carlitos", "pepo2",(Cuadra)c1);
        Vecino v3 = new Vecino("Pedro", "pedrito", "pepo3",(Cuadra) c1);
        Vecino v4 = new Vecino("Mauri", "maurito", "pepo4",(Cuadra) c1);
        Vecino v5 = new Vecino("Mariano", "nanito", "pepo5", (Cuadra) c1);
        Vecino v6 = new Vecino("Leo", "leito", "pepo6", (Cuadra) c1);//se inicializan los vecinos

        Municipio m1 = new Municipio();//se inicializa el municipio
        Empleado e1 = new Empleado("Edison", "thomas", "foco");//se unicializa un empleado
        UserManager usuarios = new UserManager();//se inicializa el sistem de login
        usuarios.signUp(v1);
        usuarios.signUp(v2);
        usuarios.signUp(v3);
        usuarios.signUp(v4);
        usuarios.signUp(v5);
        usuarios.signUp(v6);
        usuarios.signUp(e1);//se asignan los login

        Producto p1 = new Producto("botella plastica", 10, 13, 20);
        Producto p2 = new Producto("botella vidrio", 11, 13, 18);
        Producto p3 = new Producto("caja plastica", 3, 4, 7);//se crean productos
        m1.addReciclables(p2);
        m1.addReciclables(p1);
        m1.addReciclables(p3);//se le agregan al municipio como reciclables


        Vector<Producto> productos=m1.getProductos();
        for (Producto product: productos) {
            System.out.println(product.getNombre());
        }//se imprimen los productos reciclables

        if (usuarios.signIn("leito", "pepo7")) {
            System.out.println("Loggeado");
        } else {
            System.out.println("No Loggeado");
        }//check del login

        for (Producto p4: skr) {
            System.out.println(p4.getNombre());
        }
    }
}
