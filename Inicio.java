package Ventanas;

import Clases.DatosGraficos;
import Clases.PintanrDibujos;
import Clases.AlgoritmoDijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose H Elel
 */
public class Inicio extends javax.swing.JFrame {

    private int Numerotope = 0;//Numero de nodos 
    
    DatosGraficos arboles = new DatosGraficos();

    public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintanrDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintanrDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    public Inicio() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarCaminos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        colorOrigen = new javax.swing.JLabel();
        txtColorOrigen = new javax.swing.JLabel();
        colorDestino = new javax.swing.JLabel();
        txtColorDestino = new javax.swing.JLabel();
        colorNodoVisitado = new javax.swing.JLabel();
        txtColorNodoRecorrido = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EleccionDestino = new javax.swing.JComboBox<>();
        BuscarCamino = new javax.swing.JButton();
        EleccionOrigen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKMAcumulados = new javax.swing.JTextArea();
        txtDestino = new javax.swing.JLabel();
        kmRecorridos = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        kmRecorridos1 = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();
        LateralSuperior1 = new javax.swing.JLabel();
        LateralSuperior2 = new javax.swing.JLabel();
        kmRecorridos2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarCaminos.setBackground(new java.awt.Color(255, 255, 204));
        MostrarCaminos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarCaminos.setForeground(new java.awt.Color(0, 0, 204));
        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 220, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorOrigen.setBackground(new java.awt.Color(255, 0, 0));
        colorOrigen.setOpaque(true);
        jPanel1.add(colorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 20, 20));

        txtColorOrigen.setBackground(new java.awt.Color(255, 255, 255));
        txtColorOrigen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorOrigen.setForeground(new java.awt.Color(51, 0, 204));
        txtColorOrigen.setText("Origen--------------->");
        txtColorOrigen.setOpaque(true);
        jPanel1.add(txtColorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 40));

        colorDestino.setBackground(new java.awt.Color(51, 255, 51));
        colorDestino.setOpaque(true);
        jPanel1.add(colorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 20, 20));

        txtColorDestino.setBackground(new java.awt.Color(255, 255, 255));
        txtColorDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorDestino.setForeground(new java.awt.Color(51, 0, 204));
        txtColorDestino.setText("Destino-------------->");
        txtColorDestino.setOpaque(true);
        jPanel1.add(txtColorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 30));

        colorNodoVisitado.setBackground(new java.awt.Color(0, 51, 255));
        colorNodoVisitado.setOpaque(true);
        jPanel1.add(colorNodoVisitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 20, 20));

        txtColorNodoRecorrido.setBackground(new java.awt.Color(255, 255, 255));
        txtColorNodoRecorrido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorNodoRecorrido.setForeground(new java.awt.Color(51, 0, 204));
        txtColorNodoRecorrido.setText("Nodo Recorrido ---->");
        txtColorNodoRecorrido.setOpaque(true);
        jPanel1.add(txtColorNodoRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 40));

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("X");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/1232.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 800, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 850, 720));

        EleccionDestino.setBackground(new java.awt.Color(153, 153, 255));
        EleccionDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionDestino.setForeground(new java.awt.Color(0, 0, 153));
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peru cuajone", "Peru 2 cuajone", "Mira cuajone", "Pizarra cuajone", "Pierola cuajone", "Peru primavera", "Peru 2 primavera", "Mira primavera", "Pizarra primavera", "Pierola primavera", "Peru ilo", "Peru 2 ilo", "Mira ilo", "Peru tupac", "Mira tupac", "Pizarra tupac", "Pierola tupac" }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 460, 50));

        BuscarCamino.setBackground(new java.awt.Color(153, 255, 255));
        BuscarCamino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BuscarCamino.setForeground(new java.awt.Color(51, 0, 204));
        BuscarCamino.setText("Buscar Camino mas corto");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 300, 60));

        EleccionOrigen.setBackground(new java.awt.Color(153, 153, 255));
        EleccionOrigen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionOrigen.setForeground(new java.awt.Color(0, 0, 153));
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peru cuajone", "Peru 2 cuajone", "Mira cuajone", "Pizarra cuajone", "Pierola cuajone", "Peru primavera", "Peru 2 primavera", "Mira primavera", "Pizarra primavera", "Pierola primavera", "Peru ilo", "Peru 2 ilo", "Mira ilo", "Peru tupac", "Mira tupac", "Pizarra tupac", "Pierola tupac" }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 460, 50));

        txtKMAcumulados.setColumns(20);
        txtKMAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKMAcumulados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 510, 70));

        txtDestino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("Selecciona el destino:");
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, 40));

        kmRecorridos.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos.setOpaque(true);
        getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 390, 40));

        txtOrigen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("Selecciona el origen:");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 250, 40));

        kmRecorridos1.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos1.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos1.setOpaque(true);
        getContentPane().add(kmRecorridos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 140, 40));

        LateralSuperior.setBackground(new java.awt.Color(255, 255, 255));
        LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior.setOpaque(true);
        getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 730));

        LateralSuperior1.setBackground(new java.awt.Color(255, 255, 102));
        LateralSuperior1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior1.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior1.setOpaque(true);
        getContentPane().add(LateralSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 560, 30));

        LateralSuperior2.setBackground(new java.awt.Color(255, 255, 255));
        LateralSuperior2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior2.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior2.setText("                            Bienvenido al sistema");
        LateralSuperior2.setOpaque(true);
        getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, 30));

        kmRecorridos2.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos2.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos2.setText("                        Distancia recorrida:");
        kmRecorridos2.setOpaque(true);
        getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 510, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        EleccionOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);
        txtKMAcumulados.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());
        
        int Matriz[][] = {
           //A  B  C  D  E  F  G  H  I  J  K  L  M  N  Ñ  O  P
            {0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0 ,1, 0, 0, 0, 0, 0, 1, 0} 
            
        };

        double coe[][] = {
           //A  B   C  D  E  F   G  H  I  J  K  L  M  N  Ñ  O  P
            {0, 52, 0, 0, 0, 87, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {52, 0, 53, 0, 0, 0, 91, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 53, 0, 70, 0, 0, 0, 92, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 70, 0, 54, 0, 0, 0, 97, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 54, 0, 0, 0, 0, 0, 103, 0, 0, 0, 0, 0, 0, 0},
            {87, 0, 0, 0, 0, 0, 48, 0, 0, 0, 76, 0, 0, 0, 0, 0, 0},
            {0, 91, 0, 0, 0, 48, 0, 49, 0, 0, 0, 71, 0, 0, 0, 0, 0},
            {0, 0, 92, 0, 0, 0, 49, 0, 49, 0, 0, 0, 63, 0, 0, 0, 0},
            {0, 0, 0, 97, 0, 0, 0, 49, 0, 61, 0, 0, 0, 0, 0, 176, 0},
            {0, 0, 0, 0, 103, 0, 0, 0, 61, 0, 0, 0, 0, 0, 0, 0, 149},
            {0, 0, 0, 0, 0, 76, 0, 0, 0, 0, 0, 51, 0, 113, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 71, 0, 0, 0, 51, 0, 52, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 63, 0, 0, 0, 52, 0, 0, 119, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 113, 0, 0, 0, 143, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 143, 0, 48, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 176, 0, 0, 0, 0, 0, 48, 0, 49},
            {0, 0, 0, 0, 0, 0, 0, 0, 0 ,149, 0, 0, 0, 0, 0, 49, 0}, 
        
        };
        
        int xx1[] = {180, 270, 360, 480, 570, 170, 260, 340, 425, 525, 160, 240, 330, 140, 388, 475, 553};
        int yy1[] = {120, 130, 140, 159, 170, 280, 290, 305, 320, 340, 404, 414, 420, 605, 620, 615, 610};
        String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"};

        
      
        for (int j = 0; j < 17; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 17; j++) {
            for (int k = 0; k < 17; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
            }
        }
        Numerotope = 17;
        PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen = 1, destino = 1;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();
        
        if ("Peru cuajone".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("Peru 2 cuajone".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Mira cuajone".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("Pizarra cuajone".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("Pierola cuajone".equals(nombreOrigen)) {
            origen = 4;
        }
        if ("Peru primavera".equals(nombreOrigen)) {
            origen = 5;
        }
        if ("Peru 2 primavera".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("Mira primavera".equals(nombreOrigen)) {
            origen = 7;
        }
        if ("Pizarra primavera".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("Pierola primavera".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("Peru ilo".equals(nombreOrigen)) {
            origen = 10;
        }
        if ("Peru 2 ilo".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("Mira ilo".equals(nombreOrigen)) {
            origen = 12;
        }
        
        if ("Peru tupac".equals(nombreOrigen)) {
            origen = 13;
        }
        if ("Mira tupac".equals(nombreOrigen)) {
            origen = 14;
        }
        if ("Pizarra tupac".equals(nombreOrigen)) {
            origen = 15;
        }
        if ("Pierola tupac".equals(nombreOrigen)) {
            origen = 16;
        }
        
        if ("Peru cuajone".equals(nombreDestino)) {
            destino = 0;
        }
        if ("Peru 2 cuajone".equals(nombreDestino)) {
            destino = 1;
        }
        if ("Mira cuajone".equals(nombreDestino)) {
            destino = 2;
        }
        if ("Pizarra cuajone".equals(nombreDestino)) {
            destino = 3;
        }
        if ("Pierola cuajone".equals(nombreDestino)) {
            destino = 4;
        }
        if ("Peru primavera".equals(nombreDestino)) {
            destino = 5;
        }
        if ("Peru 2 primavera".equals(nombreDestino)) {
            destino = 6;
        }
        if ("Mira primavera".equals(nombreDestino)) {
            destino = 7;
        }
        if ("Pizarra primavera".equals(nombreDestino)) {
            destino = 8;
        }
        if ("Pierola primavera".equals(nombreDestino)) {
            destino = 9;
        }
        if ("Peru ilo".equals(nombreDestino)) {
            destino = 10;
        }
        if ("Peru 2 ilo".equals(nombreDestino)) {
            destino = 11;
        }
        if ("Mira ilo".equals(nombreDestino)) {
            destino = 12;
        }
        
        if ("Peru tupac".equals(nombreDestino)) {
            destino = 13;
        }
        if ("Mira tupac".equals(nombreDestino)) {
            destino = 14;
        }
        if ("Pizarra tupac".equals(nombreDestino)) {
            destino = 15;
        }
        if ("Pierola tupac".equals(nombreDestino)) {
            destino = 16;
        }
        
        
        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
            txtKMAcumulados.setText("Intenta de nuevo!!");
            txtKMAcumulados.setEnabled(false);
            txtKMAcumulados.setForeground(Color.RED);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("No hay ningun error :)");
            txtKMAcumulados.setForeground(Color.BLUE);
            txtKMAcumulados.setEnabled(false);
            
            kmRecorridos.setText(Dijkstra.getAcumulado() + " metros");
        }


    }//GEN-LAST:event_BuscarCaminoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel LateralSuperior;
    private javax.swing.JLabel LateralSuperior1;
    private javax.swing.JLabel LateralSuperior2;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JLabel colorDestino;
    private javax.swing.JLabel colorNodoVisitado;
    private javax.swing.JLabel colorOrigen;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos1;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel txtColorDestino;
    private javax.swing.JLabel txtColorNodoRecorrido;
    private javax.swing.JLabel txtColorOrigen;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JTextArea txtKMAcumulados;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
}
