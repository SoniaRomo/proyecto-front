
package com.apiproyecto.detalles.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name= "provedor_has_inventario")

public class ProveedorHasInventario {
    @Id
    @Column(name = "id")
    private long id;  
 @ManyToOne   
 @JoinColumn(name="idproveedor")
 private Proveedor proveedor; 
 @ManyToOne
 @JoinColumn(name="idinventario")
 private Inventario inventario;
}
