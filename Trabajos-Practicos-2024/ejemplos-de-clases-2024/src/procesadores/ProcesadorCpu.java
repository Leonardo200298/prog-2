package procesadores;

public class ProcesadorCpu extends Procesador {

	 public boolean compare(Tarea t1, Tarea t2) {
		  return t1.getCpu()>t2.getCpu();
	  }

}
