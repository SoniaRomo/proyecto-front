
package com.apiproyecto.detalles.demo.repository;

import com.apiproyecto.detalles.demo.entity.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface ProductoRepository extends CrudRepository<Producto, Integer> {
 @Query("SELECT p FROM producto p WHERE p.activo=true")
    List<Producto> finDallCustom();

  
    
}
