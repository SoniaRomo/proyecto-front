
package com.apiproyecto.detalles.demo.repository;

import com.apiproyecto.detalles.demo.entity.Factura;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface FacturaRepository extends JpaRepository<Factura, Long>{
  @Query("select f from factura f where f.activo= true")
    List<Factura> finDallCustom();  
}
