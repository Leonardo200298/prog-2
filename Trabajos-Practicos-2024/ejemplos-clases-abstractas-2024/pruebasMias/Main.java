public class Main {
    public static void main(String[] args) {
        Hijo n1 = new Hijo("Chuck", "Ronald", 12);
        Nieto n2 = new Nieto("Silvio", "Pereira", 5);
        Bisnieto nb1 = new Bisnieto("Carlos", "Soldan", 2);
        n1.agregarFamiliar(n2);
        n1.agregarFamiliar(nb1);
        System.out.println(n1.getFamiliares().get(0));
        System.out.println(n1.getFamiliares().get(1));
    }
}
