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
public class Ciudad {

    private int idCiudad;
    private String nombreCiudad;
    private String detalle;
    private Region Region;

    public static ArrayList<Ciudad> listaCiudad = new ArrayList<>();

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Region getRegion() {
        return Region;
    }

    public void setRegion(Region Region) {
        this.Region = Region;
    }

    public Ciudad() {
    }

    public Ciudad(String nombreCiudad, String detalle, Region Region) {
        this.nombreCiudad = nombreCiudad;
        this.detalle = detalle;
        this.Region = Region;
    }

    private Ciudad(int idCiudad, String nombreCiudad, String detalle, Region Region) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.detalle = detalle;
        this.Region = Region;
    }

    public boolean nuevaCiudad(Ciudad nuevaCiudad) {

        int id = 0;

        if (!listaCiudad.isEmpty()) {

            for (Ciudad C : listaCiudad) {
                if (C.getIdCiudad() > id) {
                    id = C.getIdCiudad();
                }
            }

        }

        id++;

        listaCiudad.add(new Ciudad(id, nuevaCiudad.getNombreCiudad(), nuevaCiudad.getDetalle(), nuevaCiudad.getRegion()));

        return true;
    }

    public Ciudad buscaCiudad(int idCiudadBuscada) {

        Ciudad ciudadEncontrado = null;

        if (!listaCiudad.isEmpty()) {
            for (Ciudad C : listaCiudad) {
                if (C.getIdCiudad() == idCiudadBuscada) {
                    ciudadEncontrado = C;
                }
            }
        }

        return ciudadEncontrado;

    }

    public Ciudad editarCiudad(int idCiudad, Ciudad ciudadEditar) {

        Ciudad ciudadEditada = null;

        if (!listaCiudad.isEmpty()) {
            for (Ciudad C : listaCiudad) {
                if (C.getIdCiudad() == idCiudad) {
                    C.setNombreCiudad(ciudadEditar.getNombreCiudad());
                    C.setDetalle(ciudadEditar.getDetalle());
                    C.setRegion(ciudadEditar.getRegion());

                    ciudadEditada = C;
                }
            }
        }

        return ciudadEditada;

    }

    public boolean eliminarCiudad(int id) {
        Ciudad ciudadEliminada = null;

        if (!listaCiudad.isEmpty()) {
            for (Ciudad C : listaCiudad) {
                if (C.getIdCiudad() == id) {
                    ciudadEliminada = C;
                }
            }
        }

        listaCiudad.remove(ciudadEliminada);

        return true;
    }

}
