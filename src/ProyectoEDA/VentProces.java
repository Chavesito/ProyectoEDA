/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEDA;

import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
public class VentProces extends javax.swing.JFrame {
    private DefaultTableModel modeloTabla;
    private String resultadoSimulacion;
    private Lista muestra;

    /**
     * Creates new form VentProces
     */
    public VentProces(String resultadoSimulacion, Lista muestra) {
        initComponents();
        this.resultadoSimulacion = resultadoSimulacion;
        modeloTabla = (DefaultTableModel) InfoFinal.getModel();
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Proceso");
        modelo2.addColumn("Tiempo de ejecución");
        modelo2.addColumn("Tiempo de llegada");
        modelo2.addColumn("Tiempo de comienzo");
        modelo2.addColumn("Tiempo de finalización");
        this.InfoFinal.setModel(modelo2);
        this.setLocationRelativeTo(null);
        jTextArea1.setText(resultadoSimulacion);
        // Llamar a actualizarTabla después de configurar el modelo
        Nodo nodoActual = muestra.getPrimero();
        while(nodoActual != null){
            Proceso proceso = nodoActual.getProceso();
            modelo2.addRow(new Object[]{proceso.getNombre(), proceso.getTiempoEjecucion(), proceso.getTiempoLlegada(), proceso.getTiempoInicio(), proceso.getTiempoSalida()});
            nodoActual = nodoActual.getSiguiente();
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

        jLabel1 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoFinal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Historial de procesos");

        Regresar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        InfoFinal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(InfoFinal);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(Regresar)))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Regresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        
        Ventana ven = new Ventana();
        ven.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable InfoFinal;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
