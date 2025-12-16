package proyectofinal;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
    
    public GUI() {
        initComponents();
        txtCombate.setEditable(false);
        
        //Opciones de clase
        opcionesClase.removeAllItems();
        opcionesClase.addItem("Bárbaro");
        opcionesClase.addItem("Bardo");
        opcionesClase.addItem("Brujo");
        opcionesClase.addItem("Clérigo");
        opcionesClase.addItem("Druida");
        opcionesClase.addItem("Explorador");
        opcionesClase.addItem("Guerrero");
        opcionesClase.addItem("Hechicero");
        opcionesClase.addItem("Mago");
        opcionesClase.addItem("Monje");
        opcionesClase.addItem("Paladín");
        opcionesClase.addItem("Pícaro");
        
        //Opciones de raza
        opcionesRaza.removeAllItems();
        opcionesRaza.addItem("Dracónido");
        opcionesRaza.addItem("Elfo");
        opcionesRaza.addItem("Enano");
        opcionesRaza.addItem("Gnomo");
        opcionesRaza.addItem("Halfling");
        opcionesRaza.addItem("Humano");
        opcionesRaza.addItem("Orco");
        opcionesRaza.addItem("Tiefling");
        
        //Opciones de personaje
        listaPersonajes.removeAll();
        for (Personaje temp : personajes){
            lista1.addElement(temp.getNombre());
        }
        listaPersonajes.setModel(lista1);
        
        //Opciones de tienda
        listaObjetos.removeAll();
        for (Objeto temp : objetos){
            lista2.addElement(temp.toString());
        }
        listaObjetos.setModel(lista2);
        
        //Inventario
        tablaInventario.setModel(tabla);
        tablaInventario.setRowHeight(40);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelMenuInicial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnHistoriaMundo = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnTutorial = new javax.swing.JButton();
        panelMenuPersonaje = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCrearPersonaje = new javax.swing.JButton();
        btnSeleccionarPersonaje = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        panelCrearPersonaje = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnInfoClases = new javax.swing.JButton();
        btnInfoRazas = new javax.swing.JButton();
        opcionesClase = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        opcionesRaza = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnVolver4 = new javax.swing.JButton();
        btnManual = new javax.swing.JButton();
        btnAzar = new javax.swing.JButton();
        btnValoresBase = new javax.swing.JButton();
        labelVida = new javax.swing.JLabel();
        labelAtaque = new javax.swing.JLabel();
        labelDefensa = new javax.swing.JLabel();
        txtVida = new javax.swing.JTextField();
        txtAtaque = new javax.swing.JTextField();
        txtDefensa = new javax.swing.JTextField();
        panelSeleccionarPersonaje = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPersonajes = new javax.swing.JList<>();
        btnVolver5 = new javax.swing.JButton();
        btnInfoPersonaje = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        panelMenuPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnIniciarMision = new javax.swing.JButton();
        btnEntrenar = new javax.swing.JButton();
        btnExplorar = new javax.swing.JButton();
        btnVerTienda = new javax.swing.JButton();
        btnVerInventario = new javax.swing.JButton();
        btnVerEstadisticas = new javax.swing.JButton();
        panelCombate = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCombate = new javax.swing.JTextArea();
        btnAtacar = new javax.swing.JButton();
        btnDefender = new javax.swing.JButton();
        btnUsarObjeto = new javax.swing.JButton();
        panelTienda = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaObjetos = new javax.swing.JList<>();
        btnComprar = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();
        panelInventario = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        btnUsarObjeto2 = new javax.swing.JButton();
        btnEliminarObjeto = new javax.swing.JButton();
        btnVolver3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.CardLayout());

        panelMenuInicial.setBackground(new java.awt.Color(159, 221, 221));
        panelMenuInicial.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel2.setBackground(new java.awt.Color(45, 106, 122));
        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 63, 72));
        jLabel2.setText("CrystalQuest");

        btnHistoriaMundo.setBackground(new java.awt.Color(27, 63, 72));
        btnHistoriaMundo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHistoriaMundo.setForeground(new java.awt.Color(255, 255, 255));
        btnHistoriaMundo.setText("Historia del Mundo");
        btnHistoriaMundo.setPreferredSize(new java.awt.Dimension(270, 52));
        btnHistoriaMundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaMundoActionPerformed(evt);
            }
        });

        btnJugar.setBackground(new java.awt.Color(27, 63, 72));
        btnJugar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("Jugar");
        btnJugar.setPreferredSize(new java.awt.Dimension(270, 52));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnTutorial.setBackground(new java.awt.Color(27, 63, 72));
        btnTutorial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnTutorial.setForeground(new java.awt.Color(255, 255, 255));
        btnTutorial.setText("¿Cómo jugar?");
        btnTutorial.setPreferredSize(new java.awt.Dimension(270, 52));
        btnTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuInicialLayout = new javax.swing.GroupLayout(panelMenuInicial);
        panelMenuInicial.setLayout(panelMenuInicialLayout);
        panelMenuInicialLayout.setHorizontalGroup(
            panelMenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuInicialLayout.createSequentialGroup()
                .addGroup(panelMenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuInicialLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuInicialLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(panelMenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnHistoriaMundo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTutorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        panelMenuInicialLayout.setVerticalGroup(
            panelMenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuInicialLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnHistoriaMundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        panel.add(panelMenuInicial, "card2");

        panelMenuPersonaje.setBackground(new java.awt.Color(159, 221, 221));
        panelMenuPersonaje.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 63, 72));
        jLabel1.setText("Personaje");

        btnCrearPersonaje.setBackground(new java.awt.Color(27, 63, 72));
        btnCrearPersonaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCrearPersonaje.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearPersonaje.setText("Crear Personaje");
        btnCrearPersonaje.setBorderPainted(false);
        btnCrearPersonaje.setPreferredSize(new java.awt.Dimension(270, 52));
        btnCrearPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPersonajeActionPerformed(evt);
            }
        });

        btnSeleccionarPersonaje.setBackground(new java.awt.Color(27, 63, 72));
        btnSeleccionarPersonaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSeleccionarPersonaje.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarPersonaje.setText("Seleccionar Personaje");
        btnSeleccionarPersonaje.setBorderPainted(false);
        btnSeleccionarPersonaje.setPreferredSize(new java.awt.Dimension(270, 52));
        btnSeleccionarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarPersonajeActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(27, 63, 72));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setPreferredSize(new java.awt.Dimension(270, 52));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPersonajeLayout = new javax.swing.GroupLayout(panelMenuPersonaje);
        panelMenuPersonaje.setLayout(panelMenuPersonajeLayout);
        panelMenuPersonajeLayout.setHorizontalGroup(
            panelMenuPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPersonajeLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(panelMenuPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearPersonaje, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(btnSeleccionarPersonaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        panelMenuPersonajeLayout.setVerticalGroup(
            panelMenuPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPersonajeLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnCrearPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnSeleccionarPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        panel.add(panelMenuPersonaje, "card3");

        panelCrearPersonaje.setBackground(new java.awt.Color(159, 221, 221));
        panelCrearPersonaje.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Edwardian Script ITC", 1, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 63, 72));
        jLabel4.setText("Crear Personaje");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Clase:");

        btnInfoClases.setBackground(new java.awt.Color(27, 63, 72));
        btnInfoClases.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInfoClases.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoClases.setText("Información de Clases");
        btnInfoClases.setBorderPainted(false);
        btnInfoClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoClasesActionPerformed(evt);
            }
        });

        btnInfoRazas.setBackground(new java.awt.Color(27, 63, 72));
        btnInfoRazas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInfoRazas.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoRazas.setText("Información de Razas");
        btnInfoRazas.setBorderPainted(false);
        btnInfoRazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoRazasActionPerformed(evt);
            }
        });

        opcionesClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        opcionesClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesClaseActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Raza:");

        opcionesRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        opcionesRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesRazaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Elija método para definir las estadísticas del personaje:");

        btnCrear.setBackground(new java.awt.Color(27, 63, 72));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.setBorderPainted(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnVolver4.setBackground(new java.awt.Color(27, 63, 72));
        btnVolver4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver4.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver4.setText("Volver");
        btnVolver4.setBorderPainted(false);
        btnVolver4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver4ActionPerformed(evt);
            }
        });

        btnManual.setBackground(new java.awt.Color(27, 63, 72));
        btnManual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManual.setForeground(new java.awt.Color(255, 255, 255));
        btnManual.setText("Manual");
        btnManual.setBorderPainted(false);
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });

        btnAzar.setBackground(new java.awt.Color(27, 63, 72));
        btnAzar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAzar.setForeground(new java.awt.Color(255, 255, 255));
        btnAzar.setText("Azar");
        btnAzar.setBorderPainted(false);
        btnAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzarActionPerformed(evt);
            }
        });

        btnValoresBase.setBackground(new java.awt.Color(27, 63, 72));
        btnValoresBase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnValoresBase.setForeground(new java.awt.Color(255, 255, 255));
        btnValoresBase.setText("Valores predefinidos");
        btnValoresBase.setBorderPainted(false);
        btnValoresBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValoresBaseActionPerformed(evt);
            }
        });

        labelVida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelVida.setText("Vida:");

        labelAtaque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelAtaque.setText("Ataque:");

        labelDefensa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDefensa.setText("Defensa:");

        txtVida.setEnabled(false);
        txtVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidaActionPerformed(evt);
            }
        });

        txtAtaque.setEnabled(false);

        txtDefensa.setEnabled(false);

        javax.swing.GroupLayout panelCrearPersonajeLayout = new javax.swing.GroupLayout(panelCrearPersonaje);
        panelCrearPersonaje.setLayout(panelCrearPersonajeLayout);
        panelCrearPersonajeLayout.setHorizontalGroup(
            panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAtaque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(labelDefensa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelVida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 380, Short.MAX_VALUE))
                            .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                        .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(btnInfoClases)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnInfoRazas))
                                .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                                    .addGap(146, 146, 146)
                                    .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(opcionesClase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(opcionesRaza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearPersonajeLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel12))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearPersonajeLayout.createSequentialGroup()
                                    .addGap(132, 132, 132)
                                    .addComponent(btnManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAzar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnValoresBase)))
                            .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnVolver4)
                                .addGap(152, 152, 152)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        panelCrearPersonajeLayout.setVerticalGroup(
            panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoClases)
                    .addComponent(btnInfoRazas))
                .addGap(18, 18, 18)
                .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(opcionesClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(opcionesRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManual)
                    .addComponent(btnAzar)
                    .addComponent(btnValoresBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVida)
                    .addComponent(labelDefensa)
                    .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAtaque)
                    .addComponent(txtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearPersonajeLayout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearPersonajeLayout.createSequentialGroup()
                        .addComponent(btnVolver4)
                        .addGap(27, 27, 27))))
        );

        panel.add(panelCrearPersonaje, "card7");

        panelSeleccionarPersonaje.setBackground(new java.awt.Color(159, 221, 221));
        panelSeleccionarPersonaje.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Edwardian Script ITC", 1, 80)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 63, 72));
        jLabel5.setText("Personajes");

        listaPersonajes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listaPersonajes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listaPersonajes);

        btnVolver5.setBackground(new java.awt.Color(27, 63, 72));
        btnVolver5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolver5.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver5.setText("Volver");
        btnVolver5.setBorderPainted(false);
        btnVolver5.setPreferredSize(new java.awt.Dimension(103, 40));
        btnVolver5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver5ActionPerformed(evt);
            }
        });

        btnInfoPersonaje.setBackground(new java.awt.Color(27, 63, 72));
        btnInfoPersonaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnInfoPersonaje.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoPersonaje.setText("Información");
        btnInfoPersonaje.setBorderPainted(false);
        btnInfoPersonaje.setPreferredSize(new java.awt.Dimension(168, 40));
        btnInfoPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoPersonajeActionPerformed(evt);
            }
        });

        btnSeleccionar.setBackground(new java.awt.Color(27, 63, 72));
        btnSeleccionar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBorderPainted(false);
        btnSeleccionar.setPreferredSize(new java.awt.Dimension(168, 40));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Elija un personaje de la lista:");

        javax.swing.GroupLayout panelSeleccionarPersonajeLayout = new javax.swing.GroupLayout(panelSeleccionarPersonaje);
        panelSeleccionarPersonaje.setLayout(panelSeleccionarPersonajeLayout);
        panelSeleccionarPersonajeLayout.setHorizontalGroup(
            panelSeleccionarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionarPersonajeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnVolver5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleccionarPersonajeLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(panelSeleccionarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleccionarPersonajeLayout.createSequentialGroup()
                        .addGroup(panelSeleccionarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSeleccionarPersonajeLayout.createSequentialGroup()
                                .addComponent(btnInfoPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSeleccionarPersonajeLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSeleccionarPersonajeLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel16)))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleccionarPersonajeLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
        );
        panelSeleccionarPersonajeLayout.setVerticalGroup(
            panelSeleccionarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionarPersonajeLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSeleccionarPersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnVolver5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        panel.add(panelSeleccionarPersonaje, "card8");

        panelMenuPrincipal.setBackground(new java.awt.Color(159, 221, 221));
        panelMenuPrincipal.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel3.setBackground(new java.awt.Color(45, 106, 122));
        jLabel3.setFont(new java.awt.Font("Edwardian Script ITC", 1, 80)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 63, 72));
        jLabel3.setText("Acciones");

        btnIniciarMision.setBackground(new java.awt.Color(27, 63, 72));
        btnIniciarMision.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnIniciarMision.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarMision.setText("Iniciar Misión");
        btnIniciarMision.setBorderPainted(false);
        btnIniciarMision.setPreferredSize(new java.awt.Dimension(270, 45));
        btnIniciarMision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarMisionActionPerformed(evt);
            }
        });

        btnEntrenar.setBackground(new java.awt.Color(27, 63, 72));
        btnEntrenar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEntrenar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrenar.setText("Entrenar");
        btnEntrenar.setBorderPainted(false);
        btnEntrenar.setPreferredSize(new java.awt.Dimension(270, 45));
        btnEntrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenarActionPerformed(evt);
            }
        });

        btnExplorar.setBackground(new java.awt.Color(27, 63, 72));
        btnExplorar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExplorar.setForeground(new java.awt.Color(255, 255, 255));
        btnExplorar.setText("Explorar");
        btnExplorar.setBorderPainted(false);
        btnExplorar.setMinimumSize(new java.awt.Dimension(128, 39));
        btnExplorar.setPreferredSize(new java.awt.Dimension(270, 45));
        btnExplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplorarActionPerformed(evt);
            }
        });

        btnVerTienda.setBackground(new java.awt.Color(27, 63, 72));
        btnVerTienda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVerTienda.setForeground(new java.awt.Color(255, 255, 255));
        btnVerTienda.setText("Ver Tienda");
        btnVerTienda.setBorderPainted(false);
        btnVerTienda.setPreferredSize(new java.awt.Dimension(270, 45));
        btnVerTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTiendaActionPerformed(evt);
            }
        });

        btnVerInventario.setBackground(new java.awt.Color(27, 63, 72));
        btnVerInventario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVerInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnVerInventario.setText("Ver Inventario");
        btnVerInventario.setBorderPainted(false);
        btnVerInventario.setPreferredSize(new java.awt.Dimension(270, 45));
        btnVerInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInventarioActionPerformed(evt);
            }
        });

        btnVerEstadisticas.setBackground(new java.awt.Color(23, 63, 72));
        btnVerEstadisticas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVerEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEstadisticas.setText("Ver Estadísticas");
        btnVerEstadisticas.setBorderPainted(false);
        btnVerEstadisticas.setPreferredSize(new java.awt.Dimension(270, 45));
        btnVerEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPrincipalLayout.createSequentialGroup()
                            .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnVerInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnIniciarMision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnVerEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(165, 165, 165))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(176, 176, 176)))
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExplorar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEntrenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarMision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExplorar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panel.add(panelMenuPrincipal, "card4");

        panelCombate.setBackground(new java.awt.Color(159, 221, 221));
        panelCombate.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel6.setBackground(new java.awt.Color(45, 106, 122));
        jLabel6.setFont(new java.awt.Font("Edwardian Script ITC", 1, 80)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 63, 72));
        jLabel6.setText("Combate");

        txtCombate.setBackground(new java.awt.Color(27, 63, 72));
        txtCombate.setColumns(20);
        txtCombate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCombate.setForeground(new java.awt.Color(255, 255, 255));
        txtCombate.setRows(5);
        jScrollPane1.setViewportView(txtCombate);

        btnAtacar.setBackground(new java.awt.Color(27, 63, 72));
        btnAtacar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtacar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtacar.setText("Atacar");
        btnAtacar.setBorderPainted(false);
        btnAtacar.setPreferredSize(new java.awt.Dimension(164, 40));
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });

        btnDefender.setBackground(new java.awt.Color(27, 63, 72));
        btnDefender.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDefender.setForeground(new java.awt.Color(255, 255, 255));
        btnDefender.setText("Defender");
        btnDefender.setBorderPainted(false);
        btnDefender.setPreferredSize(new java.awt.Dimension(164, 40));
        btnDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefenderActionPerformed(evt);
            }
        });

        btnUsarObjeto.setBackground(new java.awt.Color(27, 63, 72));
        btnUsarObjeto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUsarObjeto.setForeground(new java.awt.Color(255, 255, 255));
        btnUsarObjeto.setText("Usar Objeto");
        btnUsarObjeto.setBorderPainted(false);
        btnUsarObjeto.setPreferredSize(new java.awt.Dimension(164, 40));
        btnUsarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsarObjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCombateLayout = new javax.swing.GroupLayout(panelCombate);
        panelCombate.setLayout(panelCombateLayout);
        panelCombateLayout.setHorizontalGroup(
            panelCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCombateLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCombateLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(panelCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCombateLayout.createSequentialGroup()
                        .addComponent(btnAtacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDefender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsarObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        panelCombateLayout.setVerticalGroup(
            panelCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCombateLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(panelCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsarObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDefender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        panel.add(panelCombate, "card9");

        panelTienda.setBackground(new java.awt.Color(159, 221, 221));
        panelTienda.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel7.setBackground(new java.awt.Color(45, 106, 122));
        jLabel7.setFont(new java.awt.Font("Edwardian Script ITC", 1, 80)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 63, 72));
        jLabel7.setText("Tienda");

        listaObjetos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listaObjetos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaObjetos);

        btnComprar.setBackground(new java.awt.Color(27, 63, 72));
        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("Comprar");
        btnComprar.setBorderPainted(false);
        btnComprar.setPreferredSize(new java.awt.Dimension(128, 40));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnVolver2.setBackground(new java.awt.Color(27, 63, 72));
        btnVolver2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver2.setText("Volver");
        btnVolver2.setBorderPainted(false);
        btnVolver2.setPreferredSize(new java.awt.Dimension(103, 40));
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTiendaLayout = new javax.swing.GroupLayout(panelTienda);
        panelTienda.setLayout(panelTiendaLayout);
        panelTiendaLayout.setHorizontalGroup(
            panelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiendaLayout.createSequentialGroup()
                .addGroup(panelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTiendaLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTiendaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTiendaLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTiendaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        panelTiendaLayout.setVerticalGroup(
            panelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiendaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panel.add(panelTienda, "card13");

        panelInventario.setBackground(new java.awt.Color(159, 221, 221));
        panelInventario.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel8.setBackground(new java.awt.Color(45, 106, 122));
        jLabel8.setFont(new java.awt.Font("Edwardian Script ITC", 1, 80)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(27, 63, 72));
        jLabel8.setText("Inventario");

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""},
                {"", "", ""},
                {"", "", ""},
                {"", "", ""},
                {"", "", null}
            },
            new String [] {
                "1", "2", "3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInventario.setColumnSelectionAllowed(true);
        tablaInventario.setShowGrid(true);
        jScrollPane2.setViewportView(tablaInventario);
        tablaInventario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnUsarObjeto2.setBackground(new java.awt.Color(27, 63, 72));
        btnUsarObjeto2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUsarObjeto2.setForeground(new java.awt.Color(255, 255, 255));
        btnUsarObjeto2.setText("Usar Objeto");
        btnUsarObjeto2.setBorderPainted(false);
        btnUsarObjeto2.setPreferredSize(new java.awt.Dimension(210, 40));
        btnUsarObjeto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsarObjeto2ActionPerformed(evt);
            }
        });

        btnEliminarObjeto.setBackground(new java.awt.Color(27, 63, 72));
        btnEliminarObjeto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEliminarObjeto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarObjeto.setText("Eliminar Objeto");
        btnEliminarObjeto.setBorderPainted(false);
        btnEliminarObjeto.setPreferredSize(new java.awt.Dimension(210, 40));
        btnEliminarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarObjetoActionPerformed(evt);
            }
        });

        btnVolver3.setBackground(new java.awt.Color(27, 63, 72));
        btnVolver3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver3.setText("Volver");
        btnVolver3.setBorderPainted(false);
        btnVolver3.setPreferredSize(new java.awt.Dimension(103, 40));
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInventarioLayout = new javax.swing.GroupLayout(panelInventario);
        panelInventario.setLayout(panelInventarioLayout);
        panelInventarioLayout.setHorizontalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addGroup(panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInventarioLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInventarioLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnUsarObjeto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEliminarObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInventarioLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelInventarioLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelInventarioLayout.setVerticalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInventarioLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsarObjeto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panel.add(panelInventario, "card12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    DefaultListModel<String> lista1 = new DefaultListModel<>();
    DefaultListModel<String> lista2 = new DefaultListModel<>();
    DefaultTableModel tabla = new DefaultTableModel(3,5);
    public static Random azar = new Random();
    public static Personaje personaje;
    public static ArrayList <Personaje> personajes = new ArrayList();
    public static ArrayList <Enemigo> enemigos = new ArrayList();
    public static ArrayList <Enemigo> jefes = new ArrayList();
    public static ArrayList <Objeto> objetos = new ArrayList();
    public static Objeto [][] inventario = new Objeto[3][5];
    public static boolean cristales [] = {false, false, false, false, false};
    public static Combate combateActual;
    public static int nivel = 1;
    public static int oro = 0;
    
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
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
        
        //Personajes default
        personajes.add(new Personaje("Mirael", "Pícaro", "Halfling", 29, 9, 3));
        personajes.add(new Personaje("Borin", "Clérigo", "Enano", 31, 6, 5));
        personajes.add(new Personaje("Aerin", "Maga", "Elfo", 30, 9, 1));
        personajes.add(new Personaje("Lyra", "Druida", "Tiefling", 28, 9, 3));
        personajes.add(new Personaje("Kael", "Paladín", "Humano", 34, 8, 5));
        
        //Enemigos comunes
        enemigos.add(new Enemigo("Slime Cristalino", 20, 4, 1, false));
        enemigos.add(new Enemigo("Ladrón Sombrío", 22, 6, 2, false));
        enemigos.add(new Enemigo("Bestia del Cristal", 28, 7, 3, false));
        enemigos.add(new Enemigo("Guardia Corrupto", 25, 6, 4, false));
        enemigos.add(new Enemigo("Espíritu Fragmentado", 18, 8, 1, false));
        
        //Jefes
        jefes.add(new Enemigo("Kaelthar", 50, 9, 5, true));
        jefes.add(new Enemigo("Sylvaen", 60, 8, 7, true));
        jefes.add(new Enemigo("Nyxara", 48, 11, 4, true));
        jefes.add(new Enemigo("Vorgrim", 65, 10, 6, true));
        jefes.add(new Enemigo("Astrax", 70, 12, 7, true));
        
        //Objetos
        objetos.add(new Objeto("Poción Menor", "+VIDA", 5, 15));
        objetos.add(new Objeto("Poción Media", "+VIDA", 10, 30));
        objetos.add(new Objeto("Poción Mayor", "+VIDA", 15, 50));
        objetos.add(new Objeto("Esencia Curativa", "+VIDA", 8, 25));
        objetos.add(new Objeto("Cristal Sanador", "+VIDA", 12, 40));
        objetos.add(new Objeto("Brebaje Antiguo", "+VIDA", 18, 70));
        objetos.add(new Objeto("Elixir Vital", "+VIDA", 20, 90));
        
        objetos.add(new Objeto("Amuleto Agresivo", "+ATQ", 1, 40));
        objetos.add(new Objeto("Pergamino de Fuerza", "+ATQ", 2, 65));
        objetos.add(new Objeto("Runa de Poder", "+ATQ", 3, 90));
        objetos.add(new Objeto("Cristal Cortante", "+ATQ", 4, 120));
        
        objetos.add(new Objeto("Amuleto Defensivo", "+DEF", 1, 35));
        objetos.add(new Objeto("Escudo de Cristal", "+DEF", 2, 60));
        objetos.add(new Objeto("Armadura Ligera", "+DEF", 3, 85));
        objetos.add(new Objeto("Talismán Antiguo", "+DEF", 4, 115));
    }
    
    private void btnCrearPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPersonajeActionPerformed
        panel.removeAll();
        panel.add(panelCrearPersonaje);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnCrearPersonajeActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        panel.removeAll();
        panel.add(panelMenuPrincipal);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        if (objetoEnCombate){
            panel.removeAll();
            panel.add(panelCombate);
            panel.repaint();
            panel.revalidate();
        }
        else{
            panel.removeAll();
            panel.add(panelMenuPrincipal);
            panel.repaint();
            panel.revalidate();
        }
    }//GEN-LAST:event_btnVolver3ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnInfoPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoPersonajeActionPerformed
        int indice = listaPersonajes.getSelectedIndex();
        if (indice == -1){
            JOptionPane.showMessageDialog(this, "Seleccione un personaje primero", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Personaje temp = personajes.get(indice);
        
        String info = 
                "Nombre: " + temp.getNombre() + "\n" +
                "Raza: " + temp.getRaza() + "\n" +
                "Clase: " + temp.getClase() + "\n" +
                "Vida: " + temp.getVida() + "\n" +
                "Ataque: " + temp.getAtaque() + "\n" +
                "Defensa: " + temp.getDefensa();
        
        JOptionPane.showMessageDialog(this, info, "Información del personaje",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoPersonajeActionPerformed

    private void btnVolver5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver5ActionPerformed
        panel.removeAll();
        panel.add(panelMenuPersonaje);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnVolver5ActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        panel.removeAll();
        panel.add(panelMenuPersonaje);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnHistoriaMundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaMundoActionPerformed
        String historia = """
                          Crystal Quest
                          
                          El reino de Vitrallia prosperó durante siglos gracias a los      
                          Cristales Ancestrales, reliquias mágicas que mantenían el 
                          equilibrio del mundo.
                          Pero en las sombras, antiguas criaturas y seres olvidados
                          dejaron de luchar entre sí y formaron una peligrosa unión.
                          Unidos por la ambición, lograron lo impensable: robar los
                          Cristales Ancestrales y dispersarlos por el reino, dejando
                          a Vitrallia en el caos.
                          El reino de volvió peligroso, los pueblos quedaron aislados
                          y los fragmentos del cristal ahora son custodiados por cinco
                          poderosos enemigos.
                          Ahora, un nuevo aventurero se alza para salvar el reino.
                          Recupera los cristales, derrota a los enemigos y devuelve la
                          luz y esperanza al reino.
                          Tu destino está a punto de comenzar...""";
        JOptionPane.showMessageDialog(this, historia, "Historia", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHistoriaMundoActionPerformed

    private void btnTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutorialActionPerformed
        String tutorial ="""
                         1. Crea o selecciona un personaje.
                            Cada personaje cuenta con una raza, clase y estadísticas únicas.
                         2. Accede al menú principal.
                            Contarás con diferentes acciones a realizar.
                            Iniciar la misión lleva al combate contra el jefe para intentar
                            recuperar el cristal.
                         3. Combate.
                            Durante el combate podrás atacar, defenderte, o usar objetos
                            para derrotar al jefe y ganar un cristal.
                         4. Progresión del juego.
                            Al explorar y vencer enemigos ganarás experiencia, dinero, y
                            objetos que mejorarán a tu personaje.
                         5. Objetivo.
                            Derrota a los jefes, obtén los cristales y completa la aventura.
                            ¡Toma decisiones estratégicas y salva el reino de Vitrallia!""";
        JOptionPane.showMessageDialog(this, tutorial, "¿Cómo funciona?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnTutorialActionPerformed

    private void btnSeleccionarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarPersonajeActionPerformed
        panel.removeAll();
        panel.add(panelSeleccionarPersonaje);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnSeleccionarPersonajeActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        panel.removeAll();
        panel.add(panelMenuInicial);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnInfoClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoClasesActionPerformed
        String descClases = """
                            Barbaro: +3 ATQ, -1 DEF
                            Bardo: +1 ATQ, +2 DEF
                            Brujo: +3 ATQ, -1 VIDA
                            Clérigo: +2 DEF, +1 VIDA
                            Druida: +1 DEF, +2 VIDA
                            Explorador: +3 DEF
                            Guerrero: +2 ATQ, +1 DEF
                            Hechicero: +3 ATQ
                            Mago: +5 ATQ, -2 DEF
                            Monje: +1 ATQ, +1 DEF, +1 VIDA
                            Paladin: +2 ATQ, +1 DEF
                            Picaro: +3 ATQ""";
        JOptionPane.showMessageDialog(this, descClases, "Clases disponibles", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoClasesActionPerformed

    private void btnInfoRazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoRazasActionPerformed
        String descRazas = """
                           Dracónido: +2 ATQ, +1 VIDA
                           Elfo: +1 DEF, +2 VIDA
                           Enano: +2 DEF, +1 VIDA
                           Gnomo: +3 DEF
                           Halfling: +1 ATQ, +1 DEF, +1 VIDA
                           Humano: +2 ATQ, +1 DEF
                           Orco: +4 ATQ, -1 DEF
                           Tiefling: +2 ATQ, +1 DEF""";
        JOptionPane.showMessageDialog(this, descRazas, "Razas disponibles", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoRazasActionPerformed

    private void opcionesClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesClaseActionPerformed
        
    }//GEN-LAST:event_opcionesClaseActionPerformed

    private void opcionesRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesRazaActionPerformed
        
    }//GEN-LAST:event_opcionesRazaActionPerformed

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        txtVida.setEnabled(true);
        txtAtaque.setEnabled(true);
        txtDefensa.setEnabled(true);
        txtVida.setEditable(true);
        txtAtaque.setEditable(true);
        txtDefensa.setEditable(true);
        txtVida.setText("(20-40)");
        txtAtaque.setText("(4-8)");
        txtDefensa.setText("(1-4)");
    }//GEN-LAST:event_btnManualActionPerformed

    private void btnAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzarActionPerformed
        txtVida.setEnabled(true);
        txtAtaque.setEnabled(true);
        txtDefensa.setEnabled(true);
        txtVida.setEditable(false);
        txtAtaque.setEditable(false);
        txtDefensa.setEditable(false);
        int vida = azar.nextInt(20,46);
        int ataque = azar.nextInt(4,11);
        int defensa = azar.nextInt(1,7);
        txtVida.setText(""+vida);
        txtAtaque.setText(""+ataque);
        txtDefensa.setText(""+defensa);
    }//GEN-LAST:event_btnAzarActionPerformed

    private void btnValoresBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValoresBaseActionPerformed
        txtVida.setEnabled(true);
        txtAtaque.setEnabled(true);
        txtDefensa.setEnabled(true);
        txtVida.setEditable(false);
        txtAtaque.setEditable(false);
        txtDefensa.setEditable(false);
        txtVida.setText("30");
        txtAtaque.setText("6");
        txtDefensa.setText("3");
    }//GEN-LAST:event_btnValoresBaseActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombre = txtNombre.getText();
        String vidatxt = txtVida.getText();
        String ataquetxt = txtAtaque.getText();
        String defensatxt = txtDefensa.getText();
        if (nombre.isBlank()){
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.");
            return;
        }
        
        int vida;
        int ataque;
        int defensa;
        try{
            vida = Integer.parseInt(vidatxt);
            ataque = Integer.parseInt(ataquetxt);
            defensa = Integer.parseInt(defensatxt);
            if (vida > 45 || vida < 20){
                JOptionPane.showMessageDialog(this, "Tiene que ingresar números enteros válidos dentro del rango.");
                return;
            }
            if (ataque > 10 || ataque < 4){
                JOptionPane.showMessageDialog(this, "Tiene que ingresar números enteros válidos dentro del rango.");
                return;
            }
            if (defensa > 6 || defensa < 1){
                JOptionPane.showMessageDialog(this, "Tiene que ingresar números enteros válidos dentro del rango.");
                return;
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Tiene que ingresar números enteros válidos dentro del rango.");
            return;
        }
        
        String clase = opcionesClase.getSelectedItem().toString();
        switch (clase){
            case "Bárbaro":
                ataque += 3;
                defensa -= 1;
                break;
             
            case "Bardo":
                ataque += 1;
                defensa += 2;
                break;
            
            case "Brujo":
                ataque += 3;
                vida -= 1;
                break;
            
            case "Clérigo":
                defensa += 2;
                vida += 1;
                break;
            
            case "Druida":
                defensa += 1;
                vida += 2;
                break;
            
            case "Explorador":
                defensa += 3;
                break;
            
            case "Guerrero":
                ataque += 2;
                defensa += 1;
                break;
                
            case "Hechicero":
                ataque += 3;
                break;
                
            case "Mago":
                ataque += 5;
                defensa -= 2;
                break;
            
            case "Monje":
                ataque += 1;
                defensa += 1;
                vida += 1;
                break;
            
            case "Paladín":
                ataque += 2;
                defensa += 1;
                break;
            
            case "Pícaro":
                ataque += 3;
                break;
        }
        
        String raza = opcionesRaza.getSelectedItem().toString();
        switch (raza) {
            case "Dracónido":
                ataque += 2;
                vida += 1;
                break;
            
            case "Elfo":
                defensa += 1;
                vida += 2;
                break;
            
            case "Enano":
                defensa += 2;
                vida += 1;
                break;
            
            case "Gnomo":
                defensa += 3;
                break;
            
            case "Halfing":
                ataque += 1;
                defensa += 1;
                vida += 1;
                break;
            
            case "Humano":
                ataque += 2;
                defensa += 1;
                break;
            
            case "Orco":
                ataque += 4;
                defensa -= 1;
                break;
            
            case "Tiefling":
                ataque += 2;
                defensa += 1;
                break;
        }
        validacionStats(vida, ataque, defensa);
        personaje = new Personaje(nombre, clase, raza, vida, ataque, defensa);
        JOptionPane.showMessageDialog(this, "¡Personaje creado exitosamente!");
        
        panel.removeAll();
        panel.add(panelMenuPrincipal);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnCrearActionPerformed

    private static void validacionStats(int vida, int ataque, int defensa){
        if (vida < 20){
            vida = 20;
        }
        if (vida > 45){
            vida = 45;
        }

        if (ataque < 4){
            ataque = 4;
        }
        if (ataque > 10){
            ataque = 10;
        }
        if (defensa < 1){
            defensa = 1;
        }
        if (defensa > 6){
            defensa = 6;
        }
    }
    
    private void btnVolver4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver4ActionPerformed
        panel.removeAll();
        panel.add(panelMenuPersonaje);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnVolver4ActionPerformed

    private void txtVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidaActionPerformed
        
    }//GEN-LAST:event_txtVidaActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int indice = listaPersonajes.getSelectedIndex();
        if (indice == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un personaje primero", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        personaje = personajes.get(indice);
        JOptionPane.showMessageDialog(this, "Has seleccionado a "+personaje.getNombre(), "¡Personaje seleccionado!", JOptionPane.INFORMATION_MESSAGE);
        panel.removeAll();
        panel.add(panelMenuPrincipal);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnIniciarMisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarMisionActionPerformed
        panel.removeAll();
        panel.add(panelCombate);
        panel.repaint();
        panel.revalidate();
        Enemigo jefe = jefes.get(nivel);
        combateActual = new Combate(personaje, jefe);
        txtCombate.setText("¡Combate contra jefe del cristal!\n\n");
        txtCombate.append(combateActual.estadoActual());
    }//GEN-LAST:event_btnIniciarMisionActionPerformed
    
    private void btnEntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenarActionPerformed
        String[] opciones = {"Ataque (+1)", "Defensa (+1)", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Qué desea entrenar?", "Entrenamiento", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
        switch (eleccion){
            case 0:
                if (personaje.getAtaque() < 20) {
                    personaje.setAtaque(personaje.getAtaque() + 1);
                    JOptionPane.showMessageDialog(this, "Tu ataque aumentó a " + personaje.getAtaque() + ".\n¡Has conseguido +15 EXP!");
                    personaje.setExp(personaje.getExp() + 15);
                    subirNivel();
                } else {
                    JOptionPane.showMessageDialog(this, "Tu ataque ya está en el máximo permitido.");
                }
                break;
            
            case 1:
                if (personaje.getDefensa() < 15) {
                    personaje.setDefensa(personaje.getDefensa() + 1);
                    JOptionPane.showMessageDialog(this, "Tu defensa aumentó a " + personaje.getDefensa()+".\n¡Has conseguido +15 EXP!");
                    personaje.setExp(personaje.getExp() + 15);
                    if (personaje.getExp() >= 100){
                        personaje.setNivel(personaje.getNivel()+1);
                        personaje.setExp(personaje.getExp() - 100);
                        JOptionPane.showMessageDialog(this, "¡Has subido de nivel!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Tu defensa ya está en el máximo permitido.");
                }
                break;
              
            default:
                break;
        }
    }//GEN-LAST:event_btnEntrenarActionPerformed
    
    private void subirNivel(){
        if (personaje.getExp() >= 100) {
            personaje.setNivel(personaje.getNivel() + 1);
            personaje.setExp(personaje.getExp() - 100);
            personaje.setAtaque(personaje.getAtaque() + 1);
            personaje.setDefensa(personaje.getDefensa() + 1);
            personaje.setVida(personaje.getVida() + 5);
            JOptionPane.showMessageDialog(this, "¡Has subido de nivel!");
        }
    }
    
    private void btnExplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplorarActionPerformed
        int evento = azar.nextInt(101);
        if (evento <= 25){
            JOptionPane.showMessageDialog(this, "¡Un enemigo te atacó durante la exploración!\nPrepárate para el combate.", "Explorar", JOptionPane.WARNING_MESSAGE);
            int num = azar.nextInt(enemigos.size());
            Enemigo temp = enemigos.get(num);
            Enemigo enemigo = new Enemigo (temp.getNombre(), temp.getVida(), temp.getAtaque(), temp.getDefensa(), temp.isJefe());
            combateActual = new Combate(personaje, enemigo);
            panel.removeAll();
            panel.add(panelCombate);
            panel.repaint();
            panel.revalidate();
            txtCombate.setText("¡Un enemigo aparece!\n");
            txtCombate.append(combateActual.estadoActual());
        }
        else if (evento <= 50){
            int num = azar.nextInt(objetos.size());
            Objeto temp = objetos.get(num);
            boolean agregado = agregarObjetoInventario(temp);
            if (agregado) {
                JOptionPane.showMessageDialog(this, "¡Encontraste un objeto!\nEs un/a " + temp.getNombre(), "Explorar", JOptionPane.INFORMATION_MESSAGE);
                actualizarInventario();
            }
            else {
                JOptionPane.showMessageDialog(this, "Encontraste un objeto, pero tu mochila está llena.", "Explorar", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if (evento <= 75){
            int num = azar.nextInt(1,16);
            oro += num;
            JOptionPane.showMessageDialog(this, "¡Encontraste "+num+" monedas de oro!");
        }
        else{
            JOptionPane.showMessageDialog(this, "Exploraste la zona y ganaste +15 EXP.");
            personaje.setExp(personaje.getExp() + 15);
        }
    }//GEN-LAST:event_btnExplorarActionPerformed

    public boolean agregarObjetoInventario(Objeto objeto){
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[i].length; j++) {
                if (inventario[i][j] == null) {
                    inventario[i][j] = objeto;
                    return true;
                }
            }
        }
        return false;
    }
    
    private void btnVerTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTiendaActionPerformed
        panel.removeAll();
        panel.add(panelTienda);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_btnVerTiendaActionPerformed

    private void btnVerInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInventarioActionPerformed
        panel.removeAll();
        panel.add(panelInventario);
        panel.repaint();
        panel.revalidate();
        actualizarInventario();
    }//GEN-LAST:event_btnVerInventarioActionPerformed

    private void btnVerEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstadisticasActionPerformed
        String info = 
                "Nombre: " + personaje.getNombre() + "\n" +
                "Raza: " + personaje.getRaza() + "\n" +
                "Clase: " + personaje.getClase() + "\n" +
                "Exp: " + personaje.getExp() + "\n" +
                "Nivel: " + personaje.getNivel() + "\n" +
                "Vida: " + personaje.getVida() + "\n" +
                "Ataque: " + personaje.getAtaque() + "\n" +
                "Defensa: " + personaje.getDefensa() + "\n" +
                "Oro: " + oro + "\n" +
                "Cristales: " + (nivel - 1);
        JOptionPane.showMessageDialog(this, info);
    }//GEN-LAST:event_btnVerEstadisticasActionPerformed

    private void finalizarCombate(Combate combateActual){
        panel.removeAll();
        panel.add(panelMenuPrincipal);
        panel.repaint();
        panel.revalidate();
        if (combateActual.isGanado()){
            if (combateActual.getEnemigo().isJefe()){
                personaje.setExp(personaje.getExp() + 50);
                int num = azar.nextInt(21);
                oro += 30 + num;
                JOptionPane.showMessageDialog(this, "¡Has ganado contra el jefe y conseguido un cristal!");
                cristales[nivel-1] = true;
                personaje.setCristales(cristales);
                nivel++;
                JOptionPane.showMessageDialog(this, "¡Has ganado exp y oro!");
                subirNivel();
            }
            else{
                personaje.setExp(personaje.getExp() + 25);
                int num = azar.nextInt(16);
                oro += 10 + num;
                JOptionPane.showMessageDialog(this, "¡Has ganado exp y oro!");
                subirNivel();
            }
        }
        else if (combateActual.isPerdido()){
            JOptionPane.showMessageDialog(this, "¡Has perdido, no pudo salvar Vitrallia!");
            System.out.println("¡Derrota!");
            System.exit(0);
        }
    }
    
    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        String resultado = combateActual.atacar();
        txtCombate.append("\n" + resultado);
        txtCombate.append("\n" + combateActual.estadoActual());

        if (combateActual.isTerminado()) {
            finalizarCombate(combateActual);
            verificarVictoriaFinal();
        }
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void btnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefenderActionPerformed
        String resultado = combateActual.defender();
        txtCombate.append("\n" + resultado);
        txtCombate.append("\n" + combateActual.estadoActual());

        if (combateActual.isTerminado()) {
            finalizarCombate(combateActual);
            verificarVictoriaFinal();
        }
    }//GEN-LAST:event_btnDefenderActionPerformed
    
    public static boolean objetoEnCombate = false;
    
    private void btnUsarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarObjetoActionPerformed
        actualizarInventario();
        panel.removeAll();
        panel.add(panelInventario);
        panel.repaint();
        panel.revalidate();
        objetoEnCombate = true;
    }//GEN-LAST:event_btnUsarObjetoActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        int num = listaObjetos.getSelectedIndex();
        if (num == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un objeto para comprar.");
            return;
        }
        Objeto tempObj = objetos.get(num);
        Objeto objeto = new Objeto(tempObj.getNombre(), tempObj.getTipo(), tempObj.getEfecto(), tempObj.getPrecio());
        if (oro < objeto.getPrecio()){
            JOptionPane.showMessageDialog(this, "No tienes suficientes monedas de oro.");
            return;
        }
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Desea comprar el objeto?");
        if (confirmar == JOptionPane.YES_OPTION) {
            boolean agregado = agregarObjetoInventario(objeto);
            if (agregado) {
                oro -= objeto.getPrecio();
                JOptionPane.showMessageDialog(this, "Has comprado un/a " + objeto.getNombre() + "\nOro restante: " + oro);
            } else {
                JOptionPane.showMessageDialog(this, "Tu inventario está lleno.");
                return;
            }
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnUsarObjeto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarObjeto2ActionPerformed
        int fila = tablaInventario.getSelectedRow();
        int columna = tablaInventario.getSelectedColumn();
        if (fila == -1 || columna == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un objeto primero.");
            return;
        }
        Objeto objeto = inventario[fila][columna];
        if (objeto == null) {
            JOptionPane.showMessageDialog(this, "Ese espacio está vacío.");
            return;
        }
        if (objetoEnCombate){
            int confirmar = JOptionPane.showConfirmDialog(this, "¿Desea usar " + objeto.getNombre() + "?");
            if (confirmar == JOptionPane.YES_OPTION) {
                switch (objeto.getTipo()) {
                    case "+VIDA":
                        personaje.setVida(personaje.getVida() + objeto.getEfecto());
                        txtCombate.append("Tu vida aumentó a " + personaje.getVida() + "\n");
                        break;

                    case "+ATQ":
                        personaje.setAtaque(personaje.getAtaque() + objeto.getEfecto());
                        txtCombate.append("Tu ataque aumentó a " + personaje.getAtaque() + "\n");
                        break;

                    case "+DEF":
                        personaje.setDefensa(personaje.getDefensa() + objeto.getEfecto());
                        txtCombate.append("Tu defensa aumentó a " + personaje.getDefensa() + "\n");
                        break;
                }
                inventario[fila][columna] = null;
                actualizarInventario();
                panel.removeAll();
                panel.add(panelCombate);
                panel.repaint();
                panel.revalidate();
                objetoEnCombate = false;
                txtCombate.append("Se ha utilizado: " + objeto.getNombre() + "\n");
            }
        }
        else{
            int confirmar = JOptionPane.showConfirmDialog(this, "¿Desea usar " + objeto.getNombre() + "?");
            if (confirmar == JOptionPane.YES_OPTION) {
                switch (objeto.getTipo()) {
                    case "+VIDA":
                        personaje.setVida(personaje.getVida() + objeto.getEfecto());
                        JOptionPane.showMessageDialog(this, "Tu vida aumentó a" + personaje.getVida() + "\n");
                        break;

                    case "+ATQ":
                        personaje.setAtaque(personaje.getAtaque() + objeto.getEfecto());
                        JOptionPane.showMessageDialog(this, "Tu ataque aumentó a " + personaje.getAtaque() + "\n");
                        break;

                    case "+DEF":
                        personaje.setDefensa(personaje.getDefensa() + objeto.getEfecto());
                        JOptionPane.showMessageDialog(this, "Tu defensa aumentó a " + personaje.getDefensa() + "\n");
                        break;
                }
                inventario[fila][columna] = null;
                actualizarInventario();
            }
        }
    }//GEN-LAST:event_btnUsarObjeto2ActionPerformed

    private void btnEliminarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarObjetoActionPerformed
        int fila = tablaInventario.getSelectedRow();
        int columna = tablaInventario.getSelectedColumn();
        if (fila == -1 || columna == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un objeto primero.");
            return;
        }
        Objeto objeto = inventario[fila][columna];
        if (objeto == null) {
            JOptionPane.showMessageDialog(this, "Ese espacio ya está vacío.");
            return;
        }
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el objeto?");
        if (confirmar == JOptionPane.YES_OPTION){
            inventario[fila][columna] = null;
            actualizarInventario();
        }
    }//GEN-LAST:event_btnEliminarObjetoActionPerformed

    private void actualizarInventario(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (inventario[i][j] != null) {
                    Objeto objeto = inventario[i][j];
                    tabla.setValueAt(objeto.getNombre(), i, j);
                } else {
                    tabla.setValueAt("", i, j);
                }
            }
        }
    }
    
    private void verificarVictoriaFinal() {
        for (boolean cristal : cristales) {
            if (cristal == false) {
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "¡HAS REUNIDO LOS CINCO CRISTALES!\n\n" + "El reino de Vitrallia ha sido salvado.\n" + "Las fuerzas enemigas han sido derrotadas.\n\n"+ "🏆 ¡Felicidades héroe! 🏆");
        System.out.println("¡Victoria!");
        System.exit(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnAzar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearPersonaje;
    private javax.swing.JButton btnDefender;
    private javax.swing.JButton btnEliminarObjeto;
    private javax.swing.JButton btnEntrenar;
    private javax.swing.JButton btnExplorar;
    private javax.swing.JButton btnHistoriaMundo;
    private javax.swing.JButton btnInfoClases;
    private javax.swing.JButton btnInfoPersonaje;
    private javax.swing.JButton btnInfoRazas;
    private javax.swing.JButton btnIniciarMision;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnManual;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnSeleccionarPersonaje;
    private javax.swing.JButton btnTutorial;
    private javax.swing.JButton btnUsarObjeto;
    private javax.swing.JButton btnUsarObjeto2;
    private javax.swing.JButton btnValoresBase;
    private javax.swing.JButton btnVerEstadisticas;
    private javax.swing.JButton btnVerInventario;
    private javax.swing.JButton btnVerTienda;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JButton btnVolver4;
    private javax.swing.JButton btnVolver5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelAtaque;
    private javax.swing.JLabel labelDefensa;
    private javax.swing.JLabel labelVida;
    private javax.swing.JList<String> listaObjetos;
    private javax.swing.JList<String> listaPersonajes;
    private javax.swing.JComboBox<String> opcionesClase;
    private javax.swing.JComboBox<String> opcionesRaza;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCombate;
    private javax.swing.JPanel panelCrearPersonaje;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelMenuInicial;
    private javax.swing.JPanel panelMenuPersonaje;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelSeleccionarPersonaje;
    private javax.swing.JPanel panelTienda;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField txtAtaque;
    private javax.swing.JTextArea txtCombate;
    private javax.swing.JTextField txtDefensa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables
}
