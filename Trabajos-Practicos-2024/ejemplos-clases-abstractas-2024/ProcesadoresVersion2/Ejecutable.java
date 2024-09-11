package ProcesadoresVersion2;

public class Ejecutable {

	public static void main(String[]args) {
		Tarea t1 = new Tarea(1,1,1);
		Tarea t2 = new Tarea(10,10,100);
		Tarea t3 = new Tarea(13,1,10);
		Tarea t4 = new Tarea(211,17,21);
		Tarea t5 = new Tarea(12,31,2000);
		
		Procesador compu = new Procesador();
		Procesador cc = compu;
		
		compu.addTarea(t1);
		compu.addTarea(t2);
		compu.addTarea(t3);
		compu.addTarea(t4);
		compu.addTarea(t5);
		compu.cambiar(new ComparadorMemoria());
		while(cc.tieneTareas()) {
			cc.ejecutarTarea();
		
		}
	}
}
