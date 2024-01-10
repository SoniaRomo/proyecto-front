
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Ventas;
import java.util.List;
import java.util.Optional;


public interface VentasService {
    public List<Ventas> findAll();

    public List<Ventas> findALLCustom();

    public Optional<Ventas> findById(long id);

    public  Ventas add(Ventas v);

    public  Ventas update( Ventas v);

    public  Ventas delete(Ventas v);   
}
