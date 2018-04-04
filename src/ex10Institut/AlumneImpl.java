package ex10Institut;

public class AlumneImpl implements Alumne {

    private String nom;
    private String cognoms;
    private String dni;
    private int edat;

    public AlumneImpl(String nom, String cognoms, String dni, int edat) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.edat = edat;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public String getCognoms() {
        return this.cognoms;
    }

    @Override
    public int getEdat() {
        return this.edat;
    }

    @Override
    public String getDNI() {

        return this.dni;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    @Override
    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public void setDNI(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "AlumneImpl{" +
                "nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", dni='" + dni + '\'' +
                ", edat=" + edat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlumneImpl alumne = (AlumneImpl) o;

        if (!nom.equals(alumne.nom)) return false;
        if (!cognoms.equals(alumne.cognoms)) return false;
        return dni.equals(alumne.dni);
    }

    @Override
    public int hashCode() {
        int result = nom.hashCode();
        result = 31 * result + cognoms.hashCode();
        result = 31 * result + dni.hashCode();
        return result;
    }
}
