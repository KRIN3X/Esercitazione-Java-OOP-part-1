package it.esercitazione.animali;

public class Cane extends Animale {
    private String razza;

    public Cane(String nome, int eta, String razza) {
        super(nome, eta, "Cane");
        this.razza = razza;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Cane other = (Cane) obj;
        return razza != null ? razza.equals(other.razza) : other.razza == null;
    }
}
