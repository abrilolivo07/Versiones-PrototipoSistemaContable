
package prototiposistemacontable;

import java.awt.Color;
import javax.swing.JOptionPane;

public class FrmCatalogoCuentas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCatalogoCuentas.class.getName());
     private ManejoArchivo manejo = new ManejoArchivo();
     private String lineaAntigua = "";
    
    public FrmCatalogoCuentas() {
        initComponents();
        tipogrupo.add(genboton); // Cuenta General
        tipogrupo.add(detboton); // Cuenta Detalle
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);
        if (debitoacumcampo != null) debitoacumcampo.setEditable(false);
        if (creditoacumcampo != null) creditoacumcampo.setEditable(false);
        if (balancecampo != null) balancecampo.setEditable(false);
        limpiarCamposCompletos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipogrupo = new javax.swing.ButtonGroup();
        panelbase = new javax.swing.JPanel();
        grupocombo = new javax.swing.JComboBox<>();
        genboton = new javax.swing.JRadioButton();
        detboton = new javax.swing.JRadioButton();
        buscarBoton = new javax.swing.JButton();
        Modificarboton = new javax.swing.JButton();
        crearBoton = new javax.swing.JButton();
        limpiarBoton = new javax.swing.JButton();
        salirboton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblnumcuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nrocuentacampo = new javax.swing.JTextField();
        nombrecampo = new javax.swing.JTextField();
        lblnivel = new javax.swing.JLabel();
        nivelcampo = new javax.swing.JTextField();
        lblpadre = new javax.swing.JLabel();
        cuentapadrecampo = new javax.swing.JTextField();
        lblgrupo = new javax.swing.JLabel();
        lbldebacu = new javax.swing.JLabel();
        lblcredacu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        debitoacumcampo = new javax.swing.JTextField();
        creditoacumcampo = new javax.swing.JTextField();
        balancecampo = new javax.swing.JTextField();
        estadolabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento Catalogo de Cuentas");

        panelbase.setBackground(new java.awt.Color(243, 197, 127));

        grupocombo.setBackground(new java.awt.Color(2, 53, 54));
        grupocombo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        grupocombo.setForeground(new java.awt.Color(255, 231, 194));
        grupocombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pasivo", "Capital", "Ingresos", "Costos", "Gastos" }));
        grupocombo.setBorder(null);
        grupocombo.setEnabled(false);

        genboton.setBackground(new java.awt.Color(243, 197, 127));
        genboton.setText("Cuenta General");
        genboton.setEnabled(false);
        genboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genbotonActionPerformed(evt);
            }
        });

        detboton.setBackground(new java.awt.Color(243, 197, 127));
        detboton.setText("Cuenta Detalle");
        detboton.setEnabled(false);

        buscarBoton.setBackground(new java.awt.Color(2, 53, 54));
        buscarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscarBoton.setForeground(new java.awt.Color(255, 231, 194));
        buscarBoton.setText("Buscar");
        buscarBoton.setBorder(null);
        buscarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarBotonMouseExited(evt);
            }
        });
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        Modificarboton.setBackground(new java.awt.Color(2, 53, 54));
        Modificarboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Modificarboton.setForeground(new java.awt.Color(255, 231, 194));
        Modificarboton.setText("Modificar");
        Modificarboton.setBorder(null);
        Modificarboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificarbotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModificarbotonMouseExited(evt);
            }
        });
        Modificarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarbotonActionPerformed(evt);
            }
        });

        crearBoton.setBackground(new java.awt.Color(2, 53, 54));
        crearBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crearBoton.setForeground(new java.awt.Color(255, 231, 194));
        crearBoton.setText("Crear");
        crearBoton.setBorder(null);
        crearBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearBotonMouseExited(evt);
            }
        });
        crearBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBotonActionPerformed(evt);
            }
        });

        limpiarBoton.setBackground(new java.awt.Color(2, 53, 54));
        limpiarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBoton.setForeground(new java.awt.Color(255, 231, 194));
        limpiarBoton.setText("Limpiar");
        limpiarBoton.setBorder(null);
        limpiarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limpiarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limpiarBotonMouseExited(evt);
            }
        });
        limpiarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBotonActionPerformed(evt);
            }
        });

        salirboton.setBackground(new java.awt.Color(2, 53, 54));
        salirboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salirboton.setForeground(new java.awt.Color(255, 231, 194));
        salirboton.setText("Salir");
        salirboton.setBorder(null);
        salirboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirbotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirbotonMouseExited(evt);
            }
        });
        salirboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbotonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo:");

        lblnumcuenta.setText("Numero de cuenta:");

        jLabel2.setText("Nombre de la cuenta:");

        nrocuentacampo.setBorder(null);

        nombrecampo.setBorder(null);
        nombrecampo.setEnabled(false);

        lblnivel.setText("Nivel:");

        nivelcampo.setBorder(null);
        nivelcampo.setEnabled(false);

        lblpadre.setText("Cuenta Padre:");

        cuentapadrecampo.setBorder(null);
        cuentapadrecampo.setEnabled(false);

        lblgrupo.setText("Grupo:");

        lbldebacu.setText("Debito acumulado");

        lblcredacu.setText("Credito Acumulado");

        jLabel5.setText("Balance");

        debitoacumcampo.setBackground(new java.awt.Color(255, 255, 255));
        debitoacumcampo.setBorder(null);
        debitoacumcampo.setEnabled(false);

        creditoacumcampo.setBackground(new java.awt.Color(255, 255, 255));
        creditoacumcampo.setBorder(null);
        creditoacumcampo.setEnabled(false);

        balancecampo.setEditable(false);
        balancecampo.setBackground(new java.awt.Color(255, 255, 255));
        balancecampo.setBorder(null);
        balancecampo.setEnabled(false);

        estadolabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estadolabel.setForeground(new java.awt.Color(2, 53, 54));
        estadolabel.setText("CUENTAS");

        jSeparator1.setBackground(new java.awt.Color(243, 197, 127));
        jSeparator1.setForeground(new java.awt.Color(2, 53, 54));

        javax.swing.GroupLayout panelbaseLayout = new javax.swing.GroupLayout(panelbase);
        panelbase.setLayout(panelbaseLayout);
        panelbaseLayout.setHorizontalGroup(
            panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbaseLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblnumcuenta)
                                    .addComponent(nrocuentacampo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelbaseLayout.createSequentialGroup()
                                        .addComponent(lbldebacu)
                                        .addGap(67, 67, 67)
                                        .addComponent(lblcredacu))
                                    .addGroup(panelbaseLayout.createSequentialGroup()
                                        .addComponent(debitoacumcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(creditoacumcampo))
                                    .addGroup(panelbaseLayout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(nombrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelbaseLayout.createSequentialGroup()
                                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblnivel)
                                            .addComponent(nivelcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(51, 51, 51)
                                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblpadre)
                                            .addComponent(cuentapadrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5)
                                    .addComponent(balancecampo))
                                .addGap(32, 32, 32)
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelbaseLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(98, 98, 98))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(genboton)
                                                .addComponent(detboton))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblgrupo)
                                                .addComponent(grupocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(buscarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(Modificarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(crearBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelbaseLayout.setVerticalGroup(
            panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbaseLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(estadolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(lblnivel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nivelcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(nombrecampo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(37, 37, 37)))
                        .addGap(45, 45, 45)
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldebacu)
                            .addComponent(lblcredacu)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(creditoacumcampo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(debitoacumcampo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balancecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                                .addComponent(lblnumcuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nrocuentacampo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(lblgrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grupocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(lblpadre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuentapadrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(genboton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detboton)))
                .addGap(57, 57, 57)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBotonActionPerformed
        
        String nroCta = nrocuentacampo.getText().trim();
        String descripcion = nombrecampo.getText().trim();
        String nivelCta = nivelcampo.getText().trim();
        String ctaPadre = cuentapadrecampo.getText().trim();
        String grupoCta = grupocombo.getSelectedItem().toString().trim();

        String tipoCta = "";
        if (genboton.isSelected()) tipoCta = "General";
        else if (detboton.isSelected()) tipoCta = "Detalle";
        if (nroCta.isEmpty() || descripcion.isEmpty() || nivelCta.isEmpty() || ctaPadre.isEmpty() || grupoCta.isEmpty() || tipoCta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos obligatorios.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean opcion = manejo.crearCuenta(nroCta, descripcion, tipoCta, nivelCta, ctaPadre, grupoCta);
        if (opcion){
            limpiarCamposCompletos();  
            setEnabledFalseCampos();
        } 
    }//GEN-LAST:event_crearBotonActionPerformed

    private void ModificarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarbotonActionPerformed
        if (lineaAntigua.isEmpty() || !Modificarboton.isEnabled()) {
            JOptionPane.showMessageDialog(this, "No hay cuenta cargada o la modificación no está permitida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nroCta = nrocuentacampo.getText().trim();
        String descripcion = nombrecampo.getText().trim();
        String nivelCta = nivelcampo.getText().trim();
        String ctaPadre = cuentapadrecampo.getText().trim();
        String grupoCta = grupocombo.getSelectedItem().toString().trim();

        String tipoCta = "";
        if (genboton.isSelected()) tipoCta = "General";
        else if (detboton.isSelected()) tipoCta = "Detalle";

        String[] partesAntiguas = lineaAntigua.split(";");
        String fechaCreacion = partesAntiguas[6];
        String horaCreacion = partesAntiguas[7];
        String debitoAcum = partesAntiguas[8];
        String creditoAcum = partesAntiguas[9];
        String balance = partesAntiguas[10];

        String nuevaLinea =
        nroCta + ";" +
        descripcion + ";" +
        tipoCta + ";" +
        nivelCta + ";" +
        ctaPadre + ";" +
        grupoCta + ";" +
        fechaCreacion + ";" +
        horaCreacion + ";" +
        debitoAcum + ";" +
        creditoAcum + ";" +
        balance + ";";
        boolean opcion = manejo.modificarDoc(lineaAntigua, nuevaLinea, 0);
        if (opcion){
            limpiarCamposCompletos();  
            setEnabledFalseCampos();
        } 
    }//GEN-LAST:event_ModificarbotonActionPerformed

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed

        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);

        String nroCta = nrocuentacampo.getText().trim();

        if (nroCta.isEmpty() || nroCta.equals("No. Cuenta")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Número de Cuenta para buscar.");
            nrocuentacampo.requestFocus();
            return;
        }
        lineaAntigua = manejo.lecturaCuenta(nroCta);

        if (!lineaAntigua.isEmpty()) { // modifica la cuenta si existe
            String[] partes = lineaAntigua.split(";");

            nombrecampo.setText(partes[1].trim());
            nivelcampo.setText(partes[3].trim());
            cuentapadrecampo.setText(partes[4].trim());
            grupocombo.setSelectedItem(partes[5].trim()); // Grupo

            if (partes[2].trim().equalsIgnoreCase("general")) {
                genboton.setSelected(true); // Cuenta General
            } else {
                detboton.setSelected(true); // Cuenta Detalle
            }
            if (balancecampo != null) {
                debitoacumcampo.setText(partes[8].trim());
                creditoacumcampo.setText(partes[9].trim());
                balancecampo.setText(partes[10].trim());
            }
            try {
                double balance = Double.parseDouble(partes[10].trim());
                if (balance != 0.0) {
                    JOptionPane.showMessageDialog(this, "Cuenta con Balance (" + balance + "). Modificación NO permitida.");

                } else {
                    JOptionPane.showMessageDialog(this, "Cuenta encontrada. Puede modificar cuenta.");
                    estadolabel.setText("MODIFICANDO CUENTA");
                    Modificarboton.setEnabled(true);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error de formato de Balance.", "Error Interno", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cuenta no encontrada. Puede crear nueva cuenta.");
            estadolabel.setText("CREANDO CUENTA");
            nombrecampo.setText("");
            nivelcampo.setText("");
            cuentapadrecampo.setText("");
            grupocombo.setSelectedIndex(0);
            tipogrupo.clearSelection();
            crearBoton.setEnabled(true);
            nrocuentacampo.setEditable(true);
        }
            setEnabledCampos();
            buscarBoton.setEnabled(false);
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void salirbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbotonActionPerformed
          this.dispose();       
    }//GEN-LAST:event_salirbotonActionPerformed

    private void limpiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBotonActionPerformed
        buscarBoton.setEnabled(true);
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);
        limpiarCamposCompletos();
        setEnabledFalseCampos();
    }//GEN-LAST:event_limpiarBotonActionPerformed

    private void buscarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        buscarBoton.setBackground(new Color(hexbg));
        buscarBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_buscarBotonMouseEntered

    private void ModificarbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarbotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        Modificarboton.setBackground(new Color(hexbg));
        Modificarboton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_ModificarbotonMouseEntered

    private void crearBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        crearBoton.setBackground(new Color(hexbg));
        crearBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_crearBotonMouseEntered

    private void limpiarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        limpiarBoton.setBackground(new Color(hexbg));
        limpiarBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_limpiarBotonMouseEntered

    private void salirbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        salirboton.setBackground(new Color(hexbg));
        salirboton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_salirbotonMouseEntered

    private void buscarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        buscarBoton.setBackground(new Color(hexbg));
        buscarBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_buscarBotonMouseExited

    private void ModificarbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarbotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        Modificarboton.setBackground(new Color(hexbg));
        Modificarboton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_ModificarbotonMouseExited

    private void crearBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        crearBoton.setBackground(new Color(hexbg));
        crearBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_crearBotonMouseExited

    private void limpiarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        limpiarBoton.setBackground(new Color(hexbg));
        limpiarBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_limpiarBotonMouseExited

    private void salirbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        salirboton.setBackground(new Color(hexbg));
        salirboton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_salirbotonMouseExited

    private void genbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genbotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genbotonActionPerformed
     
     private void limpiarCamposCompletos() {
        estadolabel.setText("CUENTAS");
        nrocuentacampo.setText("");
        nrocuentacampo.setEditable(true); 
        
        nombrecampo.setText("");
        nivelcampo.setText("");
        cuentapadrecampo.setText("");
        grupocombo.setSelectedIndex(0); // El combo de Grupos (Activo, Pasivo, etc.)
        tipogrupo.clearSelection(); // Deseleccionar radio buttons

        if (debitoacumcampo != null) debitoacumcampo.setText("");
        if (creditoacumcampo != null) creditoacumcampo.setText("");
        if (balancecampo != null) balancecampo.setText("");
       
        lineaAntigua = "";
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);
        nrocuentacampo.requestFocus();
        buscarBoton.setEnabled(true);
    }
     
     private void setEnabledFalseCampos(){
            nombrecampo.setEnabled(false);
            nivelcampo.setEnabled(false);
            genboton.setEnabled(false);
            detboton.setEnabled(false);
            debitoacumcampo.setEnabled(false);
            creditoacumcampo.setEnabled(false);
            balancecampo.setEnabled(false);
            cuentapadrecampo.setEnabled(false);
            grupocombo.setEnabled(false);
     }
     
     private void setEnabledCampos(){
            nombrecampo.setEnabled(true);
            nivelcampo.setEnabled(true);
            genboton.setEnabled(true);
            detboton.setEnabled(true);
            debitoacumcampo.setEnabled(true);
            creditoacumcampo.setEnabled(true);
            balancecampo.setEnabled(true);
            cuentapadrecampo.setEnabled(true);
            grupocombo.setEnabled(true);
     }
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmCatalogoCuentas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificarboton;
    private javax.swing.JTextField balancecampo;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JButton crearBoton;
    private javax.swing.JTextField creditoacumcampo;
    private javax.swing.JTextField cuentapadrecampo;
    private javax.swing.JTextField debitoacumcampo;
    private javax.swing.JRadioButton detboton;
    private javax.swing.JLabel estadolabel;
    private javax.swing.JRadioButton genboton;
    private javax.swing.JComboBox<String> grupocombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblcredacu;
    private javax.swing.JLabel lbldebacu;
    private javax.swing.JLabel lblgrupo;
    private javax.swing.JLabel lblnivel;
    private javax.swing.JLabel lblnumcuenta;
    private javax.swing.JLabel lblpadre;
    private javax.swing.JButton limpiarBoton;
    private javax.swing.JTextField nivelcampo;
    private javax.swing.JTextField nombrecampo;
    private javax.swing.JTextField nrocuentacampo;
    private javax.swing.JPanel panelbase;
    private javax.swing.JButton salirboton;
    private javax.swing.ButtonGroup tipogrupo;
    // End of variables declaration//GEN-END:variables
}
