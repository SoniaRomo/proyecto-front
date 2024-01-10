
package com.apiproyecto.detalles.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "proveedor")
@Table(name = "proveedor")
public class Proveedor implements Serializable{
   private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idproveedor")
    private long idproveedor;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cdproducto")
    private int cdproducto;
    @Column(name = "nombreempresa")
    private String nomempresa;
     @Column(name = "direccion")
    private String direcion;
     @Column(name = "activo")
    private boolean activo;
      
}
