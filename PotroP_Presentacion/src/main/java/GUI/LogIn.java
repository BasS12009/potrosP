/**
 * LogIn.java
 * 
 * Pantalla de presentación que permite la funcionalidad de iniciar sesión en la
 * aplicación.
 */
package GUI;



import conexion.ConexionBDM;
import exception.FachadaException;
import fachada.LogginFCD;
import interfaz.ILogginFCD;
import javax.swing.JOptionPane;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class LogIn extends javax.swing.JFrame {
    
    /**
     * Constructor creado por el compilador que permite inicializar los
     * componentes de la pantalla y se agregaron 2 métodos para alinear
     * el frame con la pantalla y asignarle un tamaño.
     */
    public LogIn(){
                
        initComponents();
        this.setLocationRelativeTo(this);
        this.setSize(670, 550);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        bttIniciarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 164, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio de Sesion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setText("Correo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, 30));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 210, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 210, 30));

        bttIniciarSesion.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        bttIniciarSesion.setText("Iniciar Sesion");
        bttIniciarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bttIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(bttIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 150, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoPotroSinFondo (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 150, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttIniciarSesionActionPerformed
        ILogginFCD login = new LogginFCD();

        String correo = txtCorreo.getText();

        // Obtener la contraseña como un arreglo de caracteres
        char[] passwordChars = txtContraseña.getPassword();

        try {
            // Convertir el arreglo de caracteres a una cadena
            String contraseña = new String(passwordChars);

            // Limpiar el arreglo de caracteres para mayor seguridad
            java.util.Arrays.fill(passwordChars, '\0');

            // Validar las credenciales
            if (login.existe(correo, contraseña)) {
                Menu menu = new Menu();
                menu.setVisible(true);
                this.dispose();
            }
            
            // Limpiar la cadena de la contraseña (difícil debido a la inmutabilidad de las cadenas)
            contraseña = null;
            
        } 
        catch (FachadaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        finally {
            // Asegurarse de que la contraseña se limpie incluso si ocurre una excepción
            java.util.Arrays.fill(passwordChars, '\0');
}
   
    }//GEN-LAST:event_bttIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
