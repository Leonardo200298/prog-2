package practico2.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Impuesto i1 = new Impuesto("imp1", 10000);
        Impuesto i2 = new Impuesto("imp2", 15000);
        Impuesto i3 = new Impuesto("imp3", 25000);
        Impuesto i4 = new Impuesto("imp4", 35000);
        Impuesto i5 = new Impuesto("imp5", 10000);
        Ciudad c1 = new Ciudad("Tandil", 300000, 120000);
        c1.addImpuesto(i1);
        c1.addImpuesto(i2);
        c1.addImpuesto(i3);
        c1.addImpuesto(i4);
        c1.addImpuesto(i5);
        Ciudad c2 = new Ciudad("Bahia Blanca", 350000, 125000);
        c2.addImpuesto(i1);
        c2.addImpuesto(i2);
        c2.addImpuesto(i3);
        c2.addImpuesto(i4);
        c2.addImpuesto(i5);
        Ciudad c3 = new Ciudad("Ayacucho", 100001, 100000);
        c3.addImpuesto(i1);
        c3.addImpuesto(i2);
        c3.addImpuesto(i3);
        c3.addImpuesto(i4);
        c3.addImpuesto(i5);
        Provincia pr1 = new Provincia("Buenos Aires");
        pr1.addCiudad(c3);
        pr1.addCiudad(c2);
        pr1.addCiudad(c1);

        Pais p1 = new Pais();
        p1.addProvincia(pr1);

        System.out.println(p1.getCiudadesMasGastadoras());
        System.out.println(p1.getProvinciasMasDeficit());

    }
}
