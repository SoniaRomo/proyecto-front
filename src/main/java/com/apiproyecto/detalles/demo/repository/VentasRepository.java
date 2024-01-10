
package com.apiproyecto.detalles.demo.repository;

import com.apiproyecto.detalles.demo.entity.Ventas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface VentasRepository extends JpaRepository<Ventas, Long>{
@Query("select v from ventas v where v.activo= true")
    List<Ventas> finDallCustom();    
}
