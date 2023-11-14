package Matematicas;

public class Nodo {
    private Proceso proceso;
    private Nodo siguiente;

    public Nodo(Proceso proceso) {
        this.proceso = proceso;
        this.siguiente = null;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

