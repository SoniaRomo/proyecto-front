
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
@Entity(name = "devoluciones")
@Table(name = "devoluciones")

public class Devoluciones {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idNumfac")
    private long factura;
    @Column(name = "usuario")
    private String    usuario;
    @Column(name = "prodevolver")
    private String  prodevolver;
    @Column(name = "motDevolucion")
    private String motDevolucion;
      
    
}
