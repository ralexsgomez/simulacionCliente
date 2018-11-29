/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import simulacionatencioncliente.SimulacionAtencionCliente;

public class VistaSimulacion extends javax.swing.JFrame {

    public VistaSimulacion() {
        initComponents();
        setLocationRelativeTo(null);
        this.jSUsuariosSimulation.setValue(10);
        //set default hour
        String dateInicio = this.getdate(8, 0);
        String dateFin = this.getdate(16, 45);
        txtHoraInicio.setText(dateInicio);
        txtHoraFin.setText(dateFin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        contenedorSala1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenedorClientes1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contenedorDespacho = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSUsuariosSimulation = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        txtHoraInicio = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtHoraFin = new javax.swing.JTextField();
        contenedorSala2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        contenedorClientes2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        contenedorDespacho2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        contenedorDespacho3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        modeloServidor2 = new javax.swing.JTable();
        contenedorSala3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        contenedorClientes3 = new javax.swing.JPanel();
        servidor4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        despachador4 = new javax.swing.JPanel();
        servidor5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        despachador5 = new javax.swing.JPanel();
        servidor6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        despachador6 = new javax.swing.JPanel();
        servidor7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        despachador7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        modeloServidor3 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        modeloServidor4 = new javax.swing.JTable();
        contenedorSala4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        contenedorClientes4 = new javax.swing.JPanel();
        servidor8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        despachador8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 313, 54));

        contenedorSala1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contenedor Sala 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorSala1.setPreferredSize(new java.awt.Dimension(400, 117));
        contenedorSala1.setLayout(new javax.swing.BoxLayout(contenedorSala1, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contenedorClientes1.setAutoscrolls(true);
        contenedorClientes1.setMaximumSize(new java.awt.Dimension(500, 500));
        contenedorClientes1.setSize(new java.awt.Dimension(400, 0));
        contenedorClientes1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane1.setViewportView(contenedorClientes1);

        contenedorSala1.add(jScrollPane1);

        getContentPane().add(contenedorSala1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 400, 110));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servidor.jpeg"))); // NOI18N

        javax.swing.GroupLayout contenedorDespachoLayout = new javax.swing.GroupLayout(contenedorDespacho);
        contenedorDespacho.setLayout(contenedorDespachoLayout);
        contenedorDespachoLayout.setHorizontalGroup(
            contenedorDespachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        contenedorDespachoLayout.setVerticalGroup(
            contenedorDespachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorDespacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedorDespacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 220, 130));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios Simualcion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSUsuariosSimulation)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSUsuariosSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 6, -1, 62));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hora Inicio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtHoraInicio.setText("8");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHoraInicio)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 6, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hora Fin", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtHoraFin.setText("jTextField2");
        txtHoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHoraFin)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 6, -1, -1));

        contenedorSala2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contenedor Sala 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorSala2.setLayout(new javax.swing.BoxLayout(contenedorSala2, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contenedorClientes2.setAutoscrolls(true);
        contenedorClientes2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane3.setViewportView(contenedorClientes2);

        contenedorSala2.add(jScrollPane3);

        getContentPane().add(contenedorSala2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 110));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidor 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servidor.jpeg"))); // NOI18N

        javax.swing.GroupLayout contenedorDespacho2Layout = new javax.swing.GroupLayout(contenedorDespacho2);
        contenedorDespacho2.setLayout(contenedorDespacho2Layout);
        contenedorDespacho2Layout.setHorizontalGroup(
            contenedorDespacho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        contenedorDespacho2Layout.setVerticalGroup(
            contenedorDespacho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorDespacho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(44, 44, 44))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contenedorDespacho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 230, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidor 3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servidor.jpeg"))); // NOI18N

        javax.swing.GroupLayout contenedorDespacho3Layout = new javax.swing.GroupLayout(contenedorDespacho3);
        contenedorDespacho3.setLayout(contenedorDespacho3Layout);
        contenedorDespacho3Layout.setHorizontalGroup(
            contenedorDespacho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        contenedorDespacho3Layout.setVerticalGroup(
            contenedorDespacho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorDespacho3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(32, 32, 32))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contenedorDespacho3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 327, 230, 120));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Servidor1"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Aleatorio", "Tiempo LLegada", "Tiempo Espera", "Tiempo Atención", "Tiempo Salida"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 750, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Servidor2"));

        modeloServidor2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Aleatorio", "Tiempo LLegada", "Tiempo Espera", "Tiempo Atención", "Tiempo Salida"
            }
        ));
        jScrollPane6.setViewportView(modeloServidor2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 750, -1));

        contenedorSala3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contenedor Sala 3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorSala3.setLayout(new javax.swing.BoxLayout(contenedorSala3, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contenedorClientes3.setAutoscrolls(true);
        contenedorClientes3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane4.setViewportView(contenedorClientes3);

        contenedorSala3.add(jScrollPane4);

        getContentPane().add(contenedorSala3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 940, 120));

        servidor4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidor 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servidor.jpeg"))); // NOI18N

        javax.swing.GroupLayout despachador4Layout = new javax.swing.GroupLayout(despachador4);
        despachador4.setLayout(despachador4Layout);
        despachador4Layout.setHorizontalGroup(
            despachador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        despachador4Layout.setVerticalGroup(
            despachador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout servidor4Layout = new javax.swing.GroupLayout(servidor4);
        servidor4.setLayout(servidor4Layout);
        servidor4Layout.setHorizontalGroup(
            servidor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servidor4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(despachador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        servidor4Layout.setVerticalGroup(
            servidor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servidor4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servidor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(despachador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(servidor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 230, 110));

        servidor5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidor 5", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servidor.jpeg"))); // NOI18N

        javax.swing.GroupLayout despachador5Layout = new javax.swing.GroupLayout(despachador5);
        despachador5.setLayout(despachador5Layout);
        despachador5Layout.setHorizontalGroup(
            despachador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        despachador5Layout.setVerticalGroup(
            despachador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout servidor5Layout = new javax.swing.GroupLayout(servidor5);
        servidor5.setLayout(servidor5Layout);
        servidor5Layout.setHorizontalGroup(
            servidor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servidor5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(despachador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        servidor5Layout.setVerticalGroup(
            servidor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servidor5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servidor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(despachador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(servidor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, 230, 110));

        servidor6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidor 6", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servidor.jpeg"))); // NOI18N

        javax.swing.GroupLayout despachador6Layout = new javax.swing.GroupLayout(despachador6);
        despachador6.setLayout(despachador6Layout);
        despachador6Layout.setHorizontalGroup(
            despachador6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        despachador6Layout.setVerticalGroup(
            despachador6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout servidor6Layout = new javax.swing.GroupLayout(servidor6);
        servidor6.setLayout(servidor6Layout);
        servidor6Layout.setHorizontalGroup(
            servidor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servidor6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(despachador6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        servidor6Layout.setVerticalGroup(
            servidor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servidor6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servidor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(despachador6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(servidor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 200, 230, 120));

        servidor7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidor 7", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servidor.jpeg"))); // NOI18N

        javax.swing.GroupLayout despachador7Layout = new javax.swing.GroupLayout(despachador7);
        despachador7.setLayout(despachador7Layout);
        despachador7Layout.setHorizontalGroup(
            despachador7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        despachador7Layout.setVerticalGroup(
            despachador7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout servidor7Layout = new javax.swing.GroupLayout(servidor7);
        servidor7.setLayout(servidor7Layout);
        servidor7Layout.setHorizontalGroup(
            servidor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servidor7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(despachador7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        servidor7Layout.setVerticalGroup(
            servidor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servidor7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servidor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(despachador7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(servidor7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 210, 230, 120));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Servidor3"));

        modeloServidor3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Aleatorio", "Tiempo LLegada", "Tiempo Espera", "Tiempo Atención", "Tiempo Salida"
            }
        ));
        jScrollPane7.setViewportView(modeloServidor3);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 750, -1));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Servidor4"));

        modeloServidor4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Aleatorio", "Tiempo LLegada", "Tiempo Espera", "Tiempo Atención", "Tiempo Salida"
            }
        ));
        jScrollPane8.setViewportView(modeloServidor4);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 660, 750, -1));

        contenedorSala4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contenedor Sala 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorSala4.setLayout(new javax.swing.BoxLayout(contenedorSala4, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contenedorClientes4.setAutoscrolls(true);
        contenedorClientes4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane9.setViewportView(contenedorClientes4);

        contenedorSala4.add(jScrollPane9);

        getContentPane().add(contenedorSala4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 690, 120));

        servidor8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidor 8", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servidor.jpeg"))); // NOI18N

        javax.swing.GroupLayout despachador8Layout = new javax.swing.GroupLayout(despachador8);
        despachador8.setLayout(despachador8Layout);
        despachador8Layout.setHorizontalGroup(
            despachador8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        despachador8Layout.setVerticalGroup(
            despachador8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout servidor8Layout = new javax.swing.GroupLayout(servidor8);
        servidor8.setLayout(servidor8Layout);
        servidor8Layout.setHorizontalGroup(
            servidor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servidor8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(despachador8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        servidor8Layout.setVerticalGroup(
            servidor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servidor8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servidor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(despachador8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(servidor8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 360, 230, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int cont = 0;
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        int cantidadUsuarios = ((int)this.jSUsuariosSimulation.getValue());
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) modeloServidor2.getModel();
        DefaultTableModel modelo3 = (DefaultTableModel) modeloServidor3.getModel();
        DefaultTableModel modelo4 = (DefaultTableModel) modeloServidor4.getModel();
        SimulacionAtencionCliente simulacionAtencionCliente = new SimulacionAtencionCliente(contenedorClientes1, contenedorDespacho, modelo, cantidadUsuarios);
        simulacionAtencionCliente.addContenedorColaServidor2(contenedorClientes2, contenedorDespacho2,contenedorDespacho3, modelo2); //servidor 2
        simulacionAtencionCliente.addContenedorColaServidor3(contenedorClientes3, despachador4, despachador5, despachador6, despachador7, modelo3); //servidor 3
        simulacionAtencionCliente.addContenedorColaServidor4(contenedorClientes4, despachador8, modelo4); //servidor 4
        simulacionAtencionCliente.iniciarCola();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private String getdate(int hora, int minute){
       Calendar now = Calendar.getInstance();
        now.set(Calendar.MINUTE, minute);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.HOUR_OF_DAY, hora);
        return new SimpleDateFormat("HH:mm:ss").format(now.getTime());
    }
    
    private void txtHoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFinActionPerformed
        
    }//GEN-LAST:event_txtHoraFinActionPerformed

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
            java.util.logging.Logger.getLogger(VistaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaSimulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel contenedorClientes1;
    private javax.swing.JPanel contenedorClientes2;
    private javax.swing.JPanel contenedorClientes3;
    private javax.swing.JPanel contenedorClientes4;
    private javax.swing.JPanel contenedorDespacho;
    private javax.swing.JPanel contenedorDespacho2;
    private javax.swing.JPanel contenedorDespacho3;
    private javax.swing.JPanel contenedorDespacho4;
    private javax.swing.JPanel contenedorDespacho5;
    private javax.swing.JPanel contenedorDespacho8;
    private javax.swing.JPanel contenedorSala1;
    private javax.swing.JPanel contenedorSala2;
    private javax.swing.JPanel contenedorSala3;
    private javax.swing.JPanel contenedorSala4;
    private javax.swing.JPanel despachador4;
    private javax.swing.JPanel despachador5;
    private javax.swing.JPanel despachador6;
    private javax.swing.JPanel despachador7;
    private javax.swing.JPanel despachador8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSUsuariosSimulation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable modeloServidor2;
    private javax.swing.JTable modeloServidor3;
    private javax.swing.JTable modeloServidor4;
    private javax.swing.JPanel servidor4;
    private javax.swing.JPanel servidor5;
    private javax.swing.JPanel servidor6;
    private javax.swing.JPanel servidor7;
    private javax.swing.JPanel servidor8;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    // End of variables declaration//GEN-END:variables
    
}
