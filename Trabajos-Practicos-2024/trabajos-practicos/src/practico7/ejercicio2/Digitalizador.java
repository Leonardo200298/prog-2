package practico7.ejercicio2;

import java.util.ArrayList;

public class Digitalizador {
    private ArrayList<Documento> documentos;
    
    public Digitalizador(){
        this.documentos = new ArrayList<>();
    }

    public ArrayList<Documento> getDocumentos() {
        return new ArrayList<>(documentos);
    }

    public ArrayList<Documento> documentosQueCumplanDichaCondicion(Condicion cc){
        ArrayList<Documento> salida = new ArrayList<>();
        for (Documento documento : documentos) {
            if (cc.cumple(documento)) {
                salida.add(documento);
            }
        }
        return salida;
    }

    
}
