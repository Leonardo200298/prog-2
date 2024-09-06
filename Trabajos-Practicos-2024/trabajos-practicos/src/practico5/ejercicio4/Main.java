package practico5.ejercicio4;

public class Main {
    public static void main(String[] args) {


        /* Alumnos */

        Cualidad cualidadBondad = new Cualidad("Ser bondadoso");
        Cualidad cualidadObscura = new Cualidad("Maldad");
        Cualidad cualidadHerbaria = new Cualidad("Posiciones con hierbas");
        Cualidad cualidadPatronus = new Cualidad("Facilidad para hacer spectu patronus");
        Cualidad cualidadHegemonica = new Cualidad("Ser rubio");
        Familiar dombuldardo = new Familiar("Osvaldo", "Dombuldardo");
        Familiar felixTahim = new Familiar("Felix", "Tahim");
        Familiar carlosComander = new Familiar("Carlos", "Comander");
        Alumno felixDombuldardo = new Alumno("Felix");
        Alumno ramiroTahim = new Alumno("Ramiro");

        /* Alumnos */

        felixDombuldardo.addFamiliares(dombuldardo);
        felixDombuldardo.addFamiliares(carlosComander);
        ramiroTahim.addFamiliares(dombuldardo);
        ramiroTahim.addFamiliares(felixTahim);

        felixDombuldardo.addCualidad(cualidadBondad);
        felixDombuldardo.addCualidad(cualidadPatronus);
        ramiroTahim.addCualidad(cualidadObscura);
        ramiroTahim.addCualidad(cualidadHegemonica);
        /* Casas */

        Casa griffindor = new Casa(12);
        CasaConMasFiltro eslitherim = new CasaConMasFiltro(20);

        /* Cualidades para entrar a la casa */

        griffindor.agregarCualidad(cualidadBondad);
        eslitherim.agregarCualidad(cualidadHegemonica);
        eslitherim.agregarCualidad(cualidadObscura);

        /* familiares de la casa */
        eslitherim.setFamiliares(dombuldardo);
        eslitherim.setFamiliares(felixTahim);


        System.out.println("cantidad de elemetos en cualidades en eslitherim " 
        + eslitherim.getCualidades().size() + " cantidad de familiares en eslitherim "
        + eslitherim.getFamiliares().size() + "\n" + 
        eslitherim.getCualidades().get(0).getCualidad() + " y " + eslitherim.getFamiliares().get(0).getApellido() + "\n" +
        eslitherim.getCualidades().get(1).getCualidad() + " y " + eslitherim.getFamiliares().get(1).getApellido()
        );
        
        System.out.println("------------------");

        System.out.println("Cualidades " + ramiroTahim.getCualidades().size()
        + " familiares " + ramiroTahim.getFamiliares().size() + "\n" +
        ramiroTahim.getCualidades().get(0).getCualidad() + " y " + ramiroTahim.getFamiliares().get(0).getApellido() + "\n" +
        ramiroTahim.getCualidades().get(1).getCualidad() + " y " + ramiroTahim.getFamiliares().get(1).getApellido()
        );

        System.out.println("------------------");

        eslitherim.admision(ramiroTahim);
    }
}
