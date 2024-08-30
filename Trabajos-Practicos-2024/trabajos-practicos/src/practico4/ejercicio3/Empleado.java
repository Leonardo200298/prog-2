package practico4.ejercicio3;

public class Empleado {
    private double horasTrabajadas;
    private SueldoPorVentas tipoSueldo;
    private int ventas;

    public Empleado (double horasTrabajadas, SueldoPorVentas tipoSueldo, int ventas){
        this.horasTrabajadas = horasTrabajadas;
        this.tipoSueldo = tipoSueldo;
        this.ventas = ventas;
    }
    public void setVentas(){
        tipoSueldo.setVentas(ventas);
    }
    public double getSueldo(){
        
        return tipoSueldo.getSalario();
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getVentas() {
        return ventas;
    }
  
    public Sueldo getTipoSueldo() {
        return tipoSueldo;
    }
    public void setTipoSueldo(SueldoPorVentas tipoSueldo) {
        this.tipoSueldo = tipoSueldo;
    }

    
    
}
