package Entidades;

import ciudad.Zona;

import java.util.Date;
import java.util.Vector;

public class Empleado extends Usuario {
    private String premio;
    private Date fechaInforme;


    public Empleado() {
        super();
    }

    public Vector<Producto> statRecicle(Vecino vecino) {
        return  vecino.getHistorial();
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

    public Vector<Producto> getInfo(Zona zona) {
        Vector<Producto> res = new Vector<Producto>();
        if(fechaInforme.equals(new Date())) {
            res.addAll(zona.getHistorial());
        }
        return res;
    }

    public void setFechaInforme(Date fecha) {
        this.fechaInforme = fecha;
    }

    public  void decidirPremio(String _premio) {
        this.premio = _premio;
    }

    public Vector<Vecino> getRanking(Zona zona) {
        return  zona.getRanking();
    }
}
