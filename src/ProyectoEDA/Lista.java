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
public class Lista {
    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarAlFinal(Proceso proceso) {
        Nodo nuevoNodo = new Nodo(proceso);

        if (estaVacia()) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void mostrarLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getProceso().toString());
            actual = actual.getSiguiente();
        }
    }
    
    public Nodo buscar(String nombreProceso) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getProceso().getNombre().equals(nombreProceso)) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null; // Si no se encuentra el proceso con el nombre dado
    }
    
    public Proceso buscarProcesoMenorTiempoRestante() {
        if (estaVacia()) {
            return null; // Retorna null si la lista está vacía
        }

        Nodo actual = cabeza;
        Proceso procesoMenorTiempo = actual.getProceso();

        while (actual != null) {
            if (actual.getProceso().getTiempoRestante() < procesoMenorTiempo.getTiempoRestante()) {
                procesoMenorTiempo = actual.getProceso();
            }
            actual = actual.getSiguiente();
        }

        return procesoMenorTiempo;
    }
}
