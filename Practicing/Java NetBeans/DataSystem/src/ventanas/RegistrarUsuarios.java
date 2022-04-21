
package ventanas;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RegistrarUsuarios extends javax.swing.JFrame {
    
    String user;

    public RegistrarUsuarios() {
        initComponents();
        user = Login.user;
        this.setTitle("Registrar nuevo Usuario - Sesion de " + user);
        this.setResizable(false);
        this.setSize(630, 350);
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_footer = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        cmb_niveles = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Permisos de:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel_footer.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_footer.setText("Creado por Sandunga's Company");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        txt_mail.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        txt_telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        txt_username.setBackground(new java.awt.Color(153, 153, 255));
        txt_username.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 210, -1));

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico" }));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 120, 100));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para agregar usuario
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int permisos_cmb, validacion = 0;
        String nombre, mail, telefono, username, pass, permisos_string = "";
        
        //Recuperrar datos de los text fields
        mail = txt_mail.getText().trim();
        username = txt_username.getText().trim();
        pass = txt_password.getText().trim();
        nombre = txt_nombre.getText().trim();
        telefono= txt_telefono.getText().trim();
        //Recuperar seleccion del combo box
        permisos_cmb = cmb_niveles.getSelectedIndex() + 1;
        
        //Validacion de campos
        if(mail.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes ingresar un correo electronico");
            txt_mail.setBackground(Color.red);
            validacion++;
        } else {
            txt_mail.setBackground(new Color(153,153,255));
        }
        if(username.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes ingresar un Username");
            txt_username.setBackground(Color.red);
            validacion++;
        } else {
            txt_username.setBackground(new Color(153,153,255));
        }
        if(pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes ingresar una contraseña");
            txt_password.setBackground(Color.red);
            validacion++;
        } else {
            txt_password.setBackground(new Color(153,153,255));
        }
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");
            txt_nombre.setBackground(Color.red);
            validacion++;
        } else {
            txt_nombre.setBackground(new Color(153,153,255));
        }
        if(telefono.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes ingresar un telefono");
            txt_telefono.setBackground(Color.red);
            validacion++;
        } else {
            txt_telefono.setBackground(new Color(153,153,255));
        }
        
        //Validacion de Correo electronico valido
        int ACUM = 0;
        
        for(int i = 0; i < mail.length(); i++){
            String correo = String.valueOf(mail.charAt(i));
            if(correo.equalsIgnoreCase("@")){
                ACUM += 1;
            }
        }
        if(ACUM > 1 || ACUM == 0){
            JOptionPane.showMessageDialog(null, "El correo es incorrecto (@)");
            txt_mail.setBackground(Color.red);
            validacion++;
        }
        
        if(permisos_cmb == 1){
            permisos_string = "Administrador";
        } else if(permisos_cmb == 2){
            permisos_string = "Capturista";
        } else if(permisos_cmb == 3){
            permisos_string = "Tecnico";
        }
        
        //Verificar que el nombre de usuario ingresado no exista ya en la base de datos
        try{
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select username from usuarios where username = ?");
            
            pst.setString(1, username);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_username.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre de usuario ya esta registrado en la base de datos");
                cn.close();
                
            } else {
                cn.close();
                
                if(!mail.isEmpty() && !username.isEmpty() && !pass.isEmpty() && !nombre.isEmpty() && !telefono.isEmpty() && ACUM == 1){
                    
                    //Registrar nuevo Usuario
                    try{
                        
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement(
                        "insert into usuarios values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        
                        pst2.setInt(1, 0);
                        pst2.setString(2, nombre);
                        pst2.setString(3, mail);
                        pst2.setString(4, telefono);
                        pst2.setString(5, username);
                        pst2.setString(6, pass);
                        pst2.setString(7, permisos_string);
                        pst2.setString(8, "Activo");
                        pst2.setString(9, user);
                        
                        pst2.executeUpdate();
                        
                        cn2.close();
                        
                        Limpiar();
                        
                        txt_mail.setBackground(Color.green);
                        txt_nombre.setBackground(Color.green);
                        txt_password.setBackground(Color.green);
                        txt_telefono.setBackground(Color.green);
                        txt_username.setBackground(Color.green);
                        
                        JOptionPane.showMessageDialog(null, "Registro Exitoso");
                        this.dispose();
                        
                    } catch(SQLException e){
                        System.err.println("Error en Registrar Usuario");
                        JOptionPane.showMessageDialog(null, "Error al registrar, contacte al administrador");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Debes completar todos los campos");
                }
                
            }
            
        } catch(SQLException e){
            System.err.println("Error en validar nombre de usuario" + e);
            JOptionPane.showMessageDialog(null, "Error de conexion");
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
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    //Metodo limpiar
    public void Limpiar(){
        txt_mail.setText("");
        txt_nombre.setText("");
        txt_password.setText("");
        txt_telefono.setText("");
        txt_username.setText("");
        cmb_niveles.setSelectedIndex(0);
    }

}
