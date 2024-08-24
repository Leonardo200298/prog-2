package practico3.ejercicio1;

import java.util.ArrayList;

public class Encuesta {
    private ArrayList<String> preguntas;
    private Persona personaEncuestada;
    private Empleado empleado;
    private boolean seRealizo;
    private ArrayList<Integer> dnisDeGenteQueContesto;

    public Encuesta(Persona personaEncuestada, Empleado empleado) {
        this.preguntas = new ArrayList<>();
        this.personaEncuestada = personaEncuestada;
        this.empleado = empleado;
        this.seRealizo = false;
        this.dnisDeGenteQueContesto = new ArrayList<>();
    }

    public void setSeRealizo(boolean seRealizo) {
        this.seRealizo = seRealizo;
    }

    public Persona getPersonaEncuestada() {
        return personaEncuestada;
    }

    public int getdniPersonaencuestada() {
        return personaEncuestada.getDni();
    }

    public void setPersonaEncuestada(Persona personaEncuestada) {
        this.personaEncuestada = personaEncuestada;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public boolean SeRealizo() {
        return seRealizo;
    }

    public String respondida() {
        return "Respondida";
    }

    public void llenarEncuesta(Persona pp, Empleado ee) {

        for (String pre : preguntas) {
            respondida();   

        }
        setSeRealizo(true);
        int dniPersonaEncuestada = pp.getDni();
        dnisDeGenteQueContesto.add(dniPersonaEncuestada);

    }
    
    public boolean sacarFalsificacion(Encuesta e) {
        if (!e.SeRealizo() && e.getPersonaEncuestada().getDni() == this.getdniPersonaencuestada()) {
            return true;
        } else
            return false;
    }

}
