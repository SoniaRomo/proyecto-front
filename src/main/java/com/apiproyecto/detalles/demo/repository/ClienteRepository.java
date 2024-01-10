
package com.apiproyecto.detalles.demo.repository;

import com.apiproyecto.detalles.demo.entity.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ClienteRepository extends CrudRepository<Cliente, Integer>  {

     @Query("SELECT c FROM cliente c WHERE c.activo=true")
    List<Cliente> finDallCustom();

    public Cliente getById(Integer persona);
}
