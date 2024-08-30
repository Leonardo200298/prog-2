package practico4.ejercicio3;

public class EmpleadoHorasExtras extends Empleado{
    private double horasExtras;

    public EmpleadoHorasExtras(double sueldo,double horasExtras){
        super(sueldo);
        this.horasExtras = horasExtras;

    }

    public double getSalario(){
       return getHorasExtras() * super.getSalario();
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

}
