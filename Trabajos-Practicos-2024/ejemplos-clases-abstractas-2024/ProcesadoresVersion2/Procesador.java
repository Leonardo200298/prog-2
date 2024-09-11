package ProcesadoresVersion2;

import java.util.ArrayList;

public  class Procesador {

	
	protected ColaTareas tareas;
	
	public Procesador() {
		tareas = new ColaTareas();
	}
	public void ejecutarTarea() {
      Tarea t1 = tareas.getPrimera();
      if (t1!=null)
    	  t1.ejecutar();
       
	}
	
	public  void addTarea(Tarea taux) {
		tareas.addTarea(taux);
	};
	
	public boolean tieneTareas() {
		return tareas.tieneTareas();
	}
	
	public void cambiar(ComparadorTareas tt) {
		//tareas = tt;
		tareas.cambiarForma(tt);;
	}
}
