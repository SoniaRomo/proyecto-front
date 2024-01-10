
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Producto;
import java.util.List;
import java.util.Optional;


public interface ProductoService {
    public List<Producto> findAll();

    public List<Producto> findALLCustom();

    public Optional<Producto> findById(Integer id);

    public Producto add(Producto p);

    public Producto update(Producto p);

    public Producto delete(Producto p);  
}
