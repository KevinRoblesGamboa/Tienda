
package com.Tienda.domain;


import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable  {
    
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    private Long idCliente; // hibernate lo transforma en id_cliente en mayuscula
    String nombre;
    String apellidos;
    String correo;
    String telefono;

    public Cliente() {

    }

    public Cliente(String nombre, String apellidos, String correos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correos;
        this.telefono = telefono;
    }

}
