package practico5.ejercicio4;
import java.util.ArrayList;


public class CasaConMasFiltro extends Casa{

    private ArrayList<Familiar> familiares;

    public CasaConMasFiltro(int capacidadMaximaDeAlumnos) {
        super(capacidadMaximaDeAlumnos);
        this.familiares = new ArrayList<>();
        
    }
    public ArrayList<Familiar> getFamiliares() {
        return familiares;
    }
    public void setFamiliares(Familiar ff1) {
        this.familiares.add(ff1);
    }
    public void admision(Alumno aa) {
        boolean matchCualidad = false;
        boolean matchFamiliar = false;
    
        // Comparar Cualidades
        for (Cualidad cualidadAlumno : aa.getCualidades()) {
            for (Cualidad cualidadCasa : this.getCualidades()) {
                if (cualidadAlumno.getCualidad().equals(cualidadCasa.getCualidad())) {
                    matchCualidad = true;
                }
            }
        }
    
        // Comparar Familiares
        for (Familiar familiarAlumno : aa.getFamiliares()) {
            for (Familiar familiarCasa : this.getFamiliares()) {
                if (familiarAlumno.getApellido().equals(familiarCasa.getApellido())) {
                    matchFamiliar = true;
                }
            }
        }
    
        // Lógica final para la admisión
        if (matchCualidad && matchFamiliar) {
            this.getAlumnos().add(aa);
            System.out.println(aa.getNombre() + " ha sido admitido en la casa.");
        } else {
            System.out.println(aa.getNombre() + " no cuenta con las cualidades o el linaje para entrar a la casa.");
        }
    }
    
}
