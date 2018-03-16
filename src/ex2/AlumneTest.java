package ex2;


/**
 *
 * Quants objectes Alumne es creen al programa.
 *
 * --> Es creen 3 objectes
 *
 *
 * Les assignacions entre variables del tipus Alumne
 * (com per exemple alumne3 = alumne1) fan una còpia de l'objecte?
 *
 *
 * --> No. Simplement hi han dos punters que apunten al mateix objecte
 *
 * Les assignacions entre variables del tipus Alumne
 * (com per exemple alumne3 = alumne1) fan que les dues variables apuntin
 * al mateix objecte (és a dir podem accedir al mateix objecte amb els
 * dos noms: alumne1 i alumne3)?
 *
 * --> Sí;
 *
 **/



public class AlumneTest {

    public static void main(String[] args) {

        //crea un objecte uf4.exemples.Alumne i l'assigna a la variable alumne1
        Alumne alumne1 = null;
        Alumne alumne2 = null;
        Alumne alumne3 = null;

        alumne1 = new Alumne();
        alumne1.setNom("Ramon");

        alumne2 = new Alumne();
        alumne2.setNom("Sonia");

        alumne3 = alumne1;
        alumne3.saluda();
        alumne1.saluda();

        alumne1 = alumne2;
        alumne1.saluda();

        alumne2.setNom("Moncho");

        alumne1.saluda();
    }
}