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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import simulacionatencioncliente.Servidor;
import simulacionatencioncliente.SimulacionAtencionCliente;

public class VistaSimulacion extends javax.swing.JFrame {

    public VistaSimulacion() {
        initComponents();
        setLocationRelativeTo(null);
        this.jSUsuariosSimulation.setValue(10);
        this.jSpCantidadServidor1.setValue(2);
        this.jSpCantidadServidor2.setValue(3);
        this.jSpCantidadServidor3.setValue(4);
        this.jSpCantidadServidor4.setValue(2);
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
        contenedorServidores1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        contentServidorSala1 = new javax.swing.JPanel();
        contenedorSala1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenedorClientes1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSUsuariosSimulation = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        txtHoraInicio = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtHoraFin = new javax.swing.JTextField();
        contenedorSala2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        contenedorClientes2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        modeloServidor2 = new javax.swing.JTable();
        contenedorSala3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        contenedorClientes3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        modeloServidor3 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        modeloServidor4 = new javax.swing.JTable();
        contenedorSala4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        contenedorClientes4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        numeroServidor1 = new javax.swing.JPanel();
        jSpCantidadServidor1 = new javax.swing.JSpinner();
        contenedorServidores2 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        contentServidorSala2 = new javax.swing.JPanel();
        numeroServidor2 = new javax.swing.JPanel();
        jSpCantidadServidor2 = new javax.swing.JSpinner();
        contenedorServidores3 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        contentServidorSala3 = new javax.swing.JPanel();
        numeroServidor3 = new javax.swing.JPanel();
        jSpCantidadServidor3 = new javax.swing.JSpinner();
        contenedorServidores4 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        contentServidorSala4 = new javax.swing.JPanel();
        numeroServidor4 = new javax.swing.JPanel();
        jSpCantidadServidor4 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 313, 54));

        contenedorServidores1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidores Sala 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorServidores1.setPreferredSize(new java.awt.Dimension(400, 117));
        contenedorServidores1.setLayout(new javax.swing.BoxLayout(contenedorServidores1, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contentServidorSala1.setAutoscrolls(true);
        contentServidorSala1.setMaximumSize(new java.awt.Dimension(500, 500));
        contentServidorSala1.setSize(new java.awt.Dimension(400, 0));
        contentServidorSala1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane5.setViewportView(contentServidorSala1);

        contenedorServidores1.add(jScrollPane5);

        getContentPane().add(contenedorServidores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 550, 110));

        contenedorSala1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes Sala 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorSala1.setPreferredSize(new java.awt.Dimension(400, 117));
        contenedorSala1.setLayout(new javax.swing.BoxLayout(contenedorSala1, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contenedorClientes1.setBackground(new java.awt.Color(153, 153, 153));
        contenedorClientes1.setAutoscrolls(true);
        contenedorClientes1.setMaximumSize(new java.awt.Dimension(500, 500));
        contenedorClientes1.setSize(new java.awt.Dimension(400, 0));
        contenedorClientes1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane1.setViewportView(contenedorClientes1);

        contenedorSala1.add(jScrollPane1);

        getContentPane().add(contenedorSala1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 550, 110));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios Simualcion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSUsuariosSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSUsuariosSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 160, 60));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

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

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

        contenedorSala2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes Sala 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorSala2.setLayout(new javax.swing.BoxLayout(contenedorSala2, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contenedorClientes2.setBackground(new java.awt.Color(153, 153, 153));
        contenedorClientes2.setAutoscrolls(true);
        contenedorClientes2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane3.setViewportView(contenedorClientes2);

        contenedorSala2.add(jScrollPane3);

        getContentPane().add(contenedorSala2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 550, 110));

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

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 750, 140));

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

        contenedorSala3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes Sala 3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorSala3.setLayout(new javax.swing.BoxLayout(contenedorSala3, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contenedorClientes3.setBackground(new java.awt.Color(153, 153, 153));
        contenedorClientes3.setAutoscrolls(true);
        contenedorClientes3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane4.setViewportView(contenedorClientes3);

        contenedorSala3.add(jScrollPane4);

        getContentPane().add(contenedorSala3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 590, 100));

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
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 740, 130));

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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 740, -1));

        contenedorSala4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contenedor Sala 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorSala4.setLayout(new javax.swing.BoxLayout(contenedorSala4, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contenedorClientes4.setBackground(new java.awt.Color(153, 153, 153));
        contenedorClientes4.setAutoscrolls(true);
        contenedorClientes4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane9.setViewportView(contenedorClientes4);

        contenedorSala4.add(jScrollPane9);

        getContentPane().add(contenedorSala4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 590, 110));

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 550, -1));

        numeroServidor1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad Servidores1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout numeroServidor1Layout = new javax.swing.GroupLayout(numeroServidor1);
        numeroServidor1.setLayout(numeroServidor1Layout);
        numeroServidor1Layout.setHorizontalGroup(
            numeroServidor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numeroServidor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSpCantidadServidor1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        numeroServidor1Layout.setVerticalGroup(
            numeroServidor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numeroServidor1Layout.createSequentialGroup()
                .addComponent(jSpCantidadServidor1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(numeroServidor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 160, 60));

        contenedorServidores2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidores Sala 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorServidores2.setPreferredSize(new java.awt.Dimension(400, 117));
        contenedorServidores2.setLayout(new javax.swing.BoxLayout(contenedorServidores2, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contentServidorSala2.setAutoscrolls(true);
        contentServidorSala2.setMaximumSize(new java.awt.Dimension(500, 500));
        contentServidorSala2.setSize(new java.awt.Dimension(400, 0));
        contentServidorSala2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane10.setViewportView(contentServidorSala2);

        contenedorServidores2.add(jScrollPane10);

        getContentPane().add(contenedorServidores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 550, 110));

        numeroServidor2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad Servidores2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout numeroServidor2Layout = new javax.swing.GroupLayout(numeroServidor2);
        numeroServidor2.setLayout(numeroServidor2Layout);
        numeroServidor2Layout.setHorizontalGroup(
            numeroServidor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numeroServidor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSpCantidadServidor2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        numeroServidor2Layout.setVerticalGroup(
            numeroServidor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSpCantidadServidor2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        getContentPane().add(numeroServidor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, -1));

        contenedorServidores3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidores Sala 3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorServidores3.setPreferredSize(new java.awt.Dimension(400, 117));
        contenedorServidores3.setLayout(new javax.swing.BoxLayout(contenedorServidores3, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contentServidorSala3.setAutoscrolls(true);
        contentServidorSala3.setMaximumSize(new java.awt.Dimension(500, 500));
        contentServidorSala3.setSize(new java.awt.Dimension(400, 0));
        contentServidorSala3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane11.setViewportView(contentServidorSala3);

        contenedorServidores3.add(jScrollPane11);

        getContentPane().add(contenedorServidores3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 590, 120));

        numeroServidor3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad Servidores3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout numeroServidor3Layout = new javax.swing.GroupLayout(numeroServidor3);
        numeroServidor3.setLayout(numeroServidor3Layout);
        numeroServidor3Layout.setHorizontalGroup(
            numeroServidor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numeroServidor3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSpCantidadServidor3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        numeroServidor3Layout.setVerticalGroup(
            numeroServidor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSpCantidadServidor3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        getContentPane().add(numeroServidor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, -1, -1));

        contenedorServidores4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidores Sala 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        contenedorServidores4.setPreferredSize(new java.awt.Dimension(400, 117));
        contenedorServidores4.setLayout(new javax.swing.BoxLayout(contenedorServidores4, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contentServidorSala4.setAutoscrolls(true);
        contentServidorSala4.setMaximumSize(new java.awt.Dimension(500, 500));
        contentServidorSala4.setSize(new java.awt.Dimension(400, 0));
        contentServidorSala4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane12.setViewportView(contentServidorSala4);

        contenedorServidores4.add(jScrollPane12);

        getContentPane().add(contenedorServidores4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 590, 120));

        numeroServidor4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad Servidores4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout numeroServidor4Layout = new javax.swing.GroupLayout(numeroServidor4);
        numeroServidor4.setLayout(numeroServidor4Layout);
        numeroServidor4Layout.setHorizontalGroup(
            numeroServidor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numeroServidor4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSpCantidadServidor4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        numeroServidor4Layout.setVerticalGroup(
            numeroServidor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSpCantidadServidor4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        getContentPane().add(numeroServidor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int cont = 0;
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        //cargar los servidores de la sala 1
        ArrayList<Servidor> servidoresSala1 = new ArrayList<>();
        ArrayList<Servidor> servidoresSala2 = new ArrayList<>();
        ArrayList<Servidor> servidoresSala3 = new ArrayList<>();
        ArrayList<Servidor> servidoresSala4 = new ArrayList<>();
        for (int i = 0; i < (int)this.jSpCantidadServidor1.getValue(); i++) {
            Servidor servidor = new Servidor();
            contentServidorSala1.add(servidor);
            servidoresSala1.add(servidor);
        }
        
        for (int i = 0; i < (int)this.jSpCantidadServidor2.getValue(); i++) {
            Servidor servidor = new Servidor();
            contentServidorSala2.add(servidor);
            servidoresSala2.add(servidor);
        }
        
        for (int i = 0; i < (int)this.jSpCantidadServidor3.getValue(); i++) {
            Servidor servidor = new Servidor();
            contentServidorSala3.add(servidor);
            servidoresSala3.add(servidor);
        }
        
        for (int i = 0; i < (int)this.jSpCantidadServidor4.getValue(); i++) {
            Servidor servidor = new Servidor();
            contentServidorSala4.add(servidor);
            servidoresSala4.add(servidor);
        }

        contentServidorSala1.setSize(new Dimension(300, 300));
        contentServidorSala2.setSize(new Dimension(300, 300));
        contentServidorSala3.setSize(new Dimension(300, 300));
        contentServidorSala4.setSize(new Dimension(300, 300));
        
        //configuracion de cada servidor
        int cantidadUsuarios = ((int)this.jSUsuariosSimulation.getValue());
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) modeloServidor2.getModel();
        DefaultTableModel modelo3 = (DefaultTableModel) modeloServidor3.getModel();
        DefaultTableModel modelo4 = (DefaultTableModel) modeloServidor4.getModel();
        
//        SimulacionAtencionCliente simulacionAtencionCliente = new SimulacionAtencionCliente(contenedorClientes1, contenedorDespacho, modelo, cantidadUsuarios);
        SimulacionAtencionCliente simulacionAtencionCliente = new SimulacionAtencionCliente(contenedorClientes1, servidoresSala1, modelo, cantidadUsuarios);
//        simulacionAtencionCliente.addContenedorColaServidor2(contenedorClientes2, contenedorDespacho2,contenedorDespacho3, modelo2); //servidor 2
        simulacionAtencionCliente.addContenedorColaServidor2(contenedorClientes2, servidoresSala2, modelo2); //servidor 2
        simulacionAtencionCliente.addContenedorColaServidor3(contenedorClientes3, servidoresSala3, modelo3); //servidor 3
        simulacionAtencionCliente.addContenedorColaServidor4(contenedorClientes4, servidoresSala4, modelo4); //servidor 4
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
    private javax.swing.JPanel contenedorSala1;
    private javax.swing.JPanel contenedorSala2;
    private javax.swing.JPanel contenedorSala3;
    private javax.swing.JPanel contenedorSala4;
    private javax.swing.JPanel contenedorServidores1;
    private javax.swing.JPanel contenedorServidores2;
    private javax.swing.JPanel contenedorServidores3;
    private javax.swing.JPanel contenedorServidores4;
    private javax.swing.JPanel contentServidorSala1;
    private javax.swing.JPanel contentServidorSala2;
    private javax.swing.JPanel contentServidorSala3;
    private javax.swing.JPanel contentServidorSala4;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSUsuariosSimulation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpCantidadServidor1;
    private javax.swing.JSpinner jSpCantidadServidor2;
    private javax.swing.JSpinner jSpCantidadServidor3;
    private javax.swing.JSpinner jSpCantidadServidor4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable modeloServidor2;
    private javax.swing.JTable modeloServidor3;
    private javax.swing.JTable modeloServidor4;
    private javax.swing.JPanel numeroServidor1;
    private javax.swing.JPanel numeroServidor2;
    private javax.swing.JPanel numeroServidor3;
    private javax.swing.JPanel numeroServidor4;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    // End of variables declaration//GEN-END:variables
    
}
