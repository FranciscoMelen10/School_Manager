package presentacion;


//Datos
import datos.Dt_Usuario;


//Entidades
import entidades.Usuario;


//Librerias
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightContrastIJTheme;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * Francisco de Jesús Meléndez Simplina
 * 31/01/2023
 * 
 */

public class Frm_Login extends javax.swing.JFrame {
    
    //Datos
    private Dt_Usuario dt_user = new Dt_Usuario();
    
    //Entidades
    private Usuario user = new Usuario();

    public Frm_Login() {
        FlatSolarizedLightContrastIJTheme.setup();
        initComponents();
        Styles();
        SetDate();
    }
    
    private void Styles(){
        jLIniciar.putClientProperty("FlatLaf.styleClass", "h1" );
        //Styles FlatLaf
        UIManager.put( "Button.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );
        UIManager.put( "TabbedPane.showTabSeparators", true );
    }
    
    private void SetDate(){
        LocalDate now = LocalDate.now();
        int dia = now.getDayOfMonth();
        int mes = now.getMonthValue();
        int year = now.getYear();
        jLDate.setText(dia + "/" + mes + "/" + year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPRegister = new javax.swing.JPanel();
        jLIniciar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLDate = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTUsername = new javax.swing.JTextField();
        jTPassword = new javax.swing.JTextField();
        jBIngresar = new javax.swing.JButton();
        jLNuevaCuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(15, 76, 117));
        background.setPreferredSize(new java.awt.Dimension(670, 750));

        jPRegister.setBackground(new java.awt.Color(187, 225, 250));
        jPRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 10));

        jLIniciar.setForeground(new java.awt.Color(0, 0, 0));
        jLIniciar.setText("Iniciar sesión");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/AvatarLogin.png"))); // NOI18N

        jLDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLDate.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTUsername.setText("Username...");
        jTUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsernameMouseClicked(evt);
            }
        });
        jTUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsernameActionPerformed(evt);
            }
        });

        jTPassword.setText("Password...");
        jTPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPasswordMouseClicked(evt);
            }
        });
        jTPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPasswordActionPerformed(evt);
            }
        });

        jBIngresar.setBackground(new java.awt.Color(27, 38, 44));
        jBIngresar.setText("Ingresar");
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });

        jLNuevaCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLNuevaCuenta.setForeground(new java.awt.Color(0, 0, 0));
        jLNuevaCuenta.setText("Registra una cuenta nueva");
        jLNuevaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLNuevaCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLNuevaCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLNuevaCuentaMouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de usuario");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña de usuario");

        javax.swing.GroupLayout jPRegisterLayout = new javax.swing.GroupLayout(jPRegister);
        jPRegister.setLayout(jPRegisterLayout);
        jPRegisterLayout.setHorizontalGroup(
            jPRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegisterLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTPassword)
                        .addComponent(jTUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegisterLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegisterLayout.createSequentialGroup()
                        .addComponent(jBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegisterLayout.createSequentialGroup()
                        .addComponent(jLNuevaCuenta)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegisterLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegisterLayout.createSequentialGroup()
                        .addGroup(jPRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegisterLayout.createSequentialGroup()
                        .addComponent(jLIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        jPRegisterLayout.setVerticalGroup(
            jPRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegisterLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLNuevaCuenta)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jPRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsernameActionPerformed

    private void jTPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPasswordActionPerformed

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        //jTextField.getText().trim().isEmpty = evrifica que no este vacio y que no este vacio con espacios
        String username = jTUsername.getText();
        String clave = jTPassword.getText();
        
        if(jTUsername.getText().trim().isEmpty() || jTPassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene los cuadros faltantes", "Error al iniciar sesion" , JOptionPane.WARNING_MESSAGE);
        }
            else{   
                if(dt_user.validarUsuario(username,clave)){
                    JOptionPane.showMessageDialog (this, "El Usuario fue editado con éxito!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    Frm_Principal prin = new Frm_Principal();
                    prin.setVisible(true);
                }
                    else{
                        JOptionPane.showMessageDialog(null, "Datos incorrectos, intente con otro usuario", "Error al iniciar sesion" , JOptionPane.WARNING_MESSAGE);
                    }
            }
    }//GEN-LAST:event_jBIngresarActionPerformed

    private void jLNuevaCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNuevaCuentaMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_jLNuevaCuentaMouseClicked

    private void jTUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsernameMouseClicked
        // TODO add your handling code here:
        jTUsername.setText("");
    }//GEN-LAST:event_jTUsernameMouseClicked

    private void jTPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPasswordMouseClicked
        // TODO add your handling code here:
        jTPassword.setText("");
    }//GEN-LAST:event_jTPasswordMouseClicked

    private void jLNuevaCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNuevaCuentaMouseEntered
        // TODO add your handling code here:
        jLNuevaCuenta.setForeground(Color.blue);
    }//GEN-LAST:event_jLNuevaCuentaMouseEntered

    private void jLNuevaCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNuevaCuentaMouseExited
        // TODO add your handling code here:
        jLNuevaCuenta.setForeground(Color.black);
    }//GEN-LAST:event_jLNuevaCuentaMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        UIManager.put( "Button.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );
        UIManager.put( "TabbedPane.showTabSeparators", true );

        //Lights Flatlaf
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton jBIngresar;
    private javax.swing.JLabel jLDate;
    private javax.swing.JLabel jLIniciar;
    private javax.swing.JLabel jLNuevaCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPRegister;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTPassword;
    private javax.swing.JTextField jTUsername;
    // End of variables declaration//GEN-END:variables
}
