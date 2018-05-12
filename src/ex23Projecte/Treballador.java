package ex23Projecte;

import java.util.Date;

public class Treballador extends Persona implements Impost {

    Empresa empresa;
    Contracte contracte;

    public Treballador(String nif, String nom, String cognom, String email, Integer telefon, Date dataNaixement, Contracte contracte) {
        super(nif, nom, cognom, email, telefon, dataNaixement);
        this.contracte = contracte;
    }


    // Assignació d'un contracte al treballador
    public void setContracte(Contracte contracte) {
        this.contracte = contracte;
    }

    // Retorna la quantitat que demana el Montoro. En aquest cas el 16%
    @Override
    public Double aplicaImpost() {
        return contracte.sou * 0.16;
    }

    @Override
    public String toString() {
        return "Treballador{" +
                "empresa=" + empresa + ", " + contracte +
                "nom=" +
                nom +
                ", cognom=" +
                cognom +
                ", retencio=" + aplicaImpost() +
                '}';
    }
}