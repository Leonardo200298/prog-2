package practico2.ejercicio2;

public class Main {
    public static void main(String[] args) {

        AgendaPersonal au1 = new AgendaPersonal();
        Usuario u1 = new Usuario("Leonardo", 1, "elmail", au1);
        AgendaPersonal au2 = new AgendaPersonal();
        Usuario u2 = new Usuario("Facundo", 2, "elmail2", au2);

        Reunion r1 = new Reunion("La quiaca", "El medioambiente", 120);
        r1.addUsuario(u2);
        r1.addUsuario(u1);

        System.out.println(u1.getAgenda().getDatosReunion(r1));
    }
}
