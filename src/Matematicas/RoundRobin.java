package Matematicas;

import java.util.ArrayList;
import java.util.List;

public class RoundRobin {

    private ColaEnlazada cola;
    private int quantum;
    private int tiempoActual;

    public RoundRobin(ColaEnlazada cola, int quantum) {
        this.cola = cola;
        this.quantum = quantum;
        this.tiempoActual = 0;
    }

    public void ejecutarRoundRobin() {
        while (!cola.estaVacia()) {
            Proceso procesoActual = cola.desencolar();
            int tiempoEjecucion = Math.min(quantum, procesoActual.getTiempoEjecucion());
            procesoActual.setTiempoEjecucion(procesoActual.getTiempoEjecucion() - tiempoEjecucion);

            if (tiempoActual < procesoActual.getTiempoLlegada()) {
                tiempoActual = procesoActual.getTiempoLlegada();
            }

            System.out.println("Tiempo " + tiempoActual + ": " + procesoActual.getNombre() + " entra a ejecución");
            
            procesoActual.setTiempoComienzo(tiempoActual);

            tiempoActual += tiempoEjecucion;

            if (procesoActual.getTiempoEjecucion() > 0) {
                cola.encolar(procesoActual);
                System.out.println("Tiempo " + tiempoActual + ": " + procesoActual.getNombre() +
                        " se conmuta. Pendiente por ejecutar " + procesoActual.getTiempoEjecucion() + " ms");
            } else {
                procesoActual.setTiempoFinalizacion(tiempoActual);
                String resultado = "Proceso " + procesoActual.getNombre() +
                    " - Tiempo de Comienzo: " + procesoActual.getTiempoComienzo() +
                    ", Tiempo de Finalización: " + procesoActual.getTiempoFinalizacion();
                

                System.out.println("Tiempo " + tiempoActual + ": " + procesoActual.getNombre() + " termina su ejecución");
            }
        }}}





   
