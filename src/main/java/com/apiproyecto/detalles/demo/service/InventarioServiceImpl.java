
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Inventario;
import com.apiproyecto.detalles.demo.repository.InventarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventarioServiceImpl implements InventarioService {

     @Autowired 
    private InventarioRepository  repositorio;
     
     
    @Override
    public List<Inventario> findAll() {
       return repositorio.findAll(); 
    }

    @Override
    public List<Inventario> findALLCustom() {
        return repositorio.finDallCustom();
    }

    @Override
    public Optional<Inventario> findById(long id) {
         return repositorio.findById(id);
    }

    @Override
    public Inventario add(Inventario i) {
         return repositorio.save(i);
    }

    @Override
    public Inventario update(Inventario i) {
        Inventario objinventario = repositorio.getById(i.getIdinventario());
        BeanUtils.copyProperties(i, objinventario);
        return repositorio.save(objinventario);
    }

    @Override
    public Inventario delete(Inventario i) {
         Inventario objinventario = repositorio.getById(i.getIdinventario());
        objinventario.setEstado(false);
        return repositorio.save(objinventario);
    }
    
}
