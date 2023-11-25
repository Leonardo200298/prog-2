package recuperatorio_2023;

import java.util.ArrayList;

public class Bloque extends Tarjeta{
    ArrayList<Tarjeta> tarjetas;
    private static double gastoBateriaBloque = 5.0;
    

    public Bloque(){
        this.tarjetas = new ArrayList<>();
        
    }

    @Override
    public int getTiempoDeEjecucion() {
        int acumulador = 0;
        for (Tarjeta i : tarjetas) {
            int tiempoDeEjecucionDelSimple = i.getTiempoDeEjecucion();
            acumulador += tiempoDeEjecucionDelSimple;
        }
        return acumulador;
    }

    @Override
    public double getCantidadDeEnergiaNecesaria() {
        double acumulador=0.0;
        for (Tarjeta t : tarjetas) {
            double gastoDeBateriaDeSimple = t.getCantidadDeEnergiaNecesaria();
            acumulador += gastoDeBateriaDeSimple;
            
        }
        return acumulador + Bloque.gastoBateriaBloque * this.getTiempoDeEjecucion();
    
    }
    public Bloque crearObjeto(){
        return new Bloque();
    }
    @Override
    public Tarjeta getCopia(Condicion condicion) {
        ArrayList<Tarjeta> auxHijosQueCumplen = new ArrayList<>();
        for (Tarjeta i : tarjetas) {
            Tarjeta copiaTarjeta = i.getCopia(condicion);
            if (copiaTarjeta!=null) {
                auxHijosQueCumplen.add(copiaTarjeta);
            }
        }
        if (auxHijosQueCumplen.size() > 0) {
            Bloque copia = this.crearObjeto();
            for (Tarjeta tarjeta : tarjetas) {
                copia.addTarjeta(tarjeta);
            }
            return copia;
        }
        return null;
        //solucion de los profes
        /*  public Tarjeta getCopia(Filtro filtro) {
                Bloque copiaBloque = crearObjeto();
                for (Tarjeta t:tarjetas){
                    Tarjeta copia = t.getCopia(filtro);
                    if (copia!=null)
                        copiaBloque.agregarTarjeta(copia);
                }
                if (copiaBloque.cantidadTarjetas()>1)
                    return copiaBloque;
                else
                    return null;
            }
         */
    }

    public void addTarjeta(Tarjeta tarjeta){
        tarjetas.add(tarjeta);
    }

    @Override
    public ArrayList<String> getInstrucciones() {
        //sin repetidos
       /*  ArrayList<String> salida = new ArrayList<String>();
        for (Tarjeta i : this.tarjetas) {
            ArrayList<String> arregloConInstrucciones = i.getInstrucciones();
            for (String j : arregloConInstrucciones) {
                if (!salida.contains(j)) {
                    salida.add(j);
                }
            }
        }
        return salida; */
        ArrayList<String> salida = new ArrayList<>();
        for (Tarjeta i : tarjetas) {
            salida.addAll(i.getInstrucciones());
        }
        return salida;
        
    }
    public int cantidadDeTarjetas(){
        int cantTarjetas = 0;
        for (Tarjeta i : tarjetas) {
            int cantidadDetarjetasDelPadre = i.cantidadDeTarjetas();
            cantTarjetas+=cantidadDetarjetasDelPadre;
        }
        //porque si estoy en el hijo debo contar una por el padre
        return super.cantidadDeTarjetas()+cantTarjetas;
    }
}
