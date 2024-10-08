package practico1;

public class ElementoGeometrico{
    private int x;
    private int y;
    
    public ElementoGeometrico(int x, int y){
        this.x = x;
        this.y = y;

    }
    public ElementoGeometrico(){
        this.x = 0;
        this.y = 0;
    }
    public void desplazamiento(int x, int y){
        this.x += x;
        this.y += y;
    }
    public double distanciaEuclidea(int x,int y){
        return Math.pow(this.x - x,2) + Math.pow((this.y - y),2);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
}