
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Usuario;
import com.apiproyecto.detalles.demo.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UsuarioServiceImpl  implements UsuarioService {
    
    @Autowired 
    private UsuarioRepository  repositorio;

    @Override
    public List<Usuario> findAll() {
        return repositorio.findAll();
    }
    
    @Override
    public List<Usuario> findALLCustom() {
        return repositorio.finDallCustom();
    }

    @Override
    public Optional<Usuario> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Usuario add(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario update(Usuario u) {
        Usuario objusuario = repositorio.getById(u.getIdentificacion());
        BeanUtils.copyProperties(u, objusuario);
        return repositorio.save(objusuario);
    }

    @Override
    public Usuario delete(Usuario u) {
        Usuario objusuario = repositorio.getById(u.getIdentificacion());
        objusuario.setActivo(false);
        return repositorio.save(objusuario);
    }

    
}
