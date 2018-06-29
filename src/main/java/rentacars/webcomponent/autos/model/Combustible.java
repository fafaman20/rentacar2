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
public class Combustible {
    private int idCombustible ;
    private String tipoCombustible ; 
    private String detalle; 
    
    public static ArrayList<Combustible> combustible = new ArrayList<>();

    public int getIdCombustible() {
        return idCombustible;
    }

    public void setIdCombustible(int idCombustible) {
        this.idCombustible = idCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Combustible() {
    }

    public Combustible(String tipoCombustible, String detalle) {
        this.tipoCombustible = tipoCombustible;
        this.detalle = detalle;
    }

    private Combustible(int idCombustible, String tipoCombustible, String detalle) {
        this.idCombustible = idCombustible;
        this.tipoCombustible = tipoCombustible;
        this.detalle = detalle;
    }
    
    public boolean nuevocombustible(Combustible nuevoCombustible){
    
        int id = 0;
        
        if (!combustible.isEmpty()) {
            
            for (Combustible c : combustible) {
                if (c.getIdCombustible()> id) {
                    id = c.getIdCombustible();
                }
            }
            
        }
        
        id++;
        
        combustible.add(new Combustible(id, nuevoCombustible.getTipoCombustible(), nuevoCombustible.getDetalle()));
         
        return true;
    }
    
       public Combustible buscaCombustible(int idCombustibleBuscado){
    
        Combustible combustibleEncontrado = null;
        
        if(!combustible.isEmpty()){
            for (Combustible c : combustible) {
                if (c.getIdCombustible() == idCombustibleBuscado) {
                    combustibleEncontrado = c;
                }
            }
        }
        
        return combustibleEncontrado;
        
    }
       
       public Combustible editarCombustible(int idAlumno, Combustible combustibleEditar){
    
        Combustible combustibleEditado = null;
        
        if(!combustible.isEmpty()){
            for (Combustible c : combustible) {
                if (c.getIdCombustible()== idAlumno) {
                    c.setTipoCombustible(combustibleEditar.getTipoCombustible());
                    c.setDetalle(combustibleEditar.getDetalle());
                    
                    combustibleEditado = c;
                }
            }
        }
        
        return combustibleEditado;
        
    }
        public boolean eliminarCombustible(int id){
        Combustible combustibleEliminado = null;
        
        if(!combustible.isEmpty()){
            for (Combustible c : combustible) {
                if (c.getIdCombustible()== id) {
                   combustibleEliminado = c;
                }
            }
        }
        
        combustible.remove(combustibleEliminado);
        
        
        return true;
    }
    
}
