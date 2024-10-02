

public class CondMenorGramos extends Condicion{
    private int gramos;
	public CondMenorGramos(int gr) {
	    gramos = gr;
	}
	
	public boolean cumple(Pieza3D ee) {
		return ee.getPla()<gramos;
	}

}
