import Entidades.Empleado;
import Entidades.Municipio;
import Entidades.Vecino;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Vecino v1 = new Vecino("Juan", "juani", "pepo1");
        Vecino v2 = new Vecino("Carlos", "carlitos", "pepo2");
        Vecino v3 = new Vecino("Pedro", "pedrito", "pepo3");
        Vecino v4 = new Vecino("Mauri", "maurito", "pepo4");
        Vecino v5 = new Vecino("Mariano", "nanito", "pepo5");
        Vecino v6 = new Vecino("Leo", "leito", "pepo6");
        Municipio m1 = new Municipio();
        Empleado e1 = new Empleado();
        m1.addUsuario(v1);
        m1.addUsuario(v2);
        m1.addUsuario(v3);
        m1.addUsuario(v4);
        m1.addUsuario(v5);
        m1.addUsuario(v6);


    }
}
