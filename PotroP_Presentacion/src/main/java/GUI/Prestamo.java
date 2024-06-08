/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DTO.PrestamoDTO;
import DTO.VehiculoDTO;
import Interfaz.IEmpleadoFCD;
import Interfaz.IVehiculoFCD;
import com.toedter.calendar.JDateChooser;
import excepcion.LoanException;
import excepcion.PropsException;
import fachada.EmpleadoFCD;
import fachada.LoanFCD;
import fachada.VehiculoFCD;
import guardar.Guardar;
import interfaz.ILoanFCD;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author diana
 */
public class Prestamo extends javax.swing.JFrame {
    


    
    /**
     * Creates new form Prestamo
     */
    public Prestamo() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setSize(670, 550);

        //cargamos las configuraciones iniciales de la pantalla
        configuracionInicial();
        
    }

    private void configuracionInicial() {
          IVehiculoFCD vehiculo = new VehiculoFCD(); 
        
          //centramos la pantalla
          this.setLocationRelativeTo(this);
          //configuramos las dimenciones de la pantalla
          this.setSize(670, 550);
          
          //ocultamos la tabla
          scrolLTBLDATOS.setVisible(false);
          tblEmpleado.setVisible(false);
          try{
              vehiculo.llenarCBX(cbxVehiculo);
          }
          catch(PropsException e){
              System.out.println("problemas al cargar el combobox");
          }
    }

    public LocalDate convertir(JDateChooser dateChooser) {
        try{
        Date date = dateChooser.getDate();
        if (date != null) {
            return date.toInstant()
                       .atZone(ZoneId.systemDefault())
                       .toLocalDate();
        }
        return null;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "no se pudo convertir a local date");
        }
        return null;
    }

    public String obtenerPlaca(JComboBox box){
        VehiculoDTO vehiculo = (VehiculoDTO) box.getSelectedItem();
        String placa = vehiculo.getPlaca();
        return placa;
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
        txfMotivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dcFin = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dcInicio = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cbxVehiculo = new javax.swing.JComboBox<>();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnComprobar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSolicitar = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        scrolLTBLDATOS = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 164, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel1.setText("Solicitud Prestamo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setText("Motivo de la solicitud:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        jPanel1.add(txfMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, 60));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setText("Periodo de prestamo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));
        jPanel1.add(dcFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setText("Inicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setText("Fin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));
        jPanel1.add(dcInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel6.setText("Tipo de vehiculo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        cbxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Modelo ", "Tipo" }));
        jPanel1.add(cbxVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 200, 30));

        lblID.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lblID.setText("ID:");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 130, -1));

        btnComprobar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnComprobar.setText("Comprobar");
        btnComprobar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 100, 30));

        btnRegresar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 130, 30));

        btnSolicitar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnSolicitar.setText("Solicitar Prestamo");
        btnSolicitar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 140, 30));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 680, 40));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel9.setText("Comprobante de identidad:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        scrolLTBLDATOS.setViewportView(tblEmpleado);

        jPanel1.add(scrolLTBLDATOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 290, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        //aqui sucede la magia ojito de aqui en adelante que no explico dos veces
        
        //primero instanciamos las clases que necesitemos
        //como las clases 
        ILoanFCD prestamo = new LoanFCD();
        IEmpleadoFCD empleado = new EmpleadoFCD();
        
        // declaremos las variables necesarias que obtendremos de las pantallas
        try {
        int id = 1;
        String motivo = txfMotivo.getText();
        LocalDate inicio = convertir(dcInicio);
        LocalDate fin = convertir(dcFin);
        String placa = obtenerPlaca(cbxVehiculo);
        String correo; 
        correo = empleado.buscarPorID(id).getCorreo();
            
        PrestamoDTO loan = new PrestamoDTO(id, motivo, inicio, fin, placa, correo);
        
       
        //comenzaremos con la aplicacion de filtros 
            //validamos si los datos de prestamo son correctos
            if (prestamo.validarDatos(loan)) {
                //validamos si el empleado esta disponible
                if (prestamo.disponibilidadEmpleado(fin, fin, correo)) {
                    //validamos si el vehiculo esta disponible
                    if (prestamo.disponibilidadVehiculo(fin, fin, placa)) {
                        //si todo esta correcto agregamos el prestamo
                        prestamo.agregar(loan);
                    }
                }
            }
            
        } catch (PropsException | LoanException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // esta es la logica para regresar de pantalla todos la entendemos
        // ni pa que la explico  
        Menu menu = new Menu();

        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed
        
        IEmpleadoFCD empleado = new EmpleadoFCD();

        int id = Integer.parseInt(txtID.getText());
        
        try {
            
            //mostramos la tabla con la informacion del empleado
            empleado.tablaEmpleado(tblEmpleado, id);
            
            //ocultamos los botones 
            txtID.setVisible(false);
            lblID.setVisible(false);
            btnComprobar.setVisible(false);
            
            //mostramos la tabla 
            tblEmpleado.setVisible(true);
            scrolLTBLDATOS.setVisible(true);
            
            //guardamos el id del empleado
            Guardar guardar = new Guardar();
            guardar.getIdEmpleado();
        
        } catch (PropsException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnComprobarActionPerformed

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
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cbxVehiculo;
    private com.toedter.calendar.JDateChooser dcFin;
    private com.toedter.calendar.JDateChooser dcInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblID;
    private javax.swing.JScrollPane scrolLTBLDATOS;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txfMotivo;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
