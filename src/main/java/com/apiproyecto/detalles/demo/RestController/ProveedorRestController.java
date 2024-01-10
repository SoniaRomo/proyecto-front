
package com.apiproyecto.detalles.demo.RestController;

import com.apiproyecto.detalles.demo.entity.Proveedor;
import com.apiproyecto.detalles.demo.service.ProveedorService;
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
@RequestMapping("/proveedor")
public class ProveedorRestController {
  @Autowired
    private ProveedorService servicio;

    @GetMapping
    public List<Proveedor> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Proveedor> findAllCustom() {
        return servicio.findALLCustom();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Proveedor add(@RequestBody Proveedor r) {
        return servicio.add(r);
    }

   
 @PutMapping("/{id}")

    public Proveedor update(@PathVariable long id, @RequestBody Proveedor r) {
        r.setIdproveedor(id);
        return servicio.update(r);
    }
    
    @DeleteMapping("/{id}")

    public Proveedor delete(@PathVariable long id) {
        Proveedor objproveedor = new Proveedor();
        objproveedor.setActivo(false);
        return servicio.delete(Proveedor.builder().idproveedor(id).build());
    }    
}
