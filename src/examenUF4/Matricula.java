package examenUF4;

// Matricula on inclogui: dniAlumne, idMaster, estat
// (String amb valors preinscrit, matriculat o avaluat), pagament,
// llistaModulsPendents i llistaModulsAvaluats.

import java.util.ArrayList;

public class Matricula {
    private Alumne alumne;
    private Master master;

    private Double pagament;
    private Valor valor;

    private ArrayList <Modul> llistaModulsPendent= new ArrayList<>();
    private ArrayList <Modul> llistaModulsAvaluats = new ArrayList<>();


    // Contructor amb valors per defecte
    public Matricula(Alumne alumne, Master master) {
        this.alumne = alumne;
        this.master = master;
        this.pagament = 0.0;
        this.valor = Valor.PREINSCRIT;
    }

    public Matricula(Alumne alumne, Master master, ArrayList<Modul> llistaModuls, ArrayList<Modul> llistaModulsAvaluats) {
        this.alumne = alumne;
        this.master = master;
        this.valor = Valor.PREINSCRIT;
        this.llistaModulsPendent = llistaModuls;
        this.llistaModulsAvaluats = llistaModulsAvaluats;
    }





    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public ArrayList<Modul> getLlistaModuls() {
        return llistaModulsPendent;
    }

    public void setLlistaModuls(ArrayList<Modul> llistaModuls) {
        this.llistaModulsPendent = llistaModuls;
    }

    public ArrayList<Modul> getLlistaModulsAvaluats() {
        return llistaModulsAvaluats;
    }

    public void setLlistaModulsAvaluats(ArrayList<Modul> llistaModulsAvaluats) {
        this.llistaModulsAvaluats = llistaModulsAvaluats;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "alumne=" + alumne +
                ", master=" + master +
                ", valor=" + valor +
                ", llistaModuls=" + llistaModulsPendent +
                ", llistaModulsAvaluats=" + llistaModulsAvaluats +
                '}';
    }
}

