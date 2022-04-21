
package pruebabasededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PruebaBaseDeDatos extends javax.swing.JFrame {

    public PruebaBaseDeDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Prueba");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("CONTROL DE MERCANCIA");

        jLabel2.setText("Cantidad: ");

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });

        jButton1.setText("COMPRASTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VENDISTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Clave: ");

        jButton3.setText("REGISTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_clave)
                                    .addComponent(txt_cantidad)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        
    }//GEN-LAST:event_txt_cantidadActionPerformed

    
    //Boton para ingresar mercancia
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from registroinventario where ID = ?");
            
            pst.setString(1, txt_clave.getText());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                int val_ant = Integer.parseInt(rs.getString("Cantidad"));
                int val_nue = Integer.parseInt(txt_cantidad.getText());
                
                int total = val_ant + val_nue;
                
                Ingresar(total);
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el articulo");
            }
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    //Boton para registrar un nuevo producto
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into registroinventario values(?, ?)");
            
            pst.setString(1, "0");
            pst.setString(2, txt_cantidad.getText());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "¡REGISTO EXITOSO!");
            txt_cantidad.setText("");
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from registroinventario where ID = ?");
            
            pst.setString(1, txt_clave.getText());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                int val_ant = Integer.parseInt(rs.getString("Cantidad"));
                int val_nue = Integer.parseInt(txt_cantidad.getText());
                
                int total = val_ant - val_nue;
                
                Retirar(total);
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el articulo");
            }
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
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
            java.util.logging.Logger.getLogger(PruebaBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaBaseDeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_clave;
    // End of variables declaration//GEN-END:variables

    //Metodo para ingresar las cantidades de productos
    public void Ingresar(int x){
        
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
            PreparedStatement pst = cn.prepareStatement("update registroinventario set Cantidad = ? where ID = ?");
            
            pst.setString(1, String.valueOf(x));
            pst.setString(2, txt_clave.getText());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se agregaron nuevas existencias en " + txt_clave.getText());
            txt_cantidad.setText("");
            txt_clave.setText("");
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al ingresar la nueva cantidad de producto");
        }
        
    }
    
    //Metodo para retirar existencias de un producto
    public void Retirar(int x){
        
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
            PreparedStatement pst = cn.prepareStatement("update registroinventario set Cantidad = ? where ID = ?");
            
            pst.setString(1, String.valueOf(x));
            pst.setString(2, txt_clave.getText());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se vendieron existencias en " + txt_clave.getText());
            txt_cantidad.setText("");
            txt_clave.setText("");
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al ingresar la nueva cantidad de producto");
        }
        
    }

}
