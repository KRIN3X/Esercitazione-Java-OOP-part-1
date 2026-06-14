package it.esercitazione.animali;

public class App {
    public static void main(String[] args) {
        Cane cane1 = new Cane("Fido", 5, "Labrador");
        Cane cane2 = new Cane("Fido", 5, "Labrador");
        Cane cane3 = new Cane("Rex", 3, "Beagle");

        Gatto gatto1 = new Gatto("Micio", 2, true);
        Gatto gatto2 = new Gatto("Micio", 2, true);
        Gatto gatto3 = new Gatto("Tigre", 4, false);

        System.out.println("=== Test base classe App ===");
        System.out.println("cane1 equals cane2: " + cane1.equals(cane2));
        System.out.println("cane1 equals cane3: " + cane1.equals(cane3));
        System.out.println("gatto1 equals gatto2: " + gatto1.equals(gatto2));
        System.out.println("gatto1 equals gatto3: " + gatto1.equals(gatto3));
        System.out.println("cane1 equals gatto1: " + cane1.equals(gatto1));

        System.out.println("\nDettagli oggetti:");
        System.out.println("Cane 1: nome=" + cane1.getNome() + ", eta=" + cane1.getEta() + ", specie=" + cane1.getSpecie() + ", razza=" + cane1.getRazza());
        System.out.println("Gatto 1: nome=" + gatto1.getNome() + ", eta=" + gatto1.getEta() + ", specie=" + gatto1.getSpecie() + ", domestico=" + gatto1.isDomestico());
    }
}
