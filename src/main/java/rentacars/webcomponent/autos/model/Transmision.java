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
public class Transmision {

    private int idTransmision;
    private String nombreTransmision;
    private String detalle;
    
     public static ArrayList<Transmision> listaTransmision = new ArrayList<>();

    public int getIdTransmision() {
        return idTransmision;
    }

    public void setIdTransmision(int idTransmision) {
        this.idTransmision = idTransmision;
    }

    public String getNombreTransmision() {
        return nombreTransmision;
    }

    public void setNombreTransmision(String nombreTransmision) {
        this.nombreTransmision = nombreTransmision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Transmision() {
    }

    public Transmision(String nombreTransmision, String detalle) {
        this.nombreTransmision = nombreTransmision;
        this.detalle = detalle;
    }

    private Transmision(int idTransmision, String nombreTransmision, String detalle) {
        this.idTransmision = idTransmision;
        this.nombreTransmision = nombreTransmision;
        this.detalle = detalle;
    }
    
        public boolean nuevaTransmision(Transmision nuevaT) {

        int id = 0;

        if (!listaTransmision.isEmpty()) {

            for (Transmision T : listaTransmision) {
                if (T.getIdTransmision()> id) {
                    id = T.getIdTransmision();
                }
            }

        }

        id++;

        listaTransmision.add(new Transmision(id, nuevaT.getNombreTransmision(), nuevaT.getDetalle()));

        return true;
    }

    public Transmision buscaTransmision(int idTransmisionBuscada) {

        Transmision transmisionEncontrado = null;

        if (!listaTransmision.isEmpty()) {
            for (Transmision T : listaTransmision) {
                if (T.getIdTransmision() == idTransmisionBuscada) {
                    transmisionEncontrado = T;
                }
            }
        }

        return transmisionEncontrado;

    }

    public Transmision editarTransmision(int idT, Transmision transmisionEditar) {

        Transmision transmisionEditada = null;

        if (!listaTransmision.isEmpty()) {
            for (Transmision T : listaTransmision) {
                if (T.getIdTransmision() == idT) {
                    T.setNombreTransmision(transmisionEditar.getNombreTransmision());
                    T.setDetalle(transmisionEditar.getDetalle());

                    transmisionEditada = T;
                }
            }
        }

        return transmisionEditada;

    }

    public boolean eliminarTransmision(int id) {
        Transmision transmisionEliminada = null;

        if (!listaTransmision.isEmpty()) {
            for (Transmision T : listaTransmision) {
                if (T.getIdTransmision()== id) {
                   transmisionEliminada = T;
                }
            }
        }

        listaTransmision.remove(transmisionEliminada);

        return true;
    }
    
}
