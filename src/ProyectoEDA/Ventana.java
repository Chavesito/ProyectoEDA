/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEDA;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Ventana extends javax.swing.JFrame {
    DefaultTableModel modelo;
    Lista base = new Lista();
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        
        initComponents();
        
        modelo =new DefaultTableModel();
        modelo.addColumn("Proceso");
        modelo.addColumn("Tiempo de ejecución");
        modelo.addColumn("Tiempo de llegada");
        modelo.addColumn("Tiempo de comienzo");
        modelo.addColumn("Tiempo de finalización");
        this.TInfo.setModel(modelo);
        this.setLocationRelativeTo(null);
        
        
       
        setTitle("Trabajo EDA"); //Título de la ventana
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
        logoUL = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Universidad de Lima");

        jLabel2.setText("Carrera de Ingeniería de Sistemas");

        jLabel3.setText("Proyecto Estructuras de Datos y Algoritmos");

        logoUL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen1/UL.png"))); // NOI18N

        jLabel4.setText("Sistema simulador de planificación de procesos");

        jLabel6.setText("Ingresar:");

        jLabel7.setText("Nombre del proceso:");

        NomProces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomProcesActionPerformed(evt);
            }
        });

        jLabel8.setText("Tiempo de ejecución (en ms):");

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

        Algoritmos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RoundRobin", "ShortestJobFirst" }));
        Algoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgoritmosActionPerformed(evt);
            }
        });

        Simulacion.setText("Iniciar Simulación");
        Simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulacionActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(logoUL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Algoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(197, 197, 197))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(108, 108, 108)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NomProces)
                                    .addComponent(TL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(486, 486, 486))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(465, 465, 465))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(Simulacion))
                            .addGap(516, 516, 516)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(457, 457, 457))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addGap(538, 538, 538))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(logoUL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addComponent(Algoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NomProces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addComponent(Agregar)
                .addGap(31, 31, 31)
                .addComponent(Simulacion)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if("RoundRobin".equals(seleccion))
        {
            System.out.println("Algoritmo RoundRobin Seleccionado");
        }
        else if("ShortestJobFirst".equals(seleccion))
        {
            Main.ejecutarSJF(base);
        }
        
        
  
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_SimulacionActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoUL;
    // End of variables declaration//GEN-END:variables
}
