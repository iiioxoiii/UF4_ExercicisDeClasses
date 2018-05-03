package ex18Biblioteca;

public class test {

    public static void main(String[] args) {

        Volum v1 = new Volum("La veritat", "0679720219", "Albert Camús", (short)44 ,(short)43);
        System.out.println(v1.toString());

        //Creació de biblioteca
        Biblioteca Bibli = new BibliotecaImpl();

        Bibli.capacitatBiblioteca();
        Bibli.afegirLlibre(v1);
        Bibli.mostraBiblioteca();
        Bibli.numeroFitxes();
    }
}
