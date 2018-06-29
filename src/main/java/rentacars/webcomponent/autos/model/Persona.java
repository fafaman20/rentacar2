/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacars.webcomponent.autos.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 
 */
public class Persona {

    private int idPersona;
    public int idhola;
    private String rut;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String telefono;
    private String direccion1;
    private String direccion2;
    private Ciudad ciudad;
    private TipoPersona tipoPersona;

    public static ArrayList<Persona> listaPersona = new ArrayList<>();

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Persona() {
    }

    public Persona(String rut, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion1, String direccion2, Ciudad ciudad, TipoPersona tipoPersona) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.tipoPersona = tipoPersona;
    }

    private Persona(int idPersona, String rut, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion1, String direccion2, Ciudad ciudad, TipoPersona tipoPersona) {
        this.idPersona = idPersona;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.tipoPersona = tipoPersona;
    }

    public boolean nuevaPersona(Persona nuevaPersona) {

        int id = 0;

        if (!listaPersona.isEmpty()) {

            for (Persona P : listaPersona) {
                if (P.getIdPersona() > id) {
                    id = P.getIdPersona();
                }
            }

        }

        id++;

        listaPersona.add(new Persona(id, nuevaPersona.getRut(), nuevaPersona.getNombre(), nuevaPersona.getApellido(), nuevaPersona.getFechaNacimiento(), nuevaPersona.getTelefono(), nuevaPersona.getDireccion1(), nuevaPersona.getDireccion2(), nuevaPersona.getCiudad(), nuevaPersona.getTipoPersona()));
        return true;
    }

    public Persona buscaPersona(int idPersonaBuscada) {

        Persona personaEncontrado = null;

        if (!listaPersona.isEmpty()) {
            for (Persona P : listaPersona) {
                if (P.getIdPersona() == idPersonaBuscada) {
                    personaEncontrado = P;
                }
            }
        }

        return personaEncontrado;

    }

    public Persona editarPersona(int idPersona, Persona personaEditar) {

        Persona personaEditada = null;

        if (!listaPersona.isEmpty()) {
            for (Persona P : listaPersona) {
                if (P.getIdPersona() == idPersona) {
                    P.setRut(personaEditar.getRut());
                    P.setNombre(personaEditar.getNombre());
                    P.setApellido(personaEditar.getApellido());
                    P.setFechaNacimiento(personaEditar.getFechaNacimiento());
                    P.setTelefono(personaEditar.getTelefono());
                    P.setDireccion1(personaEditar.getDireccion1());
                    P.setDireccion2(personaEditar.getDireccion2());
                    P.setCiudad(personaEditar.getCiudad());
                    P.setTipoPersona(personaEditar.getTipoPersona());

                    personaEditada = P;
                }
            }
        }

        return personaEditada;

    }

    public boolean eliminarPersona(int id) {
        Persona personaEliminada = null;

        if (!listaPersona.isEmpty()) {
            for (Persona P : listaPersona) {
                if (P.getIdPersona() == id) {
                    personaEliminada = P;
                }
            }
        }

        listaPersona.remove(personaEliminada);

        return true;
    }

}
