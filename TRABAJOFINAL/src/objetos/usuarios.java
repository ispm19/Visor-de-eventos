/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;



/**
 *
 * @author segundo
 */
public class usuarios {
     public String NombreUsuario;
    public String Password;
    public String NombreCompleto;
    public String TipoUsuario;
    public byte estado;

    
     public byte getEstado() {
        return estado;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public String getPassword() {
        return Password;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }
    
    
    public usuarios(String NombreUsuario, String Password,String NombreCompleto,String TipoUsuario, byte estado){
    this.NombreUsuario=NombreUsuario;
    this.Password=Password;
    this.NombreCompleto=NombreCompleto;
    this.TipoUsuario=TipoUsuario;
    this.estado=estado;
    
    }
     public long getTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
