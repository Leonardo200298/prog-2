package practico3.ejercicio3;

public class Jugar {
    private Jugador j1;
    private Jugador j2;
    public Jugar(){
        this.j1 = new Jugador("Heroe","Leonardo", "Caballero lechero");
        this.j2 = new Jugador("Hechicero", "Messi", "Hechicero choricero");
    }

    public void jugar(){
        for (Caracteristica cj1 : j1.getCaracteristicas()) {
            for (Caracteristica cj2 : j2.getCaracteristicas()) {
                if (cj1.getAltura() > cj2.getAltura()) {
                    System.out.println("Gano el jugador "+ j1.getNombreReal());
                }
            }
        }
    }
}
