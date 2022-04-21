package clases;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Grafica extends javax.swing.JFrame {

    public Grafica() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("PRUEBA DE GRAFICA DE BARRAS");
        this.txt_candidato1.setBackground(new Color(200, 200, 200));
        this.txt_candidato2.setBackground(new Color(200, 200, 200));
        this.txt_candidato3.setBackground(new Color(200, 200, 200));
        this.btn_votos.setBackground(new Color(150, 150, 150));
    }

    boolean FLAG = false;
    int ACUM_Cand_uno = 0, ACUM_Cand_dos = 0, ACUM_Cand_tres = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_candidato1 = new javax.swing.JTextField();
        txt_candidato2 = new javax.swing.JTextField();
        txt_candidato3 = new javax.swing.JTextField();
        btn_votos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("PRUEBA DE GRAFICAS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("CANDIDATO1 ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("CANDIDATO 2");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("CANDIDATO 3");

        btn_votos.setText("SUMA DE VOTOS");
        btn_votos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_votosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_candidato3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_candidato2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_candidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btn_votos)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_candidato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_candidato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_candidato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_votos))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_votosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_votosActionPerformed
        FLAG = true;
        repaint();
    }//GEN-LAST:event_btn_votosActionPerformed

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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_votos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_candidato1;
    private javax.swing.JTextField txt_candidato2;
    private javax.swing.JTextField txt_candidato3;
    // End of variables declaration//GEN-END:variables

    public void paint(Graphics g) {
        super.paint(g);

        String uno = "", dos = "", tres = "";

        uno = txt_candidato1.getText();
        dos = txt_candidato2.getText();
        tres = txt_candidato3.getText();

        if (FLAG == true) {

            if (uno.isEmpty() || dos.isEmpty() || tres.isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "Debes ingresar por lo menos 0");
                
            } else {

                Logica logica = new Logica();

                int Candidato_uno = Integer.parseInt(txt_candidato1.getText());
                int Candidato_dos = Integer.parseInt(txt_candidato2.getText());
                int Candidato_tres = Integer.parseInt(txt_candidato3.getText());

                ACUM_Cand_uno += Candidato_uno;
                ACUM_Cand_dos += Candidato_dos;
                ACUM_Cand_tres += Candidato_tres;

                int ValorMayor = logica.MAYOR(ACUM_Cand_uno, ACUM_Cand_dos, ACUM_Cand_tres);

                int ancho_uno = (ACUM_Cand_uno * 250) / ValorMayor;
                int ancho_dos = (ACUM_Cand_dos * 250) / ValorMayor;
                int ancho_tres = (ACUM_Cand_tres * 250) / ValorMayor;

                g.setColor(new Color(75, 75, 75));
                g.drawString("Candidato 1 (" + ACUM_Cand_uno + ")  ", 20, 100);
                g.fillRect(120, 85, ancho_uno, 20);

                g.setColor(new Color(75, 75, 75));
                g.drawString("Candidato 2 (" + ACUM_Cand_dos + ")  ", 20, 130);
                g.fillRect(120, 115, ancho_dos, 20);

                g.setColor(new Color(75, 75, 75));
                g.drawString("Candidato 3 (" + ACUM_Cand_tres + ")  ", 20, 160);
                g.fillRect(120, 145, ancho_tres, 20);
                
                txt_candidato1.setText("0");
                txt_candidato2.setText("0");
                txt_candidato3.setText("0");

            }

        }
    }

}
