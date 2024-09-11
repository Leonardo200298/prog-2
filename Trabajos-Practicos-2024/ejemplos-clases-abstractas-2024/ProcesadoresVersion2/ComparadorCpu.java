package ProcesadoresVersion2;

public class ComparadorCpu extends ComparadorTareas {

	 public boolean compare(Tarea t1, Tarea t2) {
		  return t1.getCpu()>t2.getCpu();
	  }

}
