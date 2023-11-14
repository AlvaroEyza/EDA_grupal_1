package Matematicas;

public class Prueba1 {

    public static void main(String[] args) {
        ColaEnlazada cola = new ColaEnlazada();
        cola.encolar(new Proceso("P1", 0, 100));
        cola.encolar(new Proceso("P2", 1, 15));
        cola.encolar(new Proceso("P3", 2, 40));

        int quantum = 20;

         System.out.println("Inicio de la simulación:");
        RoundRobin roundRobin = new RoundRobin(cola, quantum);
        roundRobin.ejecutarRoundRobin();
    }
/*  
    

    public static void main(String[] args) {
        
        Proceso[] listaProcesos = {
                new Proceso("A", 0, 8),
                new Proceso("B", 1, 4),
                new Proceso("C", 2, 9),
                new Proceso("D", 3, 5),
                new Proceso("E", 4, 9)
        };
        System.out.println("Inicio de la simulación:");
        SJR.ejecutarSJR(listaProcesos);
    }
*/ 


}



