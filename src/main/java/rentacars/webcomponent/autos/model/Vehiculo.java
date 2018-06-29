/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacars.webcomponent.autos.model;

import java.util.ArrayList;
import restacars.webcomponent.cars.model.TipoVehiculo;
import restacars.webcomponent.cars.model.Version;

/**
 *
 * @author 
 */
public class Vehiculo {

    private int idVehiculo;
    private String patente;
    private int valor;
    private int año;
    private String color;
    private TipoVehiculo tipoVehiculo;
    private Version version;

    public static ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Vehiculo() {
    }

    public Vehiculo(String patente, int valor, int año, String color, TipoVehiculo tipoVehiculo, Version version) {
        this.patente = patente;
        this.valor = valor;
        this.año = año;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.version = version;
    }

    private Vehiculo(int idVehiculo, String patente, int valor, int año, String color, TipoVehiculo tipoVehiculo, Version version) {
        this.idVehiculo = idVehiculo;
        this.patente = patente;
        this.valor = valor;
        this.año = año;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.version = version;
    }
    
        public boolean nuevaVehiculo(Vehiculo nuevaVehiculo) {

        int id = 0;

        if (!listaVehiculo.isEmpty()) {

            for (Vehiculo Vh : listaVehiculo) {
                if (Vh.getIdVehiculo() > id) {
                    id = Vh.getIdVehiculo();
                }
            }

        }

        id++;

        listaVehiculo.add(new Vehiculo(id, nuevaVehiculo.getPatente(), nuevaVehiculo.getValor(), nuevaVehiculo.getAño(), nuevaVehiculo.getColor(), nuevaVehiculo.getTipoVehiculo(), nuevaVehiculo.getVersion()));

        return true;
    }

    public Vehiculo buscaVehiculo(int idVehiculoBuscada) {

        Vehiculo vehiculoEncontrado = null;

        if (!listaVehiculo.isEmpty()) {
            for (Vehiculo Vh : listaVehiculo) {
                if (Vh.getIdVehiculo() == idVehiculoBuscada) {
                    vehiculoEncontrado = Vh;
                }
            }
        }

        return vehiculoEncontrado;

    }

    public Vehiculo editarVehiculo(int idVehiculo, Vehiculo vehiculoEditar) {

       Vehiculo vehiculoEditada = null;

        if (!listaVehiculo.isEmpty()) {
            for (Vehiculo Vh : listaVehiculo) {
                if (Vh.getIdVehiculo() == idVehiculo) {
                    Vh.setPatente(vehiculoEditar.getPatente());
                    Vh.setValor(vehiculoEditar.getValor());
                    Vh.setAño(vehiculoEditar.getAño());
                    Vh.setColor(vehiculoEditar.getColor());
                    Vh.setTipoVehiculo(vehiculoEditar.getTipoVehiculo());
                    Vh.setVersion(vehiculoEditar.getVersion());

                    vehiculoEditada = Vh;
                }
            }
        }

        return vehiculoEditada;

    }

    public boolean eliminarVehiculo(int id) {
        Vehiculo vehiculoEliminada = null;

        if (!listaVehiculo.isEmpty()) {
            for (Vehiculo Vh : listaVehiculo) {
                if (Vh.getIdVehiculo() == id) {
                    vehiculoEliminada = Vh;
                }
            }
        }

        listaVehiculo.remove(vehiculoEliminada);

        return true;
    }

}
