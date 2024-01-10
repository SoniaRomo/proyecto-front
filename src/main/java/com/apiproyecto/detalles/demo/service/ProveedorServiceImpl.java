
package com.apiproyecto.detalles.demo.service;


import com.apiproyecto.detalles.demo.entity.Proveedor;
import com.apiproyecto.detalles.demo.entity.Usuario;
import com.apiproyecto.detalles.demo.repository.ProveedorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImpl implements ProveedorService  {
    
    @Autowired 
    private ProveedorRepository  repositorio;

    @Override
    public List<Proveedor> findAll() {
    return repositorio.findAll();  
    }

    @Override
    public List<Proveedor> findALLCustom() {
      return repositorio.finDallCustom();    
    }

    @Override
    public Optional<Proveedor> findById(long id) {
    return repositorio.findById(id);    
    }

    @Override
    public Proveedor add(Proveedor r) {
     return repositorio.save(r);    
    }

    @Override
    public Proveedor update(Proveedor r) {
     Proveedor objproveedor = repositorio.getById(r.getIdproveedor());
        BeanUtils.copyProperties(r, objproveedor);
        return repositorio.save(objproveedor);  
    }

    @Override
    public Proveedor delete(Proveedor r) {
     Proveedor objproveedor = repositorio.getById(r.getIdproveedor());
        objproveedor.setActivo(false);
        return repositorio.save(objproveedor);   
    }
    
}
