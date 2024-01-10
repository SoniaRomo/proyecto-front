
package com.apiproyecto.detalles.demo.RestController;

import com.apiproyecto.detalles.demo.entity.Usuario;
import com.apiproyecto.detalles.demo.service.UsuarioService;
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
@RequestMapping("/usuario")
public class UsuarioRestController {
  @Autowired
    private UsuarioService servicio;

    @GetMapping
    public List<Usuario> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Usuario> findAllCustom() {
        return servicio.findALLCustom();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Usuario add(@RequestBody Usuario u) {
        return servicio.add(u);
    }

   
 @PutMapping("/{id}")

    public Usuario update(@PathVariable long id, @RequestBody Usuario u) {
        u.setIdentificacion(id);
        return servicio.update(u);
    }
    
    @DeleteMapping("/{id}")

    public Usuario delete(@PathVariable long id) {
        Usuario objusuario = new Usuario();
        objusuario.setActivo(false);
        return servicio.delete(Usuario.builder().identificacion(id).build());
    }  
}
