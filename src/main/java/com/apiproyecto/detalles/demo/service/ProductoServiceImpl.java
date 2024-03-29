
package com.apiproyecto.detalles.demo.service;

import com.apiproyecto.detalles.demo.entity.Producto;
import com.apiproyecto.detalles.demo.repository.ProductoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) repositorio.findAll();
    }

    @Override
    public List<Producto> findALLCustom() {
        return repositorio.finDallCustom();
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        return repositorio.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return repositorio.save(p);
    }

    @Override
    public Producto update(Producto p) {
        Optional<Producto> objproducto = repositorio.findById(p.getCodproducto());
        BeanUtils.copyProperties(p, objproducto);
        return repositorio.save(objproducto.get());
    }

    @Override
    public Producto delete(Producto p) {
        Optional<Producto> objproducto = repositorio.findById(p.getCodproducto());
        objproducto.get().setActivo(false);
        return repositorio.save(objproducto.get());
    }



}
