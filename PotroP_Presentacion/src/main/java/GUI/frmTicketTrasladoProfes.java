/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author caarl
 */
public class frmTicketTrasladoProfes extends javax.swing.JFrame {

    /**
     * Creates new form frmTicketTrasladoProfes
     */
    public frmTicketTrasladoProfes() {
        initComponents();
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
        txtCantPersonas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPlantelDestino = new javax.swing.JPasswordField();
        bntAceptarYGenerarPDF = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtAcompaniante4 = new javax.swing.JPasswordField();
        txtVehiculo = new javax.swing.JPasswordField();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPlantelOrigen = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreoResponsable = new javax.swing.JPasswordField();
        txtAcompaniante1 = new javax.swing.JPasswordField();
        txtAcompaniante2 = new javax.swing.JPasswordField();
        txtAcompaniante3 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCantPersonas1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPlantelDestino1 = new javax.swing.JPasswordField();
        bntAceptarYGenerarPDF1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        txtAcompaniante5 = new javax.swing.JPasswordField();
        txtVehiculo1 = new javax.swing.JPasswordField();
        btnModificar1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPlantelOrigen1 = new javax.swing.JPasswordField();
        jLabel21 = new javax.swing.JLabel();
        txtCorreoResponsable1 = new javax.swing.JPasswordField();
        txtAcompaniante6 = new javax.swing.JPasswordField();
        txtAcompaniante7 = new javax.swing.JPasswordField();
        txtAcompaniante8 = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        txtFecha2 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 164, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos del viaje:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setText("Cantidad de personas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, 30));

        txtCantPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantPersonasActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setText("Vehiculo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        txtPlantelDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlantelDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPlantelDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 210, 30));

        bntAceptarYGenerarPDF.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        bntAceptarYGenerarPDF.setText("Aceptar");
        bntAceptarYGenerarPDF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bntAceptarYGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAceptarYGenerarPDFActionPerformed(evt);
            }
        });
        jPanel1.add(bntAceptarYGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 150, 30));

        jLabel5.setText("Prestamo Profes");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel7.setText("Plantel destino:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel8.setText("Acompañantes:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 150, 30));

        txtAcompaniante4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcompaniante4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 210, 30));

        txtVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(txtVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 210, 30));

        btnModificar.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 150, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Resumen");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Asistentes:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel9.setText("Plantel origen:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        txtPlantelOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlantelOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(txtPlantelOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 210, 30));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel10.setText("Correo del responsable:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtCorreoResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoResponsableActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreoResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 210, 30));

        txtAcompaniante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcompaniante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 210, 30));

        txtAcompaniante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcompaniante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 210, 30));

        txtAcompaniante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcompaniante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 210, 30));

        jPanel2.setBackground(new java.awt.Color(65, 164, 205));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Datos del viaje:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel13.setText("Cantidad de personas:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, 30));

        txtCantPersonas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantPersonas1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtCantPersonas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 30));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel14.setText("Vehiculo:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        txtPlantelDestino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlantelDestino1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtPlantelDestino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 210, 30));

        bntAceptarYGenerarPDF1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        bntAceptarYGenerarPDF1.setText("Aceptar");
        bntAceptarYGenerarPDF1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bntAceptarYGenerarPDF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAceptarYGenerarPDF1ActionPerformed(evt);
            }
        });
        jPanel2.add(bntAceptarYGenerarPDF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 150, 30));

        jLabel15.setText("Prestamo Profes");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel16.setText("Plantel destino:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel17.setText("Acompañantes:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        btnCancelar1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 150, 30));

        txtAcompaniante5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante5ActionPerformed(evt);
            }
        });
        jPanel2.add(txtAcompaniante5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 210, 30));

        txtVehiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehiculo1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtVehiculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 210, 30));

        btnModificar1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnModificar1.setText("Modificar");
        btnModificar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 150, 30));

        jLabel18.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Resumen");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel19.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Asistentes:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel20.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel20.setText("Plantel origen:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        txtPlantelOrigen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlantelOrigen1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtPlantelOrigen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 210, 30));

        jLabel21.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel21.setText("Correo del responsable:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtCorreoResponsable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoResponsable1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtCorreoResponsable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 210, 30));

        txtAcompaniante6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante6ActionPerformed(evt);
            }
        });
        jPanel2.add(txtAcompaniante6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 210, 30));

        txtAcompaniante7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante7ActionPerformed(evt);
            }
        });
        jPanel2.add(txtAcompaniante7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 210, 30));

        txtAcompaniante8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcompaniante8ActionPerformed(evt);
            }
        });
        jPanel2.add(txtAcompaniante8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 210, 30));

        jLabel22.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel22.setText("Fecha del prestamo:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        txtFecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecha2ActionPerformed(evt);
            }
        });
        jPanel2.add(txtFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 210, 30));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel11.setText("Motivo del viaje:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        txtMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotivoActionPerformed(evt);
            }
        });
        jPanel2.add(txtMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 210, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void bntAceptarYGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAceptarYGenerarPDFActionPerformed
        
      
    }//GEN-LAST:event_bntAceptarYGenerarPDFActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCantPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantPersonasActionPerformed

    private void txtAcompaniante4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcompaniante4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcompaniante4ActionPerformed

    private void txtVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehiculoActionPerformed

    private void txtPlantelDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlantelDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlantelDestinoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtPlantelOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlantelOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlantelOrigenActionPerformed

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

    private void txtMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotivoActionPerformed

    private void txtCantPersonas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantPersonas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantPersonas1ActionPerformed

    private void txtPlantelDestino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlantelDestino1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlantelDestino1ActionPerformed

    private void bntAceptarYGenerarPDF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAceptarYGenerarPDF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntAceptarYGenerarPDF1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void txtAcompaniante5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcompaniante5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcompaniante5ActionPerformed

    private void txtVehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehiculo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehiculo1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void txtPlantelOrigen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlantelOrigen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlantelOrigen1ActionPerformed

    private void txtCorreoResponsable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoResponsable1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoResponsable1ActionPerformed

    private void txtAcompaniante6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcompaniante6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcompaniante6ActionPerformed

    private void txtAcompaniante7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcompaniante7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcompaniante7ActionPerformed

    private void txtAcompaniante8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcompaniante8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcompaniante8ActionPerformed

    private void txtFecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFecha2ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAceptarYGenerarPDF;
    private javax.swing.JButton bntAceptarYGenerarPDF1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtAcompaniante1;
    private javax.swing.JPasswordField txtAcompaniante2;
    private javax.swing.JPasswordField txtAcompaniante3;
    private javax.swing.JPasswordField txtAcompaniante4;
    private javax.swing.JPasswordField txtAcompaniante5;
    private javax.swing.JPasswordField txtAcompaniante6;
    private javax.swing.JPasswordField txtAcompaniante7;
    private javax.swing.JPasswordField txtAcompaniante8;
    private javax.swing.JTextField txtCantPersonas;
    private javax.swing.JTextField txtCantPersonas1;
    private javax.swing.JPasswordField txtCorreoResponsable;
    private javax.swing.JPasswordField txtCorreoResponsable1;
    private javax.swing.JPasswordField txtFecha2;
    private javax.swing.JPasswordField txtMotivo;
    private javax.swing.JPasswordField txtPlantelDestino;
    private javax.swing.JPasswordField txtPlantelDestino1;
    private javax.swing.JPasswordField txtPlantelOrigen;
    private javax.swing.JPasswordField txtPlantelOrigen1;
    private javax.swing.JPasswordField txtVehiculo;
    private javax.swing.JPasswordField txtVehiculo1;
    // End of variables declaration//GEN-END:variables
}