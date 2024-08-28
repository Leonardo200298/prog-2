package practico3.ejercicio3;

public class JugarPartida {
    private Jugador j1;
    private Jugador j2;

    public JugarPartida(Jugador j1, Jugador j2){
        this.j1 = j1;
        this.j2 = j2;
    }

    public Jugador jugar(){
        Jugador jugadorGanador  = new Jugador(null, null, null);
        for (Caracteristica c1 : j1.getCaracteristicas()) {
            for (Caracteristica c2 : j2.getCaracteristicas()) {
                if (c1.getAltura()>c2.getAltura()) {
                    jugadorGanador = j1;
                }else{
                    jugadorGanador = j2;
                }
                if (c1.getAltura()==c2.getAltura()) {
                    j1.setCaracteristicas(c1);
                    j2.setCaracteristicas(c2);
                    if (c1!=c2) {
                        System.out.println("deben ser las mismas caracteristicas: ");
                        j1.setCaracteristicas(c1);
                        j2.setCaracteristicas(c2);
                        
                    }
                }
            }
        }
        return jugadorGanador;
    }
    public Jugador jugar(int t){
        return new Jugador(null,null,null);
    }
}
