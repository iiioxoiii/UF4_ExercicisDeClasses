package ex1;

import com.sun.org.apache.xpath.internal.SourceTree;
import ex1.PermisConduir;;import java.util.Scanner;


public class CotxePermis {

    public static void main(String[] args) {

        Cotxe c = new Cotxe();
        PermisConduir pc = new PermisConduir();

        modificaMatriculaCotxe(c);
        modificaModelCotxe(c);

        modificaNomPermis(pc);
        modificaPuntsPermis(pc);
        modificaTipusPermis(pc);

        System.out.println(c.toString());
        System.out.println(pc.toString());


    }


    public static void modificaNomPermis(PermisConduir o){

        Scanner sc = new Scanner(System.in);
        System.out.print("Modifica permis:");
        o.setNom(sc.nextLine());

    }

    public static void modificaTipusPermis(PermisConduir o){

        Scanner sc = new Scanner(System.in);
        System.out.print("Modifica matricula:");
        o.setTipusPermis(sc.nextLine());

    }

    public static void modificaPuntsPermis(PermisConduir o){

        Scanner sc = new Scanner(System.in);
        System.out.print("Modifica matricula:");
        o.setPunts(sc.nextInt());
    }


    public static void modificaModelCotxe(Cotxe o){

        Scanner sc = new Scanner(System.in);
        System.out.print("Modifica model:");
        o.setModel(sc.nextLine());

    }

    public static void modificaMatriculaCotxe(Cotxe o){

        Scanner sc = new Scanner(System.in);
        System.out.print("Modifica matricula:");
        o.setMatricula(sc.nextLine());

    }


}
