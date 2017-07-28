/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.evento;

/**
 *
 * @author Garcia
 */
public class eventos extends javax.swing.JFrame {
     PreparedStatement psInsertar;
     Connection con;
     Statement stmmt;
     ResultSet resultado;
     DefaultTableModel modelo = new DefaultTableModel(); 
    /**
     * Creates new form eventos
     */
    public eventos() {
        initComponents();
    this.setLocationRelativeTo(null);
        mostrar();
        id.setEditable(false);
        table.setEditingRow(false);
        
    }
    public static  Connection getConexion() {
        Connection cn=null;
        String url="jdbc:mysql://localhost:3306/trabajofinal";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(url,"root","");         
        }
        catch(ClassNotFoundException | SQLException e){
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
        catch(SQLException e){ System.out.print(e.toString());}
        return datos;
    }    
    // funcion para rellenar la tabla
    private void mostrar() {        
                    
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
        } catch (SQLException e) {
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
        jLabel12 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ubicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
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
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        estado2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        fecha = new com.toedter.calendar.JDateChooser();
        id = new javax.swing.JTextField();
        tipo2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Descripcion");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

        jLabel13.setText("Tipo de evento");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, -1));

        jLabel14.setText("Ubicacion");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });
        getContentPane().add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, -1));

        jLabel1.setText("AGREGAR EVENTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 740, 10));

        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 80, -1));

        jLabel6.setText("EVENTOS EN CURSO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 450, 300));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 360, 10));

        jLabel11.setText("EDITAR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 390, 10));
        getContentPane().add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 130, -1));

        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));
        getContentPane().add(fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 130, -1));

        jLabel8.setText("Ubicacion");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));
        getContentPane().add(ubicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 130, -1));

        jLabel9.setText("Tipo de evento");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, 20));

        jLabel10.setText("ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jButton9.setText("Modificar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 80, -1));

        jButton10.setText("Borrar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 80, -1));

        jLabel2.setText("Estado");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));
        getContentPane().add(estado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 130, -1));

        jLabel4.setText("Fecha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel5.setText("Estado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 130, -1));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 130, -1));
        getContentPane().add(tipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 130, -1));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        byte a =0;
        if(estado.getSelectedItem().equals("Activo")){
            a=1;
        }else if(estado.getSelectedItem().equals("Inactivo")){
            a=0;
        }
        evento evento = new evento(nombre.getText(),ubicacion.getText(),tipo.getText(),fecha.getDate(),a);

        try {
            // TODO add your handling code here

            String url="jdbc:mysql://localhost:3306/trabajofinal?user=root";
            con = DriverManager.getConnection(url);
            stmmt= con.createStatement();
            psInsertar = con.prepareStatement("INSERT INTO evento (DESCRIPCION,UBICACIÓN,TIPO,FECHA,ESTADO)"+" values(?,?,?,?,?)");

            psInsertar.setString(1,evento.getDescripcion());
            psInsertar.setString(2,evento.getUbicacion());
            psInsertar.setString(3,evento.getTipo());
            psInsertar.setDate(4,evento.getFecha());
            psInsertar.setByte(5,evento.getEstado());

            psInsertar.getResultSet();
            psInsertar.executeUpdate();

            JOptionPane.showMessageDialog(null," Los datos se agregador exitosamente");
            table.setModel(modelo);
            modelo.fireTableDataChanged();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }

        nombre.setText(null);
        tipo.setText(null);
        ubicacion.setText(null);
    }//GEN-LAST:event_jButton7ActionPerformed

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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        int respuesta = JOptionPane.showConfirmDialog(null, "Seguro desea eliminar a " +id.getText());
        if(respuesta==JOptionPane.YES_OPTION){
            try {
                // TODO add your handling code here

                String url="jdbc:mysql://localhost:3306/trabajofinal?user=root";
                con = DriverManager.getConnection(url);
                stmmt= con.createStatement();
                psInsertar = con.prepareStatement("DELETE FROM evento WHERE IDEVENTO='"+id.getText()+"'");

                psInsertar.getResultSet();
                psInsertar.executeUpdate();

                JOptionPane.showMessageDialog(null," Los datos borrados exitosamente");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        admin a = new admin();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new eventos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JTextField estado2;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JTextField fecha2;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTable table;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField tipo2;
    private javax.swing.JTextField ubicacion;
    private javax.swing.JTextField ubicacion2;
    // End of variables declaration//GEN-END:variables
}
