
package com.apiproyecto.detalles.demo.RestController;

import com.apiproyecto.detalles.demo.entity.TipoUsuario;
import com.apiproyecto.detalles.demo.service.TipoUsuarioService;
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
@RequestMapping("/Tipousuario")
public class TipoUsuarioRestController {
 
    @Autowired
    private TipoUsuarioService servicio;

    @GetMapping
    public List<TipoUsuario> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<TipoUsuario> findAllCustom() {
        return servicio.findALLCustom();
    }

    @GetMapping("/{id}")
    public Optional<TipoUsuario> findById(@PathVariable Integer id) {
        return servicio.findById(id);
    }

    @PostMapping
    public TipoUsuario add(@RequestBody TipoUsuario t) {
        return servicio.add(t);
    }

    @PutMapping("/{id}")

    public TipoUsuario update(@PathVariable Integer id, @RequestBody TipoUsuario t) {
        t.setTipusuario(id);
        return servicio.update(t);
    }

    @DeleteMapping("/{id}")

    public void delete(@PathVariable Integer id) {
        TipoUsuario objusuarios = new TipoUsuario();
        
        servicio.delete(TipoUsuario.builder().tipusuario(id).build());
    }   
}
