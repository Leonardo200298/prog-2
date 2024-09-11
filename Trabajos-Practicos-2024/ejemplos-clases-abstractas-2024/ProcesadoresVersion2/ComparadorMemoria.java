package ProcesadoresVersion2;

public class ComparadorMemoria extends ComparadorTareas {

	 public boolean compare(Tarea t1, Tarea t2) {
		  return t1.getMemoria()>t2.getMemoria();
	  }
}
