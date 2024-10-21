package Parcial2023Quequen;

public class ColeccionBasica extends ColeccionTematica {
    private Cond filt;

    public ColeccionBasica(String nombre, double extra, Cond filt) {
        super(nombre, extra);
        this.filt = filt;
    }

    public Cond getFiltro() {
        return filt;
    }

    public void setFiltro(Cond filt) {
        this.filt = filt;
    }

    @Override
    public void addProducto(Producto p) {
        if (filt.cumpleCondicion(p)) {
            super.addProducto(p);
        }
    }

}
