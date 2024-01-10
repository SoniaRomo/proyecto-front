
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
@Entity(name = "usuario")
@Table(name = "usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ididentificacion")
    private long identificacion;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "num_documento")
    private int documento;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "activo")
    private boolean activo;
    @ManyToOne
    @JoinColumn(name="idpersona", nullable = false)
    private Cliente cliente;
}
