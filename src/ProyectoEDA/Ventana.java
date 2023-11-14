/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEDA;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
public class Ventana extends javax.swing.JFrame {
    DefaultTableModel modelo;
    public Lista base = new Lista();
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        
        initComponents();
        //Código de la tabla
        modelo =new DefaultTableModel();
        modelo.addColumn("Proceso");
        modelo.addColumn("Tiempo de ejecución");
        modelo.addColumn("Tiempo de llegada");
        modelo.addColumn("Tiempo de comienzo");
        modelo.addColumn("Tiempo de finalización");
        this.TInfo.setModel(modelo);
        this.setLocationRelativeTo(null);
        
        
       
        setTitle("Trabajo EDA GRUPO "); //Título de la ventana
        setLocationRelativeTo(null); //Spawn de la ventana grafica al medio
        setDefaultCloseOperation(EXIT_ON_CLOSE); //dejar de ejecutar al cerrar la ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NomProces = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TL = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TInfo = new javax.swing.JTable();
        Algoritmos = new javax.swing.JComboBox<>();
        Simulacion = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Universidad de Lima");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Carrera de Ingeniería de Sistemas");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Proyecto Estructuras de Datos y Algoritmos");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setText("Sistema simulador de planificación de procesos");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Ingresar:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nombre del proceso:");

        NomProces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomProcesActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Tiempo de ejecución (en ms):");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Tiempo de llegada (en ms):");

        TL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TLActionPerformed(evt);
            }
        });

        TInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TInfo);

        Algoritmos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Algoritmos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RoundRobin", "ShortestJobFirst" }));
        Algoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgoritmosActionPerformed(evt);
            }
        });

        Simulacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Simulacion.setText("Iniciar Simulación");
        Simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulacionActionPerformed(evt);
            }
        });

        Agregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione el algoritmo a utilizar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 246, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9))
                                            .addGap(36, 36, 36)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TE)
                                                .addComponent(TL, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(Algoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(86, 86, 86)
                                            .addComponent(NomProces, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(194, 194, 194)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(Simulacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(Agregar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(78, 78, 78)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(Algoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomProces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Simulacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TLActionPerformed

    private void NomProcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomProcesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomProcesActionPerformed

    private void AlgoritmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgoritmosActionPerformed
        


        // TODO add your handling code here:
    }//GEN-LAST:event_AlgoritmosActionPerformed

    private void SimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulacionActionPerformed
        String seleccion = (String) Algoritmos.getSelectedItem();
        JTextArea outputTextArea = new JTextArea();
        if("RoundRobin".equals(seleccion))
        {
            base.ordenarPorTiempoLlegada();
            Main.ejecutarRoundRobin(base.Encolar(), 3,outputTextArea);
            String resultadoSimulacion = outputTextArea.getText();

            // Abrir nueva ventana y pasar el resultado de la simulación
            
            
        }
        else if("ShortestJobFirst".equals(seleccion))
        {
            Main.ejecutarSJF(base,outputTextArea);
            
        }
            VentProces nuevaVentana = new VentProces(outputTextArea.getText());
            nuevaVentana.setVisible(true);
            this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_SimulacionActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
       //Codigo para insertar los datos en la tabla
        String []info=new String[4];
        info[0]=NomProces.getText();
        info[1]=TE.getText();
        info[2]=TL.getText();
        try {
            // Intentar convertir los tiempos a enteros
            int tiempoEjecucion = Integer.parseInt(info[1]);
            int tiempoLlegada = Integer.parseInt(info[2]);

            // Crear una instancia de Proceso con los datos proporcionados
            Proceso proceso = new Proceso(info[0], tiempoEjecucion, tiempoLlegada);

            // Agregar el proceso a tu lista (suponiendo que "base" es una instancia de la clase Lista)
            base.agregarAlFinal(proceso);

            // Asumiendo que "modelo" es un DefaultTableModel, agregar la fila a la tabla
            modelo.addRow(info);
        } catch (NumberFormatException e) {
            // Manejar error si los campos no contienen valores numéricos
            System.out.println("Error: Los campos de tiempo deben ser números enteros.");
        }
        NomProces.setText("");
        TE.setText("");
        TL.setText("");
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        //Codigo para abrir la ventana grafica
        
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
         
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> Algoritmos;
    private javax.swing.JTextField NomProces;
    private javax.swing.JButton Simulacion;
    private javax.swing.JTextField TE;
    private javax.swing.JTable TInfo;
    private javax.swing.JTextField TL;
    private javax.swing.ButtonGroup grupo_botones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
