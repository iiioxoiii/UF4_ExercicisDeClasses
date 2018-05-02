package examenUF4;

//Alumne amb nom, dni

public class Alumne {

    private String nom;
    private String dni;

    public Alumne(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
