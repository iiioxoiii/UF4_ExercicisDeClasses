package ex23Projecte;

import java.util.Date;

public abstract class Persona {

    String nif;
    String nom;
    String cognom;
    String email;
    Integer telefon;
    Date dataNaixement;


    public Persona(String nif, String nom, String cognom, String email, Integer telefon, Date dataNaixement) {
        this.nif = nif;
        this.nom = nom;
        this.cognom = cognom;
        this.email = email;
        this.telefon = telefon;
        this.dataNaixement = dataNaixement;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nif='" + nif + '\'' +
                ", nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", email='" + email + '\'' +
                ", telefon=" + telefon +
                ", dataNaixement=" + dataNaixement +
                '}';
    }
}
