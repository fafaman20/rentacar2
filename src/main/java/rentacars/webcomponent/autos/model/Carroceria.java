/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacars.webcomponent.autos.model;

import java.util.ArrayList;

/**
 *
 * @author Amori
 */
public class Carroceria {

    private int idCarroceria;
    private String nombreCarroceria;
    private String detalle;

    public static ArrayList<Carroceria> listaCarroceria = new ArrayList<>();

    public int getIdCarroceria() {
        return idCarroceria;
    }

    public void setIdCarroceria(int idCarroceria) {
        this.idCarroceria = idCarroceria;
    }

    public String getNombreCarroceria() {
        return nombreCarroceria;
    }

    public void setNombreCarroceria(String nombreCarroceria) {
        this.nombreCarroceria = nombreCarroceria;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Carroceria() {
    }

    public Carroceria(String nombreCarroceria, String detalle) {
        this.nombreCarroceria = nombreCarroceria;
        this.detalle = detalle;
    }

    private Carroceria(int idCarroceria, String nombreCarroceria, String detalle) {
        this.idCarroceria = idCarroceria;
        this.nombreCarroceria = nombreCarroceria;
        this.detalle = detalle;
    }

    public boolean nuevaCarroceria(Carroceria nuevaForma) {

        int id = 0;

        if (!listaCarroceria.isEmpty()) {

            for (Carroceria Forma : listaCarroceria) {
                if (Forma.getIdCarroceria() > id) {
                    id = Forma.getIdCarroceria();
                }
            }

        }

        id++;

        listaCarroceria.add(new Carroceria(id, nuevaForma.getNombreCarroceria(), nuevaForma.getDetalle()));

        return true;
    }

    public Carroceria buscaCarroceria(int idCarroceriaBuscada) {

        Carroceria carroceriaEncontrado = null;

        if (!listaCarroceria.isEmpty()) {
            for (Carroceria Forma : listaCarroceria) {
                if (Forma.getIdCarroceria() == idCarroceriaBuscada) {
                    carroceriaEncontrado = Forma;
                }
            }
        }

        return carroceriaEncontrado;

    }

    public Carroceria editarCarroceria(int idForma, Carroceria carroceriaEditar) {

        Carroceria carroceriaEditada = null;

        if (!listaCarroceria.isEmpty()) {
            for (Carroceria Forma : listaCarroceria) {
                if (Forma.getIdCarroceria() == idForma) {
                    Forma.setNombreCarroceria(carroceriaEditar.getNombreCarroceria());
                    Forma.setDetalle(carroceriaEditar.getDetalle());

                    carroceriaEditada = Forma;
                }
            }
        }

        return carroceriaEditada;

    }

    public boolean eliminarCarroceria(int id) {
        Carroceria carroceriaEliminada = null;

        if (!listaCarroceria.isEmpty()) {
            for (Carroceria Forma : listaCarroceria) {
                if (Forma.getIdCarroceria()== id) {
                   carroceriaEliminada = Forma;
                }
            }
        }

        listaCarroceria.remove(carroceriaEliminada);

        return true;
    }

}
