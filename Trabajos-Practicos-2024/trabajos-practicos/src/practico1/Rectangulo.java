package practico1;

public class Rectangulo{

    private ElementoGeometrico rectangulo;
    
    
    private int l1;
    private int l2;

    public Rectangulo(ElementoGeometrico rectangulo){
        this.l1 = rectangulo.getX();
        this.l2 = rectangulo.getY();
    }

    public void desplazamientoEnElPlano(ElementoGeometrico recta){
        recta.desplazamiento(this.l1,this.l2);
    }

    public int calcularArea(){
        return this.l2 * this.l1;
    }

    public int rectanguloMasGrandeQueOtro(Rectangulo r2){
        if (this.calcularArea() == r2.calcularArea()) return 0;  
         
        return  (this.calcularArea() < r2.calcularArea() ? 1 : -1);
    }

    public boolean esCuadrado(){
        return this.l1 == this.l2;
    }

    public int ladoSuperior(){
        return this.l2;
    }

    public boolean estaParado(){
        return this.l1 > this.l2;
    }

    public ElementoGeometrico getRectangulo() {
        return rectangulo;
    }
    
}

