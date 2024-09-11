package ProcesadoresVersion2;

public class Tarea {

	private double cpu;
	private double memoria;
	private int prioridad;
	
	public Tarea(double cpu, double memoria, int prioridad) {
		super();
		this.cpu = cpu;
		this.memoria = memoria;
		this.prioridad = prioridad;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public void ejecutar() {
		System.out.println("Se ejecuto " + cpu + "-"+ memoria +"-"+prioridad);
	}
	
	
}
