package ex10Institut;

public class MatriculaImpl implements Matricula {

    private Alumne alumne;
    private double nota;
    private Modul modul;


    public MatriculaImpl(Alumne alumne, double nota, Modul modul) {
        this.alumne = alumne;
        this.nota = nota;
        this.modul = modul;
    }

    @Override
    public Alumne getAlumne() {
        return alumne;
    }

    @Override
    public double getNota() {
        return nota;
    }

    @Override
    public Modul getModul() {

        return modul;
    }

    @Override
    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    @Override
    public void setNota(double nota) {
        this.nota= nota;
    }

    @Override
    public void setModul(Modul modul) {
        this.modul = modul;

    }
}
