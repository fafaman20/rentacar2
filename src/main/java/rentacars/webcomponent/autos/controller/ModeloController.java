/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacars.webcomponent.autos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import restacars.webcomponent.cars.model.Modelo;

/**
 *
 * @author mxrni
 */
@RestController
@RequestMapping("/modelo")
public class ModeloController {
    
   @GetMapping()
    public List<Modelo> list() {
        return Modelo.listaModelo;
    }
    
    @GetMapping("/{id}")
    public Modelo get(@PathVariable String id) {
        Modelo Mo = new Modelo();
        return Mo.buscaModelo(Integer.parseInt(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Modelo> put(@PathVariable String id, @RequestBody Modelo editarModelo) {
         Modelo Mo = new Modelo();
         
        return new ResponseEntity<>(Mo.editarModelo(Integer.parseInt(id), editarModelo),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Modelo nuevoModelo) {
        Modelo Mo = new Modelo();
        if (Mo.nuevaModelo(nuevoModelo)) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else  return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        Modelo Mo = new Modelo();
        
        if (Mo.eliminarModelo(Integer.parseInt(id))) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else  return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        
        
    }
}
