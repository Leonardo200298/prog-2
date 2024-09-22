package practico7.ejercicio1;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<ProductoQuimico> agroquimicos;

    public Empresa() {
        this.agroquimicos = new ArrayList<>();
    }

    public ArrayList<ProductoQuimico> agroquimicosQueTratanDichaEnfermedad(Enfermedad ee) {
        ArrayList<ProductoQuimico> salida = new ArrayList<>();
        for (ProductoQuimico agro : this.agroquimicos) {
            if (agro.getEstadosPatologicos().contains(ee.getNombre())) {
                salida.add(agro);
            }
        }
        return salida;
    }

    public ArrayList<ProductoQuimico> listadoDeAgroquímicosConLosPuedenTratar(Cultivo cc, Enfermedad ee){
        ArrayList<ProductoQuimico> salida = new ArrayList<>();
        for (ProductoQuimico agro : this.agroquimicos) {
            if (cc.puedeTratar(agro) && ee.getEstadosPatologicosQueTrataELProductoQuimico().contains(agro)) {
                salida.add(agro);
            }
            
        }
        return salida;
    }
}
