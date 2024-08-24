package practico2.ejercicio5;
import java.time.LocalDate;
import java.util.ArrayList;

public class Peluqueria {
    private ArrayList<Cliente> clientesFrecuentes;
    private ArrayList<Peluquero> peluqueros;
    private ArrayList<Turno> turnos;
    

    public Peluqueria(){
        this.clientesFrecuentes = new ArrayList<>();
        this.peluqueros = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }
    public void addPeluquero(Peluquero p){
        peluqueros.add(p);
    }
    public void addTurnoDisponible(Turno t){
        turnos.add(t);
    }

    public void sacarTurno(Peluquero p, Cliente c){
        Turno t = getPrimerTurnoDisponible();
        if (t.isLibre()) {
            t.setLibre(false);
            t.setCliente(c);
            t.setPeluquero(p);
            if (isClienteFrecuente(c)) {
/*                 ...
 */            }
        }
    }

    public Turno getPrimerTurnoDisponible(){
        Turno aux = new Turno();
        for (Turno turno : turnos) {
            if (turno.isLibre()) {
                aux = turno;
                return aux;
            }
        }
        return aux;
    }
    public void setClienteFrecuente(Cliente c){
        if (!clientesFrecuentes.contains(c)) {
        for (Turno t : turnos) {
           if ((t.getCliente().equals(c) ) && (t.getFecha().getMonth().equals(LocalDate.now().getMonth()))){
                clientesFrecuentes.add(c);
           }
        }
    }
    }
    public boolean isClienteFrecuente(Cliente c){
        return clientesFrecuentes.contains(c);
    }
}
