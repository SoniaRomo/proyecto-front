
package com.apiproyecto.detalles.demo.RestController;

import com.apiproyecto.detalles.demo.entity.Producto;
import com.apiproyecto.detalles.demo.service.ProductoService;
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
@RequestMapping("/Producto")
public class ProductoRestController {
    @Autowired
    private ProductoService servicio;

    @GetMapping
    public List<Producto> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Producto> findAllCustom() {
        return servicio.findALLCustom();
    }

    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Integer id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Producto add(@RequestBody Producto p) {
        return servicio.add(p);
    }

    @PutMapping("/{id}")

    public Producto update(@PathVariable Integer id, @RequestBody Producto p) {
        p.setCodproducto(id);
        return servicio.update(p);
    }

    @DeleteMapping("/{id}")

    public Producto delete(@PathVariable Integer id) {
        Producto objproducto = new Producto();
        objproducto.setActivo(false);
        return servicio.delete(Producto.builder().codproducto(id).build());
    }   
}
