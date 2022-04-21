
package ventanas;

import clases.Conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import static ventanas.GestionarClientes.IDcliente_update;

public class Informacion_Cliente extends javax.swing.JFrame {
    
    DefaultTableModel model = new DefaultTableModel();
    int ID_cliente_update = 0;
    public static int IDequipo = 0;
    String user = "";

    public Informacion_Cliente() {
        initComponents();
        user = Login.user;
        ID_cliente_update = GestionarClientes.IDcliente_update;
        
        setSize(630,450);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
         //Agregar imagen dentro del JLabel y escalarla (Wallpaper)
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), 
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        //Acceso a la base de datos
        try{
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select * from clientes where id_cliente = ?");
            
            pst.setInt(1, ID_cliente_update);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                setTitle("Informacion del Cliente " + rs.getString("nombre_cliente") + " - Sesion de " + user);
                jLabel_Titulo.setText("Informacion del Cliente " + rs.getString("nombre_cliente"));
                
                txt_nombre.setText(rs.getString("nombre_cliente"));
                txt_mail.setText(rs.getString("mail_cliente"));
                txt_telefono.setText(rs.getString("tel_cliente"));
                txt_direccion.setText(rs.getString("dir_cliente"));
                txt_UltimaModificacion.setText(rs.getString("ultima_modificacion"));
                
            } else {
                System.err.println("Error al encontrar cliente");
                JOptionPane.showMessageDialog(null, "No se encontro al cliente");
            }
            cn.close();
            
        } catch(SQLException e){
            System.err.println("Error en la informacion del cliente");
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        try{
            
            Connection cn2 = Conexion.conectar();
            PreparedStatement pst2 = cn2.prepareStatement(
            "select id_equipo, tipo_equipo, marca, estatus from equipos where id_cliente = ?");
            
            pst2.setInt(1, ID_cliente_update);
            
            ResultSet rs2 = pst2.executeQuery();
            
            jTable_equipos = new JTable(model);
            jScrollPane_equipos.setViewportView(jTable_equipos);
            
            model.addColumn("ID equipo");
            model.addColumn("Tipo de equipo");
            model.addColumn("Marca");
            model.addColumn("Estatus");
            
            while(rs2.next()){
                
                Object[] fila = new Object[4];
                
                for(int i = 0; i < 4; i++){
                    
                    fila[i] = rs2.getObject(i + 1);
                    
                }
                
                model.addRow(fila);
                
            }
            
        } catch(SQLException e){
            System.err.println("Error en el llenado de la tabla equipos " + e);
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        jTable_equipos.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                
                int fila_point = jTable_equipos.rowAtPoint(e.getPoint());
                int columna_point = 0;
                
                if(fila_point > -1){
                    
                    IDequipo = (int)(model.getValueAt(fila_point, columna_point));
                    
                    InformacionEquipo informacionEquipo = new InformacionEquipo();
                    informacionEquipo.setVisible(true);
                    
                }
                
            }
            
        });
        
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

        jScrollPane_equipos = new javax.swing.JScrollPane();
        jTable_equipos = new javax.swing.JTable();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_mail = new javax.swing.JLabel();
        jLabel_telefono = new javax.swing.JLabel();
        jLabel_direccion = new javax.swing.JLabel();
        jLabel_UltimaModificacion = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_UltimaModificacion = new javax.swing.JTextField();
        jButton_Regsitrar = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_ImprimirReporte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane_equipos.setViewportView(jTable_equipos);

        getContentPane().add(jScrollPane_equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 380, 180));

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Informacion del Cliente");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel_Nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setText("Nombre:");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel_mail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_mail.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_mail.setText("Email:");
        getContentPane().add(jLabel_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_telefono.setText("Telefono:");
        getContentPane().add(jLabel_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel_direccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_direccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_direccion.setText("Direccion:");
        getContentPane().add(jLabel_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel_UltimaModificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_UltimaModificacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_UltimaModificacion.setText("Ultima Modificacion por: ");
        getContentPane().add(jLabel_UltimaModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

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

        txt_direccion.setBackground(new java.awt.Color(153, 153, 255));
        txt_direccion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        txt_UltimaModificacion.setBackground(new java.awt.Color(153, 153, 255));
        txt_UltimaModificacion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_UltimaModificacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_UltimaModificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_UltimaModificacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_UltimaModificacion.setEnabled(false);
        getContentPane().add(txt_UltimaModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 210, -1));

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
        getContentPane().add(jButton_Regsitrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 210, 35));

        jButton_Actualizar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Actualizar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Actualizar.setText("Actualizar Cliente");
        jButton_Actualizar.setBorder(null);
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 210, 35));

        jButton_ImprimirReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impresora.png"))); // NOI18N
        jButton_ImprimirReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImprimirReporteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ImprimirReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 120, 100));

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Creado por Sandunga's Company");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Creado por Sandunga's Company");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para registrar un nuevo equipo al cliente
    private void jButton_RegsitrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegsitrarActionPerformed
        RegistrarEquipo registrarEquipo = new RegistrarEquipo();
        registrarEquipo.setVisible(true);
    }//GEN-LAST:event_jButton_RegsitrarActionPerformed
    //Boton para actualizar la informacion del cliente
    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        
        int validacion = 0;
        String nombre, mail, telefono, direccion;
        
        nombre = txt_nombre.getText().trim();
        mail = txt_mail.getText().trim();
        telefono = txt_telefono.getText().trim();
        direccion = txt_direccion.getText().trim();
        
        if(nombre.isEmpty()){
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if(mail.isEmpty()){
            txt_mail.setBackground(Color.red);
            validacion++;
        }
        if(telefono.isEmpty()){
            txt_telefono.setBackground(Color.red);
            validacion++;
        }
        if(direccion.isEmpty()){
            txt_direccion.setBackground(Color.red);
            validacion++;
        }
        
        if(validacion == 0){
            
            try{
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                "update clientes set nombre_cliente = ?, mail_cliente = ?, tel_cliente = ?, dir_cliente = ?, ultima_modificacion = ? "
                        + "where id_cliente = ?");
                
                pst.setString(1, nombre);
                pst.setString(2, mail);
                pst.setString(3, telefono);
                pst.setString(4, direccion);
                pst.setString(5, user);
                pst.setInt(6, IDcliente_update);
                
                pst.executeUpdate();
                cn.close();
                
                Limpiar();
                
                txt_direccion.setBackground(Color.green);
                txt_mail.setBackground(Color.green);
                txt_nombre.setBackground(Color.green);
                txt_telefono.setBackground(Color.green);
                txt_UltimaModificacion.setText(user);
                
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
                this.dispose();
                
            } catch(SQLException e){
                System.err.println("Error en la informacion del cliente " + e);
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
        
    }//GEN-LAST:event_jButton_ActualizarActionPerformed
    //Boton para imprimir la informacion y equipos del cliente
    private void jButton_ImprimirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImprimirReporteActionPerformed
        
        Document documento = new Document();
        
        try{
            
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + txt_nombre.getText().trim() + ".pdf"));
            
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/images/BannerPDF.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Informacion del Cliente. \n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tablaCliente = new PdfPTable(5);
            tablaCliente.addCell("ID");
            tablaCliente.addCell("Nombre");
            tablaCliente.addCell("Email");
            tablaCliente.addCell("Telefono");
            tablaCliente.addCell("Direccion");
            
            try{
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                "select * from clientes where id_cliente = ?");
                
                pst.setInt(1, IDcliente_update);
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    
                    do{
                        
                        tablaCliente.addCell(rs.getString(1));
                        tablaCliente.addCell(rs.getString(2));
                        tablaCliente.addCell(rs.getString(3));
                        tablaCliente.addCell(rs.getString(4));
                        tablaCliente.addCell(rs.getString(5));
                        
                    } while(rs.next());
                    
                    documento.add(tablaCliente);
                    
                } else {
                    System.err.println("error al encontrar cliente");
                    JOptionPane.showMessageDialog(null, "No se encontro el cliente");
                }
                
               Paragraph parrafo2 = new Paragraph();
               parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
               parrafo2.add("\n \n Equipos Registrados. \n \n");
               parrafo2.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
               
               documento.add(parrafo2);
               
               PdfPTable tablaEquipos = new PdfPTable(4);
               
               tablaEquipos.addCell("ID Equipo");
               tablaEquipos.addCell("Tipo");
               tablaEquipos.addCell("Marca");
               tablaEquipos.addCell("Estatus");
               
               try{
                   
                   Connection cn2 = Conexion.conectar();
                   PreparedStatement pst2 = cn2.prepareStatement(
                   "select id_equipo, tipo_equipo, marca, estatus from equipos where id_cliente = ?");
                   
                   pst2.setInt(1, IDcliente_update);
                   
                   ResultSet rs2 = pst2.executeQuery();
                   
                   if(rs2.next()){
                       
                       do{
                           
                           tablaEquipos.addCell(rs2.getString(1));
                           tablaEquipos.addCell(rs2.getString(2));
                           tablaEquipos.addCell(rs2.getString(3));
                           tablaEquipos.addCell(rs2.getString(4));
                           
                       } while(rs2.next());
                       
                       documento.add(tablaEquipos);
                       
                   } else {
                       System.err.println("Error al encontrar equipos");
                       JOptionPane.showMessageDialog(null, "No se encontraron equipos del cliente");
                   }
                   
               } catch(SQLException e){
                   System.err.println("Error en la conexion a la base de equipos" + e);
                   JOptionPane.showMessageDialog(null, "Error de onexion");
               }
               
                documento.close();
                JOptionPane.showMessageDialog(null, "Cliente creado correctamente");
                
            } catch(SQLException e ){
                System.err.println("Error en la conexion a la Base de Datos" + e);
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
            
        } catch(DocumentException | HeadlessException | IOException e){
            System.err.println("Error al generar pdf" + e);
            JOptionPane.showMessageDialog(null, "Error al generar PDF");
        }
        
    }//GEN-LAST:event_jButton_ImprimirReporteActionPerformed

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
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_ImprimirReporte;
    private javax.swing.JButton jButton_Regsitrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_UltimaModificacion;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_mail;
    private javax.swing.JLabel jLabel_telefono;
    private javax.swing.JScrollPane jScrollPane_equipos;
    private javax.swing.JTable jTable_equipos;
    private javax.swing.JTextField txt_UltimaModificacion;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    public void Limpiar(){
        txt_UltimaModificacion.setText("");
        txt_direccion.setText("");
        txt_mail.setText("");
        txt_nombre.setText("");
        txt_telefono.setText("");
    }

}
