
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.util.Calendar;

public class RegistrarEquipo extends javax.swing.JFrame {
    
    int IDcliente_update = 0;
    String user = "", nom_cliente = "";

    public RegistrarEquipo() {
        initComponents();
        user = Login.user;
        IDcliente_update = GestionarClientes.IDcliente_update;
        
        setSize(630,445);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        //Agregar imagen dentro del JLabel y escalarla (Wallpaper)
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), 
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        try{
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select nombre_cliente from clientes where id_cliente = ?");
            
            pst.setInt(1, IDcliente_update);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                nom_cliente = rs.getString("nombre_cliente");
                txt_nombreCliente.setText(nom_cliente);
                
            } else {
                System.err.println("No al consultar al cliente");
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
            
        } catch(SQLException e){
            System.err.println("Error en registrar equipo");
                JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        setTitle("Registrar nuevo equipo para " + nom_cliente);
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

        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Nombre1 = new javax.swing.JLabel();
        jLabel_Nombre2 = new javax.swing.JLabel();
        jLabel_Nombre3 = new javax.swing.JLabel();
        jLabel_Nombre4 = new javax.swing.JLabel();
        jLabel_Nombre5 = new javax.swing.JLabel();
        txt_nombreCliente = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        txt_num_serie = new javax.swing.JTextField();
        cmb_tipoEquipo = new javax.swing.JComboBox<>();
        cmb_marcas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_observaciones = new javax.swing.JTextPane();
        jButton_Regsitrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Registro de Equipo");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel_Nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setText("Nombre del Cliente:");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel_Nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre1.setText("Tipo de Equipo:");
        getContentPane().add(jLabel_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel_Nombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre2.setText("Marca:");
        getContentPane().add(jLabel_Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel_Nombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombre3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre3.setText("Modelo:");
        getContentPane().add(jLabel_Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel_Nombre4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombre4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre4.setText("Numero de Serie:");
        getContentPane().add(jLabel_Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel_Nombre5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombre5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre5.setText("Daño reportado y/o Observaciones:");
        getContentPane().add(jLabel_Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        txt_nombreCliente.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombreCliente.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_nombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        txt_modelo.setBackground(new java.awt.Color(153, 153, 255));
        txt_modelo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_modelo.setForeground(new java.awt.Color(255, 255, 255));
        txt_modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_modelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, -1));

        txt_num_serie.setBackground(new java.awt.Color(153, 153, 255));
        txt_num_serie.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_num_serie.setForeground(new java.awt.Color(255, 255, 255));
        txt_num_serie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_num_serie.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_num_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, -1));

        cmb_tipoEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Impresora", "Multifuncional" }));
        getContentPane().add(cmb_tipoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        cmb_marcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acer", "Alienware", "Apple", "Asus", "Brother", "Dell", "HP", "Lenovo", "Samsung", "Toshiba", "Xerox" }));
        getContentPane().add(cmb_marcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jScrollPane1.setViewportView(jTextPane_observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 330, 230));

        jButton_Regsitrar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Regsitrar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton_Regsitrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Regsitrar.setText("Registrar Equipo");
        jButton_Regsitrar.setBorder(null);
        jButton_Regsitrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegsitrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Regsitrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 210, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Creado por Sandunga's Company");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 445));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para registrar equipo
    private void jButton_RegsitrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegsitrarActionPerformed
        
        int validacion = 0;
        String tipo_equipo, marca, modelo, num_serie, dia_ingreso, mes_ingreso, annio_ingreso, 
                estatus, observaciones;
        
        tipo_equipo = String.valueOf(cmb_tipoEquipo.getSelectedItem());
        marca = cmb_marcas.getSelectedItem().toString();
        
        modelo = txt_modelo.getText().trim();
        num_serie = txt_num_serie.getText().trim();
        observaciones = jTextPane_observaciones.getText();
        estatus = "Nuevo ingreso";
        
        Calendar calendar = Calendar.getInstance();
        
        dia_ingreso = String.valueOf(calendar.get(Calendar.DATE)); // Se registra el dia de ingreso del equipo
        mes_ingreso = String.valueOf(calendar.get(Calendar.MONTH)); // Se registra el mes de ingreso del equipo
        annio_ingreso = String.valueOf(calendar.get(Calendar.YEAR + 1)); // Se registra el año de ingreso del equipo
        
        if(modelo.isEmpty()){
            txt_modelo.setBackground(Color.red);
            validacion++;
        }
        if(num_serie.isEmpty()){
            txt_num_serie.setBackground(Color.red);
            validacion++;
        }
        if(observaciones.isEmpty()){
            jTextPane_observaciones.setText("Sin observaciones...");
        }
        
        if(validacion == 0){
            
            try{
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                "insert into equipos values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                
                pst.setInt(1, 0);
                pst.setInt(2, IDcliente_update);
                pst.setString(3, tipo_equipo);
                pst.setString(4, marca);
                pst.setString(5, modelo);
                pst.setString(6, num_serie);
                pst.setString(7, dia_ingreso);
                pst.setString(8, mes_ingreso);
                pst.setString(9, annio_ingreso);
                pst.setString(10, observaciones);
                pst.setString(11, estatus);
                pst.setString(12, user);
                pst.setString(13, "");
                pst.setString(14, "");
                
                pst.executeUpdate();
                cn.close();
                
                txt_modelo.setBackground(Color.green);
                txt_nombreCliente.setBackground(Color.green);
                txt_num_serie.setBackground(Color.green);
                
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                this.dispose();
                
            } catch(SQLException e){
                System.err.println("Error en registrar equipo" + e);
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos lo campos");
        }
        
        
    }//GEN-LAST:event_jButton_RegsitrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_marcas;
    private javax.swing.JComboBox<String> cmb_tipoEquipo;
    private javax.swing.JButton jButton_Regsitrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Nombre1;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Nombre3;
    private javax.swing.JLabel jLabel_Nombre4;
    private javax.swing.JLabel jLabel_Nombre5;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane_observaciones;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_num_serie;
    // End of variables declaration//GEN-END:variables
}
