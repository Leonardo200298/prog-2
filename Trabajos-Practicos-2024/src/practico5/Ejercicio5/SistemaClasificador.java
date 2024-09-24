package practico5.Ejercicio5;

import java.util.ArrayList;

public class SistemaClasificador {
    private ArrayList<Cereal> cereales;
    private ArrayList<Lote> lotes;


    public SistemaClasificador(){
        cereales = new ArrayList<>(); 
        lotes = new ArrayList<>(); 
    }
    public void addCereal(Cereal ll){
        cereales.add(ll);
    }
    public ArrayList<Cereal> seleccionadorDeCereales(Lote lo){
        ArrayList<Cereal> aux = new ArrayList<>();
        for (Cereal cereal : cereales) {
            if (cereal.getMineralesNecesarios().containsAll(lo.getMinerales())) {
                aux.add(cereal);
            }
        }
        return aux;
    }
    public ArrayList<Lote> seleccionadorDeLotes(Cereal cc){
        ArrayList<Lote> aux = new ArrayList<>();
        for (Lote lote : lotes) {
            if (lote.getMinerales().containsAll(cc.getMineralesNecesarios())) {
                aux.add(lote);
            }
        }
        return aux;
    }
    public String tipoLote(Lote ll){
        int contador=0;
        for (Mineral mineral : ll.getMinerales()) {
            if (mineral.getInteres()=="Primario") {
                contador++;
            }
        }
        if (contador==ll.getMinerales().size()) {
            return "Lote Especial";
        }else{
            return "Lote comun";
        }
    }

    
}
