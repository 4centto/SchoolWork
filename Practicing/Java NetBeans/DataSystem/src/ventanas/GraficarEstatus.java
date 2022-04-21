
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Graphics;
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

public class GraficarEstatus extends javax.swing.JFrame {
    
    String user = "";
    int NuevoIngreso, NoReparado, EnRevision, Reparado, Entregado;
    
    String[] VectorEstatus_Nombre = new String[5];
    int[] VectorEstatus_Cantidad = new int[5];

    public GraficarEstatus() {
        initComponents();
        user = Login.user;
        
        setTitle("Tecnico - Sesion de " + user);
        setLocationRelativeTo(null);
        setSize(550, 450);
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
            "select estatus, count(estatus) as Cantidad from equipos group by estatus");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                int posicion = 0;
                
                do{
                    
                    VectorEstatus_Nombre[posicion] = rs.getString(1);
                    VectorEstatus_Cantidad[posicion] = rs.getInt(2);
                    
                    if(VectorEstatus_Nombre[posicion].equalsIgnoreCase("En revision")){
                        EnRevision = VectorEstatus_Cantidad[posicion];
                    } else if(VectorEstatus_Nombre[posicion].equalsIgnoreCase("Entregado")){
                        Entregado = VectorEstatus_Cantidad[posicion];
                    } else if(VectorEstatus_Nombre[posicion].equalsIgnoreCase("No reparado")){
                        NoReparado = VectorEstatus_Cantidad[posicion];
                    } else if(VectorEstatus_Nombre[posicion].equalsIgnoreCase("Nuevo ingreso")){
                        NuevoIngreso = VectorEstatus_Cantidad[posicion];
                    } else if(VectorEstatus_Nombre[posicion].equalsIgnoreCase("Reparado")){
                        Reparado = VectorEstatus_Cantidad[posicion];
                    } else if(VectorEstatus_Nombre[posicion].equalsIgnoreCase("Entregado")){
                        Reparado = VectorEstatus_Cantidad[posicion];
                    }
                    
                    posicion++;
                    
                } while(rs.next());
                
            } else {
                System.err.println("No se encontraron los estatus");
                JOptionPane.showMessageDialog(null, "No se encontraron los estatus");
            }
            
        } catch(SQLException e){
            System.err.println("Error al recuperar el conteo de estatus de los equipos " + e);
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        repaint();
        
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
        jLabel_footer = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grafica de Estatus");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel_footer.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_footer.setText("Creado por Sandunga's Company");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarEstatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    // End of variables declaration//GEN-END:variables

    public int EstatusMasRepetido(int NuevoIngreso, int NoReparado, int EnRevision, int Reparado, int Entregado){
        
        if(NuevoIngreso > NoReparado && NuevoIngreso > EnRevision && NuevoIngreso > Reparado && NuevoIngreso > Entregado){
            return NuevoIngreso;
        } else if(NoReparado > EnRevision && NoReparado > Reparado && NoReparado > Entregado){
            return NoReparado;
        } else if(EnRevision > Reparado && EnRevision > Entregado){
            return EnRevision;
        } else if(Reparado > Entregado){
            return Reparado;
        } else {
            return Entregado;
        }
        
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        int Estatus_Mas_Repetido = EstatusMasRepetido(NuevoIngreso, NoReparado, EnRevision, Reparado, Entregado);
        
        int largo_NuevoIngreso = (NuevoIngreso * 400) / Estatus_Mas_Repetido;
        int largo_NoReparado = (NoReparado * 400) / Estatus_Mas_Repetido;
        int largo_EnRevision = (EnRevision * 400) / Estatus_Mas_Repetido;
        int largo_Reparado = (Reparado * 400) / Estatus_Mas_Repetido;
        int largo_Entregado = (Entregado * 400) / Estatus_Mas_Repetido;
        
        //Amarillo (Nuevo Ingreso)
        g.setColor(Color.yellow);
        g.fillRect(100, 100, largo_NuevoIngreso, 40);
        g.drawString("Nuevo ingreso", 10, 118);
        g.drawString("Cantidad: " + NuevoIngreso, 10, 133);
        
        //Rojo (No Reparado)
        g.setColor(Color.red);
        g.fillRect(100, 150, largo_NoReparado, 40);
        g.drawString("No reparado", 10, 168);
        g.drawString("Cantidad: " + NoReparado, 10, 183);
        
        //Negro (En Revision)
        g.setColor(Color.black);
        g.fillRect(100, 200, largo_EnRevision, 40);
        g.drawString("En revision", 10, 218);
        g.drawString("Cantidad: " + EnRevision, 10, 233);
        
        //Blanco (Reparado)
        g.setColor(Color.white);
        g.fillRect(100, 250, largo_Reparado, 40);
        g.drawString("Reparado", 10, 268);
        g.drawString("Cantidad: " + Reparado, 10, 283);
        
        //Verde (Entregado)
        g.setColor(Color.green);
        g.fillRect(100, 300, largo_Entregado, 40);
        g.drawString("Entregado", 10, 318);
        g.drawString("Cantidad: " + Entregado, 10, 333);
    }

}
