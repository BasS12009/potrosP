/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Fachada.TrasladoFCD;
import bo.TrasladoBO;
import dtos.EmpleadoDTO;
import dtos.TrasladoDTO;
import dtos.VehiculoDTO;
import dtos.VehiculoEntregadoDTO;
import excepciones.NegocioException;
import excepciones.fachadaException;
import fachada.VehiculoFCD;
import interfaces.IEmpleadoBO;
import interfaz.IVehiculoFCD;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import negocio.EmpleadoBO;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import dtos.VehiculoDevueltoDTO;
import excepciones.FachadaException;
import java.io.*;
import java.awt.Desktop;
import java.time.LocalDateTime;

/**
 *
 * @author diana
 */
public class Traslado2 extends javax.swing.JFrame {
  // Instancia de JLabel
    private JLabel lblEmpleadoDatos;
    //instancia de mi form traslado
    Traslado formT;
    private IVehiculoFCD vehiculo;
    private TrasladoBO fachada;
    
    private String empleado;

    /**
     * 
     * Creates new form Traslado2
     */
    public Traslado2() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setSize(780, 580);
        this.vehiculo = new VehiculoFCD();
        
        try {

            // Inicializar JLabel
            lblEmpleadoDatos = new JLabel();
            lblEmpleadoDatos.setForeground(Color.WHITE);
            jPanel1.add(lblEmpleadoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));
            lblEmpleadoDatos.setVisible(false);
            btnDisponibilidad.enable(false);

            vehiculo.llenarCBX(boxVehiculo);
        } catch (FachadaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * 
     * @param formTr 
     */
    public Traslado2(Traslado formTr) {
        this.formT = formTr;
        initComponents();
        this.setLocationRelativeTo(this);
        this.setSize(780, 580);
        this.vehiculo = new VehiculoFCD();
        try {

            // Inicializar JLabel
            lblEmpleadoDatos = new JLabel();
            lblEmpleadoDatos.setForeground(Color.WHITE);
            jPanel1.add(lblEmpleadoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));
            lblEmpleadoDatos.setVisible(false);
            btnDisponibilidad.enable(false);

            vehiculo.llenarCBX(boxVehiculo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void traslado() {
        // Validaciones de los campos obligatorios
        if (txtPrestamo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Motivo de Préstamo' es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtDestino.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Destino' es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (boxVehiculo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un 'Vehículo'.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cbxCarroceria.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el estado de 'Carrocería'.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cbxCombustible.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el nivel de 'Combustible'.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cbxLlantas.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el estado de las 'Llantas'.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cbxVehiculo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el estado del 'Vehículo'.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
    

        
        // Crear una instancia de TrasladoDTO y llenar sus campos
        String id= "" ;
        String folio = txtFolio.getText();
        String motivo = txtPrestamo.getText().trim();
        int personas = formT.cantidadP;
        LocalDateTime fechaHoraSalida = formT.inicio;
        LocalDateTime fechaHoraRegreso = formT.fin;
        boolean disponibilidad = true;
        VehiculoDTO vehiculos = obtenerVehiculoSeleccionado();
        
        //instanciamos el vehiculo entregado
        VehiculoEntregadoDTO vehiculoEntregado = crearEntregado(vehiculos);
        
        VehiculoDevueltoDTO vehiculoDevuelto = null;
        String correoEmpleado = empleado;
        boolean estado = false;
        
        //formamos el nuevo traslado
        TrasladoDTO trasladoDTO = new TrasladoDTO(id,folio, motivo, personas, 
                fechaHoraSalida, fechaHoraRegreso, disponibilidad, vehiculos, 
                vehiculoEntregado, vehiculoDevuelto, correoEmpleado, estado);
        
        // Crear una instancia de TrasladoFCD y solicitar el traslado
        TrasladoFCD trasladoFCD = new TrasladoFCD();
        try {
            trasladoFCD.solicitarTraslado(trasladoDTO);
            JOptionPane.showMessageDialog(this, "Traslado solicitado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (fachadaException e) {
            JOptionPane.showMessageDialog(this, "Error al solicitar el traslado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private VehiculoDTO obtenerVehiculoSeleccionado() {
        // Obtener el índice seleccionado en el combobox
        int selectedIndex = boxVehiculo.getSelectedIndex();

        // Verificar si se ha seleccionado algún ítem
        if (selectedIndex != -1) {
            // Obtener el objeto VehiculoDTO seleccionado
            Object selectedObject = boxVehiculo.getSelectedItem();

            // Verificar si el objeto es de tipo VehiculoDTO
            if (selectedObject instanceof VehiculoDTO) {
                return (VehiculoDTO) selectedObject;
            } else {
                // Manejo de error si el objeto no es de tipo VehiculoDTO (esto debería ser poco probable si el JComboBox está configurado correctamente)
                JOptionPane.showMessageDialog(this, "Error: El objeto seleccionado no es un VehiculoDTO válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Manejo de error si no se ha seleccionado ningún ítem (esto debería ser manejado según la lógica de tu aplicación)
            JOptionPane.showMessageDialog(this, "Error: No se ha seleccionado ningún vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Si no se puede obtener el objeto seleccionado, retornar un nuevo VehiculoDTO vacío o manejar según la lógica de tu aplicación
        return new VehiculoDTO();
        
    }
    
  
    
    public VehiculoEntregadoDTO crearEntregado(VehiculoDTO vehiculo){
        VehiculoDTO beiculo = obtenerVehiculoSeleccionado();
        
        String carroceria = (String) cbxCarroceria.getSelectedItem();
        int combustible = eliminarCaracter((String) cbxCombustible.getSelectedItem());
        String estado = (String)cbxVehiculo.getSelectedItem();
        String llantas = (String)cbxLlantas.getSelectedItem();
        
        
        int numVehiculo = beiculo.getNumVehiculo();
        String marca = beiculo.getMarca();
        String modelo = beiculo.getModelo();
        int año = beiculo.getAño();
        String tipo = beiculo.getTipo();
        String placa = beiculo.getPlaca();
        String capacidad = beiculo.getCapacidad();
        
        return new VehiculoEntregadoDTO(carroceria, combustible, estado, 
              llantas, numVehiculo, marca, modelo, año, tipo, placa, capacidad);
    }

    /**
     * Método que elimina un carácter específico de una cadena y lo convierte 
     * a int
     * 
     * @param cadena cadena de la cual deseamos eliminar el caracter
     * @param caracter caracter que se desaea eliminar
     * @return retorna un String sin el caracter deseado
     */
    private int eliminarCaracter(String cadena) {
        // Reemplazar todas las ocurrencias del carácter con una cadena vacía
        String gasolina = cadena.replace(String.valueOf("%"), "");
        int gasolina2 = Integer.parseInt(gasolina);
        return gasolina2;
    }
    



    


private void generarYAbrirPDF() {
    Document document = new Document(PageSize.A4);
    try {
        PdfWriter.getInstance(document, new FileOutputStream("ReporteTraslado.pdf"));
        document.open();
        Font fontTitulo = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
        Font fontContenido = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);

        // Título del reporte
        Paragraph titulo = new Paragraph("Reporte de Traslado", fontTitulo);
        titulo.setAlignment(Element.ALIGN_CENTER);
        document.add(titulo);
        document.add(new Paragraph(" ")); // Espacio en blanco

        // Información del traslado
        PdfPTable table = new PdfPTable(2);
        table.setWidthPercentage(100);

        addTableRow(table, "Folio:", txtFolio.getText(), fontContenido);
        addTableRow(table, "Motivo de Préstamo:", txtPrestamo.getText(), fontContenido);
        addTableRow(table, "Destino:", txtDestino.getText(), fontContenido);
        addTableRow(table, "Vehículo:", boxVehiculo.getSelectedItem().toString(), fontContenido);
        addTableRow(table, "Carrocería:", cbxCarroceria.getSelectedItem().toString(), fontContenido);
        addTableRow(table, "Combustible:", cbxCombustible.getSelectedItem().toString(), fontContenido);
        addTableRow(table, "Llantas:", cbxLlantas.getSelectedItem().toString(), fontContenido);
        addTableRow(table, "Estado del vehículo:", cbxVehiculo.getSelectedItem().toString(), fontContenido);
        addTableRow(table, "ID de Empleado:", txtID.getText(), fontContenido);

        document.add(table);

        document.close();

        // Abrir el archivo PDF
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(new File("ReporteTraslado.pdf"));
        } else {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler ReporteTraslado.pdf");
        }

        JOptionPane.showMessageDialog(null, "Se ha generado y abierto el archivo 'ReporteTraslado.pdf'");

    } catch (DocumentException | IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al generar o abrir el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void addTableRow(PdfPTable table, String key, String value, Font font) {
    table.addCell(new Phrase(key, font));
    table.addCell(new Phrase(value, font));
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
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrestamo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boxVehiculo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnComprobar = new javax.swing.JButton();
        lblID1 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxCarroceria = new javax.swing.JComboBox<>();
        cbxCombustible = new javax.swing.JComboBox<>();
        cbxLlantas = new javax.swing.JComboBox<>();
        cbxVehiculo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        btnDisponibilidad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 164, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("Traslado de Alumnos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 760, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Motivo de Prestamo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel1.add(txtPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vehiculo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        boxVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(boxVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 190, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Datos de empleado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        lblID.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("Id:");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 180, 30));

        btnComprobar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnComprobar.setText("Comprobar");
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        lblID1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblID1.setForeground(new java.awt.Color(255, 255, 255));
        lblID1.setText("Destino:");
        jPanel1.add(lblID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 210, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carroceria:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Llantas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Combustible:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado de vehiculo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        cbxCarroceria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excelente", "Regular ", "Dañada", " " }));
        jPanel1.add(cbxCarroceria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 160, 30));

        cbxCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25%", "50%", "75%", "100%" }));
        jPanel1.add(cbxCombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 160, 30));

        cbxLlantas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aire bajo", "Desgastado", "Buen estado", " " }));
        jPanel1.add(cbxLlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 160, 30));

        cbxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dañado", "Sin daños", "Sin combustible", " " }));
        jPanel1.add(cbxVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 160, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Folio:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jPanel1.add(txtFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 30));

        btnDisponibilidad.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnDisponibilidad.setText("Confirmar Traslado");
        btnDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibilidadActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxVehiculoActionPerformed
        try {
            // TODO add your handling code here:
            IVehiculoFCD vehiculos = new VehiculoFCD();

            vehiculos.llenarCBX(boxVehiculo);
        } catch (excepciones.FachadaException ex) {
            Logger.getLogger(Traslado2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boxVehiculoActionPerformed

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed

        btnDisponibilidad.setEnabled(false);

        String empleadoId = txtID.getText();
        IEmpleadoBO empleadoBO = new EmpleadoBO();

        try {
            int id = Integer.parseInt(empleadoId);
            EmpleadoDTO empleadoDTO = empleadoBO.buscarEmpleado(id);
            this.empleado = empleadoDTO.getCorreo();

            // Verificar si el tipo de empleado es "empleado"
            if ("empleado".equalsIgnoreCase(empleadoDTO.getTipo())) {
                // Si el empleado fue encontrado y es de tipo "empleado", muestra un mensaje
                JOptionPane.showMessageDialog(this, "Empleado encontrado: " + empleadoDTO.getCorreo(), "Información", JOptionPane.INFORMATION_MESSAGE);
                btnDisponibilidad.setEnabled(true);
            } else {
                // Si el empleado no es de tipo "empleado", muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un empleado", "Error", JOptionPane.ERROR_MESSAGE);
                btnDisponibilidad.setEnabled(false);

            }
        } catch (NumberFormatException e) {
            // Si el texto ingresado no es un número válido
            JOptionPane.showMessageDialog(this, "ID inválido", "Error", JOptionPane.ERROR_MESSAGE);
            btnDisponibilidad.setEnabled(false);

        } catch (NegocioException e) {
            // Si hubo un error al buscar el empleado (incluyendo si no fue encontrado)
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            btnDisponibilidad.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnComprobarActionPerformed

    private void btnDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibilidadActionPerformed
        traslado();
        generarYAbrirPDF();
       
    }//GEN-LAST:event_btnDisponibilidadActionPerformed

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
            java.util.logging.Logger.getLogger(Traslado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traslado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traslado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traslado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traslado2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxVehiculo;
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnDisponibilidad;
    private javax.swing.JComboBox<String> cbxCarroceria;
    private javax.swing.JComboBox<String> cbxCombustible;
    private javax.swing.JComboBox<String> cbxLlantas;
    private javax.swing.JComboBox<String> cbxVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPrestamo;
    // End of variables declaration//GEN-END:variables
}
