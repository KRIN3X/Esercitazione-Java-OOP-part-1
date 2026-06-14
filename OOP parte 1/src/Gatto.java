package it.esercitazione.animali;

public class Gatto extends Animale {
    private boolean domestico;

    public Gatto(String nome, int eta, boolean domestico) {
        super(nome, eta, "Gatto");
        this.domestico = domestico;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Gatto other = (Gatto) obj;
        return domestico == other.domestico;
    }
}
