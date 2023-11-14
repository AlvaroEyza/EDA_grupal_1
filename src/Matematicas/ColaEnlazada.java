package Matematicas;

public class ColaEnlazada {
     private Nodo inicio;
    private Nodo fin;

    public ColaEnlazada() {
        inicio = null;
        fin = null;
    }

    public boolean estaVacia() {
        return inicio == null && fin == null;
    }

    public void encolar(Proceso proceso) {
        Nodo nuevoNodo = new Nodo(proceso);
        if (estaVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    public Proceso desencolar() {
        if (!estaVacia()) {
            Proceso procesoRetornar = inicio.getProceso();

            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.getSiguiente();
            }
            return procesoRetornar;
        } else {
            return null;
        }
    }
    
public void encolarConPrioridad(Proceso proceso) {
        Nodo nuevoNodo = new Nodo(proceso);

        if (estaVacia() || nuevoNodo.getProceso().getTiempoEjecucion() < inicio.getProceso().getTiempoEjecucion()) {
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
        } else {
            Nodo actual = inicio;
            Nodo anterior = null;

            while (actual != null && nuevoNodo.getProceso().getTiempoEjecucion() >= actual.getProceso().getTiempoEjecucion()) {
                anterior = actual;
                actual = actual.getSiguiente();
            }

            nuevoNodo.setSiguiente(actual);
            anterior.setSiguiente(nuevoNodo);

            if (actual == null) {
                fin = nuevoNodo;
            }
        }
    }

}
