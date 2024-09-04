package prueba;

public class X {
    public int x1(){
        return 10;
    }

    public int x2(){
        return 20;
    }

    public int x3(){
        return this.x1()+this.x2();
    }
}
