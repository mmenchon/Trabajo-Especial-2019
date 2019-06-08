import java.util.Vector;

public class Municipio {
 private Vector<Producto> reciclables;
 private Vector<Usuario> usuarios;

    public void  addReciclables (Producto P1){
        reciclables.add(P1);
    }
    public  void addUsuario(Usuario S1){

        usuarios.add(S1);
    }
    public Vector<Producto>DevolverProductos(){
        Vector<Producto> productos=new Vector<Producto>();
        for (Producto item:reciclables){
            Producto product=new Producto(item.getNombre(),item.getCantidad(),true,item.getGanancia(),item.getImpacto());
            productos.add(product);
        }
        return productos;
    }
}
