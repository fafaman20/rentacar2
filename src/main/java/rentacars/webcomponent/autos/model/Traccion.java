/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacars.webcomponent.autos.model;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Traccion {
    
        private int idTraccion;
    private String nombreTraccion;
    private String detalle;
    
    public static ArrayList<Traccion> listaTraccion = new ArrayList<>();

    public int getIdTraccion() {
        return idTraccion;
    }

    public void setIdTraccion(int idTraccion) {
        this.idTraccion = idTraccion;
    }

    public String getNombreTraccion() {
        return nombreTraccion;
    }

    public void setNombreTraccion(String nombreTraccion) {
        this.nombreTraccion = nombreTraccion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Traccion() {
    }

    public Traccion(String nombreTraccion, String detalle) {
        this.nombreTraccion = nombreTraccion;
        this.detalle = detalle;
    }

    private Traccion(int idTraccion, String nombreTraccion, String detalle) {
        this.idTraccion = idTraccion;
        this.nombreTraccion = nombreTraccion;
        this.detalle = detalle;
    }
    
     public boolean nuevaTraccion(Traccion nuevaTr) {

        int id = 0;

        if (!listaTraccion.isEmpty()) {

            for (Traccion Tr : listaTraccion) {
                if (Tr.getIdTraccion()> id) {
                    id = Tr.getIdTraccion();
                }
            }

        }

        id++;

        listaTraccion.add(new Traccion(id, nuevaTr.getNombreTraccion(), nuevaTr.getDetalle()));

        return true;
    }

    public Traccion buscaTraccion(int idTraccionBuscada) {

        Traccion traccionEncontrado = null;

        if (!listaTraccion.isEmpty()) {
            for (Traccion Tr : listaTraccion) {
                if (Tr.getIdTraccion() == idTraccionBuscada) {
                    traccionEncontrado = Tr;
                }
            }
        }

        return traccionEncontrado;

    }

    public Traccion editarTraccion(int idTr, Traccion traccionEditar) {

        Traccion traccionEditada = null;

        if (!listaTraccion.isEmpty()) {
            for (Traccion Tr : listaTraccion) {
                if (Tr.getIdTraccion() == idTr) {
                    Tr.setNombreTraccion(traccionEditar.getNombreTraccion());
                    Tr.setDetalle(traccionEditar.getDetalle());

                   traccionEditada = Tr;
                }
            }
        }

        return traccionEditada;

    }

    public boolean eliminarTraccion(int id) {
        Traccion traccionEliminada = null;

        if (!listaTraccion.isEmpty()) {
            for (Traccion Tr : listaTraccion) {
                if (Tr.getIdTraccion()== id) {
                   traccionEliminada = Tr;
                }
            }
        }

        listaTraccion.remove(traccionEliminada);

        return true;
    }
    
}
