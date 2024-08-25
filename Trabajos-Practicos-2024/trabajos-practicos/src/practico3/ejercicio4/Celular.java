package practico3.ejercicio4;

import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos;

    public Celular(){
        this.contactos = new ArrayList<>();
    }

    public String getMostrarContactos(){
        String resultado ="";
        String appe;
        String nombre;
        int edad;
        Long tel;
        String ciudad;
        for (Contacto contacto : contactos) {
            appe = contacto.getApellido();
            nombre = contacto.getNombre();
            edad = contacto.getEdad();
            tel = contacto.getTelefono();
            ciudad = contacto.getCiudad();
            resultado += "apellido: " + appe+ "\n";
            resultado += "nombre: " + nombre+ "\n";
            resultado += "edad: " + edad+ "\n";
            resultado += "tel: " + tel + "\n";
            resultado += "ciudad: " + ciudad+ "\n";
        }

        return  resultado;
    }
    
    public boolean numerosIguales(Long t1, Long t2){
        return t1 == t2;

    }
    public boolean cadenasIguales(String s1, String s2) {
        return s1.equals(s2);
    }
    public ArrayList<Contacto> contactosRepetidos(){
        ArrayList<Contacto> contactosRep = new ArrayList<>();
        for (Contacto contacto : contactos) {
            
        }
        return contactosRep;
    }
}
