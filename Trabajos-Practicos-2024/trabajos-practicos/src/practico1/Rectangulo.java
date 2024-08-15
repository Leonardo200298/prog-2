package practico1;

public class Rectangulo{

    private int lh1;
    private int lv1;
    private int lh2;
    private int lv2;

    public Rectangulo(int lh1, int lv1, int lh2, int lv2){
        this.lh1 = lh1;
        this.lv1 = lv1;
        this.lh2 = lh2;
        this.lv2 = lv2;
    }

    public Rectangulo(int lh1, int lv1, int lv2){
        this.lh1 = lh1;
        this.lv1 = lv1;
        this.lv2 = lv2;
    }

    public void desplazamientoEnElPlano(int x, int y){
        this.lh1 += x;
        this.lv1 += x;
        this.lh2 += x;
        this.lv2 += x;
        this.lh1 += y;
        this.lv1 += y;
        this.lh2 += y;
        this.lv2 += y;
    }

    public int calcularArea(){
        return this.lh1 * this.lv1;
    }

    public int rectanguloMasGrandeQueOtro(Rectangulo r2){
        if (this.calcularArea() == r2.calcularArea()) return 0;  
         
        return  (this.calcularArea() < r2.calcularArea() ? 1 : -1);
    }

    public boolean esCuadrado(){
        return this.lh1 == this.lv1;
    }

    public int ladoSuperior(){
        //represente a lh2 como lado horizontal 2 o base
        return this.lh2;
    }

    public boolean estaParado(){
        return this.lv1 > this.lh1;
    }
}

