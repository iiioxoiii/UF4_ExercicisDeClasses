package ex18Biblioteca;

import java.util.ArrayList;

public class BibliotecaImpl implements Biblioteca {

    private final int midaBibli = 10;
    private ArrayList<Fitxa> llista = new ArrayList<>();

    public BibliotecaImpl() {
    }

    @Override
    public boolean afegirLlibre(Fitxa f) {

        boolean afegit = false;

        if(llista.size()<=10 && ! existeixLlibre(f)){
            llista.add(f);
            afegit = true;
        }else{
            afegit = false;
        }
        return afegit;
    }

    @Override
    public boolean existeixLlibre(Fitxa f) {

        boolean existeix = false;

        for (Fitxa ff: llista) {
            if(ff.equals(f)){
                existeix = true;
            }
        }

        return existeix;
    }

    @Override
    public int numeroFitxes() {
        return llista.size();
    }

    @Override
    public int capacitatBiblioteca() {
        return midaBibli;
    }

    @Override
    public Fitxa getFitxa(String referencia) {

        for (Fitxa f: llista){
            if(referencia.equals(f.getReferencia())){
                return f;
            }
        }

        return null;
    }

    @Override
    public Fitxa getFitxaEnPosicio(int posicio) {
        llista.get(posicio);
        return null;
    }

    @Override
    public void mostraBiblioteca() {
        for (Fitxa f: llista){
            System.out.println(f.toString());
        }
    }
}
