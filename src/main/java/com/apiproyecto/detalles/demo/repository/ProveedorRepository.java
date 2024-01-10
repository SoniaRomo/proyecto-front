
package com.apiproyecto.detalles.demo.repository;

import com.apiproyecto.detalles.demo.entity.Proveedor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{
  @Query("select r from proveedor r where r.activo= true")
    List<Proveedor> finDallCustom();  
}
