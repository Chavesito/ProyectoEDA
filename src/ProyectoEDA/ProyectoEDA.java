/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEDA;

/**
 *
 * @author leo-f
 */
public class ProyectoEDA {
    public static void main(String[] args){
      Cola procesos = new Cola();

        // Agrega algunos procesos a la cola
        procesos.encolar(new Proceso("P1", 5));
        procesos.encolar(new Proceso("P2", 3));
        procesos.encolar(new Proceso("P3", 2));
        procesos.encolar(new Proceso("P4", 7));

        int quantum = 3; // Tamaño del quantum

        ejecutarRoundRobin(procesos, quantum);
    }

    public static void ejecutarRoundRobin(Cola procesos, int quantum) {
        while (!procesos.estaVacia()) {
            Proceso procesoActual = (Proceso) procesos.desencolar();
            int tiempoEjecucion = Math.min(quantum, procesoActual.getTiempoRestante());

            System.out.println("Ejecutando " + procesoActual.getNombre() + " por " + tiempoEjecucion + " unidades de tiempo.");

            procesoActual.disminuirTiempoRestante(tiempoEjecucion);

            if (procesoActual.getTiempoRestante() > 0) {
                procesos.encolar(procesoActual); // Vuelve a encolar el proceso
            } else {
                System.out.println(procesoActual.getNombre() + " ha terminado su ejecución.");
            }
        }
    }
}