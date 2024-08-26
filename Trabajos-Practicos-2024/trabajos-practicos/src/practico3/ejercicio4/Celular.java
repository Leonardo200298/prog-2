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
        for (int i = 0; i < contactos.size() - 1; i++) {
            boolean encontrado = false;
            for (int j = i+1; j < contactos.size() - 1; j++) {
                if (cadenasIguales(contactos.get(i).getNombre(), contactos.get(j).getNombre())
                &&(cadenasIguales(contactos.get(i).getApellido(),contactos.get(j).getApellido()))
                &&(numerosIguales(contactos.get(i).getTelefono(), contactos.get(j).getTelefono()))) {
                    encontrado = true;
                }
            }
            if (encontrado && !contactosRep.contains(contactos.get(i))) {
                contactosRep.add(contactos.get(i));
                
            }
        }
      
        return contactosRep;
    }
    public ArrayList<Contacto> contactosConNumerosIguales(){
        ArrayList<Contacto> numerosIgualess = new ArrayList<>();
        for (int i = 0; i < this.contactosRepetidos().size(); i++) {
            boolean encontrado = false;
            for (int j = i+1; j < this.contactosRepetidos().size(); j++) {
                if (numerosIguales(this.contactosRepetidos().get(i).getTelefono(),this.contactosRepetidos().get(j).getTelefono())) {
                    encontrado = true;
                    
                }
            }
            if (encontrado && !numerosIgualess.contains(numerosIgualess.get(i))) {
                numerosIgualess.add(this.contactosRepetidos().get(i));
            }
        }
        return numerosIgualess;
    }
}
