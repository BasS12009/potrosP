/**
 * DevoluciónTraslado.java
 * 
 * Pantalla de presentación que permite la funcionalidad de devolver un 
 * traslado.
 */
package GUI;

import GUI.BusquedaTraslado;
import GUI.Menu;
import dtos.TrasladoDTO;
import fachada.DevolucionFCD;
import guardar.Guardar;
import interfaz.IDevolucionFCD;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class DevolucionTraslado extends javax.swing.JFrame {

    IDevolucionFCD devolucionFCD;
    Guardar guardar;
    
    //instaciamos frames
    Menu menu = new Menu();
    BusquedaTraslado busquedaTraslado = new BusquedaTraslado();
   
    /**
     * Constructor creado por el compilador que permite inicializar los
     * componentes de la pantalla y se agregaron 2 métodos para alinear
     * el frame con la pantalla y asignarle un tamaño.
     */
    public DevolucionTraslado() {
        initComponents();
        
        //inicializacion de las variables de clase
        this.devolucionFCD = new DevolucionFCD();
        this.guardar = new Guardar();
        
        //configuracion del frame
        this.setLocationRelativeTo(this);
        this.setSize(670, 600);  
        this.txfMotivo.setEditable(false);
        
        //configuramos el contenedore motivo para que no sea editable
        txfMotivo.setEditable(false);
        
        //cargamos la informacion del traslado
        cargarInfo();
    }

    /**
     * Cargamos la informacion del traslado que se desea hacer la devolucion
     * 
     */
    private void cargarInfo(){
        try{
        //buscamos el objeto traslado basandonos en su numero de traslado    
        TrasladoDTO traslado = devolucionFCD.buscar(guardar.getNumDevolucion());
        
        lblPersonas.setText(String.valueOf(traslado.getPersonas()));
        lblSalida.setText(convertir(traslado.getFechaHoraRegreso()));
        lblRegreso.setText(convertir(traslado.getFechaHoraSalida()));
        txfMotivo.setText(traslado.getMotivo());
        lblPlaca.setText(traslado.getPlaca());
        lblEmpleado.setText(traslado.getCorreoEmpleado());
        lblChofer.setText(traslado.getCorreoChofer());
        lblEstado.setText(establecerEstado(traslado.getEstado()));
        
        //configuramos el estado
        configEstado(lblEstado);
        
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    /**
     * Nos ayuda a configurar un estado para en caso de que este este devuelto 
     * no nos bloquee el boton de devolucion y configura el label para que se 
     * muestre en un color verde.
     * En un caso contrario muestra el boton de color rojo permitiendonos 
     * realizar la devolucion.
     * 
     * @param estado JLabel al cual le haremos los cambios.
     */
    private void configEstado(JLabel estado){
        if (estado.getText().equalsIgnoreCase("DEVUELTO")) {
            estado.setForeground(new Color(144, 238, 144));
            btnDevolucion.setEnabled(false);
        }
        else{
           estado.setForeground(new Color(255, 102, 102));
       }
    }
    
    /**
     * A partir de un booleano nos devuelve un string indicando el estado
     * 
     * @param estado Booleano a convertir a un String
     * @return String que nos indica el estado del prestamo
     */
    private String establecerEstado(boolean estado){
        if (estado) {
            return "DEVUELTO";
        }
        else{
            return "PENDIENTE";
        }
    }
    
    /**
     * Retorna el numero de porcentaje de la gasolina definido en el ComboBox
     * 
     * @param combo ComboBox del cual extraemos los datos
     * @return porcentaje de combustible
     */
    private int combustible(JComboBox combo){
        String remover = (String) combo.getSelectedItem();
        String combustible = eliminarCaracter(remover, '%');
        return Integer.parseInt(combustible);
    }
    
    /**
     * Retorna el estado de la carroceria definido en el ComboBox
     * 
     * @param combo ComboBox del cual extraemos los datos
     * @return Estado del la carroceria en forma de String
     */
    private String carroceria(JComboBox combo){
        String carroceria = (String) combo.getSelectedItem();
        return carroceria;
    }
     
    /**
     * Retorna el estado de la carroceria definido en el ComboBox
     * 
     * @param combo del cual extraemos los datos
     * @return Estado del las llantas en forma de String
     */
    private String llantas(JComboBox combo){
        String llantas = (String) combo.getSelectedItem();
        return llantas;
    }
    
    /**
     * Convierte un String un objeto LocalDateTime a un String 
     * 
     * @param fechaHora Objeto LocalDateTime a convertir
     * @return Un String del localDateTime del parametro
     */
    private String convertir(LocalDateTime fechaHora) {
        
        // Define el formato deseado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Convierte el LocalDateTime a String usando el formato definido
        return fechaHora.format(formatter);
        
    }
    
     
    /**
     * Método que elimina un carácter específico de una cadena
     * 
     * @param cadena cadena de la cual deseamos eliminar el caracter
     * @param caracter caracter que se desaea eliminar
     * @return retorna un String sin el caracter deseado
     */
    private String eliminarCaracter(String cadena, char caracter) {
        // Reemplazar todas las ocurrencias del carácter con una cadena vacía
        return cadena.replace(String.valueOf(caracter), "");
    }
    
    /**
     * Crea un nuevo objeto TrasladoDTO con los valores combinados de el 
     * traslado original y los nuevos valores que se ingresan el el frame
     * 
     * @param original Objeto TrasladoDTO del cual obtendremos los valores 
     * originales del objeto;
     * 
     * @return nuevo Objeto TrasladoDTO con los nuevos valores ingresados en el 
     * frame
     */
    private TrasladoDTO crearDevolucion(TrasladoDTO original){
        
        //originales
        int numTraslado = original.getNumTraslado();
        String destino = original.getDestino();
        int personas = original.getPersonas();
        LocalDateTime fechaSalida = original.getFechaHoraSalida();
        
        //modificado
        LocalDateTime fechaDevolucion = LocalDateTime.now();
        
        //original
        String motivo = original.getMotivo();
        
        //modificados
        String carroceria = carroceria(cbxCarroceria);    
        String llantas = llantas(cbxLlantas);
        int combustible = combustible(cbxCombustible);
      
        //originales
        String placa = original.getPlaca();
        String empleado = original.getCorreoEmpleado();
        String chofer = original.getCorreoChofer();
        boolean estado = original.getEstado();
        
        return new TrasladoDTO(numTraslado, destino, personas, fechaSalida, 
        fechaDevolucion, motivo, carroceria, llantas, combustible, placa,
        empleado, chofer, estado);
        
    }
    
    /**
     * Genera el codigo necesario para realizar la devolucion del Traslado
     * 
     */
    private void devolucion(){
        try{
        //definimos el traslado orinal    
        TrasladoDTO original = devolucionFCD.buscar(guardar.getNumDevolucion());
        
        //definimos el traslado de devolucion
        TrasladoDTO devolucion = crearDevolucion(original);
       
            System.out.println(original.toString());
            System.out.println(" ");
            System.out.println(devolucion.toString());
            
        
        //agregamos la devolucion
        devolucionFCD.agregar(original, devolucion);
        
        //mostramos una ventana de confirmacion para preguntar si se desa hacer 
        //otra devolucion
        int opcion = JOptionPane.showConfirmDialog(null, 
                "¿Desea realizar otra devolucion?", 
                "Confirmación", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            busquedaTraslado.setVisible(true);
            this.dispose();
        }
        else{
            menu.setVisible(true);
            this.dispose();
        }
        
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dcFin = new com.toedter.calendar.JDateChooser();
        jScrollBar1 = new javax.swing.JScrollBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnDevolucion = new javax.swing.JButton();
        cbxLlantas = new javax.swing.JComboBox<>();
        cbxCombustible = new javax.swing.JComboBox<>();
        cbxCarroceria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taComentarios = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSalida = new javax.swing.JLabel();
        lblPersonas = new javax.swing.JLabel();
        lblRegreso = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txfMotivo = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        lblChofer = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 164, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Devolucion Traslado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 330, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Combustible:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Estado carroceria:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Estado llantas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        btnDevolucion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDevolucion.setText("Solicitar Devolucion");
        btnDevolucion.setToolTipText("");
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });
        jPanel1.add(btnDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        cbxLlantas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AIRE BAJO", "DESGASTADAS", "BUEN ESTADO " }));
        jPanel1.add(cbxLlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 180, -1));

        cbxCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25%", "50%", "75%", "100%" }));
        cbxCombustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCombustibleActionPerformed(evt);
            }
        });
        jPanel1.add(cbxCombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 180, -1));

        cbxCarroceria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXCELENTE", "REGULAR", "DAÑADA" }));
        jPanel1.add(cbxCarroceria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Comentarios adicionales:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        taComentarios.setColumns(20);
        taComentarios.setRows(5);
        jScrollPane1.setViewportView(taComentarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 270, -1));

        jLabel5.setText("Personas:");

        jLabel7.setText("Fecha y Hora salida:");

        jLabel8.setText("Fecha y hora llegada: ");

        jLabel9.setText("Motivo:");

        lblSalida.setText("jLabel12");

        lblPersonas.setText("12");

        lblRegreso.setText("jLabel16");

        jLabel17.setText("Placa vehiculo: ");

        txfMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMotivoActionPerformed(evt);
            }
        });

        lblPlaca.setText("jLabel18");

        jLabel19.setText("Correo empleado:");

        jLabel20.setText("Correo chofer:");

        lblEmpleado.setText("jLabel21");

        lblChofer.setText("jLabel22");

        jLabel23.setText("Estado: ");

        lblEstado.setText("jLabel10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblChofer))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmpleado))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblPersonas))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txfMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPersonas))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblSalida))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblRegreso))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblPlaca))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblEmpleado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblChofer))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lblEstado))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 300, 370));

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

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed
        
        int opcion = JOptionPane.showConfirmDialog(null, 
                "¿Estás seguro realizar la devolucion?", 
                "Confirmación", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            devolucion();
        } 
    
    }//GEN-LAST:event_btnDevolucionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu menu = new Menu();
        menu.dispose();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cbxCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCombustibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCombustibleActionPerformed

    private void txfMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfMotivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolucion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxCarroceria;
    private javax.swing.JComboBox<String> cbxCombustible;
    private javax.swing.JComboBox<String> cbxLlantas;
    private com.toedter.calendar.JDateChooser dcFin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblChofer;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblPersonas;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblRegreso;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JTextArea taComentarios;
    private javax.swing.JTextField txfMotivo;
    // End of variables declaration//GEN-END:variables
}
