package ex10Institut;

import java.util.ArrayList;
import java.util.List;

public class testInstitut {

    List <Matricula> llista = new ArrayList <Matricula> ();


    public static void main(String[] args) {

        testInstitut tt = new testInstitut();
        tt.inici();

    }


    public void inici(){

        Alumne a1 = new AlumneImpl("Joan","Lue Gulak","34555666A", 22);
        Alumne a2 = new AlumneImpl("Carme","Ful Lar","88555666A", 51);

        llista.add(new MatriculaImpl(a1, 6.75, Modul.M1));
        llista.add(new MatriculaImpl(a1, 6.04, Modul.M2));
        llista.add(new MatriculaImpl(a1, 4.13, Modul.M3));
        llista.add(new MatriculaImpl(a2, 4.15, Modul.M5));
        llista.add(new MatriculaImpl(a2, 5.45, Modul.M1));
        llista.add(new MatriculaImpl(a2, 7.09, Modul.M6));


        veureNotesMitjana("34555666A");
        extreuModulsSuspesos("34555666A");


    }

    void veureNotesMitjana (String dni){
        double nota = 0.0;
        double n = 0;

        for (Matricula m: llista) {
            if(m.getAlumne().getDNI().equals(dni)){
                nota = nota + m.getNota();
                n++;
            }
        }

        n = nota/n;

        System.out.println("La mitjana es de: " + n);
    }

    void extreuModulsSuspesos(String dni){

        for (Matricula m: llista) {
            if(m.getAlumne().getDNI().equals(dni)){
                if (m.getNota()< 5.0){
                    System.out.println("Mòdul " + m.getModul().toString() + " suspés");
                }
            }
        }

    }

}
