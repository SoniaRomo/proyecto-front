
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Factura;
import java.util.List;
import java.util.Optional;


public interface FacturaService {
 public List<Factura> findAll();

    public List<Factura> findALLCustom();

    public Optional<Factura> findById(long id);

    public  Factura add(Factura f);

    public  Factura update( Factura f);

    public  Factura delete(Factura f);    
}
