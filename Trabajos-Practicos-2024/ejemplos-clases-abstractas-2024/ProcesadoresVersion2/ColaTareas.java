package ProcesadoresVersion2;

import java.util.ArrayList;

public  class ColaTareas {

	private ArrayList<Tarea> tareas;
	private ComparadorTareas cc;
	
	
	public ColaTareas() {
		tareas = new ArrayList<Tarea>();
		cc = new ComparadorCpu();
	}
	
	public void addTarea(Tarea tt) {
		int lugar = 0;
		while(lugar<tareas.size() &&
				cc.compare(tareas.get(lugar),tt)) {
			lugar++;
		}
		if (lugar<tareas.size()) {
			tareas.add(lugar, tt);
		} else {
			tareas.add(tt);
		}
	}
	public boolean tieneTareas() {
		return tareas.size()>0;
	}
	
    public Tarea getPrimera() {
    	if(tareas.size()>0) {
			Tarea t0 = tareas.get(0);
			tareas.remove(0);
			return t0;
		} else {
			return null;
		}
    }
	
	
	public void copiarA(ColaTareas cc) {
		while(this.tieneTareas()) {
			cc.addTarea(this.getPrimera());
		}
	}
	
	public void cambiarForma(ComparadorTareas tnuevo) {
		cc= tnuevo;
		ArrayList<Tarea> aux = tareas;
		tareas=	new ArrayList<Tarea>();
		for(int i = 0; i< aux.size();i++) {
			this.addTarea(aux.get(i));
		}
	}
}
