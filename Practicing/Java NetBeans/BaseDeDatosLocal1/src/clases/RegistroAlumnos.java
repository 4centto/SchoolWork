
package clases;
import java.sql.*;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import java.io.IOException;

public class RegistroAlumnos extends javax.swing.JFrame {

    public RegistroAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.label_status.setVisible(false);
        this.setTitle("BD");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_grupo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Grupo: ");

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el codigo del alumno: ");

        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_status.setText("Registro Existoso");

        jButton5.setText("GENERAR REPORTE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_grupo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                    .addComponent(txt_nombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(label_status))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_codigo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(label_status)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Insertar elementos a la base de datos
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into alumnos values(?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_grupo.getText().trim());
            pst.executeUpdate();

            txt_nombre.setText("");
            txt_grupo.setText("");

            label_status.setText("Registro Exitoso");
            label_status.setVisible(true);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    //Buscar elementos de la base de datos
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try{

            Connection cn;
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from alumnos where ID = ?");

            pst.setString(1, txt_codigo.getText().trim());

            ResultSet rs;
            rs = pst.executeQuery();

            if(rs.next()){
                txt_nombre.setText(rs.getString("NombreAlumno"));
                txt_grupo.setText(rs.getString("Grupo"));
                
                label_status.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    //Boton que modifica los datos de la tabla
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try{
            
            String ID = txt_codigo.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("update alumnos set NombreAlumno = ?, Grupo = ? where ID = " + ID);
            
            pst.setString(1, txt_nombre.getText().trim());
            pst.setString(2, txt_grupo.getText().trim());
            pst.executeUpdate();
            
            label_status.setVisible(true);
            label_status.setText("Modificacion \n "
                    + " Exitosa");
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Conexion");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Boton que elimina algun elemento de la tabla
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from alumnos where ID = ?");
            
            pst.setString(1, txt_codigo.getText().trim());
            pst.executeUpdate();
            
            txt_nombre.setText("");
            txt_grupo.setText("");
            txt_codigo.setText("");
            
            label_status.setText("Eliminado");
            label_status.setVisible(true);
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    //Boton que genera el pdf
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Document documento = new Document();
        
        try{
            String ruta = System.getProperty("user.home");
            
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Alumnos.pdf"));
            
            Image header = Image.getInstance("src/img/StarWars.jpg");
            header.scaleToFit(600, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Formato creado por Ivan \n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLDITALIC, BaseColor.DARK_GRAY));
            parrafo.add("ALUMNOS REGISTRADOS \n\n");
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Código");
            tabla.addCell("Alumno");
            tabla.addCell("Grupo");
            
            try{
                
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from alumnos");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    
                    do{
                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        
                    } while(rs.next());
                    
                    documento.add(tabla);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Lo siento, ocurrio un problema");
                }
                
            } catch(DocumentException | HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null, "Error de Conexion");
            }
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado correctamente");
            
        } catch(DocumentException | HeadlessException | FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema con la generacion del pdf");
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error en la imagen " + e);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_grupo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
