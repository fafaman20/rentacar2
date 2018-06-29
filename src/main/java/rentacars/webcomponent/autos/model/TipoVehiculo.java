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
public class TipoVehiculo {

    private int idTipoVehiculo;
    private String nombreTipoVehiculo;
    private String detalle;

    public static ArrayList<TipoVehiculo> listaTipoVehiculo = new ArrayList<>();

    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getNombreTipoVehiculo() {
        return nombreTipoVehiculo;
    }

    public void setNombreTipoVehiculo(String nombreTipoVehiculo) {
        this.nombreTipoVehiculo = nombreTipoVehiculo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TipoVehiculo() {
    }

    public TipoVehiculo(String nombreTipoVehiculo, String detalle) {
        this.nombreTipoVehiculo = nombreTipoVehiculo;
        this.detalle = detalle;
    }

    private TipoVehiculo(int idTipoVehiculo, String nombreTipoVehiculo, String detalle) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.nombreTipoVehiculo = nombreTipoVehiculo;
        this.detalle = detalle;
    }

    public boolean nuevaTipoVehiculo(TipoVehiculo nuevaTipoVehiculo) {

        int id = 0;

        if (!listaTipoVehiculo.isEmpty()) {

            for (TipoVehiculo Tipo : listaTipoVehiculo) {
                if (Tipo.getIdTipoVehiculo() > id) {
                    id = Tipo.getIdTipoVehiculo();
                }
            }

        }

        id++;

        listaTipoVehiculo.add(new TipoVehiculo(id, nuevaTipoVehiculo.getNombreTipoVehiculo(), nuevaTipoVehiculo.getDetalle()));

        return true;
    }

    public TipoVehiculo buscaTipoVehiculo(int idTipoVehiculoBuscada) {

        TipoVehiculo tipoVehiculoEncontrado = null;

        if (!listaTipoVehiculo.isEmpty()) {
            for (TipoVehiculo Tipo : listaTipoVehiculo) {
                if (Tipo.getIdTipoVehiculo() == idTipoVehiculoBuscada) {
                    tipoVehiculoEncontrado = Tipo;
                }
            }
        }

        return tipoVehiculoEncontrado;

    }

    public TipoVehiculo editarTipoVehiculo(int idTipoVehiculo, TipoVehiculo tipoVehiculoEditar) {

        TipoVehiculo tipoVehiculoEditada = null;

        if (!listaTipoVehiculo.isEmpty()) {
            for (TipoVehiculo Tipo : listaTipoVehiculo) {
                if (Tipo.getIdTipoVehiculo() == idTipoVehiculo) {
                    Tipo.setNombreTipoVehiculo(tipoVehiculoEditar.getNombreTipoVehiculo());
                    Tipo.setDetalle(tipoVehiculoEditar.getDetalle());

                    tipoVehiculoEditada = Tipo;
                }
            }
        }

        return tipoVehiculoEditada;

    }

    public boolean eliminarTipoVehiculo(int id) {
        TipoVehiculo tipoVehiculoEliminada = null;

        if (!listaTipoVehiculo.isEmpty()) {
            for (TipoVehiculo Tipo : listaTipoVehiculo) {
                if (Tipo.getIdTipoVehiculo() == id) {
                    tipoVehiculoEliminada = Tipo;
                }
            }
        }

        listaTipoVehiculo.remove(tipoVehiculoEliminada);

        return true;
    }

}
