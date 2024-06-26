/**
 * Prestamo.java
 *
 * Pantalla de presentación que permite la funcionalidad de gestionar las
 * solicitudes de los préstamos de vehículos.
 */
package GUI.devolucionTraslado;

import GUI.*;
import excepcion.FachadaException;
import fachada.DevolucionFCD;
import guardar.Guardar;
import interfaz.IDevolucionFCD;
import javax.swing.JOptionPane;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class BusquedaTraslado extends javax.swing.JFrame {

    /**
     * Constructor creado por el compilador que permite inicializar los
     * componentes de la pantalla y se agregaron 2 métodos para alinear el frame
     * con la pantalla y asignarle un tamaño.
     */
    public BusquedaTraslado() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setSize(390, 220);

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
        btnBuscar = new javax.swing.JButton();
        txfTraslado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 164, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel1.setText("Ingrese el numero de traslado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, 30));

        txfTraslado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txfTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 
     * Realiza las acciones correspondientes cuando se hace clic en el botón
     * "Solicitar". Instancia las clases ILoanFCD y IEmpleadoFCD, declara
     * variables necesarias, y crea un objeto PrestamoDTO. Valida los datos del
     * préstamo y la disponibilidad del empleado y el vehículo. Si todo está
     * correcto, agrega el préstamo utilizando el método agregar de ILoanFCD.
     * Captura PropsException y LoanException y muestra un mensaje de error en
     * caso de excepción.
     *
     * @param evt El evento que desencadenó esta acción.
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try{
        //instanciamos las clases que necesitamos    
        IDevolucionFCD devolucionFCD = new DevolucionFCD();
        Guardar guardar = new Guardar();
        
        //instanciamos los frames 
        DevolucionTraslado devolucion = new DevolucionTraslado();
        Menu menu = new Menu();
            
        //convertimos el campo de el numero de traslado a un interger
        int numeroTraslado = Integer.parseInt(txfTraslado.getText());
        
        if(devolucionFCD.existe(numeroTraslado)){
            //guardamos el numero de traslado
            guardar.setNumDevolucion(numeroTraslado);

            //hacemos visible el frame de devolucion
            devolucion.setVisible(true);
        
            //cerramos las ventanas abiertas
            menu.dispose();
            this.dispose();
        }
        }
        catch(FachadaException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txfTraslado;
    // End of variables declaration//GEN-END:variables
}
