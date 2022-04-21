
package clases;

import Objetos.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class PedirNombre extends javax.swing.JFrame {
    
    int valor;
    String[] nombre = new String[50];

    public PedirNombre() {
        initComponents();
        
        this.valor = VentanaPrincipal.valor;
        
        setSize(400, 250);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresa Nombre");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel_sentencia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR HORARIO");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jTextField1.setBackground(new java.awt.Color(102, 0, 0));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, -1));

        jLabel_sentencia.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_sentencia.setText("Nombre invalido.");
        getContentPane().add(jLabel_sentencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESA TU NOMBRE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 6, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 0, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        String aux = jTextField1.getText();
        if(aux.length() >= 10){
            jLabel_sentencia.setVisible(false);
        } else {
            jLabel_sentencia.setVisible(true);
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = jTextField1.getText().toString();
        String horario = "";
        int acum = 0;
        
        if(nombre.length() >= 10){
            try{
                
                Connection cn = Conexion.Conexion();
                PreparedStatement pst = cn.prepareStatement("SELECT hora, minutos FROM horario WHERE id_horario = '" + valor + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    
                    horario += String.valueOf(rs.getInt(1)) + ":" + String.valueOf(rs.getInt(2));
                    acum += 1;
                    
                }
                
            } catch(SQLException e){
                System.err.println("Error de conexion al obtener los horarios " + e);
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
            
            try{
                
                Connection cn = Conexion.Conexion();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO reservadas VALUES(?,?,?,?)");
                
                pst.setInt(1, 0);
                pst.setInt(2, valor);
                pst.setString(3, nombre);
                pst.setString(4, horario);
                
                pst.executeUpdate();
                cn.close();
                
                acum += 1;
                
            } catch(SQLException e){
                System.err.println("Error de conexion al insertar horario " + e);
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
            
            try{
                
                Connection cn = Conexion.Conexion();
                PreparedStatement pst = cn.prepareStatement("UPDATE horario SET ocupado = 'SI' WHERE id_horario = '" + valor + "'");
                
                pst.executeUpdate();
                cn.close();
                
                acum += 1;
                
            } catch(SQLException e){
                System.err.println("Error de conexion al actualizar ocupado " + e);
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
            
            if(acum == 3){
                JOptionPane.showMessageDialog(null, "Se registro correctamente el horario");
                new VentanaPrincipal().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se registro de manera correcta");
                new VentanaPrincipal().setVisible(true);
                this.dispose();
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(PedirNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedirNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedirNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedirNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedirNombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_sentencia;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
