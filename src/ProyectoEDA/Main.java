/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEDA;
import javax.swing.JTextArea;
/**
 *
 * @author leo-f
 */
public class Main {
   
    public static void ejecutarRoundRobin(Cola procesos, int quantum, JTextArea outputTextArea) {
        int tiempo = 0;

        while (!procesos.estaVacia()) {
            Proceso procesoActual = (Proceso) procesos.desencolar();
            int tiempoEjecucion = Math.min(quantum, procesoActual.getTiempoRestante());

            if (procesoActual.getTiempoLlegada() <= tiempo) {
                String mensaje = "Tiempo:" + tiempo + " Ejecutando " + procesoActual.getNombre() + " por " + tiempoEjecucion + " unidades de tiempo.";

                // Actualizar el JTextArea en lugar de imprimir en consola
                if (outputTextArea != null) {
                    outputTextArea.append(mensaje + "\n");
                }

                procesoActual.disminuirTiempoRestante(tiempoEjecucion);

                if (procesoActual.getTiempoRestante() > 0) {
                    procesos.encolar(procesoActual);
                } else {
                    System.out.println(procesoActual.getNombre() + " ha terminado su ejecución.");
                }
                tiempo = tiempo + tiempoEjecucion;
            } else {
                procesos.encolarAlFrente(procesoActual);
                tiempo++;
            }

            
        }
    }
    
    public static void ejecutarSJF(Lista lista, JTextArea outputTextArea) {
    int tiempo = 0;
    while (!lista.estaVacia()) {
        Proceso procesoActual = lista.buscarProcesoMenorTiempoRestante(tiempo);

        if (procesoActual.getTiempoLlegada() <= tiempo) {
            if (procesoActual.getTiempoRestante() != 0) {
                procesoActual.disminuirTiempoRestante(1);
                String mensaje = "Ejecutando " + procesoActual.getNombre() + " en el tiempo " + tiempo + " tiempo restante:" + procesoActual.getTiempoRestante();
                
                if (outputTextArea != null) {
                    outputTextArea.append(mensaje + "\n");
                }
                
                tiempo++;
            } else {
                lista.eliminarProceso(procesoActual.getNombre());
            }
        } else {
            String mensaje = "No hay proceso a ejecutar en el tiempo " + tiempo + " tiempo restante:" + procesoActual.getTiempoRestante();
            if (outputTextArea != null) {
                outputTextArea.append(mensaje + "\n");
            }
            tiempo++;
        }
    }
}
}