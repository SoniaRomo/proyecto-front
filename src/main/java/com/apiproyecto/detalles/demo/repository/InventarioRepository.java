
package com.apiproyecto.detalles.demo.repository;

import com.apiproyecto.detalles.demo.entity.Inventario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface InventarioRepository extends JpaRepository<Inventario, Long>{
 @Query("select i from inventario i where i.estado= true")
    List<Inventario> finDallCustom();   
}
