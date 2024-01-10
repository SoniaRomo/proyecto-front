
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Proveedor;
import java.util.List;
import java.util.Optional;


public interface ProveedorService {
    public List<Proveedor> findAll();

    public List<Proveedor> findALLCustom();

    public Optional<Proveedor> findById(long id);

    public  Proveedor add(Proveedor r);

    public  Proveedor update( Proveedor r);

    public  Proveedor delete(Proveedor r); 
} 

