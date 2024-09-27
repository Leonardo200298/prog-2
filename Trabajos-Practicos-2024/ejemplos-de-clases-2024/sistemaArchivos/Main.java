package sistemaArchivos;

import sistemaArchivos.condiciones.CondNot;
import sistemaArchivos.condiciones.CondTamanioMayor;
import sistemaArchivos.condiciones.Condicion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Directorio raiz =  new Directorio("raiz");
        Directorio d2 =  new Directorio("TUDAI");
        Directorio d3 =  new Directorio("Prog2");
        Archivo parcial = new Archivo("parcial", 20.0, "txt");
        Archivo recu = new Archivo("recu", 420.5, "pdf");
        Archivo prefi = new Archivo("prefi", 5420.5, "pdf");

        raiz.addElemento(d2);
        raiz.addElemento(parcial);
        raiz.addElemento(d3);
        d2.addElemento(recu);
        d2.addElemento(prefi);

        System.out.println(raiz.getTamanio());
        System.out.println(d2.getTamanio());
        System.out.println(d3.getTamanio());

        raiz.cantElementos();

        Condicion cond =  new CondTamanioMayor(100.0);
        Condicion menores = new CondNot(cond);
        ArrayList<Archivo> resultado = raiz.buscar(cond);
        System.out.println(resultado);
    }
}
