
package clases;

import Objetos.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    DefaultComboBoxModel modelo_Hora = new DefaultComboBoxModel();
    DefaultComboBoxModel modelo_Minutos = new DefaultComboBoxModel();
    DefaultTableModel modelo_horarios = new DefaultTableModel();
    DefaultTableModel modelo_reservadas = new DefaultTableModel();
    
    public static int valor;

    public VentanaPrincipal() {
        initComponents();
        
        setSize(500, 500);
        setTitle("Registro de horarios");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        //Llenado de las horas
        for(int i = 13; i <= 20; i++){
            modelo_Hora.addElement(i);
        }
        
        //Llenado de los minutos
        for(int i = 00; i <= 45; i += 15){
            modelo_Minutos.addElement(i);
        }
        
        jCombo_Horas.setModel(modelo_Hora);
        jCombo_minutos.setModel(modelo_Minutos);
        
        LlenadoTabla();
        LlenadoTablaReservados();
        
        jTable_Horarios.setEnabled(false);
        jTable_reservados.setEnabled(false); 
        
        jTable_Horarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                
                int fila = (int)(jTable_Horarios.rowAtPoint(e.getPoint())); // Obtener el valor de la fila
                int columna = 0; // Valor de la columna
                valor = (int)(modelo_horarios.getValueAt(fila, columna)); // Obtener el valor que esta en la fila y columna
                
                new PedirNombre().setVisible(true);
                dispose();
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_reservados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Horarios = new javax.swing.JTable();
        jCombo_Horas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCombo_minutos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_reservados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable_reservados);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 450, 110));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("RESERVADOS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTable_Horarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Horarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 170));

        getContentPane().add(jCombo_Horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 50, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        getContentPane().add(jCombo_minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 50, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Minutos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton1.setText("REGISTRAR HORARIO");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE USUARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 6, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Registro de horarios
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int hora = Integer.parseInt(jCombo_Horas.getSelectedItem().toString());
        int minutos = Integer.parseInt(jCombo_minutos.getSelectedItem().toString());
        
        //Ahora se ingresan los valores dentro de la bd
        try{
            
            Connection cn = Conexion.Conexion();
            PreparedStatement pst = cn.prepareStatement("INSERT INTO horario VALUES (?,?,?,?)");
            
            pst.setInt(1, 0);
            pst.setString(2, "NO");
            pst.setInt(3, hora);
            pst.setInt(4, minutos);
            
            pst.executeUpdate();
            cn.close();
            
            JOptionPane.showMessageDialog(null, "¡Horario agregado!");
            
        } catch(SQLException e){
            System.err.println("Error al ingresar horario " + e);
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        Actualizar();
        
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCombo_Horas;
    private javax.swing.JComboBox<String> jCombo_minutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_Horarios;
    private javax.swing.JTable jTable_reservados;
    // End of variables declaration//GEN-END:variables

    private void Actualizar(){
        modelo_horarios.setRowCount(0);
        
        //Llenado de la tabla con los horarios disponibles
        try{
            
            Connection cn = Conexion.Conexion();
            PreparedStatement pst = cn.prepareStatement("SELECT id_horario, hora, minutos FROM horario WHERE ocupado = 'NO'"
                    + " ORDER BY hora, minutos");
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                
                Object[] objeto = new Object[2];
                
                for(int i = 0; i < 2; i++){
                    if(i == 0){
                        objeto[i] = rs.getObject(i + 1);
                    } else {
                        String aux = String.valueOf(rs.getObject(i + 1));
                        String aux_dos = String.valueOf(rs.getObject(i + 2));
                        String aux_tres = aux + ":" + aux_dos;
                        objeto[i] = aux_tres;
                    }
                }
                modelo_horarios.addRow(objeto);
            }
            
            jTable_Horarios.setModel(modelo_horarios);
            
        } catch(SQLException e){
            System.err.println("Error al llenar la tabla de horarios disponibles " + e);
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
    }
    
    private void LlenadoTabla(){
        //Llenado de la tabla con los horarios disponibles
        try{
            
            Connection cn = Conexion.Conexion();
            PreparedStatement pst = cn.prepareStatement("SELECT id_horario, hora, minutos FROM horario WHERE ocupado = 'NO'"
                    + " ORDER BY hora, minutos");
            
            ResultSet rs = pst.executeQuery();
            
            modelo_horarios.addColumn("ID");
            modelo_horarios.addColumn("Hora");
            
            while(rs.next()){
                
                Object[] objeto = new Object[2];
                
                for(int i = 0; i < 2; i++){
                    if(i == 0){
                        objeto[i] = rs.getObject(i + 1);
                    } else {
                        String aux = String.valueOf(rs.getObject(i + 1));
                        String aux_dos = String.valueOf(rs.getObject(i + 2));
                        String aux_tres = aux + ":" + aux_dos;
                        objeto[i] = aux_tres;
                    }
                }
                modelo_horarios.addRow(objeto);
            }
            
            jTable_Horarios.setModel(modelo_horarios);
            
        } catch(SQLException e){
            System.err.println("Error al llenar la tabla de horarios disponibles " + e);
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
    }
    
    private void LlenadoTablaReservados(){
        //Llenado de la tabla con los horarios disponibles
        try{
            
            Connection cn = Conexion.Conexion();
            PreparedStatement pst = cn.prepareStatement("SELECT id_reserva, nombre_cliente, hora FROM reservadas ORDER BY hora");
            
            ResultSet rs = pst.executeQuery();
            
            modelo_reservadas.addColumn("ID");
            modelo_reservadas.addColumn("Nombre");
            modelo_reservadas.addColumn("Hora");
            
            while(rs.next()){
                
                Object[] objeto = new Object[3];
                
                for(int i = 0; i < 3; i++){
                    objeto[i] = rs.getObject(i + 1);
                }
                modelo_reservadas.addRow(objeto);
            }
            
            jTable_reservados.setModel(modelo_reservadas);
            
        } catch(SQLException e){
            System.err.println("Error al llenar la tabla de horarios disponibles " + e);
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
    }
    
}
