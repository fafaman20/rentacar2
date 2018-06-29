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
public class TipoPersona {

    private int idTipoPersona;
    private String nombreTipoPersona;
    private String detalle;

    public static ArrayList<TipoPersona> listaTipoPersona = new ArrayList<>();

    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    public String getNombreTipoPersona() {
        return nombreTipoPersona;
    }

    public void setNombreTipoPersona(String nombreTipoPersona) {
        this.nombreTipoPersona = nombreTipoPersona;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TipoPersona() {
    }

    public TipoPersona(String nombreTipoPersona, String detalle) {
        this.nombreTipoPersona = nombreTipoPersona;
        this.detalle = detalle;
    }

    private TipoPersona(int idTipoPersona, String nombreTipoPersona, String detalle) {
        this.idTipoPersona = idTipoPersona;
        this.nombreTipoPersona = nombreTipoPersona;
        this.detalle = detalle;
    }

    public boolean nuevaTipoPersona(TipoPersona nuevaTipoPersona) {

        int id = 0;

        if (!listaTipoPersona.isEmpty()) {

            for (TipoPersona Tipop : listaTipoPersona) {
                if (Tipop.getIdTipoPersona() > id) {
                    id = Tipop.getIdTipoPersona();
                }
            }

        }

        id++;

        listaTipoPersona.add(new TipoPersona(id, nuevaTipoPersona.getNombreTipoPersona(), nuevaTipoPersona.getDetalle()));

        return true;
    }

    public TipoPersona buscaTipoPersona(int idTipoPersonaBuscada) {

        TipoPersona tipoPersonaEncontrado = null;

        if (!listaTipoPersona.isEmpty()) {
            for (TipoPersona Tipop : listaTipoPersona) {
                if (Tipop.getIdTipoPersona() == idTipoPersonaBuscada) {
                    tipoPersonaEncontrado = Tipop;
                }
            }
        }

        return tipoPersonaEncontrado;

    }

    public TipoPersona editarTipoPersona(int idTipoPersona, TipoPersona tipoPersonaEditar) {

        TipoPersona tipoPersonaEditada = null;

        if (!listaTipoPersona.isEmpty()) {
            for (TipoPersona Tipop : listaTipoPersona) {
                if (Tipop.getIdTipoPersona() == idTipoPersona) {
                    Tipop.setNombreTipoPersona(tipoPersonaEditar.getNombreTipoPersona());
                    Tipop.setDetalle(tipoPersonaEditar.getDetalle());

                    tipoPersonaEditada = Tipop;
                }
            }
        }

        return tipoPersonaEditada;

    }

    public boolean eliminarTipoPersona(int id) {
        TipoPersona tipoPersonaEliminada = null;

        if (!listaTipoPersona.isEmpty()) {
            for (TipoPersona Tipop : listaTipoPersona) {
                if (Tipop.getIdTipoPersona() == id) {
                    tipoPersonaEliminada = Tipop;
                }
            }
        }

        listaTipoPersona.remove(tipoPersonaEliminada);

        return true;
    }

}
