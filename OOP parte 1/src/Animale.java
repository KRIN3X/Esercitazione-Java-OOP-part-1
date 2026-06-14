package it.esercitazione.animali;

public class Animale {
    private String nome;
    private int eta;
    private String specie;

    public Animale(String nome, int eta, String specie) {
        this.nome = nome;
        this.eta = eta;
        this.specie = specie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animale other = (Animale) obj;
        return eta == other.eta
                && (nome != null ? nome.equals(other.nome) : other.nome == null)
                && (specie != null ? specie.equals(other.specie) : other.specie == null);
    }
}
