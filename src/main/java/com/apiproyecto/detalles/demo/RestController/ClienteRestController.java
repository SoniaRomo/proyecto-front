
package com.apiproyecto.detalles.demo.RestController;

import com.apiproyecto.detalles.demo.entity.Cliente;
import com.apiproyecto.detalles.demo.service.ClienteService;
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
@RequestMapping("/Cliente")
public class ClienteRestController {
     @Autowired
    private ClienteService servicio;

    @GetMapping
    public List<Cliente> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Cliente> findAllCustom() {
        return servicio.findALLCustom();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Integer id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Cliente add(@RequestBody Cliente c) {
        return servicio.add(c);
    }

    @PutMapping("/{id}")

    public Cliente update(@PathVariable Integer id, @RequestBody Cliente c) {
        c.setPersona(id);
        return servicio.update(c);
    }

    @DeleteMapping("/{id}")

    public Cliente delete(@PathVariable Integer id) {
        Cliente objcliente = new Cliente();
        objcliente.setActivo(false);
        return servicio.delete(Cliente.builder().persona(id).build());
    } 
}
