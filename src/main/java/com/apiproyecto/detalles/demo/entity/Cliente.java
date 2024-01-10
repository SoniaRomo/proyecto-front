

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
@Entity(name = "cliente")
@Table(name = "cliente")
public class Cliente implements Serializable{
   private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idpersona")
    private Integer persona;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "valor")
    private int valor;
    @Column(name = "activo")
    private boolean activo;  
     @ManyToOne
    @JoinColumn(name="ididentificacion")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name="codproducto")
    private Producto producto;
}
