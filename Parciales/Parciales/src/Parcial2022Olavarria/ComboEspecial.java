package Parcial2022Olavarria;

public class ComboEspecial extends Combo {
    private Condicion c1;

    public ComboEspecial(String m, double descuento, Condicion c1) {
        super(m, descuento);
        this.c1 = c1;
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public void addPieza(ElementoPieza p) {
        if (c1.cumpleElem(p)) {
            super.addPieza(p);
        }

    }

}
