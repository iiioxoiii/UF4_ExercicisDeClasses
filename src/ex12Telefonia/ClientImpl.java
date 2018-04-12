package ex12Telefonia;

public class ClientImpl implements Client {

    private String nom;
    private String dni;
    private Double preuMinut;

    public ClientImpl() {
    }


    public ClientImpl(String nom, String dni, Double preu) {
        this.nom = nom;
        this.dni = dni;
        this.preuMinut = preu;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getDNI() {
        return dni;
    }

    @Override
    public Double getPreuTrucada() {
        return preuMinut;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setDNI(String dni) {
        this.dni = dni;
    }

    @Override
    public void setPreuTrucada(Double preu) {

        this.preuMinut = preu;
    }

    @Override
    public boolean equals(Object o) {
        boolean r = false;

        if(o instanceof Client){
            Client c = (Client) o;
            r = this.nom.equals(c.getNom());
            if(r && this.dni.equals(c.getDNI())){
                return r;
            }
        }

        return r;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", dni='" + dni + '\'' +
                ", preuMinut=" + preuMinut +
                '}';
    }
}
