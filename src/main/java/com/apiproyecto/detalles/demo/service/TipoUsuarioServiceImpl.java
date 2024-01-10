
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.TipoUsuario;
import com.apiproyecto.detalles.demo.repository.TipoUsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class TipoUsuarioServiceImpl  implements TipoUsuarioService {
    
    @Autowired 
    private TipoUsuarioRepository  repositorio;

    @Override
    public List<TipoUsuario> findAll() {
        return (List<TipoUsuario>) repositorio.findAll();
    }

    @Override
    public List<TipoUsuario> findALLCustom() {
        return repositorio.finDallCustom();
    }

    @Override
    public Optional<TipoUsuario> findById(Integer id) {
        return repositorio.findById(id);
    }

    @Override
    public TipoUsuario add(TipoUsuario t) {
        return repositorio.save(t);
    }

    @Override
    public TipoUsuario update(TipoUsuario t) {
          TipoUsuario objusuarios = repositorio.getById(t.getTipusuario());
        BeanUtils.copyProperties(t, objusuarios);
        return repositorio.save(objusuarios);
    }

    @Override
    public void delete(TipoUsuario t) {
         TipoUsuario objusuarios = repositorio.getById(t.getTipusuario());
         repositorio.delete(objusuarios);
    }


    
}
