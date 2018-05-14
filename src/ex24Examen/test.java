package ex24Examen;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {

        Galeria g = new Galeria();


        //Creem 2 quadres, 2 escultures i dos antiguetats
        Obra e1 = new Escultura("Home Cáctus", "Julio González", 1000.00, "Ferro", 24.9, 34.6, 45.9);
        Obra e2 = new Escultura("L'homme au doigt", "Alberto Giacometti", 1000.00, "Ferro", 100.9, 20.6, 67.9);
        Obra q1 = new Quadre("Quadrat negre sobre fons blanx", "Kazimir Malèvitx", 2000.00, "Oli", 60.0, 60.0);
        Obra q2 = new Quadre("People beguin to fly","Yves Klein", 4000.00, "Oli sobre paper", 80.0, 90.0);
        Obra a1 = new Antiguitat("Barbie Arrimadas", "Mattel", 20.00, 1977, "plàstic");
        Obra a2 = new Antiguitat("Ken Rivera", "Mattel", 20.00, 2018, "plàstic");

        //Les comprem i imprimim les característiques
        g.compraObra(e1);
        System.out.println(e1.toString());
        g.compraObra(e2);
        System.out.println(e2.toString());
        g.compraObra(q1);
        System.out.println(q1.toString());
        g.compraObra(q2);
        System.out.println(q2.toString());
        g.compraObra(a1);
        System.out.println(a1.toString());
        g.compraObra(a2);
        System.out.println(a2.toString());

        //Imprimim l'inventari
        g.inventari();

        //Imprimim la pasta que ens queda per gastar
        System.out.println(g.getPressupost());


        //Per què crear aquest arrayList????
        ArrayList<Subastable> s = new ArrayList<Subastable>();


        for (Obra o:g.getFons()) {
            if(o instanceof Subastable){
                ((Subastable) o).realitzaSubasta();
            }
        }
    }
}
