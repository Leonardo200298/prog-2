import practico8.ejercicio2.*;

public class App {
    public static void main(String[] args) throws Exception {
        EnvioPaquete e1 = new EnvioPaquete(1,"Narnia","Sucursal", 10);
        EnvioPaquete e2 = new EnvioPaquete(2,"Narnia","Sucursal", 10);
        EnvioPaquete e3 = new EnvioPaquete(3,"Narnia","Sucursal", 10);
        EnvioCombo e4 = new EnvioCombo(4);
        e4.addPaquete(e1);
        e4.addPaquete(e2);
        e4.addPaquete(e3);
        EnvioCombo e5= new EnvioCombo(5);
        e5.addPaquete(e4);
        System.out.println(e5.getTracking());
        System.out.println(e4.getTracking());
    }
}
