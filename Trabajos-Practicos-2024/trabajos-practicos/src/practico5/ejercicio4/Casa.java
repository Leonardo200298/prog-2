package practico5.ejercicio4;

import java.util.ArrayList;

public class Casa {
    private ArrayList<Cualidad> cualidades;
    private int capacidadMaximaDeAlumnos;
    private ArrayList<Alumno> alumnos;

    public Casa(int capacidadMaximaDeAlumnos){
        this.cualidades = new ArrayList<>();
        this.capacidadMaximaDeAlumnos = capacidadMaximaDeAlumnos;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno){
        if (alumnos.size() < this.getCapacidadMaximaDeAlumnos()) {
            alumnos.add(alumno);
        }
    }

    public ArrayList<Alumno> getAlumnos(){
        return this.alumnos;
    }

    public void agregarCualidad(Cualidad cualidad){
        this.cualidades.add(cualidad);
    }
    
    public ArrayList<Cualidad> getCualidades(){
        return this.cualidades;
    }

    public int getCapacidadMaximaDeAlumnos() {
        return capacidadMaximaDeAlumnos;
    }

    public void setCapacidadMaximaDeAlumnos(int capacidadMaximaDeAlumnos) {
        this.capacidadMaximaDeAlumnos = capacidadMaximaDeAlumnos;
    }

    public void admision(Alumno aa){
        boolean match = false;
        for (int i = 0; i < aa.getCualidades().size(); i++) {
            for (int j = 0; j < this.getCualidades().size(); j++) {
                if (aa.getCualidades().get(i).equals(this.getCualidades().get(j))) {
                    match = true;
                }
            }
            if (match && !this.cualidades.contains(aa.getCualidades().get(i))) {
                this.alumnos.add(aa);
            }else{
                System.out.println("No cuenta con las cualidades para entrar a la casa");
            }
        }
    }
    
}
