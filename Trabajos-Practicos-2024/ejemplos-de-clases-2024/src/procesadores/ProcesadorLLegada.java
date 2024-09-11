package procesadores;

public class ProcesadorLLegada extends Procesador {


   public void addTarea(Tarea tnueva) {
	   tareas.add(tnueva);
   }

   public boolean compare(Tarea t1, Tarea t2) {
      return false;
	}
}
