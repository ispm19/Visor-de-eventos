/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author segundo
 */
public class Registro extends javax.swing.JFrame {
    
        private Connection conectar;

        public void enviar_datos(){
		
       try {
			final String consulta="INSERT INTO USUARIOS (NOMBREUSUARIO, CONTRASEÑA,NOMBRECOMPLETO,TIPOUSUARIO ) VALUES(?,?,?,?)";
			
			java.sql.PreparedStatement setencia= conectar.prepareStatement(consulta);
			
			setencia.setString(2, nombre_u.getText());
			setencia.setString(3, pass.getText());
			setencia.setString(4,nombreC.getText());
			setencia.setString(5, (String) tipo.getSelectedItem());
			
			setencia.executeUpdate();
			nombre_u.setText("");
			pass.setText("");
			nombreC.setText("");
			tipo.setSelectedItem("");
		} catch (SQLException e) {
			e.getStackTrace();
			JOptionPane.showMessageDialog(null, "Error en el envio de los datos  a la BD");
		}
        }
   
    public Registro() {
        initComponents();
        try {
			
			
			conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajofinal","root","");
			
		} catch (SQLException e) {
			e.getStackTrace();
			JOptionPane.showMessageDialog(null, "Error al conectar la BD");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre_u = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        nombreC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registrarte ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 28, 140, 40));

        jLabel2.setText("Nombre Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 20));

        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));

        nombre_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_uActionPerformed(evt);
            }
        });
        getContentPane().add(nombre_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, 20));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, -1));

        jLabel4.setText("Nombre Completo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, -1));
        getContentPane().add(nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 130, -1));

        jLabel5.setText("Tipo de Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 224, 80, 20));

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Administrador" }));
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 110, 20));

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        enviar_datos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombre_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_uActionPerformed

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
                JOptionPane.showMessageDialog(null, "El usuario se ha registrado con excito");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
