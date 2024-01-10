
package com.apiproyecto.detalles.demo.RestController;


import com.apiproyecto.detalles.demo.entity.Ventas;
import com.apiproyecto.detalles.demo.service.VentasService;
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
@RequestMapping("/ventas")
public class VentasRestController {
 @Autowired
    private VentasService servicio; 
 
 
  @GetMapping
    public List<Ventas> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Ventas> findAllCustom() {
        return servicio.findALLCustom();
    }

    @GetMapping("/{id}")
    public Optional<Ventas> findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Ventas add(@RequestBody Ventas v) {
        return servicio.add(v);
    }

   
 @PutMapping("/{id}")

    public Ventas update(@PathVariable long id, @RequestBody Ventas v) {
        v.setVenta(id);
        return servicio.update(v);
    }
    
    @DeleteMapping("/{id}")

    public Ventas delete(@PathVariable long id) {
        Ventas objventa = new Ventas();
        objventa.setActivo(false);
        return servicio.delete(Ventas.builder().venta(id).build());
    }  
}
