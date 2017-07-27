/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import codigo.codigo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Garcia
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrar();
        id.setEditable(false);
        panel.setVisible(false);
    }
    public static  Connection getConexion() {
        Connection cn=null;
        String url="jdbc:mysql://localhost:3306/trabajofinal";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(url,"root","");         
        }
        catch(Exception e){
         System.out.println(String.valueOf(e));}
        return cn;
    }
    
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConexion();
        Statement st;
        ResultSet datos=null;
        try{
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);            
        }
        catch(Exception e){ System.out.print(e.toString());}
        return datos;
    }    
    // funcion para rellenar la tabla
    private void mostrar() {        
        DefaultTableModel modelo = new DefaultTableModel();               
        ResultSet rs = getTabla("select IDEVENTO,DESCRIPCION,UBICACIÓN,TIPO,FECHA,ESTADO from evento");
        modelo.setColumnIdentifiers(new Object[]{"IDEVENTO","DESCRIPCION","UBICACIÓN","TIPO","FECHA","ESTADO"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{
               rs.getString("IDEVENTO"), 
                rs.getString("DESCRIPCION"),
                rs.getString("UBICACIÓN"),
                rs.getString("TIPO"),
                 rs.getString("FECHA"),
                 rs.getString("ESTADO")});
                
            }            
            // asigna el modelo a la tabla
            table.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ubicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        nombre2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fecha2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ubicacion2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tipo2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        estado2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Cerrar seccion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 10));

        jButton2.setText("USUARIOS");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        jButton3.setText("EVENTOS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));

        jButton4.setText("INVITADOS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 30));

        jButton5.setText("INVITACIONES");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 30));

        jButton6.setText("REPORTES");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 30));

        jButton11.setText("MODO PORTERO");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, 30));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Nombre");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        panel.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

        jLabel13.setText("Tipo de evento");
        panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        panel.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, -1));

        jLabel14.setText("Ubicacion");
        panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });
        panel.add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, -1));

        jLabel1.setText("AGREGAR EVENTO");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
        panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 640, -1));

        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 80, -1));

        jButton8.setText("Actualizar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jLabel6.setText("EVENTOS EN CURSO");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 350, 260));
        panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 360, 10));

        jLabel11.setText("EDITAR");
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));
        panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 270, 10));
        panel.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 130, -1));

        jLabel7.setText("Nombre");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabel3.setText("Fecha");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));
        panel.add(fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 130, -1));

        jLabel8.setText("Ubicacion");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));
        panel.add(ubicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 130, -1));

        jLabel9.setText("Tipo de evento");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, 20));

        tipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo2ActionPerformed(evt);
            }
        });
        panel.add(tipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 130, 30));

        jLabel10.setText("ID");
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        panel.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 60, 30));

        jButton9.setText("Modificar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 80, -1));

        jButton10.setText("Borrar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 80, -1));

        jLabel2.setText("Estado");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));
        panel.add(estado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 130, -1));

        jLabel4.setText("Fecha");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel5.setText("Estado");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));
        panel.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 100, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 630, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(null, " Esta seguro que quiere salir?");
        if(respuesta==JOptionPane.YES_OPTION){
           
        
        login a = new login();
        a.setVisible(true);
        dispose();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        panel.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         
        codigo.guardarevento(nombre.getText(),ubicacion.getText(),tipo.getText(),estado.getText());
        nombre.setText(null);
        tipo.setText(null);
        ubicacion.setText(null);
                

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
      
            
        JOptionPane.showMessageDialog(null,"Lista actualizada exitosamente");

    }//GEN-LAST:event_jButton8ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int rec = table.getSelectedRow();
        id.setText(table.getValueAt(rec, 0).toString());
        nombre2.setText(table.getValueAt(rec, 1).toString());
        ubicacion2.setText(table.getValueAt(rec, 2).toString());
        tipo2.setText(table.getValueAt(rec, 3).toString());
        fecha2.setText(table.getValueAt(rec, 4).toString());
        estado2.setText(table.getValueAt(rec, 5).toString());

    }//GEN-LAST:event_tableMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        codigo.modificarevento(id.getText(),nombre2.getText(), ubicacion2.getText(), tipo2.getText(), fecha2.getText());

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String ida= id.getText();
        int respuesta = JOptionPane.showConfirmDialog(null, "Seguro desea eliminar a " +ida);
        if(respuesta==JOptionPane.YES_OPTION){
            codigo.borrarevento(ida);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo2ActionPerformed

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField estado;
    private javax.swing.JTextField estado2;
    private javax.swing.JTextField fecha2;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre2;
    private javax.swing.JPanel panel;
    private javax.swing.JTable table;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField tipo2;
    private javax.swing.JTextField ubicacion;
    private javax.swing.JTextField ubicacion2;
    // End of variables declaration//GEN-END:variables
}
