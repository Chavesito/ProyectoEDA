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
public class Main {
    public void ejecutarRoundRobin(Cola procesos, int quantum) {
        int i =0;
        while (!procesos.estaVacia()) {
            Proceso procesoActual = (Proceso) procesos.desencolar();
            if(procesoActual.getTiempoLlegada() <= i){
              int tiempoEjecucion = Math.min(quantum, procesoActual.getTiempoRestante());

                System.out.println("Ejecutando " + procesoActual.getNombre() + " por " + tiempoEjecucion + " unidades de tiempo.");

                procesoActual.disminuirTiempoRestante(tiempoEjecucion);

                if (procesoActual.getTiempoRestante() > 0) {
                    procesos.encolar(procesoActual); // Vuelve a encolar el proceso
                } else {
                    System.out.println(procesoActual.getNombre() + " ha terminado su ejecución.");
                }  
            }else{
                i++;
            }        
        }
    }
    
    public static void ejecutarSJF(Lista lista){
        int tiempo = 0;
        while(!lista.estaVacia()){
            Proceso procesoActual = lista.buscarProcesoMenorTiempoRestante(tiempo);
            if(procesoActual.getTiempoLlegada()<= tiempo){
                if(procesoActual.getTiempoRestante()!= 0){
                    procesoActual.disminuirTiempoRestante(1);
                }else{
                    lista.eliminarProceso(procesoActual.getNombre());
                }
            }
        }
    }
}