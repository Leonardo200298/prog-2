package practico7.ejercicio2;

import java.util.ArrayList;

public class Historiador {
    private ArrayList<Documento> documentos;
    public Historiador(){
        documentos = new ArrayList<>();
    }
    public void addDocumento(Documento dd){
        documentos.add(dd);
    }

    public ArrayList<Documento> buscarDocumento(Filtro ff){
        ArrayList<Documento> aux = new ArrayList<>();
        for (Documento doc : documentos) {
            if (ff.cumple(doc)) {
                aux.add(doc);
            }
        }
        return aux;
    }
}
