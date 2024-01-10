
package com.apiproyecto.detalles.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Entity(name = "ventas")
@Table(name = "ventas")
public class Ventas implements Serializable{
 private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idventa")
    private long venta;
    @Column(name = "cantidad")
    private int    cantidad;
    @Column(name = "total_compra")
    private int  total_compra;
    @Column(name = "iva")
    private Double iva;
    @Column(name = "activo")
    private boolean activo;   
    @ManyToOne
    @JoinColumn(name="codproducto")
    private Producto producto;
    
    
}
