
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RestaurarPassword extends javax.swing.JFrame {
    
    String user = "", user_update = "";

    public RestaurarPassword() {
        initComponents();
        
        user = Login.user;
        user_update = GestionarUsuarios.user_update;
        
        setSize(360, 260);
        setTitle("Cambio de password para " + user_update);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        //Agregar imagen dentro del JLabel y escalarla (Wallpaper)
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), 
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
    }
    
    //Icono de la interfaz
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_passwordConfirmacion = new javax.swing.JPasswordField();
        jButton_RestaurarPassword = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cambio de Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nuevo Password: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirmar Password: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        txt_passwordConfirmacion.setBackground(new java.awt.Color(153, 153, 255));
        txt_passwordConfirmacion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_passwordConfirmacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_passwordConfirmacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_passwordConfirmacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_passwordConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        jButton_RestaurarPassword.setBackground(new java.awt.Color(153, 153, 255));
        jButton_RestaurarPassword.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton_RestaurarPassword.setForeground(new java.awt.Color(255, 255, 255));
        jButton_RestaurarPassword.setText("Restaurar Password");
        jButton_RestaurarPassword.setBorder(null);
        jButton_RestaurarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RestaurarPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RestaurarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 35));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para restaurar el password
    private void jButton_RestaurarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestaurarPasswordActionPerformed
        
        String password, confirmacion_password;
        
        password = txt_password.getText().trim();
        confirmacion_password = txt_passwordConfirmacion.getText().trim();
        
        if(!password.isEmpty() && !confirmacion_password.isEmpty()){
            
            if(password.equals(confirmacion_password)){
                
                try{
                    
                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement(
                    "update usuarios set password = ? where username = ?");
                    
                    pst.setString(1, password);
                    pst.setString(2, user_update);
                    
                    pst.executeUpdate();
                    cn.close();
                    
                    txt_password.setBackground(Color.green);
                    txt_passwordConfirmacion.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "Restauracion exitosa");
                    
                    this.dispose();
                    
                } catch(SQLException e){
                    System.err.println("Error en restaurar password " + e);
                    JOptionPane.showMessageDialog(null, "Error de conexion");
                }
                
            } else {
                txt_passwordConfirmacion.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
            
        } else {
            txt_password.setBackground(Color.red);
            txt_passwordConfirmacion.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
        
    }//GEN-LAST:event_jButton_RestaurarPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_RestaurarPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_passwordConfirmacion;
    // End of variables declaration//GEN-END:variables
}
