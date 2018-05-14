package ex24Examen;

import java.util.ArrayList;

public class Galeria {

    private ArrayList <Obra> fons;
    private Double pressupost;
    private Double gastat;


    public Galeria (){
        this.pressupost= 50000.00;
        this.gastat = 0.00;
        this.fons = new ArrayList<Obra>();
    }


    public ArrayList<Obra> getFons(){
        return fons;
    }

    public Boolean compraObra(Obra o){

        Boolean resulatOperacio = false;

        //Si el pressupost es igual o mes gran que el preu de la obra...
        if (pressupost >= o.preuVenda) {

            //s'afegeix l'obra al fons
            fons.add(o);

            // i s'actualitza la pasta de la galeria
            this.pressupost= this.pressupost - o.preuVenda;

            resulatOperacio = true;

        //Si no hi ha prou pasta s'informa al client...
        }else{

            //No hi ha prous calers!
            System.out.println("No hi ha suficient pressupost");

            resulatOperacio=false;
        }

        return resulatOperacio;
    }


    public void inventari (){
        for (Obra o:fons) {
            System.out.print(o.getClass().toString()+ ": "+ o.toString());
        }
    }


    public void realitzaSubvasta(){
        for (Obra o:this.fons) {
            if(o instanceof Subastable){
                ((Subastable) o).realitzaSubasta();
            }
        }
    }


    public Double getPressupost() {
        return pressupost;
    }

    public void setPressupost(Double pressupost) {
        this.pressupost = pressupost;
    }

    public Double getGastat() {
        return gastat;
    }

    public void setGastat(Double gastat) {
        this.gastat = gastat;
    }




}
