package ProcesadoresVersion2;

public class ComparadorPrioridad extends ComparadorTareas {


  public boolean compare(Tarea t1, Tarea t2) {
	  return t1.getPrioridad()>t2.getPrioridad();
  }
}
