package practico5.ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Planta pp = new Planta("Haedes Aegiptis", "dengue", "Islandia", LocalDate.of(2012, 12, 23));
        Planta pp2 = new Planta("chupaverguis autoctono", "Leo", "Corrientes", LocalDate.of(2012, 3, 5));
        System.out.println("primer identificador "+pp.getId());
        System.out.println("Segundo identificador "+pp2.getId());
        System.out.println(Planta.getContador());
    }
}
