
package com.apiproyecto.detalles.demo.RestController;

import com.apiproyecto.detalles.demo.entity.Inventario;
import com.apiproyecto.detalles.demo.service.InventarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/inventario")
public class InventarioRestController {
  @Autowired
    private InventarioService servicio;  
  
  @GetMapping
    public List<Inventario> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Inventario> findAllCustom() {
        return servicio.findALLCustom();
    }

    @GetMapping("/{id}")
    public Optional<Inventario> findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Inventario add(@RequestBody Inventario i) {
        return servicio.add(i);
    }

   
 @PutMapping("/{id}")

    public Inventario update(@PathVariable long id, @RequestBody Inventario i) {
        i.setIdinventario(id);
        return servicio.update(i);
    }
    
    @DeleteMapping("/{id}")

    public Inventario delete(@PathVariable long id) {
        Inventario objinventario = new Inventario();
        objinventario.setEstado(false);
        return servicio.delete(Inventario.builder().idinventario(id).build());
    } 
}
