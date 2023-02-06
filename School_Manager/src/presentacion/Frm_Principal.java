package presentacion;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.time.LocalDate;
import javax.imageio.ImageIO;


/**
 *
 * @author DELL
 */
public class Frm_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Principal
     */
    public Frm_Principal() {
        FlatNightOwlIJTheme.setup();
        initComponents();
        CargarImagen();
        this.setLocationRelativeTo(null);
        dimensionPantalla();
        SetDate();
    }
    
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
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelSubThings = new javax.swing.JPanel();
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
        Background.setPreferredSize(new java.awt.Dimension(1366, 768));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 76, 117));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Control general");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setText("Registros");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 240, 10));

        jLabel1.setText("Acerca de");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 700, -1, -1));

        jButton1.setText("Administracion");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 50));

        jButton2.setText("Administracion");
        jButton2.setBorder(null);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 50));

        jButton3.setText("Administracion");
        jButton3.setBorder(null);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 290, 50));

        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 290, 740));

        jPanelSubThings.setBackground(new java.awt.Color(50, 130, 184));

        javax.swing.GroupLayout jPanelSubThingsLayout = new javax.swing.GroupLayout(jPanelSubThings);
        jPanelSubThings.setLayout(jPanelSubThingsLayout);
        jPanelSubThingsLayout.setHorizontalGroup(
            jPanelSubThingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanelSubThingsLayout.setVerticalGroup(
            jPanelSubThingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        Background.add(jPanelSubThings, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 1080, 90));

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
                .addContainerGap(8, Short.MAX_VALUE)
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
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelSubThings;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpMin;
    // End of variables declaration//GEN-END:variables
}
