
package com.apiproyecto.detalles.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Entity(name = "inventario")
@Table(name = "inventario")
public class Inventario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idinventario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idinventario;
    @Column(name = "pedido")
    private String pedido;
    @Column(name = "estadocat")
    private boolean estado;
    
}
