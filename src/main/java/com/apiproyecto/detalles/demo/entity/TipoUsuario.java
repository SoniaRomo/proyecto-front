
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
@Entity(name = "tipousuario")
@Table(name = "tipousuario")
public class TipoUsuario implements Serializable{
     private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tipusuario;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "contraseña")
    private int contraseña;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="ididentifcacion")
    private Usuario usuario;
}
