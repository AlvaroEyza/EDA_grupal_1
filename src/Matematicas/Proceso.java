package Matematicas;

public class Proceso {
    
    private String nombre;
    private int tiempoLlegada;
    private int tiempoEjecucion;
    private int tiempoComienzo;  
    private int tiempoFinalizacion; 
    private int tiempoEjecucionOriginal;
    
    public Proceso(String nombre, int tiempoLlegada, int tiempoEjecucion) {
        this.nombre = nombre;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoEjecucion = tiempoEjecucion;
        this.tiempoEjecucionOriginal = tiempoEjecucion;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }
    public int getTiempoComienzo() {
        return tiempoComienzo;
    }

    public void setTiempoComienzo(int tiempoComienzo) {
        this.tiempoComienzo = tiempoComienzo;
    }

    public int getTiempoFinalizacion() {
        return tiempoFinalizacion;
    }

    public void setTiempoFinalizacion(int tiempoFinalizacion) {
        this.tiempoFinalizacion = tiempoFinalizacion;
    }
    
    public int getTiempoEjecucionOriginal() {
            return tiempoEjecucionOriginal;
        }

}


