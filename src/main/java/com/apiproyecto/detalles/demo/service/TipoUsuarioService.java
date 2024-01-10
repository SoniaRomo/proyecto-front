
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.TipoUsuario;
import java.util.List;
import java.util.Optional;


public interface TipoUsuarioService {
 
    public List<TipoUsuario> findAll();

    public List<TipoUsuario> findALLCustom();

    public Optional<TipoUsuario> findById(Integer id);

    public  TipoUsuario add( TipoUsuario t);

    public TipoUsuario update(TipoUsuario t);

    public void delete(TipoUsuario t);   
}
