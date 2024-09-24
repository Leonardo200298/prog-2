package practico5.Ejercicio1;
import java.time.LocalDate;

class Planta {
  	private String nombreCientifico;
  	private String nombreComun;
  	private String paisOrigen;
  	private LocalDate fechaCompra;
  	private int id;
  	static int contador=0;
  	
  	public Planta(String nombreCientifico, String nombreComun, String paisOrigen,LocalDate fechaCompra){
      this.nombreCientifico=nombreCientifico;
      this.nombreComun=nombreComun;
      this.paisOrigen=paisOrigen;
      this.fechaCompra=fechaCompra;
      this.id = Planta.aumentarContador();
      
    }
  	public static int aumentarContador(){
      contador++;
      return contador;
    }
    public String getNombreCientifico() {
      return nombreCientifico;
    }
    public void setNombreCientifico(String nombreCientifico) {
      this.nombreCientifico = nombreCientifico;
    }
    public String getNombreComun() {
      return nombreComun;
    }
    public void setNombreComun(String nombreComun) {
      this.nombreComun = nombreComun;
    }
    public String getPaisOrigen() {
      return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
      this.paisOrigen = paisOrigen;
    }
    public LocalDate getFechaCompra() {
      return fechaCompra;
    }
    public void setFechaCompra(LocalDate fechaCompra) {
      this.fechaCompra = fechaCompra;
    }
    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public static int getContador() {
      return contador;
    }
    public static void setContador(int contador) {
      Planta.contador = contador;
    }
    
  
  
  
}