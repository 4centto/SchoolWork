
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

public class GraficarMarcas extends javax.swing.JFrame {
    
    String user = "";
    int[] vector_marcas_cantidad = new int[11];
    String[] vector_marcas_nombre = new String[11];
    
    int hp, lenovo, dell, acer, apple, toshiba, brother, samsung, asus, alienware, xerox;

    public GraficarMarcas() {
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
            "select marca, count(marca) as Marcas from equipos group by marca");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                int posicion = 0;
                
                do{
                    
                    vector_marcas_nombre[posicion] = rs.getString(1);
                    vector_marcas_cantidad[posicion] = rs.getInt(2);
                    
                    if(vector_marcas_nombre[posicion].equalsIgnoreCase("Acer")){
                        acer = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("Alienware")){
                        alienware = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("Apple")){
                        apple = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("Asus")){
                        asus = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("Brother")){
                        brother = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("Dell")){
                        dell = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("HP")){
                        hp = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("Lenovo")){
                        lenovo = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("Samsung")){
                        samsung = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("Toshiba")){
                        toshiba = vector_marcas_cantidad[posicion];
                    } else if(vector_marcas_nombre[posicion].equalsIgnoreCase("Xerox")){
                        xerox = vector_marcas_cantidad[posicion];
                    }
                    
                    posicion++;
                    
                } while(rs.next());
                
            } else {
                System.err.println("No se encontraron los datos de las marcas");
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
            
        } catch(SQLException e){
            System.err.println("Error al recuperar el conteo de marcas " + e);
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
        jLabel1.setText("Grafica de Marcas");
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
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarMarcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        int total_marcas = acer + alienware + apple + asus + brother + dell + hp + lenovo + samsung + toshiba + xerox;
        
        int grados_acer = (acer * 360) / total_marcas;
        int grados_alienware = (alienware * 360) / total_marcas;
        int grados_apple = (apple * 360) / total_marcas;
        int grados_asus = (asus * 360) / total_marcas;
        int grados_brother = (brother * 360) / total_marcas;
        int grados_dell = (dell * 360) / total_marcas;
        int grados_hp = (hp * 360) / total_marcas;
        int grados_lenovo = (lenovo * 360) / total_marcas;
        int grados_samsung = (samsung * 360) / total_marcas;
        int grados_toshiba = (toshiba * 360) / total_marcas;
        int grados_xerox = (xerox * 360) / total_marcas;
        
        //Marca Acer (Morado)
        g.setColor(new Color(175, 122, 197));
        g.fillArc(25, 100, 270, 270, 0, grados_acer);
        g.fillRect(310, 120, 20, 20);
        g.drawString("Acer: " + acer ,340 ,135);
        
        //Marca alienware (Verde)
        g.setColor(new Color(0, 255, 0));
        g.fillArc(25, 100, 270, 270, grados_acer, grados_alienware);
        g.fillRect(310, 150, 20, 20);
        g.drawString("Alienware: " + alienware ,340 ,165);
        
        //Marca apple (Verde agua)
        g.setColor(new Color(0, 255, 255));
        g.fillArc(25, 100, 270, 270, grados_acer + grados_alienware, grados_apple);
        g.fillRect(310, 180, 20, 20);
        g.drawString("Apple: " + apple ,340 ,195);
        
        //Marca Asus (Azul)
        g.setColor(new Color(0, 0, 255));
        g.fillArc(25, 100, 270, 270, grados_acer + grados_alienware + grados_apple, grados_asus);
        g.fillRect(310, 210, 20, 20);
        g.drawString("Asus: " + asus ,340 ,225);
        
        //Marca Brother (Blanco)
        g.setColor(new Color(255, 255, 255));
        g.fillArc(25, 100, 270, 270, grados_acer + grados_alienware + grados_apple + grados_asus + grados_brother, grados_brother);
        g.fillRect(310, 240, 20, 20);
        g.drawString("Brother: " + brother ,340 ,255);
        
        //Marca Dell (Amarillo)
        g.setColor(new Color(247, 220, 111));
        g.fillArc(25, 100, 270, 270, grados_acer + grados_alienware + grados_apple + grados_asus + grados_brother + 
                grados_brother, grados_dell);
        g.fillRect(310, 270, 20, 20);
        g.drawString("Dell: " + dell ,340 ,285);
        
        //Marca HP (Azul Marino)
        g.setColor(new Color(21, 42, 160));
        g.fillArc(25, 100, 270, 270, grados_acer + grados_alienware + grados_apple + grados_asus + grados_brother + 
                grados_brother + grados_dell, grados_hp);
        g.fillRect(310, 300, 20, 20);
        g.drawString("HP: " + hp ,340 ,315);
        
        //Marca Lenovo (Naranja)
        g.setColor(new Color(215, 96, 0));
        g.fillArc(25, 100, 270, 270, grados_acer + grados_alienware + grados_apple + grados_asus + grados_brother + 
                grados_brother + grados_dell + grados_hp, grados_lenovo);
        g.fillRect(310, 330, 20, 20);
        g.drawString("Lenovo: " + lenovo ,340 ,345);
        
        //Marca Samsung (Rosa)
        g.setColor(new Color(215, 96, 140));
        g.fillArc(25, 100, 270, 270, grados_acer + grados_alienware + grados_apple + grados_asus + grados_brother + 
                grados_brother + grados_dell + grados_hp + grados_lenovo, grados_samsung);
        g.fillRect(430, 120, 20, 20);
        g.drawString("Samsung: " + samsung, 460, 135);
        
        //Marca Toshiba (Amarillo Canario)
        g.setColor(new Color(215, 196, 25));
        g.fillArc(25, 100, 270, 270, grados_acer + grados_alienware + grados_apple + grados_asus + grados_brother + 
                grados_brother + grados_dell + grados_hp + grados_lenovo + grados_samsung, grados_toshiba);
        g.fillRect(430, 150, 20, 20);
        g.drawString("Toshiba: " + toshiba, 460, 165);
        
        //Marca Xerox (Azul Celeste)
        g.setColor(new Color(93, 173, 226));
        g.fillArc(25, 100, 270, 270, grados_acer + grados_alienware + grados_apple + grados_asus + grados_brother + 
                grados_brother + grados_dell + grados_hp + grados_lenovo + grados_samsung + grados_toshiba, grados_xerox);
        g.fillRect(430, 180, 20, 20);
        g.drawString("Toshiba: " + toshiba, 460, 195);
        
        
    }
    
}
