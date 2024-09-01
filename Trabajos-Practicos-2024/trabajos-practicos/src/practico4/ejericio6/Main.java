package practico4.ejericio6;


public class Main {
    
    public static void main(String[] args) {
        Empresa ee = new Empresa();
        Empleado empleado = new Empleado("Leonardo","Sanchez",33,1,900000.00,"empleado");
        Empleado empleado2 = new Empleado("Jack", "Jagger", 39, 3, 700000.0, "empleado");
        Jerarquico jerarquicoP = new Jerarquico("Juan","Gomez", 39, 2,2000000, "Jerarquico");
        jerarquicoP.agregarEmpleadoACargo(empleado);
        jerarquicoP.agregarEmpleadoACargo(empleado2);
        ee.agregarEmpleado(empleado);
        ee.agregarEmpleado(empleado2);
        ee.agregarEmpleado(jerarquicoP);

        System.out.println(ee.cadenaDePersonas());
        
        
    }

   
}
