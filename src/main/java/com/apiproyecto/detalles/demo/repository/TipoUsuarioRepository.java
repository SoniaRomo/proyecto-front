
package com.apiproyecto.detalles.demo.repository;

import com.apiproyecto.detalles.demo.entity.TipoUsuario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface TipoUsuarioRepository extends CrudRepository<TipoUsuario, Integer> {

      @Query("SELECT t FROM tipousuario t WHERE t.estado=true")
    List<TipoUsuario> finDallCustom();

    public TipoUsuario getById(Integer tipusuario);
    
}
