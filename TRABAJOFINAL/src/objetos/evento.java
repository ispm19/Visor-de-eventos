/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.sql.Date;


/**
 *
 * @author Garcia
 */
public class evento {
    public String descripcion;
    public String ubicacion;
    public String tipo;
    public String fecha;
    public byte estado;

    public byte getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public evento(String descripcion, String ubicacion, String tipo, String fecha, byte estado) {
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.fecha = fecha;
        this.estado = estado;
    }

    

   
    

    
}
