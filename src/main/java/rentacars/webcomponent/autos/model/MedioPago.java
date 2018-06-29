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
public class MedioPago {

    private int idMedioPago;
    private String nombreMedioPago;
    private String detalle;

    public static ArrayList<MedioPago> listaMedioPago = new ArrayList<>();

    public int getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(int idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public String getNombreMedioPago() {
        return nombreMedioPago;
    }

    public void setNombreMedioPago(String nombreMedioPago) {
        this.nombreMedioPago = nombreMedioPago;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public MedioPago() {
    }

    public MedioPago(String nombreMedioPago, String detalle) {
        this.nombreMedioPago = nombreMedioPago;
        this.detalle = detalle;
    }

    private MedioPago(int idMedioPago, String nombreMedioPago, String detalle) {
        this.idMedioPago = idMedioPago;
        this.nombreMedioPago = nombreMedioPago;
        this.detalle = detalle;
    }

    public boolean nuevaMedioPago(MedioPago nuevaMedioPago) {

        int id = 0;

        if (!listaMedioPago.isEmpty()) {

            for (MedioPago Me : listaMedioPago) {
                if (Me.getIdMedioPago() > id) {
                    id = Me.getIdMedioPago();
                }
            }

        }

        id++;

        listaMedioPago.add(new MedioPago(id, nuevaMedioPago.getNombreMedioPago(), nuevaMedioPago.getDetalle()));

        return true;
    }

    public MedioPago buscaMedioPago(int idMedioPagoBuscada) {

        MedioPago medioPagoEncontrado = null;

        if (!listaMedioPago.isEmpty()) {
            for (MedioPago Me : listaMedioPago) {
                if (Me.getIdMedioPago() == idMedioPagoBuscada) {
                    medioPagoEncontrado = Me;
                }
            }
        }

        return medioPagoEncontrado;

    }

    public MedioPago editarMedioPago(int idMedioPago, MedioPago medioPagoEditar) {

        MedioPago medioPagoEditada = null;

        if (!listaMedioPago.isEmpty()) {
            for (MedioPago Me : listaMedioPago) {
                if (Me.getIdMedioPago() == idMedioPago) {
                    Me.setNombreMedioPago(medioPagoEditar.getNombreMedioPago());
                    Me.setDetalle(medioPagoEditar.getDetalle());

                    medioPagoEditada = Me;
                }
            }
        }

        return medioPagoEditada;

    }

    public boolean eliminarMedioPago(int id) {
        MedioPago medioPagoEliminada = null;

        if (!listaMedioPago.isEmpty()) {
            for (MedioPago Me : listaMedioPago) {
                if (Me.getIdMedioPago() == id) {
                    medioPagoEliminada = Me;
                }
            }
        }

        listaMedioPago.remove(medioPagoEliminada);

        return true;
    }

}
