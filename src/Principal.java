
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        visualizarLogin();
        
        // Procedimiento para identificar cierre del Programa si hay sesion activa
        Evento e = new Evento();
        addWindowListener(e);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d_Login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tf_usuarioLogin = new javax.swing.JTextField();
        bt_cancelarLogin = new javax.swing.JButton();
        bt_aceptarLogin = new javax.swing.JButton();
        ps_passwordLogin = new javax.swing.JPasswordField();
        d_LocalesAgencias = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDescripcionLocales = new javax.swing.JTable();
        bt_AgregarLocal_AdministracionLocales = new javax.swing.JButton();
        bt_Cerrar_AdministradorLocales = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        d_AgregarLocal = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        tf_CodigoLocal_AgregarLocal = new javax.swing.JTextField();
        tf_NombreLocal_AgregarLocal = new javax.swing.JTextField();
        sp_Latitud_AgregarLocal = new javax.swing.JSpinner();
        sp_Longitud_AgregarLocal = new javax.swing.JSpinner();
        bt_Agregar_AgregarLocal = new javax.swing.JButton();
        bt_Cancelar_AgregarLocal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        d_AgregarAreaLocal = new javax.swing.JDialog();
        vistas = new javax.swing.JPanel();
        vistaAdministrador = new javax.swing.JPanel();
        vistaGerente = new javax.swing.JPanel();
        vistaEmpleadoNormal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuIniciarSesion = new javax.swing.JMenuItem();
        menuCerrarSeision = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        menuBaseDatos = new javax.swing.JMenu();
        menuLocales = new javax.swing.JMenuItem();
        menuDepartamentos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Transacciones = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuGerentes = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        d_Login.setTitle("Ingreso al Sistema");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Autentificacion");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        bt_cancelarLogin.setText("Cancelar");
        bt_cancelarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarLoginActionPerformed(evt);
            }
        });

        bt_aceptarLogin.setText("Aceptar");
        bt_aceptarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_aceptarLoginActionPerformed(evt);
            }
        });

        ps_passwordLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ps_passwordLoginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout d_LoginLayout = new javax.swing.GroupLayout(d_Login.getContentPane());
        d_Login.getContentPane().setLayout(d_LoginLayout);
        d_LoginLayout.setHorizontalGroup(
            d_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_LoginLayout.createSequentialGroup()
                .addGroup(d_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(d_LoginLayout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(bt_cancelarLogin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_aceptarLogin))
                        .addGroup(d_LoginLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(ps_passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(d_LoginLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(d_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(d_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(tf_usuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        d_LoginLayout.setVerticalGroup(
            d_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_LoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(d_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_LoginLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(tf_usuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(d_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_LoginLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(ps_passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(d_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelarLogin)
                    .addComponent(bt_aceptarLogin))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Administracion de Locales");

        tablaDescripcionLocales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDescripcionLocales);

        bt_AgregarLocal_AdministracionLocales.setText("Agregar Local");
        bt_AgregarLocal_AdministracionLocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarLocal_AdministracionLocalesActionPerformed(evt);
            }
        });

        bt_Cerrar_AdministradorLocales.setText("Cerrar");
        bt_Cerrar_AdministradorLocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cerrar_AdministradorLocalesActionPerformed(evt);
            }
        });

        jLabel5.setText("Lista de Locales");

        javax.swing.GroupLayout d_LocalesAgenciasLayout = new javax.swing.GroupLayout(d_LocalesAgencias.getContentPane());
        d_LocalesAgencias.getContentPane().setLayout(d_LocalesAgenciasLayout);
        d_LocalesAgenciasLayout.setHorizontalGroup(
            d_LocalesAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_LocalesAgenciasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(d_LocalesAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, d_LocalesAgenciasLayout.createSequentialGroup()
                        .addGroup(d_LocalesAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                            .addGroup(d_LocalesAgenciasLayout.createSequentialGroup()
                                .addComponent(bt_AgregarLocal_AdministracionLocales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_Cerrar_AdministradorLocales)))
                        .addGap(42, 42, 42))
                    .addGroup(d_LocalesAgenciasLayout.createSequentialGroup()
                        .addGroup(d_LocalesAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        d_LocalesAgenciasLayout.setVerticalGroup(
            d_LocalesAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_LocalesAgenciasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(d_LocalesAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_AgregarLocal_AdministracionLocales)
                    .addComponent(bt_Cerrar_AdministradorLocales))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Agregar Local");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Código:");

        jLabel9.setText("Latitud: ");

        jLabel10.setText("Logitud: ");

        tf_CodigoLocal_AgregarLocal.setEnabled(false);

        sp_Latitud_AgregarLocal.setModel(new javax.swing.SpinnerNumberModel(0.0d, -90.0d, 90.0d, 0.1d));

        sp_Longitud_AgregarLocal.setModel(new javax.swing.SpinnerNumberModel(0.0d, -180.0d, 90.0d, 0.1d));

        bt_Agregar_AgregarLocal.setText("Agregar");
        bt_Agregar_AgregarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Agregar_AgregarLocalActionPerformed(evt);
            }
        });

        bt_Cancelar_AgregarLocal.setText("Cancelar");
        bt_Cancelar_AgregarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cancelar_AgregarLocalActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 8)); // NOI18N
        jLabel12.setText("Valor entre -90 y 90");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 8)); // NOI18N
        jLabel13.setText("Valor entre -180 y 180");

        javax.swing.GroupLayout d_AgregarLocalLayout = new javax.swing.GroupLayout(d_AgregarLocal.getContentPane());
        d_AgregarLocal.getContentPane().setLayout(d_AgregarLocalLayout);
        d_AgregarLocalLayout.setHorizontalGroup(
            d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_AgregarLocalLayout.createSequentialGroup()
                .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_AgregarLocalLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(d_AgregarLocalLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(d_AgregarLocalLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_CodigoLocal_AgregarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(d_AgregarLocalLayout.createSequentialGroup()
                                .addComponent(bt_Cancelar_AgregarLocal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_Agregar_AgregarLocal))
                            .addGroup(d_AgregarLocalLayout.createSequentialGroup()
                                .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_NombreLocal_AgregarLocal)
                                    .addComponent(sp_Latitud_AgregarLocal)
                                    .addComponent(sp_Longitud_AgregarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        d_AgregarLocalLayout.setVerticalGroup(
            d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_AgregarLocalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_CodigoLocal_AgregarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_NombreLocal_AgregarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sp_Latitud_AgregarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sp_Longitud_AgregarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(d_AgregarLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Agregar_AgregarLocal)
                    .addComponent(bt_Cancelar_AgregarLocal))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout d_AgregarAreaLocalLayout = new javax.swing.GroupLayout(d_AgregarAreaLocal.getContentPane());
        d_AgregarAreaLocal.getContentPane().setLayout(d_AgregarAreaLocalLayout);
        d_AgregarAreaLocalLayout.setHorizontalGroup(
            d_AgregarAreaLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        d_AgregarAreaLocalLayout.setVerticalGroup(
            d_AgregarAreaLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestion de Colas");

        vistas.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout vistaAdministradorLayout = new javax.swing.GroupLayout(vistaAdministrador);
        vistaAdministrador.setLayout(vistaAdministradorLayout);
        vistaAdministradorLayout.setHorizontalGroup(
            vistaAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        vistaAdministradorLayout.setVerticalGroup(
            vistaAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        vistas.add(vistaAdministrador, "card2");

        javax.swing.GroupLayout vistaGerenteLayout = new javax.swing.GroupLayout(vistaGerente);
        vistaGerente.setLayout(vistaGerenteLayout);
        vistaGerenteLayout.setHorizontalGroup(
            vistaGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        vistaGerenteLayout.setVerticalGroup(
            vistaGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        vistas.add(vistaGerente, "card3");

        javax.swing.GroupLayout vistaEmpleadoNormalLayout = new javax.swing.GroupLayout(vistaEmpleadoNormal);
        vistaEmpleadoNormal.setLayout(vistaEmpleadoNormalLayout);
        vistaEmpleadoNormalLayout.setHorizontalGroup(
            vistaEmpleadoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        vistaEmpleadoNormalLayout.setVerticalGroup(
            vistaEmpleadoNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        vistas.add(vistaEmpleadoNormal, "card4");

        menuArchivo.setText("Archivo");

        menuIniciarSesion.setText("Iniciar Sesión");
        menuIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIniciarSesionActionPerformed(evt);
            }
        });
        menuArchivo.add(menuIniciarSesion);

        menuCerrarSeision.setText("Cerrar Sesión");
        menuCerrarSeision.setEnabled(false);
        menuCerrarSeision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSeisionActionPerformed(evt);
            }
        });
        menuArchivo.add(menuCerrarSeision);
        menuArchivo.add(jSeparator4);

        menuSalir.setText("Salir");
        menuArchivo.add(menuSalir);

        jMenuBar1.add(menuArchivo);

        menuBaseDatos.setText("Base de Datos");

        menuLocales.setText("Agencias / Locales");
        menuLocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLocalesActionPerformed(evt);
            }
        });
        menuBaseDatos.add(menuLocales);

        menuDepartamentos.setText("Departamentos / Areas");
        menuBaseDatos.add(menuDepartamentos);
        menuBaseDatos.add(jSeparator2);

        Transacciones.setText("Transacciones");
        menuBaseDatos.add(Transacciones);
        menuBaseDatos.add(jSeparator3);

        menuGerentes.setText("Gerentes");
        menuBaseDatos.add(menuGerentes);

        menuEmpleados.setText("Empleados");
        menuBaseDatos.add(menuEmpleados);
        menuBaseDatos.add(jSeparator5);

        jMenuItem5.setText("Administracion ");
        menuBaseDatos.add(jMenuItem5);

        jMenuBar1.add(menuBaseDatos);

        menuReportes.setText("Reportes");

        jMenuItem1.setText("Log");
        menuReportes.add(jMenuItem1);

        jMenuBar1.add(menuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIniciarSesionActionPerformed
        visualizarLogin();
    }//GEN-LAST:event_menuIniciarSesionActionPerformed

    private void bt_aceptarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_aceptarLoginActionPerformed
        autentificacionLogin();
    }//GEN-LAST:event_bt_aceptarLoginActionPerformed

    private void ps_passwordLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ps_passwordLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            autentificacionLogin();
        }
    }//GEN-LAST:event_ps_passwordLoginKeyPressed

    private void menuCerrarSeisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSeisionActionPerformed
        sesionActiva = false;
        sesion = null;
        JOptionPane.showMessageDialog(this, "Cerro sesion exitosamente");
        menuIniciarSesion.setEnabled(true);
        menuCerrarSeision.setEnabled(false);
        registroCierreSesionLog();
    }//GEN-LAST:event_menuCerrarSeisionActionPerformed

    private void bt_cancelarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarLoginActionPerformed
        cerrarLogin();
    }//GEN-LAST:event_bt_cancelarLoginActionPerformed

    private void bt_AgregarLocal_AdministracionLocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarLocal_AdministracionLocalesActionPerformed
        tf_CodigoLocal_AgregarLocal.setText(String.valueOf(codigoLocalDisponible()));
        d_AgregarLocal.setModal(true);
        d_AgregarLocal.pack();
        d_AgregarLocal.setLocationRelativeTo(d_LocalesAgencias);
        d_AgregarLocal.setVisible(true);
    }//GEN-LAST:event_bt_AgregarLocal_AdministracionLocalesActionPerformed

    private void menuLocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLocalesActionPerformed
        d_LocalesAgencias.setModal(true);
        d_LocalesAgencias.pack();
        d_LocalesAgencias.setLocationRelativeTo(this);
        d_LocalesAgencias.setVisible(true);
        cargarTablaDescripcionLocales();
    }//GEN-LAST:event_menuLocalesActionPerformed

    private void bt_Agregar_AgregarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Agregar_AgregarLocalActionPerformed
        int codigo = Integer.parseInt(tf_CodigoLocal_AgregarLocal.getText());
        String nombreLocal = tf_NombreLocal_AgregarLocal.getText();
        String latitudCadena = sp_Latitud_AgregarLocal.getValue().toString();
        String longitudCadena = sp_Longitud_AgregarLocal.getValue().toString();
        
        if (nombreLocal != "" && latitudCadena != "" && longitudCadena != "") {
            listaLocales.add(new Local(new DescripcionLocal(nombreLocal, 
                    new Ubicacion((double)sp_Latitud_AgregarLocal.getValue(), 
                            (double) sp_Longitud_AgregarLocal.getValue()),
                    codigo)));
            cargarTablaDescripcionLocales();
            d_AgregarLocal.setModal(false);
            d_AgregarLocal.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(d_AgregarLocal, "Revise que todos los campos este completos");
        }
    }//GEN-LAST:event_bt_Agregar_AgregarLocalActionPerformed

    private void bt_Cancelar_AgregarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cancelar_AgregarLocalActionPerformed
        d_AgregarLocal.setModal(false);
        d_AgregarLocal.setVisible(false);
    }//GEN-LAST:event_bt_Cancelar_AgregarLocalActionPerformed

    private void bt_Cerrar_AdministradorLocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cerrar_AdministradorLocalesActionPerformed
        d_LocalesAgencias.setModal(false);
        d_LocalesAgencias.setVisible(false);
        
    }//GEN-LAST:event_bt_Cerrar_AdministradorLocalesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Transacciones;
    private javax.swing.JButton bt_AgregarLocal_AdministracionLocales;
    private javax.swing.JButton bt_Agregar_AgregarLocal;
    private javax.swing.JButton bt_Cancelar_AgregarLocal;
    private javax.swing.JButton bt_Cerrar_AdministradorLocales;
    private javax.swing.JButton bt_aceptarLogin;
    private javax.swing.JButton bt_cancelarLogin;
    private javax.swing.JDialog d_AgregarAreaLocal;
    private javax.swing.JDialog d_AgregarLocal;
    private javax.swing.JDialog d_LocalesAgencias;
    private javax.swing.JDialog d_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuBaseDatos;
    private javax.swing.JMenuItem menuCerrarSeision;
    private javax.swing.JMenuItem menuDepartamentos;
    private javax.swing.JMenuItem menuEmpleados;
    private javax.swing.JMenuItem menuGerentes;
    private javax.swing.JMenuItem menuIniciarSesion;
    private javax.swing.JMenuItem menuLocales;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPasswordField ps_passwordLogin;
    private javax.swing.JSpinner sp_Latitud_AgregarLocal;
    private javax.swing.JSpinner sp_Longitud_AgregarLocal;
    private javax.swing.JTable tablaDescripcionLocales;
    private javax.swing.JTextField tf_CodigoLocal_AgregarLocal;
    private javax.swing.JTextField tf_NombreLocal_AgregarLocal;
    private javax.swing.JTextField tf_usuarioLogin;
    private javax.swing.JPanel vistaAdministrador;
    private javax.swing.JPanel vistaEmpleadoNormal;
    private javax.swing.JPanel vistaGerente;
    private javax.swing.JPanel vistas;
    // End of variables declaration//GEN-END:variables

    //Variables
    boolean sesionActiva;
    Empleado sesion;
    ArrayList<Local> listaLocales = new ArrayList<Local>();
    ArrayList<String> listaAreasTipo = new ArrayList<String>();
    ArrayList<Transaccion> listaTransaccionesTipo = new ArrayList<Transaccion>();
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    ArrayList<Persona> listaCliente = new ArrayList<Persona>();
    
    //Modelos
    Object[] titulosTablaDescripcionLocal = {"Código","Nombre Local","Ubicacion"};
    DefaultTableModel modeloTablaDescripcionLocal = new DefaultTableModel(titulosTablaDescripcionLocal , 0){
        @Override
        public boolean isCellEditable(int row, int column) {
        //all cells false
        return false;}};
    DefaultListModel modeloListaAreasTipo = new DefaultListModel();
    
    //Login temporal
    Administrador administradorDefault = new Administrador("joliva","123","Juan Oliva","1");
    
    //Metodo provisional
    public void poblarListaEmpleados(){
        listaEmpleados.add(administradorDefault);
    }
    
    public void visualizarLogin(){
        tf_usuarioLogin.setText("");
        ps_passwordLogin.setText("");
        d_Login.pack();
        d_Login.setLocationRelativeTo(this);
        d_Login.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        d_Login.setVisible(true);
        tf_usuarioLogin.requestFocus();
    }
    
    public void autentificacionLogin(){
        String usuario = tf_usuarioLogin.getText();
        String password = String.valueOf(ps_passwordLogin.getPassword());
        boolean usuarioExiteSistema = false;
        for (Empleado e : listaEmpleados) {
            usuarioExiteSistema = e.autentificacion(usuario, password);
            if (usuarioExiteSistema) {
                sesion = e;
                break;
            }
        }
        if (usuarioExiteSistema) {
            JOptionPane.showMessageDialog(d_Login,sesion.getNombre()+" ha ingresado exitosamente");
            d_Login.setVisible(false);
            //agregar permisos
            menuIniciarSesion.setEnabled(false);
            menuCerrarSeision.setEnabled(true);
            //agregar a log
            registroInicioSesionLog();
        }else{
            JOptionPane.showMessageDialog(d_Login, "Usuario o contraseña incorrecto(s)");
        }
    }

    private void cerrarLogin() {
        d_Login.setVisible(false);
    }
    
    private void inicializarPermisosSesion(){
        if (sesion instanceof Administrador) {
            activarPermisosAdministrador();
            return;
        }
        if (sesion instanceof Gerente) {
            activarPermisosGenerente();
            return;
        }
        if (sesion instanceof EmpleadoNormal) {
            activarPermisosEmpleadoNormal();
        }
    }
    
    //Pendiente activar permisos para cada usuario y las pantallas que utilizaran
    private void activarPermisosAdministrador() {
        
    }

    private void activarPermisosGenerente() {
        
    }

    private void activarPermisosEmpleadoNormal() {
    
    
    }

    //Pendiente escribir metodo del LOG
    private void registroInicioSesionLog() {
    }
    
    //Pendiente escribir metodo del LOG
    private void registroCierreSesionLog() {
    }
    
    //Clase creada para poder registrar cierre de cesion un cierre de programa 
    private class Evento  implements WindowListener{
        public void windowClosing(WindowEvent e) {registroCierreSesionLog();}
        public void windowOpened(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
    }

    public void cargarTablaDescripcionLocales(){
        modeloTablaDescripcionLocal.setRowCount(0);
        for (Local l : listaLocales) {
            modeloTablaDescripcionLocal.addRow(l.getTablaDescrion());
        }
        tablaDescripcionLocales.setModel(modeloTablaDescripcionLocal);
    }
    
    public int codigoLocalDisponible(){
        int codigo = 0;
        for (Local l : listaLocales) {
            int cl = l.getDescripcionLocal().getCodigoLocal();
            codigo = cl > codigo ? cl : codigo ;
        }
        return codigo+1;
    }
    
}
