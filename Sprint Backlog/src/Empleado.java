import java.util.Date;
import java.util.Vector;

public class Empleado extends Usuario {
    private String premio;
    private Date fechaInforme;


    public Empleado() {
    }

    public void generarStatsRecollect(Vector<Producto> productos) {

    }

    public void infoRecoridoCamion(Camion _camion) {
        if (_camion.getTrayectoria().equals(_camion.getRecorrido())) {
            System.out.println("RECORRIDO CORRECTO");
        } else  {
            System.out.println("RECORRIDO INCORRECTO");
        }
    }

    public Vector<Producto> statRecicle(Zona zona) {
        return zona.getHistorial();
    }

    public void getInfo(Zona zona) {
        if(fechaInforme.equals(new Date())) {
            zona.getHistorial();
        }
    }

    public  void decidirPremio(String _premio) {
        this.premio = _premio;
    }

    public Vector<Vecino> getRanking(Zona zona) {
        return  zona.getRanking();
    }
}
