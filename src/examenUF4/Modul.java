package examenUF4;

public class Modul {

    private String nom;
    private Double nota;

    public Modul(String nom, Double nota) {
        this.nom = nom;
        this.nota = nota;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Modul{" +
                "nom='" + nom + '\'' +
                ", nota=" + nota +
                '}';
    }
}
