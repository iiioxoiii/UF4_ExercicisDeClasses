package examenUF4;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;


public class Aplicacio {


    // ArrayList de Masters
    ArrayList<Master> llistaMasters = new ArrayList<>();
    ArrayList<Alumne> llistaAlumnes = new ArrayList<>();

    ArrayList<Matricula> llistaMatricules = new ArrayList<>();




    public static void main(String[] args) {
        Aplicacio inici = new Aplicacio();
        inici.go();
    }

    public void go(){

        Aplicacio control = new Aplicacio();

        boolean sortir = false;

        while(!sortir){
            control.preguntesMenu();
            Integer op = control.preguntaInteger();
            if(op.equals(1)){
                control.crearMasters();
            }else if (op.equals(2)) {
                control.creaAlumnes();
            }else if (op.equals(3)){
                control.crearMatricules();
            }else if (op.equals(4)){
                control.efectuarPagament();
            }else if (op.equals(5)){
                control.aprovaModul();
            }else if (op.equals(6)) {
                control.notaMitjana();
            }else if (op.equals(7)){
                sortir = true;
            }

        }

        System.out.println("by");
    }


    public void preguntesMenu(){
        System.out.println("1) Crea masters");
        System.out.println("2) Crea alumnes");
        System.out.println("3) Crea matrícula");
        System.out.println("4) Efectua pagament");
        System.out.println("5) Aprova Mòdul");
        System.out.println("6) Nota mitjana");
        System.out.println("Opció:");
    }


    public void crearMasters(){

        //Es creen tres masters

        Master m1 = new Master("M1", "Com estafar a l'administració pública", 3000.05);
        Master m2 = new Master("M2", "Expertus en escalar", 6000.05);
        Master m3 = new Master("M3", "Transtorns mentals, adiccions i sadisme de jutges i fiscals", 2500.00);

        llistaMasters.add(m1);
        llistaMasters.add(m2);
        llistaMasters.add(m3);

        /**
        System.out.println("Introdueix el id del master:");
        String idMaster = preguntaString();
        System.out.println("Introdueix el nom master:");
        String nom = preguntaString();
        System.out.println("Introdueix el preu del master:");
        Double preuMaster = preguntaDouble();

        Master m = new Master(idMaster,nom,preuMaster);
        llistaMasters.add(m);
        **/
    }


    public void creaAlumnes(){

        // Es creen tres alumnes

        Alumne a1 = new Alumne("Joan Riudecanyes", "22333444U");
        Alumne a2 = new Alumne("Maria Gassul", "44555888P");
        Alumne a3 = new Alumne("Lluis Oliva", "33000111M");

        llistaAlumnes.add(a1);
        llistaAlumnes.add(a2);
        llistaAlumnes.add(a3);

    }


    public void crearMatricules(){

        // Es creen tres matrícules (cada alumne se li assigna un master)

        Matricula m1 = new Matricula(llistaAlumnes.get(1),llistaMasters.get(1));
        Matricula m2 = new Matricula(llistaAlumnes.get(2),llistaMasters.get(2));
        Matricula m3 = new Matricula(llistaAlumnes.get(3),llistaMasters.get(3));

        llistaMatricules.add(m1);
        llistaMatricules.add(m2);
        llistaMatricules.add(m3);
    }


    public void efectuarPagament(){

    }

    public void aprovaModul(){

    }

    public void notaMitjana(){

    }



    public String preguntaString(){

        Scanner sc = new Scanner(System.in);
        String sortida = sc.nextLine();

        return sortida;
    }

    public Double preguntaDouble(){

        Scanner sc = new Scanner(System.in);
        Double sortida = sc.nextDouble();

        return sortida;
    }

    public Integer preguntaInteger(){

        Scanner sc = new Scanner(System.in);
        Integer sortida = sc.nextInt();

        return sortida;

    }




}
