/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author segundo
 */
public class Registro extends javax.swing.JFrame {
    
        private Connection conectar;

        public void enviar_datos(){
            PreparedStatement setencia;
     Connection con;
     Statement stmmt;
		
      byte a =0;
        if(estado.getSelectedItem().equals("Activo")){
            a=1;
        }else if(estado.getSelectedItem().equals("Inactivo")){
            a=0;
        }
        
       try {
            String url="jdbc:mysql://localhost:3306/trabajofinal?user=root";
            con = DriverManager.getConnection(url);
            stmmt= con.createStatement();
            
			final String consulta="INSERT INTO usuarios (NombreUsuario, Password,NombreCompleto,TipoUsuario,Estado ) VALUES(?,?,?,?,?)";
			
                        setencia = con.prepareStatement(consulta);			
			setencia.setString(1, nombre_u.getText());
			setencia.setString(2, pass.getText());
			setencia.setString(3,nombreC.getText());
			setencia.setString(4, (String) tipo.getSelectedItem());
                        setencia.setByte(5,a);
			
			nombre_u.setText("");
			pass.setText("");
			nombreC.setText("");
			tipo.setSelectedItem("");
			
                        setencia.getResultSet();
                        setencia.executeUpdate();
            
                        JOptionPane.showMessageDialog(null, "El usuario se ha registrado con excito");
                        
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e);
		}
        }
   
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        nombreC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nombre_u = new javax.swing.JTextField();
        estado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registrarte ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 28, 140, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, -1));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre Completo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, -1));
        getContentPane().add(nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 224, 110, 20));

        tipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Administrador" }));
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 100, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("<-- Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));
        getContentPane().add(nombre_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, -1));

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        enviar_datos();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login r = new login();
      r.setVisible(true);
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreC;
    private javax.swing.JTextField nombre_u;
    private javax.swing.JPasswordField pass;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
