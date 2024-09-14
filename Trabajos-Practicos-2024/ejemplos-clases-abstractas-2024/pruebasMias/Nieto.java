public class Nieto extends Hijo{

    public Nieto(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        
    }
    public void agregarFamiliar(){
        super.agregarFamiliar(this);
    }
    @Override
    public boolean conseguirTrabajo(Hijo hijx) {
        // TODO Auto-generated method stub
        return false;
    }
    
   

    
}
