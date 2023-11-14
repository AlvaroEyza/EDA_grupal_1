package Matematicas;

public class SJR {
    
 public static void ejecutarSJR(Proceso[] procesos) {
        int tiempoActual = 0;
        ColaEnlazada colaEspera = new ColaEnlazada();
        boolean procesosPendientes = true;

        while (procesosPendientes || !colaEspera.estaVacia()) {
            while (procesosPendientes && procesos[0].getTiempoLlegada() <= tiempoActual) {
                colaEspera.encolarConPrioridad(procesos[0]);
                Proceso[] nuevosProcesos = new Proceso[procesos.length - 1];
                System.arraycopy(procesos, 1, nuevosProcesos, 0, procesos.length - 1);
                procesos = nuevosProcesos;
                if (procesos.length == 0) {
                    procesosPendientes = false;
                }
            }

            if (!colaEspera.estaVacia()) {
                Proceso proceso = colaEspera.desencolar();
                System.out.println("Tiempo " + tiempoActual + ": " + proceso.getNombre() + " entra a ejecución");
                tiempoActual += proceso.getTiempoEjecucion();
                System.out.println("Tiempo " + tiempoActual + ": " + proceso.getNombre() + " termina su ejecución");
            } else if (procesosPendientes) {
                tiempoActual += 1; 
            }               
            }
             System.out.println("Tiempo " + tiempoActual + ": Se ejecutaron todos los procesos");
    }
    } 


    
    
 

    






