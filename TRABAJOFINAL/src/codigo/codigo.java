/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Garcia
 */
public class codigo {
    
     public static void guardar(String a,String b, String c){
     PreparedStatement psInsertar;
     Connection con;
     Statement stmmt;
     Date now = new Date(System.currentTimeMillis());
     SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
     
        try {
            // TODO add your handling code here

            String url="jdbc:mysql://localhost:3306/trabajofinal?user=root";
            con = DriverManager.getConnection(url);
            stmmt= con.createStatement();
            psInsertar = con.prepareStatement("INSERT INTO eventos (Nombre,Ubicacion,Tipo,Fecha)"+" values(?,?,?,?)");

            
          
            
            psInsertar.setString(1,a);
            psInsertar.setString(2,b);
            psInsertar.setString(3,c);
            psInsertar.setString(4,date.format(now));
            
            psInsertar.getResultSet();
            psInsertar.executeUpdate();

            JOptionPane.showMessageDialog(null," Los datos se agregador exitosamente");

           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
     
    private void modificar(){
        
    }
    private void borrar(){
        
    }
   
}
