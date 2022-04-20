
package marcadoresdetennis;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Marcadores extends javax.swing.JFrame {
    
    public String jugador_Uno = "", jugador_Dos = ""; // Nombres de los jugadores
    String juegos_Uno = "0", juegos_Dos = "0"; // Cantidad de juegos ganados
    String puntos_Uno = "0", puntos_Dos = "0"; // Cantidades de puntos ganados
    
    int[] set_Uno = new int[3];
    int[] set_Dos = new int[3];
    
    String s_Uno = "", s_Dos = "";
    
    int contador = 0;
    int sets_jugados = 0;

    public Marcadores() {
        initComponents();
        
        //Obtenemos los nombres de los jugadores
        jugador_Uno = RegistroJugadores.jugador1;
        jugador_Dos = RegistroJugadores.jugador2;
        
        //Llenar los sets
        for(int i = 0; i < set_Uno.length; i++){
            set_Uno[i] = 0;
            set_Dos[i] = 0;
        }
        
        //Imprimir los sets
        for(int i = 0; i < set_Uno.length; i++){
            if(s_Uno.isEmpty()){
                s_Uno += " " + set_Uno[i];
                s_Dos += " " + set_Dos[i];
            } else {
                s_Uno += "   |   " + set_Uno[i];
                s_Dos += "   |   " + set_Dos[i];
            }
        }
        
        jLabel_setsUno.setText(s_Uno);
        jLabel_setsDos.setText(s_Dos);
        s_Uno = "";
        s_Dos = "";
        
        //Damos diseño a la interfaz
        setSize(600, 525);
        setTitle("Marcador principal");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Imprimimos los nombres de los jugadores
        jLabel_jugadorUno.setText(jugador_Uno);
        jLabel_jugadorDos.setText(jugador_Dos);
        
        //Imprimimos los valores de los sets y de los juegos
        jLabel_juegosUno.setText(String.valueOf(juegos_Uno));
        jLabel_juegosDos.setText(String.valueOf(juegos_Dos));
        jLabel_puntoUno.setText(String.valueOf(puntos_Uno));
        jLabel_puntoDos.setText(String.valueOf(puntos_Dos));
        
        //Llenado de la tabla de marcadores
        String[] apellido_uno = jugador_Uno.split(" ");
        String[] apellido_dos = jugador_Dos.split(" ");
        
        String[] inicial_uno = apellido_uno[0].split("");
        String[] inicial_dos = apellido_dos[0].split("");
        String abrev_uno = inicial_uno[0] + ". " + apellido_uno[1];
        String abrev_dos = inicial_dos[0] + ". " + apellido_dos[1];
        
        //Mostramos los nombres
        jLabel_ApellidoUno.setText(abrev_uno);
        jLabel_ApellidoDos.setText(abrev_dos);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel_ApellidoDos = new javax.swing.JLabel();
        jLabel_ApellidoUno = new javax.swing.JLabel();
        jLabel_setsUno = new javax.swing.JLabel();
        jLabel_setsDos = new javax.swing.JLabel();
        jLabel_separador = new javax.swing.JLabel();
        jLabel_separador1 = new javax.swing.JLabel();
        jLabel_separador2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_puntoDos = new javax.swing.JLabel();
        jLabel_puntoUno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_jugadorDos = new javax.swing.JLabel();
        jLabel_jugadorUno = new javax.swing.JLabel();
        jLabel_juegosDos = new javax.swing.JLabel();
        jLabel_juegosUno = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 300, 500);

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 0, 300, 500);

        jLabel_ApellidoDos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_ApellidoDos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ApellidoDos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_ApellidoDos.setText("jLabel5");
        getContentPane().add(jLabel_ApellidoDos);
        jLabel_ApellidoDos.setBounds(10, 450, 100, 17);

        jLabel_ApellidoUno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_ApellidoUno.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ApellidoUno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_ApellidoUno.setText("jLabel5");
        getContentPane().add(jLabel_ApellidoUno);
        jLabel_ApellidoUno.setBounds(10, 420, 100, 17);

        jLabel_setsUno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_setsUno.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_setsUno.setText("jLabel5");
        getContentPane().add(jLabel_setsUno);
        jLabel_setsUno.setBounds(120, 420, 90, 17);

        jLabel_setsDos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_setsDos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_setsDos.setText("jLabel5");
        getContentPane().add(jLabel_setsDos);
        jLabel_setsDos.setBounds(120, 450, 90, 17);

        jLabel_separador.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_separador.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel_separador.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_separador.setOpaque(true);
        getContentPane().add(jLabel_separador);
        jLabel_separador.setBounds(115, 420, 1, 50);

        jLabel_separador1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_separador1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel_separador1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_separador1.setOpaque(true);
        getContentPane().add(jLabel_separador1);
        jLabel_separador1.setBounds(10, 445, 205, 1);

        jLabel_separador2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_separador2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel_separador2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_separador2.setOpaque(true);
        getContentPane().add(jLabel_separador2);
        jLabel_separador2.setBounds(215, 420, 1, 50);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 280, 150, 1);

        jLabel_puntoDos.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel_puntoDos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_puntoDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_puntoDos.setText("0");
        getContentPane().add(jLabel_puntoDos);
        jLabel_puntoDos.setBounds(400, 290, 110, 50);

        jLabel_puntoUno.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel_puntoUno.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_puntoUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_puntoUno.setText("0");
        getContentPane().add(jLabel_puntoUno);
        jLabel_puntoUno.setBounds(100, 290, 110, 50);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 280, 150, 1);

        jLabel_jugadorDos.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_jugadorDos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel_jugadorDos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_jugadorDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_jugadorDos.setText("JUGADOR 2");
        jLabel_jugadorDos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel_jugadorDos);
        jLabel_jugadorDos.setBounds(320, 20, 270, 80);

        jLabel_jugadorUno.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_jugadorUno.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel_jugadorUno.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_jugadorUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_jugadorUno.setText("JUGADOR 1");
        jLabel_jugadorUno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel_jugadorUno);
        jLabel_jugadorUno.setBounds(20, 20, 270, 80);

        jLabel_juegosDos.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        jLabel_juegosDos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_juegosDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_juegosDos.setText("0");
        getContentPane().add(jLabel_juegosDos);
        jLabel_juegosDos.setBounds(380, 90, 150, 200);

        jLabel_juegosUno.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        jLabel_juegosUno.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_juegosUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_juegosUno.setText("0");
        getContentPane().add(jLabel_juegosUno);
        jLabel_juegosUno.setBounds(80, 90, 150, 200);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 10, 2, 350);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        puntucionJugadorUno();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        puntucionJugadorDos();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Marcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marcadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_ApellidoDos;
    private javax.swing.JLabel jLabel_ApellidoUno;
    private javax.swing.JLabel jLabel_juegosDos;
    private javax.swing.JLabel jLabel_juegosUno;
    private javax.swing.JLabel jLabel_jugadorDos;
    private javax.swing.JLabel jLabel_jugadorUno;
    private javax.swing.JLabel jLabel_puntoDos;
    private javax.swing.JLabel jLabel_puntoUno;
    private javax.swing.JLabel jLabel_separador;
    private javax.swing.JLabel jLabel_separador1;
    private javax.swing.JLabel jLabel_separador2;
    private javax.swing.JLabel jLabel_setsDos;
    private javax.swing.JLabel jLabel_setsUno;
    // End of variables declaration//GEN-END:variables
    
    public void puntucionJugadorUno(){
        if(puntos_Uno.equals("0")){
            puntos_Uno = "15";
        } else if(puntos_Uno.equals("15")){
            puntos_Uno = "30";
        } else if(puntos_Uno.equals("30")){
            puntos_Uno = "40";
        } else if(puntos_Uno.equals("40")){
            if(puntos_Dos.equals("40")){
                puntos_Uno = "AD";
                puntos_Dos = "";
            } else {
                puntos_Uno = "0";
                puntos_Dos = "0";
                int aux = Integer.parseInt(juegos_Uno);
                aux++;
                juegos_Uno = String.valueOf(aux);
                
                //Sacar la diferencia para saber si ya se cumplio o no el set
                int juego1 = Integer.parseInt(juegos_Uno);
                int juego2 = Integer.parseInt(juegos_Dos);
                if(juego1 >= 6 || juego2 >= 6){
                    if((juego1 - juego2) >= 2){
                        set_Uno[contador] = Integer.parseInt(juegos_Uno);
                        set_Dos[contador] = Integer.parseInt(juegos_Dos);
                        contador ++;
                        sets_jugados ++;
                        juegos_Uno = "0";
                        juegos_Dos = "0";
                        puntos_Uno = "0";
                        puntos_Dos = "0";
                        
                        //Imprimir los sets
                        for(int i = 0; i < set_Uno.length; i++){
                            if(s_Uno.isEmpty()){
                                s_Uno += " " + set_Uno[i];
                                s_Dos += " " + set_Dos[i];
                            } else {
                                s_Uno += "   |   " + set_Uno[i];
                                s_Dos += "   |   " + set_Dos[i];
                            }
                        }

                        jLabel_setsUno.setText(s_Uno);
                        jLabel_setsDos.setText(s_Dos);
                        s_Uno = "";
                        s_Dos = "";
                        
                        if(sets_jugados >= 2){
                            int resUno = 0;
                            int resDos = 0;
                            for(int i = 0; i < sets_jugados; i++){
                                if(set_Uno[i] > set_Dos[i]){
                                    resUno ++;
                                } else if(set_Dos[i] > set_Uno[i]){
                                    resDos ++;
                                }
                            }
                            
                            if(resUno > resDos){
                                JOptionPane.showMessageDialog(null, jugador_Uno + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                                
                            } else if(resDos > resUno){
                                JOptionPane.showMessageDialog(null, jugador_Dos + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                                
                            }
                            
                        }
                        
                    } else if((juego2 - juego1) >= 2){
                        set_Uno[contador] = Integer.parseInt(juegos_Uno);
                        set_Dos[contador] = Integer.parseInt(juegos_Dos);
                        contador ++;
                        sets_jugados ++;
                        juegos_Uno = "0";
                        juegos_Dos = "0";
                        puntos_Uno = "0";
                        puntos_Dos = "0";
                        
                        //Imprimir los sets
                        for(int i = 0; i < set_Uno.length; i++){
                            if(s_Uno.isEmpty()){
                                s_Uno += " " + set_Uno[i];
                                s_Dos += " " + set_Dos[i];
                            } else {
                                s_Uno += "   |   " + set_Uno[i];
                                s_Dos += "   |   " + set_Dos[i];
                            }
                        }

                        jLabel_setsUno.setText(s_Uno);
                        jLabel_setsDos.setText(s_Dos);
                        s_Uno = "";
                        s_Dos = "";
                        
                        if(sets_jugados >= 2){
                            int resUno = 0;
                            int resDos = 0;
                            for(int i = 0; i < sets_jugados; i++){
                                if(set_Uno[i] > set_Dos[i]){
                                    resUno ++;
                                } else if(set_Dos[i] > set_Uno[i]){
                                    resDos ++;
                                }
                            }
                            
                            if(resUno > resDos){
                                JOptionPane.showMessageDialog(null, jugador_Uno + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            } else if(resDos > resUno){
                                JOptionPane.showMessageDialog(null, jugador_Dos + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            }
                            
                        }
                        
                    }
                }
            }
        } else if(puntos_Uno.equals("") && puntos_Dos.equals("AD")){
            puntos_Uno = "40";
            puntos_Dos = "40";
        } else if(puntos_Uno.equals("AD")){
            int aux = Integer.parseInt(juegos_Uno);
            aux++;
            juegos_Uno = String.valueOf(aux);
            puntos_Uno = "0";
            puntos_Dos = "0";
            
            //Sacar la diferencia para saber si ya se cumplio o no el set
            int juego1 = Integer.parseInt(juegos_Uno);
            int juego2 = Integer.parseInt(juegos_Dos);
            if(juego1 >= 6 || juego2 >= 6){
                if((juego1 - juego2) >= 2){
                    set_Uno[contador] = Integer.parseInt(juegos_Uno);
                    set_Dos[contador] = Integer.parseInt(juegos_Dos);
                    contador ++;
                    sets_jugados ++;
                    juegos_Uno = "0";
                    juegos_Dos = "0";
                    puntos_Uno = "0";
                    puntos_Dos = "0";
                    
                    //Imprimir los sets
                    for(int i = 0; i < set_Uno.length; i++){
                        if(s_Uno.isEmpty()){
                            s_Uno += " " + set_Uno[i];
                            s_Dos += " " + set_Dos[i];
                        } else {
                            s_Uno += "   |   " + set_Uno[i];
                            s_Dos += "   |   " + set_Dos[i];
                        }
                    }
                    
                    jLabel_setsUno.setText(s_Uno);
                    jLabel_setsDos.setText(s_Dos);
                    s_Uno = "";
                    s_Dos = "";
                        
                    if(sets_jugados >= 2){
                            int resUno = 0;
                            int resDos = 0;
                            for(int i = 0; i < sets_jugados; i++){
                                if(set_Uno[i] > set_Dos[i]){
                                    resUno ++;
                                } else if(set_Dos[i] > set_Uno[i]){
                                    resDos ++;
                                }
                            }
                            
                            if(resUno > resDos){
                                JOptionPane.showMessageDialog(null, jugador_Uno + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            } else if(resDos > resUno){
                                JOptionPane.showMessageDialog(null, jugador_Dos + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            }
                            
                        }
                    
                } else if((juego2 - juego1) >= 2){
                    set_Uno[contador] = Integer.parseInt(juegos_Uno);
                    set_Dos[contador] = Integer.parseInt(juegos_Dos);
                    contador ++;
                    sets_jugados ++;
                    juegos_Uno = "0";
                    juegos_Dos = "0";
                    puntos_Uno = "0";
                    puntos_Dos = "0";
                    
                    //Imprimir los sets
                    for(int i = 0; i < set_Uno.length; i++){
                        if(s_Uno.isEmpty()){
                            s_Uno += " " + set_Uno[i];
                            s_Dos += " " + set_Dos[i];
                        } else {
                            s_Uno += "   |   " + set_Uno[i];
                            s_Dos += "   |   " + set_Dos[i];
                        }
                    }
                    
                    jLabel_setsUno.setText(s_Uno);
                    jLabel_setsDos.setText(s_Dos);
                    s_Uno = "";
                    s_Dos = "";
                    
                    if(sets_jugados >= 2){
                            int resUno = 0;
                            int resDos = 0;
                            for(int i = 0; i < sets_jugados; i++){
                                if(set_Uno[i] > set_Dos[i]){
                                    resUno ++;
                                } else if(set_Dos[i] > set_Uno[i]){
                                    resDos ++;
                                }
                            }
                            
                            if(resUno > resDos){
                                JOptionPane.showMessageDialog(null, jugador_Uno + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            } else if(resDos > resUno){
                                JOptionPane.showMessageDialog(null, jugador_Dos + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            }
                            
                        }
                    
                }
            }
        }
        
        jLabel_juegosUno.setText(String.valueOf(juegos_Uno));
        jLabel_juegosDos.setText(String.valueOf(juegos_Dos));
        jLabel_puntoUno.setText(String.valueOf(puntos_Uno));
        jLabel_puntoDos.setText(String.valueOf(puntos_Dos));
    }
    
    public void puntucionJugadorDos(){
        if(puntos_Dos.equals("0")){
            puntos_Dos = "15";
        } else if(puntos_Dos.equals("15")){
            puntos_Dos = "30";
        } else if(puntos_Dos.equals("30")){
            puntos_Dos = "40";
        } else if(puntos_Dos.equals("40")){
            if(puntos_Uno.equals("40")){
                puntos_Dos = "AD";
                puntos_Uno = "";
            } else {
                puntos_Dos = "0";
                puntos_Uno = "0";
                int aux = Integer.parseInt(juegos_Dos);
                aux++;
                juegos_Dos = String.valueOf(aux);
                
                //Sacar la diferencia para saber si ya se cumplio o no el set
                int juego1 = Integer.parseInt(juegos_Dos);
                int juego2 = Integer.parseInt(juegos_Uno);
                if(juego1 >= 6 || juego2 >= 6){
                    if((juego1 - juego2) >= 2){
                        set_Uno[contador] = Integer.parseInt(juegos_Uno);
                        set_Dos[contador] = Integer.parseInt(juegos_Dos);
                        contador ++;
                        sets_jugados ++;
                        juegos_Uno = "0";
                        juegos_Dos = "0";
                        puntos_Uno = "0";
                        puntos_Dos = "0";
                        
                        //Imprimir los sets
                        for(int i = 0; i < set_Uno.length; i++){
                            if(s_Uno.isEmpty()){
                                s_Uno += " " + set_Uno[i];
                                s_Dos += " " + set_Dos[i];
                            } else {
                                s_Uno += "   |   " + set_Uno[i];
                                s_Dos += "   |   " + set_Dos[i];
                            }
                        }

                        jLabel_setsUno.setText(s_Uno);
                        jLabel_setsDos.setText(s_Dos);
                        s_Uno = "";
                        s_Dos = "";
                        
                        if(sets_jugados >= 2){
                            int resUno = 0;
                            int resDos = 0;
                            for(int i = 0; i < sets_jugados; i++){
                                if(set_Uno[i] > set_Dos[i]){
                                    resUno ++;
                                } else if(set_Dos[i] > set_Uno[i]){
                                    resDos ++;
                                }
                            }
                            
                            if(resUno > resDos){
                                JOptionPane.showMessageDialog(null, jugador_Uno + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            } else if(resDos > resUno){
                                JOptionPane.showMessageDialog(null, jugador_Dos + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            }
                            
                        }
                        
                    } else if((juego2 - juego1) >= 2){
                        set_Uno[contador] = Integer.parseInt(juegos_Uno);
                        set_Dos[contador] = Integer.parseInt(juegos_Dos);
                        contador ++;
                        sets_jugados ++;
                        juegos_Uno = "0";
                        juegos_Dos = "0";
                        puntos_Uno = "0";
                        puntos_Dos = "0";
                        
                        //Imprimir los sets
                        for(int i = 0; i < set_Uno.length; i++){
                            if(s_Uno.isEmpty()){
                                s_Uno += " " + set_Uno[i];
                                s_Dos += " " + set_Dos[i];
                            } else {
                                s_Uno += "   |   " + set_Uno[i];
                                s_Dos += "   |   " + set_Dos[i];
                            }
                        }

                        jLabel_setsUno.setText(s_Uno);
                        jLabel_setsDos.setText(s_Dos);
                        s_Uno = "";
                        s_Dos = "";
                        
                        if(sets_jugados >= 2){
                            int resUno = 0;
                            int resDos = 0;
                            for(int i = 0; i < sets_jugados; i++){
                                if(set_Uno[i] > set_Dos[i]){
                                    resUno ++;
                                } else if(set_Dos[i] > set_Uno[i]){
                                    resDos ++;
                                }
                            }
                            
                            if(resUno > resDos){
                                JOptionPane.showMessageDialog(null, jugador_Uno + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            } else if(resDos > resUno){
                                JOptionPane.showMessageDialog(null, jugador_Dos + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            }
                            
                        }
                        
                    }
                }
                
            }
        } else if(puntos_Dos.equals("") && puntos_Uno.equals("AD")){
            puntos_Dos = "40";
            puntos_Uno = "40";
        } else if(puntos_Dos.equals("AD")){
            int aux = Integer.parseInt(juegos_Dos);
            aux++;
            juegos_Dos = String.valueOf(aux);
            puntos_Dos = "0";
            puntos_Uno = "0";
            
            //Sacar la diferencia para saber si ya se cumplio o no el set
            int juego1 = Integer.parseInt(juegos_Dos);
            int juego2 = Integer.parseInt(juegos_Uno);
            if(juego1 >= 6 || juego2 >= 6){
                if((juego1 - juego2) >= 2){
                    set_Uno[contador] = Integer.parseInt(juegos_Uno);
                    set_Dos[contador] = Integer.parseInt(juegos_Dos);
                    contador ++;
                    sets_jugados ++;
                    juegos_Uno = "0";
                    juegos_Dos = "0";
                    puntos_Uno = "0";
                    puntos_Dos = "0";
                    
                    //Imprimir los sets
                    for(int i = 0; i < set_Uno.length; i++){
                        if(s_Uno.isEmpty()){
                            s_Uno += " " + set_Uno[i];
                            s_Dos += " " + set_Dos[i];
                        } else {
                            s_Uno += "   |   " + set_Uno[i];
                            s_Dos += "   |   " + set_Dos[i];
                        }
                    }

                    jLabel_setsUno.setText(s_Uno);
                    jLabel_setsDos.setText(s_Dos);
                    s_Uno = "";
                    s_Dos = "";
                    
                    if(sets_jugados >= 2){
                            int resUno = 0;
                            int resDos = 0;
                            for(int i = 0; i < sets_jugados; i++){
                                if(set_Uno[i] > set_Dos[i]){
                                    resUno ++;
                                } else if(set_Dos[i] > set_Uno[i]){
                                    resDos ++;
                                }
                            }
                            
                            if(resUno > resDos){
                                JOptionPane.showMessageDialog(null, jugador_Uno + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            } else if(resDos > resUno){
                                JOptionPane.showMessageDialog(null, jugador_Dos + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            }
                            
                        }
                    
                } else if((juego2 - juego1) >= 2){
                    set_Uno[contador] = Integer.parseInt(juegos_Uno);
                    set_Dos[contador] = Integer.parseInt(juegos_Dos);
                    contador ++;
                    sets_jugados ++;
                    juegos_Uno = "0";
                    juegos_Dos = "0";
                    puntos_Uno = "0";
                    puntos_Dos = "0";
                    
                    //Imprimir los sets
                    for(int i = 0; i < set_Uno.length; i++){
                        if(s_Uno.isEmpty()){
                            s_Uno += " " + set_Uno[i];
                            s_Dos += " " + set_Dos[i];
                        } else {
                            s_Uno += "   |   " + set_Uno[i];
                            s_Dos += "   |   " + set_Dos[i];
                        }
                    }

                    jLabel_setsUno.setText(s_Uno);
                    jLabel_setsDos.setText(s_Dos);
                    s_Uno = "";
                    s_Dos = "";
                    
                    if(sets_jugados >= 2){
                            int resUno = 0;
                            int resDos = 0;
                            for(int i = 0; i < sets_jugados; i++){
                                if(set_Uno[i] > set_Dos[i]){
                                    resUno ++;
                                } else if(set_Dos[i] > set_Uno[i]){
                                    resDos ++;
                                }
                            }
                            
                            if(resUno > resDos){
                                JOptionPane.showMessageDialog(null, jugador_Uno + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            } else if(resDos > resUno){
                                JOptionPane.showMessageDialog(null, jugador_Dos + " es el ganador");
                                
                                RegistroJugadores rj = new RegistroJugadores();
                                rj.setVisible(true);
                                this.dispose();
                            }
                            
                        }
                    
                }
            }
        }
        
        jLabel_juegosUno.setText(String.valueOf(juegos_Uno));
        jLabel_juegosDos.setText(String.valueOf(juegos_Dos));
        jLabel_puntoUno.setText(String.valueOf(puntos_Uno));
        jLabel_puntoDos.setText(String.valueOf(puntos_Dos));
    }

}