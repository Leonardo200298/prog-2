package practico4.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

public class IntegranteCuerpoTecnico {
    private String nombre;
    private String apellido;
    private Long pasaporte;
    private LocalDate fecha_de_nacimiento;
    private ArrayList<Estado> estados;
    private boolean estarEnElPais;
    private boolean concentrado;

    public IntegranteCuerpoTecnico(String nombre, String apellido, Long pasaporte, LocalDate fecha_de_nacimiento,
            boolean estarEnElPais, boolean concentrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.estados = new ArrayList<>();
        this.estarEnElPais = estarEnElPais;
        this.concentrado = concentrado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Long getPasaporte() {
        return pasaporte;
    }
    public void setPasaporte(Long pasaporte) {
        this.pasaporte = pasaporte;
    }
    public LocalDate getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }
    public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }
    public boolean isEstarEnElPais(boolean inte) {
        return estarEnElPais;
    }
    public void setEstarEnElPais(boolean estarEnElPais) {
        this.estarEnElPais = estarEnElPais;
    }
    public boolean isConcentrado(boolean inte) {
        return concentrado;
    }
    public void setConcentrado(boolean concentrado) {
        this.concentrado = concentrado;
    }
    public ArrayList<Estado> getEstados() {
        return estados;
    }
    public void setEstados(ArrayList<Estado> estados) {

        this.estados.addAll(estados);
    }
    public boolean disponible(boolean inte){
        return this.isConcentrado(inte) && this.isEstarEnElPais(inte);
    }
    
}
