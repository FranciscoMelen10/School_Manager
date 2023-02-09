package presentacion;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaContrastIJTheme;
import presentacion_administracion.Frm_Things;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author DELL
 */
public class Frm_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Principal
     */
    
    
    public Frm_Principal() {
        FlatDraculaContrastIJTheme.setup();
        initComponents();
        CargarImagen();
        this.setLocationRelativeTo(null);
        dimensionPantalla();
        SetDate();
    }
    
    
    //Funciones

    private void SetDate(){
        LocalDate now = LocalDate.now();
        int dia = now.getDayOfMonth();
        int mes = now.getMonthValue();
        int year = now.getYear();
        jLFecha.setText(dia + "/" + mes + "/" + year);
    }
    
    private void dimensionPantalla(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension size_pantalla = tk.getScreenSize();
        double widht = size_pantalla.getWidth();
        double height = size_pantalla.getHeight();        
        System.out.println(widht + "X" + height );
    }
    
    private void CargarImagen(){
        try {
            Image img = ImageIO.read(new File("School Manager Icon.png"));
            this.setIconImage(img);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
    private void CargarThing(JPanel jp){
        jp.setSize(1070, 740);
        jp.setLocation(0, 0);
        jPContenedor.removeAll();
        jPContenedor.add(jp, BorderLayout.CENTER);
        jPContenedor.revalidate();
        jPContenedor.repaint();
    }
        
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jbAdministracion = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabelFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPContenedor = new javax.swing.JPanel();
        jpMin = new javax.swing.JPanel();
        jLCerrar = new javax.swing.JLabel();
        jLMinimizar = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Manager");
        setAutoRequestFocus(false);
        setExtendedState(6);
        setLocationByPlatform(true);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMinimumSize(new java.awt.Dimension(1360, 780));
        Background.setPreferredSize(new java.awt.Dimension(1360, 780));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(20, 40, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("School Manager ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 270, 10));

        jButton2.setBackground(new java.awt.Color(39, 73, 109));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Acerca De.png"))); // NOI18N
        jButton2.setText("Acerca De");
        jButton2.setBorder(null);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 290, 70));

        jbAdministracion.setBackground(new java.awt.Color(39, 73, 109));
        jbAdministracion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jbAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Admistracion.png"))); // NOI18N
        jbAdministracion.setText("Administracion");
        jbAdministracion.setBorder(null);
        jbAdministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdministracionActionPerformed(evt);
            }
        });
        jPanel2.add(jbAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 290, 70));

        jButton4.setBackground(new java.awt.Color(39, 73, 109));
        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Gestion.png"))); // NOI18N
        jButton4.setText("Gestión");
        jButton4.setBorder(null);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 290, 70));

        jButton5.setBackground(new java.awt.Color(39, 73, 109));
        jButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Economia.png"))); // NOI18N
        jButton5.setText("Economía");
        jButton5.setBorder(null);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 290, 70));

        jLabelFoto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setText("Foto escuela");
        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jLabelFoto.setMaximumSize(new java.awt.Dimension(60, 15));
        jLabelFoto.setMinimumSize(new java.awt.Dimension(60, 15));
        jLabelFoto.setPreferredSize(new java.awt.Dimension(60, 15));
        jPanel2.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 130, 140));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre de la Escuela");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, 30));

        jButton3.setBackground(new java.awt.Color(39, 73, 109));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Datos Escuela.png"))); // NOI18N
        jButton3.setText("Datos de escuela");
        jButton3.setBorder(null);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 290, 70));

        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 290, 740));

        jPContenedor.setBackground(new java.awt.Color(50, 130, 184));

        javax.swing.GroupLayout jPContenedorLayout = new javax.swing.GroupLayout(jPContenedor);
        jPContenedor.setLayout(jPContenedorLayout);
        jPContenedorLayout.setHorizontalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPContenedorLayout.setVerticalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        Background.add(jPContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 1070, 740));

        jLCerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLCerrar.setText("X");
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCerrarMouseExited(evt);
            }
        });

        jLMinimizar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLMinimizar.setText("-");
        jLMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseExited(evt);
            }
        });

        jLFecha.setBackground(new java.awt.Color(255, 255, 255));
        jLFecha.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLFecha.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpMinLayout = new javax.swing.GroupLayout(jpMin);
        jpMin.setLayout(jpMinLayout);
        jpMinLayout.setHorizontalGroup(
            jpMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMinLayout.createSequentialGroup()
                .addContainerGap(664, Short.MAX_VALUE)
                .addComponent(jLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(502, 502, 502)
                .addComponent(jLMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLCerrar)
                .addGap(35, 35, 35))
        );
        jpMinLayout.setVerticalGroup(
            jpMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCerrar)
                        .addComponent(jLMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        Background.add(jpMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void jLCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseEntered
        // TODO add your handling code here:
        jLCerrar.setForeground(Color.red);
        jLCerrar.setBackground(Color.white);
    }//GEN-LAST:event_jLCerrarMouseEntered

    private void jLCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseExited
        // TODO add your handling code here:
        jLCerrar.setForeground(Color.white);
        jLCerrar.setBackground(Color.white);
        
    }//GEN-LAST:event_jLCerrarMouseExited

    private void jLMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLMinimizarMouseClicked

    private void jLMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseEntered
        // TODO add your handling code here:
        jLMinimizar.setForeground(Color.blue);
        jLMinimizar.setBackground(Color.blue);
    }//GEN-LAST:event_jLMinimizarMouseEntered

    private void jLMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseExited
        // TODO add your handling code here:
        jLMinimizar.setForeground(Color.white);
        jLMinimizar.setBackground(Color.white);
    }//GEN-LAST:event_jLMinimizarMouseExited

    private void jbAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdministracionActionPerformed
        // TODO add your handling code here:
        Frm_Things frm_thing = new Frm_Things();
        CargarThing(frm_thing.sizePanelThing());
    }//GEN-LAST:event_jbAdministracionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //Styles FlatLaf[102,204,255]
//        UIManager.put( "Button.arc", 999 );
//        UIManager.put( "TextComponent.arc", 999 );
//        UIManager.put( "TabbedPane.showTabSeparators", true );

        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPContenedor;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAdministracion;
    private javax.swing.JPanel jpMin;
    // End of variables declaration//GEN-END:variables
}
