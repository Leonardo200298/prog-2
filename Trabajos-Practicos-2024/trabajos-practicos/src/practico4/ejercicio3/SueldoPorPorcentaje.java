package practico4.ejercicio3;

public class SueldoPorPorcentaje extends Sueldo{

    public SueldoPorPorcentaje(double salarioFijo) {
        super(salarioFijo);
        
    }
    public double getSalarioPorPorcentaje(Empleado ee){
        return ee.getVentas() + this.getSalario();
    }
}
