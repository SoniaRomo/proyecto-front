
package com.apiproyecto.detalles.demo.repository;

import com.apiproyecto.detalles.demo.entity.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;





public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
 @Query("select u from usuario u where u.activo= true")
    List<Usuario> finDallCustom();

  
    
}
