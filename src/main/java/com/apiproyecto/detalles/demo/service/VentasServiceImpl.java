
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Ventas;
import com.apiproyecto.detalles.demo.repository.VentasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentasServiceImpl implements VentasService {

     @Autowired 
    private VentasRepository  repositorio;
     
    @Override
    public List<Ventas> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Ventas> findALLCustom() {
         return repositorio.finDallCustom();
    }

    @Override
    public Optional<Ventas> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Ventas add(Ventas v) {
        return repositorio.save(v);
    }

    @Override
    public Ventas update(Ventas v) {
       Ventas objventa = repositorio.getById(v.getVenta());
        BeanUtils.copyProperties(v, objventa);
        return repositorio.save(objventa);
    }

    @Override
    public Ventas delete(Ventas v) {
        Ventas objventa = repositorio.getById(v.getVenta());
        objventa.setActivo(false);
        return repositorio.save(objventa);
    }
    
}
