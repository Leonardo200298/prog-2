package practico7.ejercicio1;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Producto> productos;
    
    public Sistema(){
        productos = new ArrayList<>();
    }
    public ArrayList<Producto> agroquimicosQueTratanLaEnfermedad(Enfermedad ee){
        ArrayList<Producto> aux = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPatologias().containsAll(ee.getPatologias())) {
                aux.add(producto);
            }
        }
        return aux;
    }
    public ArrayList<Producto> BuscarProducto(Cultivo cc, Enfermedad ee){
        ArrayList<Producto> aux = new ArrayList<>();
        aux.addAll(agroquimicosQueTratanLaEnfermedad(ee));
        for (Producto producto : aux) {
            if (producto.getCultivosProhibidos().contains(cc)) {
                aux.remove(producto);
            }
        }
        return aux;
    }
}
