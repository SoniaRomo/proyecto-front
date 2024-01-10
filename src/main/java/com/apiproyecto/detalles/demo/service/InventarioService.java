
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Inventario;
import java.util.List;
import java.util.Optional;


public interface InventarioService {
    
    public List<Inventario> findAll();

    public List<Inventario> findALLCustom();

    public Optional<Inventario> findById(long id);

    public  Inventario add(Inventario i);

    public  Inventario update( Inventario i);

    public  Inventario delete(Inventario i); 
}
