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
public class RoundRobin {
    public static void main(String[] args){
        Lista lista = new Lista();
        lista.agregarAlFinal(new Proceso("P1", 5));
        lista.agregarAlFinal(new Proceso("P2", 3));
        lista.agregarAlFinal(new Proceso("P3", 7));

        Proceso procesoMenorTiempo = lista.buscarProcesoMenorTiempoRestante();

        if (procesoMenorTiempo != null) {
            System.out.println("Proceso con menor tiempo restante: " + procesoMenorTiempo);
        } else {
            System.out.println("La lista está vacía.");
        }
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
    
    public static void ejecutarSJF(Cola procesos){
       
    }
}