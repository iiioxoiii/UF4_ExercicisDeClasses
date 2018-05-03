package ex18Biblioteca;

public interface Biblioteca {

    boolean afegirLlibre(Fitxa f);
    boolean existeixLlibre(Fitxa f);
    int numeroFitxes();
    int capacitatBiblioteca();
    Fitxa getFitxa(String referencia);
    Fitxa getFitxaEnPosicio(int posicio);

    void mostraBiblioteca();
}
