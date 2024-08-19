package prefinal_2021;

public class CondicionNOT extends Condicion{
    private CondicionNOT cond;

    
    
    public CondicionNOT(CondicionNOT cond) {
        this.cond = cond;
    }



    @Override
    public boolean cumple(Video e) {
        return !cond.cumple(e);
    }
    
}

/*  function findFirstRepeated(giftIds) {
  // Objeto para realizar un seguimiento de las identificaciones ya vistas
  const seenIds = {};

  for (let i = 0; i < giftIds.length; i++) {
    const currentId = giftIds[i];

    // Verifica si la identificación ya ha sido vista
    if (seenIds[currentId] !== undefined) {
      return currentId; // Devuelve la identificación si se ha repetido
    }

    // Almacena el índice de la primera ocurrencia de la identificación
    seenIds[currentId] = i;
  }

  return -1; // Si no se encuentra ninguna repetición
}*/
