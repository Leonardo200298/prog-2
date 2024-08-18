package practico1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fecha_de_nacimiento;
    private int dni;
    private String sexo;
    private int peso;
    private int altura;

    public Persona(String nombre, String apellido, LocalDate fecha_de_nacimiento, int dni, int peso, int altura) {
        this.dni = dni;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.altura = altura;
        this.edad = LocalDate.now().getYear() - fecha_de_nacimiento.getYear();
    }

    public Persona(int dni) {
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.fecha_de_nacimiento = LocalDate.of(2000, 1, 1);
        this.edad = LocalDate.now().getYear() - fecha_de_nacimiento.getYear();
        this.sexo = "Femenino";
        this.peso = 1;
        this.altura = 1;
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_de_nacimiento = LocalDate.of(2000, 1, 1);
        this.edad = LocalDate.now().getYear() - fecha_de_nacimiento.getYear();
        this.sexo = "Femenino";
        this.peso = 1;
        this.altura = 1;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fecha_de_nacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.edad = LocalDate.now().getYear() - fecha_de_nacimiento.getYear();
        this.sexo = "Femenino";
        this.peso = 1;
        this.altura = 1;
    }

    public double indiceDeMasaCorporal() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public boolean estaEnForma() {
        return (this.indiceDeMasaCorporal() > 18.5 && this.indiceDeMasaCorporal() < 25);
    }

    public boolean estaDeCumple() {
        if (LocalDate.now().getMonth() == fecha_de_nacimiento.getMonth()
                && LocalDate.now().getDayOfMonth() == fecha_de_nacimiento.getDayOfMonth()) {

            return true;
        } else
            return false;
    }

    public boolean esMayorDeEdad() {
        return this.edad > 18;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }

    public boolean puedeVotar() {
        return this.edad > 16;
    }

    public boolean esCoherenteLaFechaConEdad() {
        return (LocalDate.now().getYear() - fecha_de_nacimiento.getYear()) == this.edad;
    }

    public String retornarInfo() {
        return "nombre: " + this.nombre + "\n" + "apellido: " + this.apellido
                + "\n" + "edad" + this.edad + "\n" + "dni: " + this.dni + "\n" + "altura: " + this.altura
                + "\n" + "peso: " + this.peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}