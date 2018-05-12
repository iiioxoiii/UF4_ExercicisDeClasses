package ex23Projecte;

import java.util.Date;

public class Aturat extends Persona implements Impost {

   Double prestacio;

    public Aturat(String nif, String nom, String cognom, String email, Integer telefon, Date dataNaixement, Double prestacio) {
        super(nif, nom, cognom, email, telefon, dataNaixement);
        this.prestacio = prestacio;
    }
// Retorna la quantitat que demana el Montoro a un atutat
    // Aquí li reté un 5%;

    @Override
    public Double aplicaImpost() {
        return prestacio * 0.05;
    }

    @Override
    public String toString() {
        return "Aturat{" +
                "nom=" +
                nom +
                ", cognom=" +
                cognom +
                ", retencio=" + aplicaImpost() +
                '}';
    }
}