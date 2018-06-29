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
public class Marca {

    private int idMarca;
    private String nombreMarca;
    private String detalle;

    public static ArrayList<Marca> listaMarca = new ArrayList<>();

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Marca() {
    }

    public Marca(String nombreMarca, String detalle) {
        this.nombreMarca = nombreMarca;
        this.detalle = detalle;
    }

    private Marca(int idMarca, String nombreMarca, String detalle) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
        this.detalle = detalle;
    }

    public boolean nuevaMarca(Marca nuevaMarca) {

        int id = 0;

        if (!listaMarca.isEmpty()) {

            for (Marca M : listaMarca) {
                if (M.getIdMarca() > id) {
                    id = M.getIdMarca();
                }
            }

        }

        id++;

        listaMarca.add(new Marca(id, nuevaMarca.getNombreMarca(), nuevaMarca.getDetalle()));

        return true;
    }

    public Marca buscaMarca(int idMarcaBuscada) {

        Marca marcaEncontrado = null;

        if (!listaMarca.isEmpty()) {
            for (Marca M : listaMarca) {
                if (M.getIdMarca() == idMarcaBuscada) {
                    marcaEncontrado = M;
                }
            }
        }

        return marcaEncontrado;

    }

    public Marca editarMarca(int idMarca, Marca marcaEditar) {

        Marca marcaEditada = null;

        if (!listaMarca.isEmpty()) {
            for (Marca M : listaMarca) {
                if (M.getIdMarca() == idMarca) {
                    M.setNombreMarca(marcaEditar.getNombreMarca());
                    M.setDetalle(marcaEditar.getDetalle());

                    marcaEditada = M;
                }
            }
        }

        return marcaEditada;

    }

    public boolean eliminarMarca(int id) {
        Marca marcaEliminada = null;

        if (!listaMarca.isEmpty()) {
            for (Marca M : listaMarca) {
                if (M.getIdMarca() == id) {
                    marcaEliminada = M;
                }
            }
        }

        listaMarca.remove(marcaEliminada);

        return true;
    }

}
