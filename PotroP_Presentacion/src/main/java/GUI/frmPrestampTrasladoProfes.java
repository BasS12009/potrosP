package GUI;


import DTO.PrestamoMaestrosDTO;
import DTO.VehiculoDTO;
import excepcion.FachadaException;
import excepcion.FachadaExceptionPDF;
import fachada.PrestamoMaestrosFCD;
import fachada.PrestamoMaestrosFCDPDF;
import fachada.VehiculoFCD;
import interfaz.IPrestamoMaestrosFCD;
import interfaz.IVehiculoFCD;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;
import prueba.TabladeMaestros;

/**
 *
 * @author caarl
 */
public class frmPrestampTrasladoProfes extends javax.swing.JFrame {

private final IPrestamoMaestrosFCD fachada;
   
    private PrestamoMaestrosDTO prestamoMaestrosDTO;
    
    public frmPrestampTrasladoProfes() throws Exception {      
    initComponents();
    
    this.fachada = new PrestamoMaestrosFCD();
            
        this.setLocationRelativeTo(this);
        this.setSize(670, 550);

        // Cargar las configuraciones iniciales de la pantalla
        configuracionInicial();

          
    // Bloquear inicialmente todos los campos de texto de "Acompañantes"
    txtCorreoResponsable.setEditable(false);
    txtAcompaniante1.setEditable(false);
    txtAcompaniante2.setEditable(false);
    txtAcompaniante3.setEditable(false);
    txtAcompaniante4.setEditable(false);
    
}
    
private void configuracionInicial() {
        IVehiculoFCD vehiculo = new VehiculoFCD();

        // Centra la pantalla
        this.setLocationRelativeTo(this);
        
       

        // Llenamos el combo box de vehículos 
        try {
            // Llena el JComboBox cmbVehiculos con los vehículos obtenidos a través del IVehiculoFCD
            vehiculo.llenarCBX(cmbVehiculos);
        } catch (excepciones.FachadaException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
   private void cargarDatosIniciales() {
      
       
       try {
            List<PrestamoMaestrosDTO> prestamos = fachada.listaPrestamosMaestros();
            // Aquí puedes cargar los datos en una tabla o lista en la interfaz
        } catch (FachadaException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

private PrestamoMaestrosDTO obtenerDatosFormulario() throws IllegalArgumentException {
    // Validación de campos vacíos
    if (cbmDepartamentosProfes.getSelectedItem().equals("<None>") ||
        cmbMotivo.getSelectedItem().equals("<None>") ||
        cmbPlantelOrigen.getSelectedItem().equals("<None>") ||
        cmbPlantelDestino.getSelectedItem().equals("<None>") ||
        cmbVehiculos.getSelectedItem().equals("<None>") ||
        txtCorreoResponsable.getText().trim().isEmpty()) {
        throw new IllegalArgumentException("Todos los campos obligatorios deben estar llenos");
    }

    // Validación de la fecha de préstamo
    LocalDate fechaPrestamo = calFechaPrestamo.getDate().toInstant()
            .atZone(ZoneId.systemDefault()).toLocalDate();
    if (fechaPrestamo.isBefore(LocalDate.now())) {
        throw new IllegalArgumentException("La fecha del préstamo no puede ser anterior a la fecha actual.");
    }

    // Validación de la cantidad de personas
    int cantidadPersonas = Integer.parseInt((String) cmbCant.getSelectedItem());
    if (cantidadPersonas <= 0) {
        throw new IllegalArgumentException("La cantidad de personas debe ser mayor que cero.");
    }

    VehiculoDTO vehiculoSeleccionado = (VehiculoDTO) cmbVehiculos.getSelectedItem();
    if (vehiculoSeleccionado == null) {
        throw new IllegalArgumentException("Debe seleccionar un vehículo.");
    }

    // Añade esta línea para validar la disponibilidad del vehículo
    validarDisponibilidadVehiculo(vehiculoSeleccionado.getPlaca(), fechaPrestamo);

    // Validación de plantel origen y destino
    String plantelOrigen = (String) cmbPlantelOrigen.getSelectedItem();
    String plantelDestino = (String) cmbPlantelDestino.getSelectedItem();
    if (plantelOrigen.equals(plantelDestino)) {
        throw new IllegalArgumentException("El plantel de origen no puede ser el mismo que el de destino.");
    }

    // Obtener el resto de los datos
    String departamento = (String) cbmDepartamentosProfes.getSelectedItem();
    String motivo = (String) cmbMotivo.getSelectedItem();
    String correoResponsable = txtCorreoResponsable.getText().trim();

    // Obtener la lista de acompañantes
    List<String> acompaniantes = new ArrayList<>();
    if (!txtAcompaniante1.getText().trim().isEmpty()) {
        acompaniantes.add(txtAcompaniante1.getText().trim());
    }
    if (!txtAcompaniante2.getText().trim().isEmpty()) {
        acompaniantes.add(txtAcompaniante2.getText().trim());
    }
    if (!txtAcompaniante3.getText().trim().isEmpty()) {
        acompaniantes.add(txtAcompaniante3.getText().trim());
    }
    if (!txtAcompaniante4.getText().trim().isEmpty()) {
        acompaniantes.add(txtAcompaniante4.getText().trim());
    }

    // Crear y devolver el DTO
    return new PrestamoMaestrosDTO(
        0, // El ID se asignará en la capa DAO
        fechaPrestamo,
        departamento,
        cantidadPersonas,
        motivo,
        plantelOrigen,
        plantelDestino,
        vehiculoSeleccionado.getPlaca(),
        correoResponsable,
        acompaniantes
    );
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
        jLabel3 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        cmbMotivo = new javax.swing.JComboBox<>();
        calFechaPrestamo = new com.toedter.calendar.JCalendar();
        jLabel4 = new javax.swing.JLabel();
        cmbCant = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbPlantelOrigen = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnListaMaestros = new javax.swing.JButton();
        txtCorreoResponsable = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAcompaniante1 = new javax.swing.JTextField();
        txtAcompaniante2 = new javax.swing.JTextField();
        txtAcompaniante3 = new javax.swing.JTextField();
        txtAcompaniante4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbPlantelDestino = new javax.swing.JComboBox<>();
        cbmDepartamentosProfes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbVehiculos = new javax.swing.JComboBox<>();
        btnListaPrestamos = new javax.swing.JButton();
        btnSolicitar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 164, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Prestamo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setText("Motivo de la solicitud:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setText("Fecha del prestamo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btnAtras.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 170, 30));

        cmbMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Junta Administrativa", "Evento", "Congreso" }));
        cmbMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMotivoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));
        jPanel1.add(calFechaPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 330, 240));

        jLabel4.setText("Vehiculo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        cmbCant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "1", "2", "3", "4", "5" }));
        cmbCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCantActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 130, -1));

        jLabel5.setText("Plantel de origen:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        cmbPlantelOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Campus Obregón Centro", "Campus Náinari", "Campus Guaymas", "Campus Empalme", "Campus Navojoa Centro", "Campus Navojoa Sur" }));
        cmbPlantelOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlantelOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPlantelOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 130, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 10, 480));

        jLabel6.setText("Comprobante de identidad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        btnListaMaestros.setText(" Ver Maestros");
        btnListaMaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaMaestrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnListaMaestros, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        txtCorreoResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoResponsableActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreoResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 140, -1));

        jLabel7.setText("Correo Maestro responsable:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel8.setText("Departamento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        txtAcompaniante1.setText("ID-1");
        txtAcompaniante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcompaniante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, -1));

        txtAcompaniante2.setText("ID-2");
        txtAcompaniante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcompaniante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 110, -1));

        txtAcompaniante3.setText("ID-3");
        txtAcompaniante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcompaniante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 110, -1));

        txtAcompaniante4.setText("ID-4");
        txtAcompaniante4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcompaniante4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 110, -1));

        jLabel9.setText("Plantel destino::");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        cmbPlantelDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>", "Campus Obregón Centro", "Campus Náinari", "Campus Guaymas", "Campus Empalme", "Campus Navojoa Centro", "Campus Navojoa Sur" }));
        cmbPlantelDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlantelDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPlantelDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 130, -1));

        cbmDepartamentosProfes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "MATEMATICAS", "INGENIERIA EN SOFTWARE", "MECATRONICA", "TURISMO", "CONTABILIDAD" }));
        cbmDepartamentosProfes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmDepartamentosProfesActionPerformed(evt);
            }
        });
        jPanel1.add(cbmDepartamentosProfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        jLabel10.setText("Acompañantes:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jLabel11.setText("Filtrar por:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jLabel12.setText("Cantidad de personas:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        cmbVehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None>" }));
        cmbVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVehiculosActionPerformed(evt);
            }
        });
        jPanel1.add(cmbVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 130, -1));

        btnListaPrestamos.setText("Lista de prestamos");
        btnListaPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPrestamosActionPerformed(evt);
            }
        });
        jPanel1.add(btnListaPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        btnSolicitar1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnSolicitar1.setText("Solicitar vehiculo");
        btnSolicitar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSolicitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Método para limpiar el formulario después de agregar un préstamo

private void mostrarPrestamosEnConsola() {
    try {
        List<PrestamoMaestrosDTO> prestamos = fachada.listaPrestamosMaestros();
        for (PrestamoMaestrosDTO prestamo : prestamos) {
            System.out.println("ID: " + prestamo.getId());
            System.out.println("Fecha: " + prestamo.getFechaPrestamo());
            System.out.println("Departamento: " + prestamo.getDepartamento());
            // ... Imprime más detalles según tus necesidades
            System.out.println("--------------------");
        }
    } catch (FachadaException ex) {
        System.err.println("Error al obtener los préstamos: " + ex.getMessage());
    }
}
private void validarDisponibilidadVehiculo(String placa, LocalDate fecha) throws IllegalArgumentException {
    try {
        List<PrestamoMaestrosDTO> prestamos = fachada.listaPrestamosMaestros();
        for (PrestamoMaestrosDTO prestamo : prestamos) {
            if (prestamo.getVehiculo().equals(placa) && prestamo.getFechaPrestamo().equals(fecha)) {
                throw new IllegalArgumentException("El vehículo seleccionado no está disponible para la fecha indicada.");
            }
        }
    } catch (FachadaException e) {
        throw new IllegalArgumentException("Error al verificar la disponibilidad del vehículo: " + e.getMessage());
    }
}



    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       Menu menu = new Menu();
        menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void cmbMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMotivoActionPerformed

    private void cmbCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCantActionPerformed
       // Bloquear todos los campos de texto de "Acompañantes"
    txtCorreoResponsable.setEditable(false);
    txtAcompaniante1.setEditable(false);
    txtAcompaniante2.setEditable(false);
    txtAcompaniante3.setEditable(false);
    txtAcompaniante4.setEditable(false);

    // Obtener la opción seleccionada en el combo box
    String selectedOption = (String) cmbCant.getSelectedItem();

    switch (selectedOption) {
        case "<None>":
            // Mantener todos los campos de texto bloqueados
            break;
        case "1":
            // Desbloquear solo el campo txtIdResponsable
            txtCorreoResponsable.setEditable(true);
            break;
        case "2":
            // Desbloquear los campos txtIdResponsable y txtAcompaniante1
            txtCorreoResponsable.setEditable(true);
            txtAcompaniante1.setEditable(true);
            break;
        case "3":
            // Desbloquear los campos txtIdResponsable, txtAcompaniante1 y txtAcompaniante2
            txtCorreoResponsable.setEditable(true);
            txtAcompaniante1.setEditable(true);
            txtAcompaniante2.setEditable(true);
            break;
        case "4":
            // Desbloquear los campos txtIdResponsable, txtAcompaniante1, txtAcompaniante2 y txtAcompaniante3
            txtCorreoResponsable.setEditable(true);
            txtAcompaniante1.setEditable(true);
            txtAcompaniante2.setEditable(true);
            txtAcompaniante3.setEditable(true);
            break;
        case "5":
            // Desbloquear todos los campos de texto
            txtCorreoResponsable.setEditable(true);
            txtAcompaniante1.setEditable(true);
            txtAcompaniante2.setEditable(true);
            txtAcompaniante3.setEditable(true);
            txtAcompaniante4.setEditable(true);
            break;
    }
    }//GEN-LAST:event_cmbCantActionPerformed

    private void cmbPlantelOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlantelOrigenActionPerformed
       String selectedOrigen = (String) cmbPlantelOrigen.getSelectedItem();
    String selectedDestino = (String) cmbPlantelDestino.getSelectedItem();
    
    if (selectedOrigen.equals(selectedDestino) && !selectedOrigen.equals("<None>")) {
        // Muestra un mensaje de error
        JOptionPane.showMessageDialog(this,
            "El plantel de origen no puede ser el mismo que el de destino.",
            "Error de selección",
            JOptionPane.ERROR_MESSAGE);
        
        // Resetea la selección al valor anterior
        cmbPlantelOrigen.setSelectedItem("<None>");
    }
    }//GEN-LAST:event_cmbPlantelOrigenActionPerformed

    private void btnListaMaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaMaestrosActionPerformed
       JDialog dialog = new JDialog(frmPrestampTrasladoProfes.this, "Lista de Maestros", true);
    dialog.setSize(600, 400);
    dialog.setLocationRelativeTo(null);

    TabladeMaestros tableModel = new TabladeMaestros();
    JTable table = new JTable(tableModel);
    JScrollPane scrollPane = new JScrollPane(table);
    dialog.add(scrollPane, BorderLayout.CENTER);

    TableRowSorter<TabladeMaestros> sorter = new TableRowSorter<>(tableModel);
    table.setRowSorter(sorter);

    String selectedDepartment = (String) cbmDepartamentosProfes.getSelectedItem();
    if (!selectedDepartment.equals("Todos")) {
        RowFilter<TabladeMaestros, Object> rf = RowFilter.regexFilter("(?i)" + selectedDepartment, 3);
        sorter.setRowFilter(rf);
    }

    // Añadir un listener de selección a la tabla
    table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent  e) {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    // Asumiendo que el correo está en la segunda columna (índice 1)
                    // Ajusta este índice si el correo está en una columna diferente
                    String correo = table.getValueAt(selectedRow, 2).toString();
                    txtCorreoResponsable.setText(correo);
                    dialog.dispose(); // Cierra el diálogo después de seleccionar
                }
            }
        }
    });

    dialog.setVisible(true);
    }//GEN-LAST:event_btnListaMaestrosActionPerformed

    private void txtCorreoResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoResponsableActionPerformed

    private void txtAcompaniante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcompaniante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcompaniante1ActionPerformed

    private void txtAcompaniante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcompaniante2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcompaniante2ActionPerformed

    private void txtAcompaniante3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcompaniante3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcompaniante3ActionPerformed

    private void txtAcompaniante4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcompaniante4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcompaniante4ActionPerformed

    private void cmbPlantelDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlantelDestinoActionPerformed
        String selectedOrigen = (String) cmbPlantelOrigen.getSelectedItem();
    String selectedDestino = (String) cmbPlantelDestino.getSelectedItem();
    
    if (selectedOrigen.equals(selectedDestino) && !selectedDestino.equals("<None>")) {
        // Muestra un mensaje de error
        JOptionPane.showMessageDialog(this,
            "El plantel de destino no puede ser el mismo que el de origen.",
            "Error de selección",
            JOptionPane.ERROR_MESSAGE);
        
        // Resetea la selección al valor anterior
        cmbPlantelDestino.setSelectedItem("<None>");
    }
    }//GEN-LAST:event_cmbPlantelDestinoActionPerformed

    private void cbmDepartamentosProfesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmDepartamentosProfesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmDepartamentosProfesActionPerformed

    private void cmbVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVehiculosActionPerformed

    }//GEN-LAST:event_cmbVehiculosActionPerformed

    private void btnListaPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPrestamosActionPerformed
   try {
        // Supongamos que tienes una instancia de tu BO (Business Object) llamada "prestamoMaestrosBO"
        List<PrestamoMaestrosDTO> listaPrestamos = fachada.listaPrestamosMaestros();

        // Mostrar la lista en la consola
        for (PrestamoMaestrosDTO prestamo : listaPrestamos) {
            System.out.println("ID: " + prestamo.getId());
            System.out.println("Fecha: " + prestamo.getFechaPrestamo());
            System.out.println("Departamento: " + prestamo.getDepartamento());
            // Agrega aquí las demás características que deseas mostrar
            System.out.println("--------------------");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al obtener la lista de préstamos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
  
   

    }//GEN-LAST:event_btnListaPrestamosActionPerformed

    private void btnSolicitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitar1ActionPerformed
                                          
    try {
        PrestamoMaestrosDTO nuevoPrestamo = obtenerDatosFormulario();
        
        // Crear un mensaje con los detalles del préstamo
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Detalles del préstamo:\n\n");
        mensaje.append("Fecha: ").append(nuevoPrestamo.getFechaPrestamo()).append("\n");
        mensaje.append("Departamento: ").append(nuevoPrestamo.getDepartamento()).append("\n");
        mensaje.append("Cantidad de personas: ").append(nuevoPrestamo.getCantidadPersonas()).append("\n");
        mensaje.append("Motivo: ").append(nuevoPrestamo.getMotivo()).append("\n");
        mensaje.append("Plantel origen: ").append(nuevoPrestamo.getPlantelOrigen()).append("\n");
        mensaje.append("Plantel destino: ").append(nuevoPrestamo.getPlantelDestino()).append("\n");
        mensaje.append("Vehículo: ").append(nuevoPrestamo.getVehiculo()).append("\n");
        mensaje.append("Correo responsable: ").append(nuevoPrestamo.getCorreoResponsable()).append("\n");
        mensaje.append("Acompañantes: ").append(String.join(", ", nuevoPrestamo.getAcompaniantes()));
        
        // Mostrar el mensaje en un JOptionPane con botones "Cancelar" y "Solicitar"
        int opcion = JOptionPane.showOptionDialog(this, 
                mensaje.toString(), 
                "Confirmar Préstamo", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                new Object[]{"Solicitar", "Cancelar"}, 
                "Solicitar");
        
        if (opcion == JOptionPane.YES_OPTION) {
            // El usuario seleccionó "Solicitar"
            fachada.agregar(nuevoPrestamo);
            
            // Generar PDF
            PrestamoMaestrosFCDPDF controller = new PrestamoMaestrosFCDPDF();
            String pdfFileName = "TicketPrestamoMaestros.pdf";
            controller.generarPDF(nuevoPrestamo, pdfFileName);
            
            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Préstamo agregado con éxito y PDF generado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            // Abrir el PDF generado
            abrirPDF(pdfFileName);

        } else {
            // El usuario seleccionó "Cancelar" o cerró el diálogo
            JOptionPane.showMessageDialog(this, "Operación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }
     } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);
    } catch (FachadaException e) {
        JOptionPane.showMessageDialog(this, "Error al agregar el préstamo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (FachadaExceptionPDF e) {
        JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void abrirPDF(String fileName) {
    try {
        File pdfFile = new File(fileName);
        if (pdfFile.exists()) {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(pdfFile);
            } else {
                JOptionPane.showMessageDialog(this, 
                    "La apertura automática no está soportada en este sistema.\n" +
                    "Por favor, abra el archivo manualmente: " + pdfFile.getAbsolutePath(),
                    "No se puede abrir automáticamente", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                "El archivo PDF no existe.",
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, 
            "Error al abrir el archivo PDF: " + ex.getMessage(),
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnSolicitar1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnListaMaestros;
    private javax.swing.JButton btnListaPrestamos;
    private javax.swing.JButton btnSolicitar1;
    private com.toedter.calendar.JCalendar calFechaPrestamo;
    private javax.swing.JComboBox<String> cbmDepartamentosProfes;
    private javax.swing.JComboBox<String> cmbCant;
    private javax.swing.JComboBox<String> cmbMotivo;
    private javax.swing.JComboBox<String> cmbPlantelDestino;
    private javax.swing.JComboBox<String> cmbPlantelOrigen;
    private javax.swing.JComboBox<String> cmbVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAcompaniante1;
    private javax.swing.JTextField txtAcompaniante2;
    private javax.swing.JTextField txtAcompaniante3;
    private javax.swing.JTextField txtAcompaniante4;
    private javax.swing.JTextField txtCorreoResponsable;
    // End of variables declaration//GEN-END:variables
}

