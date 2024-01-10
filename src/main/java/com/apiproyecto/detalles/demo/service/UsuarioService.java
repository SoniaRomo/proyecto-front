
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Usuario;
import java.util.List;
import java.util.Optional;


public interface UsuarioService {
    
    public List<Usuario> findAll();

    public List<Usuario> findALLCustom();

    public Optional<Usuario> findById(long id);

    public  Usuario add(Usuario u);

    public  Usuario update( Usuario u);

    public  Usuario delete(Usuario u); 
}
