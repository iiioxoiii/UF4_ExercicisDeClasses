package ex10Institut;

public interface Matricula {

    Alumne getAlumne();
    double getNota();
    Modul getModul();

    void setAlumne(Alumne a);
    void setNota(double n);
    void setModul(Modul m);
}
