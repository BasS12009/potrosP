/**
 * Disponibilidad.java
 * 
 * Pantalla de presentación que permite la funcionalidad de gestionar la
 * disponibilidad de los vehículos.
 */
package GUI;


/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Constructor creado por el compilador que permite inicializar los
     * componentes de la pantalla y se agregaron 2 métodos para alinear
     * el frame con la pantalla y asignarle un tamaño.
     */
    public Menu() {
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
        btnPrestamo = new javax.swing.JButton();
        btnSolicitarTraslado = new javax.swing.JButton();
        btnDevolucionTraslado = new javax.swing.JButton();
        btnTrasladoMaestros = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnDisponibilidad1 = new javax.swing.JButton();
        btnHistorialPrestamos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 164, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel1.setText("Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        btnPrestamo.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnPrestamo.setText("Solicitar Prestamo");
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 210, 50));

        btnSolicitarTraslado.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnSolicitarTraslado.setText("Solicitar Traslado");
        btnSolicitarTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarTrasladoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitarTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 210, 50));

        btnDevolucionTraslado.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnDevolucionTraslado.setText("Devolucion Traslado");
        btnDevolucionTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionTrasladoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDevolucionTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 210, 50));

        btnTrasladoMaestros.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnTrasladoMaestros.setText("Traslado Maestros");
        btnTrasladoMaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasladoMaestrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrasladoMaestros, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 210, 50));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 670, 40));

        btnDisponibilidad1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnDisponibilidad1.setForeground(new java.awt.Color(255, 255, 255));
        btnDisponibilidad1.setText("Disponibilidad");
        btnDisponibilidad1.setBorder(null);
        btnDisponibilidad1.setContentAreaFilled(false);
        btnDisponibilidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibilidad1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisponibilidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        btnHistorialPrestamos.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnHistorialPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorialPrestamos.setText("Historial ");
        btnHistorialPrestamos.setBorder(null);
        btnHistorialPrestamos.setContentAreaFilled(false);
        btnHistorialPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialPrestamosActionPerformed(evt);
            }
        });
        jPanel1.add(btnHistorialPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        // TODO add your handling code here:
        Prestamo prestamo = new Prestamo();

        prestamo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void btnSolicitarTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarTrasladoActionPerformed
        // TODO add your handling code here:
        Traslado traslado = new Traslado();
       
        traslado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSolicitarTrasladoActionPerformed

    private void btnTrasladoMaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasladoMaestrosActionPerformed
   
            // TODO add your handling code here:
            frmPrestampTrasladoProfes dddd = new frmPrestampTrasladoProfes();
            
            dddd.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_btnTrasladoMaestrosActionPerformed

    private void btnHistorialPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialPrestamosActionPerformed
        // TODO add your handling code here:

        HistorialPrestamo historialPrestamo = new HistorialPrestamo();
        
        historialPrestamo.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnHistorialPrestamosActionPerformed

    private void btnDisponibilidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibilidad1ActionPerformed
        // TODO add your handling code here:
        Disponibilidad disponibilidad = new Disponibilidad();
        
        disponibilidad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDisponibilidad1ActionPerformed

    private void btnDevolucionTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionTrasladoActionPerformed
        BusquedaTraslado busqueda = new BusquedaTraslado();
        busqueda.setVisible(true);
    }//GEN-LAST:event_btnDevolucionTrasladoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolucionTraslado;
    private javax.swing.JButton btnDisponibilidad1;
    private javax.swing.JButton btnHistorialPrestamos;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JButton btnSolicitarTraslado;
    private javax.swing.JButton btnTrasladoMaestros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
