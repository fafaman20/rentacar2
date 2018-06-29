/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacars.webcomponent.autos.model;

import rentacars.webcomponent.autos.model.Arriendo;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 
 */
public class Devolucion {

    private int idDevolucion;
    private Date fechaDevolucion;
    private Time horaDevolucion;
    private Arriendo arriendo;

    public static ArrayList<Devolucion> listaDevolucion = new ArrayList<>();

    public int getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Time getHoraDevolucion() {
        return horaDevolucion;
    }

    public void setHoraDevolucion(Time horaDevolucion) {
        this.horaDevolucion = horaDevolucion;
    }

    public Arriendo getArriendo() {
        return arriendo;
    }

    public void setArriendo(Arriendo arriendo) {
        this.arriendo = arriendo;
    }

    public Devolucion() {
    }

    public Devolucion(Date fechaDevolucion, Time horaDevolucion, Arriendo arriendo) {
        this.fechaDevolucion = fechaDevolucion;
        this.horaDevolucion = horaDevolucion;
        this.arriendo = arriendo;
    }

    private Devolucion(int idDevolucion, Date fechaDevolucion, Time horaDevolucion, Arriendo arriendo) {
        this.idDevolucion = idDevolucion;
        this.fechaDevolucion = fechaDevolucion;
        this.horaDevolucion = horaDevolucion;
        this.arriendo = arriendo;
    }

    public boolean nuevaDevolucion(Devolucion nuevaDevolucion) {

        int id = 0;

        if (!listaDevolucion.isEmpty()) {

            for (Devolucion D : listaDevolucion) {
                if (D.getIdDevolucion() > id) {
                    id = D.getIdDevolucion();
                }
            }

        }

        id++;

        listaDevolucion.add(new Devolucion(id, nuevaDevolucion.getFechaDevolucion(), nuevaDevolucion.getHoraDevolucion(), nuevaDevolucion.getArriendo()));

        return true;
    }

    public Devolucion buscaDevolucion(int idDevolucionBuscada) {

        Devolucion devolucionEncontrado = null;

        if (!listaDevolucion.isEmpty()) {
            for (Devolucion D : listaDevolucion) {
                if (D.getIdDevolucion() == idDevolucionBuscada) {
                    devolucionEncontrado = D;
                }
            }
        }

        return devolucionEncontrado;

    }

    public Devolucion editarDevolucion(int idDevolucion, Devolucion devolucionEditar) {

        Devolucion devolucionEditada = null;

        if (!listaDevolucion.isEmpty()) {
            for (Devolucion D : listaDevolucion) {
                if (D.getIdDevolucion() == idDevolucion) {
                    D.setFechaDevolucion(devolucionEditar.getFechaDevolucion());
                    D.setHoraDevolucion(devolucionEditar.getHoraDevolucion());
                    D.setArriendo(devolucionEditar.getArriendo());

                    devolucionEditada = D;
                }
            }
        }

        return devolucionEditada;

    }

    public boolean eliminarDevolucion(int id) {
      Devolucion devolucionEliminada = null;

        if (!listaDevolucion.isEmpty()) {
            for (Devolucion D : listaDevolucion) {
                if (D.getIdDevolucion() == id) {
                  devolucionEliminada = D;
                }
            }
        }

        listaDevolucion.remove(devolucionEliminada);

        return true;
    }

}
