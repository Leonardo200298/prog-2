package procesadores;

import java.util.ArrayList;

public abstract class Procesador {

	
	protected ArrayList<Tarea> tareas;
	
	public Procesador() {
		tareas = new ArrayList<Tarea>();
	}
	public void ejecutarTarea() {
		if(tareas.size()>0) {
			Tarea t0 = tareas.get(0);
			tareas.remove(0);
			t0.ejecutar();
		}
	}
	
	public  void addTarea(Tarea taux) {
		int lugar = 0;
		while(lugar<tareas.size() && this.compare(tareas.get(lugar),taux)) {
			lugar++;
		}
		if (lugar<tareas.size()) {
			tareas.add(lugar, taux);
		} else {
			tareas.add(taux);
		}
	};
	
	public abstract boolean compare(Tarea t1, Tarea t2);
	public boolean tieneTareas() {
		return tareas.size() > 0;
	}
}
