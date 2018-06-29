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
public class Region {

    private int idRegion;
    private String nombreRegion;
    private String detalle;

    public static ArrayList<Region> listaRegion = new ArrayList<>();

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Region() {
    }

    public Region(String nombreRegion, String detalle) {
        this.nombreRegion = nombreRegion;
        this.detalle = detalle;
    }

    private Region(int idRegion, String nombreRegion, String detalle) {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
        this.detalle = detalle;
    }

    public boolean nuevaRegion(Region nuevaRegion) {

        int id = 0;

        if (!listaRegion.isEmpty()) {

            for (Region R : listaRegion) {
                if (R.getIdRegion() > id) {
                    id = R.getIdRegion();
                }
            }

        }

        id++;

        listaRegion.add(new Region(id, nuevaRegion.getNombreRegion(), nuevaRegion.getDetalle()));

        return true;
    }

    public Region buscaRegion(int idRegionBuscada) {

        Region regionEncontrado = null;

        if (!listaRegion.isEmpty()) {
            for (Region R : listaRegion) {
                if (R.getIdRegion() == idRegionBuscada) {
                    regionEncontrado = R;
                }
            }
        }

        return regionEncontrado;

    }

    public Region editarRegion(int idRegion, Region regionEditar) {

        Region regionEditada = null;

        if (!listaRegion.isEmpty()) {
            for (Region R : listaRegion) {
                if (R.getIdRegion() == idRegion) {
                    R.setNombreRegion(regionEditar.getNombreRegion());
                    R.setDetalle(regionEditar.getDetalle());

                    regionEditada = R;
                }
            }
        }

        return regionEditada;

    }

    public boolean eliminarRegion(int id) {
        Region regionEliminada = null;

        if (!listaRegion.isEmpty()) {
            for (Region R : listaRegion) {
                if (R.getIdRegion() == id) {
                    regionEliminada = R;
                }
            }
        }

        listaRegion.remove(regionEliminada);

        return true;
    }

}
