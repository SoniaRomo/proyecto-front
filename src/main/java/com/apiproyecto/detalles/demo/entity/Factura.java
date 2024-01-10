
package com.apiproyecto.detalles.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "factura")
@Table(name = "factura")
public class Factura implements Serializable {
  private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idfactura")
    private long idfactura;
    @Column(name = "total_venta")
    private String total_venta;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "activo")
    private boolean activo;  
    @OneToMany
    @JoinColumn(name="idfactura")
    private List < Ventas> ventas;
    @ManyToOne
    @JoinColumn(name="id_persona")
    private Cliente cliente;
}
