package Entidades;

import java.util.Vector;

public class Municipio {
 private Vector<Producto> reciclables;
 private Vector<Usuario> usuarios;

 public Municipio(){
     reciclables = new Vector<Producto>();
     usuarios = new Vector<Usuario>();
 }
    public void  addReciclables (Producto P1){
        reciclables.add(P1);
    }

    public  void addUsuario(Usuario S1){

        usuarios.add(S1);
    }
    public Vector<Producto>getProductos() {
        Vector<Producto> productos = new Vector<Producto>();
        for (Producto item : reciclables) {
            Producto product = new Producto(item.getNombre(), true, item.getGanancia(), item.getImpacto(), item.getPuntReciclaje());
            productos.add(product);
        }
        return productos;
    }



    }